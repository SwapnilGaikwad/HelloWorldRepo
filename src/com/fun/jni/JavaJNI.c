#include<jni.h>
#include<stdio.h>
#include "com_fun_jni_JavaJNI.h"

JNIEXPORT void JNICALL Java_com_fun_jni_JavaJNI_printHello(JNIEnv *, jclass) {
    printf("Hello World!!!\n");
    return;
}
