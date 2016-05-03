/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVectorOfVec3 extends RowVectorBaseVec3 {
  private transient long swigCPtr;

  protected RowVectorOfVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorOfVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RowVectorOfVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_RowVectorOfVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorOfVec3() {
    this(opensimSimbodyJNI.new_RowVectorOfVec3__SWIG_0(), true);
  }

  public RowVectorOfVec3(RowVectorOfVec3 src) {
    this(opensimSimbodyJNI.new_RowVectorOfVec3__SWIG_1(RowVectorOfVec3.getCPtr(src), src), true);
  }

  public RowVectorOfVec3(int n) {
    this(opensimSimbodyJNI.new_RowVectorOfVec3__SWIG_2(n), true);
  }

  public RowVectorOfVec3(int n, Vec3 cppInitialValues) {
    this(opensimSimbodyJNI.new_RowVectorOfVec3__SWIG_3(n, Vec3.getCPtr(cppInitialValues), cppInitialValues), true);
  }

  public RowVectorOfVec3(StdVectorVec3 row) {
    this(opensimSimbodyJNI.new_RowVectorOfVec3__SWIG_5(StdVectorVec3.getCPtr(row), row), true);
  }

}
