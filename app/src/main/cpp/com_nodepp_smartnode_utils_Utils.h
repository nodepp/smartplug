/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_nodepp_smartnode_utils_Utils */

#ifndef _Included_com_nodepp_smartnode_utils_Utils
#define _Included_com_nodepp_smartnode_utils_Utils
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_nodepp_smartnode_utils_Utils
 * Method:    encrypt
 * Signature: ([B[B)[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_nodepp_smartnode_utils_Utils_encrypt
  (JNIEnv *, jobject instance, jbyteArray, jbyteArray);

/*
 * Class:     com_nodepp_smartnode_utils_Utils
 * Method:    decrypt
 * Signature: ([B[B)[B
 */
JNIEXPORT jbyteArray JNICALL Java_com_nodepp_smartnode_utils_Utils_decrypt
  (JNIEnv *, jclass, jbyteArray, jbyteArray);

JNIEXPORT void JNICALL
Java_com_nodepp_smartnode_utils_Utils_disConnect(JNIEnv *env, jclass type);
#ifdef __cplusplus
}
#endif
#endif
