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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CATransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CATransactionPtr extends Ptr<CATransaction, CATransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CATransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CATransaction() {}
    protected CATransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kCATransactionAnimationDuration", optional=true)
    public static native String KeyAnimationDuration();
    @GlobalValue(symbol="kCATransactionDisableActions", optional=true)
    public static native String KeyDisableActions();
    @GlobalValue(symbol="kCATransactionAnimationTimingFunction", optional=true)
    public static native String KeyAnimationTimingFunction();
    @GlobalValue(symbol="kCATransactionCompletionBlock", optional=true)
    public static native String KeyCompletionBlock();
    
    @Method(selector = "begin")
    public static native void begin();
    @Method(selector = "commit")
    public static native void commit();
    @Method(selector = "flush")
    public static native void flush();
    @Method(selector = "lock")
    public static native void lock();
    @Method(selector = "unlock")
    public static native void unlock();
    @Method(selector = "animationDuration")
    public static native double animationDuration();
    @Method(selector = "setAnimationDuration:")
    public static native void setAnimationDuration(double dur);
    @Method(selector = "animationTimingFunction")
    public static native CAMediaTimingFunction animationTimingFunction();
    @Method(selector = "setAnimationTimingFunction:")
    public static native void setAnimationTimingFunction(CAMediaTimingFunction function);
    @Method(selector = "disableActions")
    public static native boolean disableActions();
    @Method(selector = "setDisableActions:")
    public static native void setDisableActions(boolean flag);
    @Method(selector = "completionBlock")
    public static native @Block Runnable completionBlock();
    @Method(selector = "setCompletionBlock:")
    public static native void setCompletionBlock(@Block Runnable block);
    @Method(selector = "valueForKey:")
    public static native NSObject valueForKey$(String key);
    @Method(selector = "setValue:forKey:")
    public static native void setValue$forKey$(NSObject anObject, String key);
    /*</methods>*/
}
