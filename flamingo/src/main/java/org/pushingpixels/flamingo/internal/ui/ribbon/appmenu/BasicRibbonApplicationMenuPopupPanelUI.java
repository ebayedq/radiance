/*
 * Copyright (c) 2005-2018 Flamingo Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of Flamingo Kirill Grouchnikov nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.flamingo.internal.ui.ribbon.appmenu;

import org.pushingpixels.flamingo.api.common.*;
import org.pushingpixels.flamingo.api.common.model.*;
import org.pushingpixels.flamingo.api.common.popup.JPopupPanel;
import org.pushingpixels.flamingo.api.ribbon.*;
import org.pushingpixels.flamingo.internal.ui.common.popup.BasicPopupPanelUI;
import org.pushingpixels.substance.api.ComponentState;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.painter.fill.SubstanceFillPainter;
import org.pushingpixels.substance.internal.utils.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.*;

/**
 * Basic UI for ribbon application menu button {@link JRibbonApplicationMenuButton}.
 *
 * @author Kirill Grouchnikov
 */
public abstract class BasicRibbonApplicationMenuPopupPanelUI extends BasicPopupPanelUI {
    private JPanel panelLevel1;

    protected JScrollablePanel<JPanel> panelScrollerLevel2;

    protected JPanel panelLevel2;

    private JPanel footerPanel;

    private static final CommandButtonPresentationState MENU_TILE_LEVEL_1 =
            new CommandButtonPresentationState(
                    "Ribbon application menu tile level 1", 32) {
                @Override
                public CommandButtonLayoutManager createLayoutManager(AbstractCommandButton commandButton) {
                    return new CommandButtonLayoutManagerMenuTileLevel1();
                }
            };

    /**
     * The associated application menu button.
     */
    protected JRibbonApplicationMenuPopupPanel applicationMenuPopupPanel;

    protected JPanel mainPanel;

    @Override
    public void installUI(JComponent c) {
        this.applicationMenuPopupPanel = (JRibbonApplicationMenuPopupPanel) c;
        this.popupPanel = (JPopupPanel) c;

        this.applicationMenuPopupPanel.setLayout(new BorderLayout());

        installDefaults();
        installComponents();
        installListeners();
    }

    @Override
    public void uninstallUI(JComponent c) {
        uninstallListeners();
        uninstallComponents();
        uninstallDefaults();

        this.applicationMenuPopupPanel = null;
    }

