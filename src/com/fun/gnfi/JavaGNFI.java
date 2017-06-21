package com.fun.gnfi;

import org.graalvm.compiler.api.test.Graal;

import com.oracle.nfi.api.NativeFunctionHandle;
import com.oracle.nfi.api.NativeFunctionInterface;
import com.oracle.nfi.api.NativeLibraryHandle;


public class JavaGNFI {

	public static void main(String[] args) {
		NativeFunctionInterface ffi = Graal.getRequiredCapability(NativeFunctionInterface.class);
		NativeLibraryHandle libraryHandle = ffi.getLibraryHandle("/home/sgaikwad/sandbox/java/javaSandbox/src/com/fun/gnfi/JavaGNFI.so");
		NativeFunctionHandle functionHandle = ffi.getFunctionHandle(libraryHandle, "add", double.class, double.class);
		
		Object[] arg = new Object[1];
		arg[0] = new Double(10);
		//arg[1] = new Double(20);
		double result = (double) functionHandle.call(arg);
	}

}
