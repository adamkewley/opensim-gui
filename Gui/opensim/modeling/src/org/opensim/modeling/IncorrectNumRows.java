/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IncorrectNumRows extends InvalidColumn {
  private transient long swigCPtr;

  public IncorrectNumRows(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.IncorrectNumRows_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IncorrectNumRows obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_IncorrectNumRows(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IncorrectNumRows(String file, long line, String func, long expected, long received) {
    this(opensimCommonJNI.new_IncorrectNumRows(file, line, func, expected, received), true);
  }

}
