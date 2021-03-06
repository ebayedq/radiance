package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.IsHiDpiAware;
import org.pushingpixels.neon.icon.NeonIcon;
import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconFactory;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_dtd implements ResizableIcon, IsHiDpiAware {
    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
paint = new LinearGradientPaint(new Point2D.Double(36.108001708984375, 3.003000020980835), new Point2D.Double(36.108001708984375, 101.0009994506836), new float[] {0.0f,0.139f,0.359f,0.617f,1.0f}, new Color[] {new Color(200, 212, 219, 255),new Color(216, 225, 230, 255),new Color(235, 240, 243, 255),new Color(249, 250, 251, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.2, 99.0);
((GeneralPath)shape).lineTo(0.2, 1.0);
((GeneralPath)shape).lineTo(45.100002, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
paint = new Color(76, 108, 123, 255);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.5, 71.2);
((GeneralPath)shape).lineTo(16.9, 71.2);
((GeneralPath)shape).curveTo(18.6, 71.2, 19.8, 71.299995, 20.699999, 71.6);
((GeneralPath)shape).curveTo(21.9, 71.9, 22.9, 72.6, 23.699999, 73.4);
((GeneralPath)shape).curveTo(24.499998, 74.3, 25.199999, 75.3, 25.599998, 76.6);
((GeneralPath)shape).curveTo(25.999998, 77.899994, 26.3, 79.4, 26.3, 81.299995);
((GeneralPath)shape).curveTo(26.3, 82.899994, 26.099998, 84.299995, 25.699999, 85.49999);
((GeneralPath)shape).curveTo(25.199999, 86.899994, 24.499998, 88.09999, 23.599998, 88.99999);
((GeneralPath)shape).curveTo(22.899998, 89.69999, 21.999998, 90.19999, 20.8, 90.59999);
((GeneralPath)shape).curveTo(19.9, 90.899994, 18.699999, 90.99999, 17.199999, 90.99999);
((GeneralPath)shape).lineTo(9.5, 90.99999);
((GeneralPath)shape).lineTo(9.5, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(13.6, 74.6);
((GeneralPath)shape).lineTo(13.6, 87.7);
((GeneralPath)shape).lineTo(16.6, 87.7);
((GeneralPath)shape).curveTo(17.7, 87.7, 18.5, 87.6, 19.0, 87.5);
((GeneralPath)shape).curveTo(19.7, 87.3, 20.2, 87.1, 20.6, 86.7);
((GeneralPath)shape).curveTo(21.0, 86.299995, 21.4, 85.7, 21.7, 84.799995);
((GeneralPath)shape).curveTo(22.000002, 83.899994, 22.1, 82.7, 22.1, 81.2);
((GeneralPath)shape).curveTo(22.1, 79.7, 22.0, 78.5, 21.7, 77.7);
((GeneralPath)shape).curveTo(21.400002, 76.899994, 21.0, 76.2, 20.6, 75.799995);
((GeneralPath)shape).curveTo(20.1, 75.299995, 19.5, 74.99999, 18.7, 74.899994);
((GeneralPath)shape).curveTo(18.1, 74.799995, 17.0, 74.7, 15.400001, 74.7);
((GeneralPath)shape).lineTo(13.6, 74.7);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(34.2, 91.1);
((GeneralPath)shape).lineTo(34.2, 74.6);
((GeneralPath)shape).lineTo(28.300001, 74.6);
((GeneralPath)shape).lineTo(28.300001, 71.2);
((GeneralPath)shape).lineTo(44.2, 71.2);
((GeneralPath)shape).lineTo(44.2, 74.6);
((GeneralPath)shape).lineTo(38.3, 74.6);
((GeneralPath)shape).lineTo(38.3, 91.1);
((GeneralPath)shape).lineTo(34.2, 91.1);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(46.7, 71.2);
((GeneralPath)shape).lineTo(54.100002, 71.2);
((GeneralPath)shape).curveTo(55.800003, 71.2, 57.000004, 71.299995, 57.9, 71.6);
((GeneralPath)shape).curveTo(59.100002, 71.9, 60.100002, 72.6, 60.9, 73.4);
((GeneralPath)shape).curveTo(61.7, 74.200005, 62.4, 75.3, 62.800003, 76.6);
((GeneralPath)shape).curveTo(63.200005, 77.9, 63.500004, 79.4, 63.500004, 81.299995);
((GeneralPath)shape).curveTo(63.500004, 82.899994, 63.300003, 84.299995, 62.900005, 85.49999);
((GeneralPath)shape).curveTo(62.400005, 86.899994, 61.700005, 88.09999, 60.800007, 88.99999);
((GeneralPath)shape).curveTo(60.100006, 89.69999, 59.20001, 90.19999, 58.000008, 90.59999);
((GeneralPath)shape).curveTo(57.100006, 90.899994, 55.90001, 90.99999, 54.40001, 90.99999);
((GeneralPath)shape).lineTo(46.80001, 90.99999);
((GeneralPath)shape).lineTo(46.80001, 71.2);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(50.8, 74.6);
((GeneralPath)shape).lineTo(50.8, 87.7);
((GeneralPath)shape).lineTo(53.8, 87.7);
((GeneralPath)shape).curveTo(54.899998, 87.7, 55.7, 87.6, 56.2, 87.5);
((GeneralPath)shape).curveTo(56.9, 87.3, 57.4, 87.1, 57.8, 86.7);
((GeneralPath)shape).curveTo(58.199997, 86.299995, 58.6, 85.7, 58.899998, 84.799995);
((GeneralPath)shape).curveTo(59.199997, 83.899994, 59.3, 82.7, 59.3, 81.2);
((GeneralPath)shape).curveTo(59.3, 79.7, 59.2, 78.5, 58.899998, 77.7);
((GeneralPath)shape).curveTo(58.599995, 76.899994, 58.199997, 76.2, 57.8, 75.799995);
((GeneralPath)shape).curveTo(57.3, 75.299995, 56.7, 74.99999, 55.899998, 74.899994);
((GeneralPath)shape).curveTo(55.3, 74.799995, 54.199997, 74.7, 52.6, 74.7);
((GeneralPath)shape).lineTo(50.8, 74.7);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
paint = new LinearGradientPaint(new Point2D.Double(12.784000396728516, 34.27000045776367), new Point2D.Double(29.89900016784668, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.9, 40.8);
((GeneralPath)shape).lineTo(17.0, 34.3);
((GeneralPath)shape).lineTo(17.0, 34.2);
((GeneralPath)shape).lineTo(29.9, 27.800001);
((GeneralPath)shape).lineTo(29.9, 23.400002);
((GeneralPath)shape).lineTo(12.799999, 32.5);
((GeneralPath)shape).lineTo(12.799999, 36.0);
((GeneralPath)shape).lineTo(29.9, 45.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(12.034000396728516, 34.27000045776367), new Point2D.Double(30.64900016784668, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.9, 40.8);
((GeneralPath)shape).lineTo(17.0, 34.3);
((GeneralPath)shape).lineTo(17.0, 34.2);
((GeneralPath)shape).lineTo(29.9, 27.800001);
((GeneralPath)shape).lineTo(29.9, 23.400002);
((GeneralPath)shape).lineTo(12.799999, 32.5);
((GeneralPath)shape).lineTo(12.799999, 36.0);
((GeneralPath)shape).lineTo(29.9, 45.1);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
paint = new LinearGradientPaint(new Point2D.Double(33.89799880981445, 29.459999084472656), new Point2D.Double(39.56800079345703, 29.459999084472656), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.8, 37.0);
((GeneralPath)shape).lineTo(39.6, 22.0);
((GeneralPath)shape).lineTo(33.899998, 22.0);
((GeneralPath)shape).lineTo(34.699997, 37.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(33.10599899291992, 29.459999084472656), new Point2D.Double(40.358001708984375, 29.459999084472656), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(38.8, 37.0);
((GeneralPath)shape).lineTo(39.6, 22.0);
((GeneralPath)shape).lineTo(33.899998, 22.0);
((GeneralPath)shape).lineTo(34.699997, 37.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
paint = new LinearGradientPaint(new Point2D.Double(33.540000915527344, 42.71099853515625), new Point2D.Double(39.92399978637695, 42.71099853515625), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.8, 46.4);
((GeneralPath)shape).curveTo(38.7, 46.4, 40.0, 44.800003, 40.0, 42.7);
((GeneralPath)shape).curveTo(40.0, 40.5, 38.7, 39.0, 36.8, 39.0);
((GeneralPath)shape).curveTo(34.899998, 39.0, 33.6, 40.5, 33.6, 42.7);
((GeneralPath)shape).curveTo(33.5, 44.8, 34.8, 46.4, 36.8, 46.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(32.790000915527344, 42.71099853515625), new Point2D.Double(40.67399978637695, 42.71099853515625), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.8, 46.4);
((GeneralPath)shape).curveTo(38.7, 46.4, 40.0, 44.800003, 40.0, 42.7);
((GeneralPath)shape).curveTo(40.0, 40.5, 38.7, 39.0, 36.8, 39.0);
((GeneralPath)shape).curveTo(34.899998, 39.0, 33.6, 40.5, 33.6, 42.7);
((GeneralPath)shape).curveTo(33.5, 44.8, 34.8, 46.4, 36.8, 46.4);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_6
paint = new LinearGradientPaint(new Point2D.Double(43.597999572753906, 34.27000045776367), new Point2D.Double(60.715999603271484, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.6, 23.4);
((GeneralPath)shape).lineTo(43.6, 27.8);
((GeneralPath)shape).lineTo(56.8, 34.2);
((GeneralPath)shape).lineTo(56.8, 34.3);
((GeneralPath)shape).lineTo(43.6, 40.8);
((GeneralPath)shape).lineTo(43.6, 45.1);
((GeneralPath)shape).lineTo(60.699997, 36.1);
((GeneralPath)shape).lineTo(60.699997, 32.399998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(42.847999572753906, 34.27000045776367), new Point2D.Double(61.465999603271484, 34.27000045776367), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(43.6, 23.4);
((GeneralPath)shape).lineTo(43.6, 27.8);
((GeneralPath)shape).lineTo(56.8, 34.2);
((GeneralPath)shape).lineTo(56.8, 34.3);
((GeneralPath)shape).lineTo(43.6, 40.8);
((GeneralPath)shape).lineTo(43.6, 45.1);
((GeneralPath)shape).lineTo(60.699997, 36.1);
((GeneralPath)shape).lineTo(60.699997, 32.399998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_7
paint = new LinearGradientPaint(new Point2D.Double(15.302000045776367, 52.39400100708008), new Point2D.Double(58.22999954223633, 52.39400100708008), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.3, 50.9);
((GeneralPath)shape).lineTo(58.2, 50.9);
((GeneralPath)shape).lineTo(58.2, 53.800003);
((GeneralPath)shape).lineTo(15.3, 53.800003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.552000045776367, 52.39400100708008), new Point2D.Double(58.97999954223633, 52.39400100708008), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.3, 50.9);
((GeneralPath)shape).lineTo(58.2, 50.9);
((GeneralPath)shape).lineTo(58.2, 53.800003);
((GeneralPath)shape).lineTo(15.3, 53.800003);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_7);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_8 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_8
paint = new LinearGradientPaint(new Point2D.Double(15.302000045776367, 60.67399978637695), new Point2D.Double(58.22999954223633, 60.67399978637695), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.3, 59.2);
((GeneralPath)shape).lineTo(58.2, 59.2);
((GeneralPath)shape).lineTo(58.2, 62.100002);
((GeneralPath)shape).lineTo(15.3, 62.100002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(14.552000045776367, 60.67399978637695), new Point2D.Double(58.97999954223633, 60.67399978637695), new float[] {0.0f,0.265f,0.798f,1.0f}, new Color[] {new Color(204, 221, 231, 255),new Color(181, 204, 216, 255),new Color(127, 160, 177, 255),new Color(106, 143, 161, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.5f,0,0,10.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.3, 59.2);
((GeneralPath)shape).lineTo(58.2, 59.2);
((GeneralPath)shape).lineTo(58.2, 62.100002);
((GeneralPath)shape).lineTo(15.3, 62.100002);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_8);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_9
paint = new LinearGradientPaint(new Point2D.Double(45.12200164794922, 74.22899627685547), new Point2D.Double(58.57500076293945, 87.68299865722656), new float[] {0.0f,0.35f,0.532f,0.675f,0.799f,0.908f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(250, 251, 251, 255),new Color(237, 241, 244, 255),new Color(221, 229, 233, 255),new Color(199, 211, 218, 255),new Color(173, 189, 199, 255),new Color(146, 165, 176, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_9);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_10 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_10
paint = new Color(0, 0, 0, 0);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(113, 145, 161, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.1, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.1, 27.7);
((GeneralPath)shape).lineTo(45.1, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_10);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.13199999928474426;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7380064129829407;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 0.9999999403953552;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. It is recommended to use the 
	 * {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	public ext_dtd() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
    public boolean isHiDpiAware() {
        return true;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static NeonIcon of(int width, int height) {
       ext_dtd base = new ext_dtd();
       base.width = width;
       base.height = height;
       return new NeonIcon(base);
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static NeonIconUIResource uiResourceOf(int width, int height) {
       ext_dtd base = new ext_dtd();
       base.width = width;
       base.height = height;
       return new NeonIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static ResizableIconFactory factory() {
        return () -> new NeonIcon(new ext_dtd());
    }
}