    @Override
    protected void installComponents() {
        super.installComponents();

        this.mainPanel = new JPanel(new BorderLayout());

        this.panelLevel1 = new JPanel();
        this.panelLevel1.setLayout(new LayoutManager() {
            @Override
            public void addLayoutComponent(String name, Component comp) {
            }

            @Override
            public void removeLayoutComponent(Component comp) {
            }

            @Override
            public Dimension preferredLayoutSize(Container parent) {
                int height = 0;
                int width = 0;
                for (int i = 0; i < parent.getComponentCount(); i++) {
                    Dimension pref = parent.getComponent(i).getPreferredSize();
                    height += pref.height;
                    width = Math.max(width, pref.width);
                }

                Insets ins = parent.getInsets();
                return new Dimension(width + ins.left + ins.right, height + ins.top + ins.bottom);
            }

            @Override
            public Dimension minimumLayoutSize(Container parent) {
                return preferredLayoutSize(parent);
            }

            @Override
            public void layoutContainer(Container parent) {
                Insets ins = parent.getInsets();

                int topY = ins.top;
                for (int i = 0; i < parent.getComponentCount(); i++) {
                    Component comp = parent.getComponent(i);
                    Dimension pref = comp.getPreferredSize();
                    comp.setBounds(ins.left, topY, parent.getWidth() - ins.left - ins.right,
                            pref.height);
                    topY += pref.height;
                }
            }
        });

        final RibbonApplicationMenuPanelProjection ribbonAppMenuProjection =
                (RibbonApplicationMenuPanelProjection) this.applicationMenuPopupPanel.getRibbonAppMenuProjection();
        final RibbonApplicationMenu ribbonAppMenu = (ribbonAppMenuProjection != null)
                ? ribbonAppMenuProjection.getContentModel() : null;

        if (ribbonAppMenu != null) {
            final Map<Command, CommandButtonPresentationModel.Overlay> commandOverlays =
                    ribbonAppMenuProjection.getCommandOverlays();
            CommandButtonPresentationModel baseCommandPresentation = CommandButtonPresentationModel.builder()
                    .setMenu(true).build();
            List<CommandGroup> primaryEntries = ribbonAppMenu.getCommandGroups();
            int primaryGroupCount = primaryEntries.size();
            for (int i = 0; i < primaryGroupCount; i++) {
                for (final Command menuEntry : primaryEntries.get(i).getCommands()) {
                    // Check to see if we have an overlay for the current command
                    CommandButtonPresentationModel commandPresentation = baseCommandPresentation;
                    if (commandOverlays.containsKey(menuEntry)) {
                        commandPresentation = commandPresentation.overlayWith(
                                commandOverlays.get(menuEntry));
                    }
                    final JCommandMenuButton commandButton =
                            (JCommandMenuButton) menuEntry.project(commandPresentation)
                                    .buildComponent();

                    if (menuEntry.getSecondaryContentModel() == null) {
                        // if there are no secondary menu items, remove all entries from the
                        // secondary panel
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            panelLevel2.removeAll();
                            panelScrollerLevel2.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                            panelLevel2.revalidate();
                            panelLevel2.repaint();
                        });
                    } else {
                        commandButton.addRolloverActionListener((ActionEvent e) -> {
                            // populate the second level panel with secondary level items
                            panelLevel2.removeAll();
                            panelLevel2.setLayout(new BorderLayout());

                            CommandButtonPresentationState secondaryMenuPresentationState =
                                    ribbonAppMenuProjection.getSecondaryLevelCommandPresentationState()
                                            .get(menuEntry);
                            if (secondaryMenuPresentationState == null) {
                                secondaryMenuPresentationState =
                                        CommandButtonPresentationState.MEDIUM;
                            }

                            JRibbonApplicationMenuPopupPanelSecondary secondary =
                                    JRibbonApplicationMenuPopupPanelSecondary.getPanel(menuEntry,
                                            commandOverlays, secondaryMenuPresentationState,
                                            commandButton);
                            secondary.applyComponentOrientation(
                                    applicationMenuPopupPanel.getComponentOrientation());
                            panelLevel2.add(secondary, BorderLayout.CENTER);
                            panelLevel2.revalidate();
                            panelLevel2.repaint();
                            // emulate showing the popup so the button remains "selected"
                            commandButton.getPopupModel().setPopupShowing(true);
                        });
                    }
                    commandButton.setPresentationState(MENU_TILE_LEVEL_1);
                    commandButton.setHorizontalAlignment(SwingUtilities.LEADING);
                    commandButton.setPopupOrientationKind(
                            CommandButtonPresentationModel.PopupOrientationKind.SIDEWARD);
                    commandButton.setEnabled(menuEntry.isEnabled());
                    this.panelLevel1.add(commandButton);
                }
                if (i < (primaryGroupCount - 1)) {
                    this.panelLevel1.add(new JPopupMenu.Separator());
                }
            }
        }

        mainPanel.add(this.panelLevel1, BorderLayout.LINE_START);

        this.panelLevel2 = new JPanel();
        this.panelScrollerLevel2 = new JScrollablePanel<>(this.panelLevel2,
                JScrollablePanel.ScrollType.VERTICALLY);
        this.panelScrollerLevel2.setPreferredSize(new Dimension(30 *
                this.panelLevel1.getFont().getSize() - 30, 10));

        mainPanel.add(this.panelScrollerLevel2, BorderLayout.CENTER);

        this.applicationMenuPopupPanel.add(mainPanel, BorderLayout.CENTER);

        this.footerPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING)) {
            @Override
            protected void paintComponent(Graphics g) {
                SubstanceFillPainter fillPainter = SubstanceCoreUtilities.getFillPainter(null);
                SubstanceColorScheme baseFillScheme = SubstanceColorSchemeUtilities.getColorScheme(
                        null, ComponentState.ENABLED);
                fillPainter.paintContourBackground(g, null,
                        footerPanel.getWidth(), footerPanel.getHeight(),
                        new Rectangle(0, 0, footerPanel.getWidth(), footerPanel.getHeight()), false,
                        baseFillScheme, true);
            }
        };
        if (ribbonAppMenu != null) {
            for (Command footerCommand : ribbonAppMenu.getFooterCommands().getCommands()) {
                JCommandButton commandFooterButton =
                        (JCommandButton) footerCommand.project().buildComponent();
                commandFooterButton.setPresentationState(CommandButtonPresentationState.MEDIUM);
                commandFooterButton.setFlat(false);
                this.footerPanel.add(commandFooterButton);
            }
        }

        this.applicationMenuPopupPanel.add(this.footerPanel, BorderLayout.SOUTH);
    }

    @Override
    protected void installListeners() {
        super.installListeners();
    }

    @Override
    protected void uninstallDefaults() {
        super.uninstallDefaults();
    }

    @Override
    protected void uninstallComponents() {
        super.uninstallComponents();
    }

    @Override
    protected void uninstallListeners() {
        super.uninstallListeners();
    }

    @Override
    public void paint(Graphics g, JComponent c) {
    }

    public JPanel getPanelLevel1() {
        return panelLevel1;
    }

    public JPanel getPanelLevel2() {
        return panelLevel2;
    }
}
