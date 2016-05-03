/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IncorrectMetaDataLength extends OpenSimException {
  private transient long swigCPtr;

  public IncorrectMetaDataLength(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.IncorrectMetaDataLength_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IncorrectMetaDataLength obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_IncorrectMetaDataLength(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IncorrectMetaDataLength(String file, long line, String func, String key, long expected, long received) {
    this(opensimModelCommonJNI.new_IncorrectMetaDataLength(file, line, func, key, expected, received), true);
  }

}
