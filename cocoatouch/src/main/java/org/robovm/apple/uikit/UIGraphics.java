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
package org.robovm.apple.uikit;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("UIKit")/*</annotations>*/
@Marshaler(NSString.AsStringMarshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIGraphics/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIGraphics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="UIGraphicsGetCurrentContext", optional=true)
    public static native CGContext getCurrentContext();
    @Bridge(symbol="UIGraphicsPushContext", optional=true)
    public static native void pushContext(CGContext context);
    @Bridge(symbol="UIGraphicsPopContext", optional=true)
    public static native void popContext();
    @Bridge(symbol="UIRectFillUsingBlendMode", optional=true)
    public static native void rectFillUsingBlendMode(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFill", optional=true)
    public static native void rectFill(@ByVal CGRect rect);
    @Bridge(symbol="UIRectFrameUsingBlendMode", optional=true)
    public static native void rectFrameUsingBlendMode(@ByVal CGRect rect, CGBlendMode blendMode);
    @Bridge(symbol="UIRectFrame", optional=true)
    public static native void rectFrame(@ByVal CGRect rect);
    @Bridge(symbol="UIRectClip", optional=true)
    public static native void rectClip(@ByVal CGRect rect);
    @Bridge(symbol="UIGraphicsBeginImageContext", optional=true)
    public static native void beginImageContext(@ByVal CGSize size);
    @Bridge(symbol="UIGraphicsBeginImageContextWithOptions", optional=true)
    public static native void beginImageContextWithOptions(@ByVal CGSize size, boolean opaque, @MachineSizedFloat double scale);
    @Bridge(symbol="UIGraphicsGetImageFromCurrentImageContext", optional=true)
    public static native UIImage getImageFromCurrentImageContext();
    @Bridge(symbol="UIGraphicsEndImageContext", optional=true)
    public static native void endImageContext();
    @Bridge(symbol="UIGraphicsBeginPDFContextToFile", optional=true)
    public static native boolean beginPDFContextToFile(String path, @ByVal CGRect bounds, NSDictionary<NSString, ?> documentInfo);
    @Bridge(symbol="UIGraphicsBeginPDFContextToData", optional=true)
    public static native void beginPDFContextToData(NSMutableData data, @ByVal CGRect bounds, NSDictionary<NSString, ?> documentInfo);
    @Bridge(symbol="UIGraphicsEndPDFContext", optional=true)
    public static native void endPDFContext();
    @Bridge(symbol="UIGraphicsBeginPDFPage", optional=true)
    public static native void beginPDFPage();
    @Bridge(symbol="UIGraphicsBeginPDFPageWithInfo", optional=true)
    public static native void beginPDFPageWithInfo(@ByVal CGRect bounds, NSDictionary<NSString, ?> pageInfo);
    @Bridge(symbol="UIGraphicsGetPDFContextBounds", optional=true)
    public static native @ByVal CGRect getPDFContextBounds();
    @Bridge(symbol="UIGraphicsSetPDFContextURLForRect", optional=true)
    public static native void setPDFContextURLForRect(NSURL url, @ByVal CGRect rect);
    @Bridge(symbol="UIGraphicsAddPDFContextDestinationAtPoint", optional=true)
    public static native void addPDFContextDestinationAtPoint(String name, @ByVal CGPoint point);
    @Bridge(symbol="UIGraphicsSetPDFContextDestinationForRect", optional=true)
    public static native void setPDFContextDestinationForRect(String name, @ByVal CGRect rect);
    /*</methods>*/
}
