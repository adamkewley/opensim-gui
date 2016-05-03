/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MassProperties {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MassProperties(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MassProperties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MassProperties(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MassProperties() {
    this(opensimSimbodyJNI.new_MassProperties(), true);
  }

  public boolean isExactlyMassless() {
    return opensimSimbodyJNI.MassProperties_isExactlyMassless(swigCPtr, this);
  }

  public boolean isNearlyMassless(double tol) {
    return opensimSimbodyJNI.MassProperties_isNearlyMassless__SWIG_0(swigCPtr, this, tol);
  }

  public boolean isNearlyMassless() {
    return opensimSimbodyJNI.MassProperties_isNearlyMassless__SWIG_1(swigCPtr, this);
  }

  public boolean isExactlyCentral() {
    return opensimSimbodyJNI.MassProperties_isExactlyCentral(swigCPtr, this);
  }

  public boolean isNearlyCentral(double tol) {
    return opensimSimbodyJNI.MassProperties_isNearlyCentral__SWIG_0(swigCPtr, this, tol);
  }

  public boolean isNearlyCentral() {
    return opensimSimbodyJNI.MassProperties_isNearlyCentral__SWIG_1(swigCPtr, this);
  }

  public boolean isNaN() {
    return opensimSimbodyJNI.MassProperties_isNaN(swigCPtr, this);
  }

  public boolean isInf() {
    return opensimSimbodyJNI.MassProperties_isInf(swigCPtr, this);
  }

  public boolean isFinite() {
    return opensimSimbodyJNI.MassProperties_isFinite(swigCPtr, this);
  }

}
