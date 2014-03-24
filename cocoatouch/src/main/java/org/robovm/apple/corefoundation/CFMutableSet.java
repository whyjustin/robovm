/*
 * Copyright (C) 2014 Trillian AB
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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/**
 *
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("CoreFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFMutableSet/*</name>*/ 
    extends /*<extends>*/CFSet/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CFMutableSetPtr extends Ptr<CFMutableSet, CFMutableSetPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CFMutableSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CFMutableSet() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Bridge(symbol="CFSetCreateMutable")
    public static native CFMutableSet createMutable(CFAllocator allocator, @MachineSizedSInt long capacity, CFSetCallBacks callBacks);
    @Bridge(symbol="CFSetCreateMutableCopy")
    public static native CFMutableSet createMutableCopy(CFAllocator allocator, @MachineSizedSInt long capacity, CFSet theSet);
    @Bridge(symbol="CFSetAddValue")
    public native void addValue(VoidPtr value);
    @Bridge(symbol="CFSetReplaceValue")
    public native void replaceValue(VoidPtr value);
    @Bridge(symbol="CFSetSetValue")
    public native void setValue(VoidPtr value);
    @Bridge(symbol="CFSetRemoveValue")
    public native void removeValue(VoidPtr value);
    @Bridge(symbol="CFSetRemoveAllValues")
    public native void removeAllValues();
    /*</methods>*/
}