/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreanimation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.opengles.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAShapeLayer/*</name>*/ 
    extends /*<extends>*/CALayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAShapeLayerPtr extends Ptr<CAShapeLayer, CAShapeLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAShapeLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAShapeLayer() {}
    protected CAShapeLayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "path")
    public native CGPath getPath();
    @Property(selector = "setPath:")
    public native void setPath(CGPath v);
    @Property(selector = "fillColor")
    public native CGColor getFillColor();
    @Property(selector = "setFillColor:")
    public native void setFillColor(CGColor v);
    @Property(selector = "fillRule")
    public native String getFillRule();
    @Property(selector = "setFillRule:")
    public native void setFillRule(String v);
    @Property(selector = "strokeColor")
    public native CGColor getStrokeColor();
    @Property(selector = "setStrokeColor:")
    public native void setStrokeColor(CGColor v);
    @Property(selector = "strokeStart")
    public native @MachineSizedFloat double getStrokeStart();
    @Property(selector = "setStrokeStart:")
    public native void setStrokeStart(@MachineSizedFloat double v);
    @Property(selector = "strokeEnd")
    public native @MachineSizedFloat double getStrokeEnd();
    @Property(selector = "setStrokeEnd:")
    public native void setStrokeEnd(@MachineSizedFloat double v);
    @Property(selector = "lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Property(selector = "miterLimit")
    public native @MachineSizedFloat double getMiterLimit();
    @Property(selector = "setMiterLimit:")
    public native void setMiterLimit(@MachineSizedFloat double v);
    @Property(selector = "lineCap")
    public native String getLineCap();
    @Property(selector = "setLineCap:")
    public native void setLineCap(String v);
    @Property(selector = "lineJoin")
    public native String getLineJoin();
    @Property(selector = "setLineJoin:")
    public native void setLineJoin(String v);
    @Property(selector = "lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    @Property(selector = "setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "lineDashPattern")
    public native NSArray<?> getLineDashPattern();
    @Property(selector = "setLineDashPattern:")
    public native void setLineDashPattern(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCAFillRuleNonZero", optional=true)
    public static native String FillRuleNonZero();
    @GlobalValue(symbol="kCAFillRuleEvenOdd", optional=true)
    public static native String FillRuleEvenOdd();
    @GlobalValue(symbol="kCALineJoinMiter", optional=true)
    public static native String LineJoinMiter();
    @GlobalValue(symbol="kCALineJoinRound", optional=true)
    public static native String LineJoinRound();
    @GlobalValue(symbol="kCALineJoinBevel", optional=true)
    public static native String LineJoinBevel();
    @GlobalValue(symbol="kCALineCapButt", optional=true)
    public static native String LineCapButt();
    @GlobalValue(symbol="kCALineCapRound", optional=true)
    public static native String LineCapRound();
    @GlobalValue(symbol="kCALineCapSquare", optional=true)
    public static native String LineCapSquare();
    
    
    /*</methods>*/
}
