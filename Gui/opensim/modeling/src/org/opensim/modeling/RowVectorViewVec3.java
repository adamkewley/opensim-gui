/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVectorViewVec3 extends RowVectorBaseVec3 {
  private transient long swigCPtr;

  public RowVectorViewVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.RowVectorViewVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorViewVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_RowVectorViewVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorViewVec3(RowVectorViewVec3 r) {
    this(opensimModelJNI.new_RowVectorViewVec3(RowVectorViewVec3.getCPtr(r), r), true);
  }

}
