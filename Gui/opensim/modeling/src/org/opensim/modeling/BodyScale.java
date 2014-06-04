/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyScale extends OpenSimObject {
  private long swigCPtr;

  public BodyScale(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.BodyScale_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyScale obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BodyScale(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BodyScale safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.BodyScale_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BodyScale(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.BodyScale_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.BodyScale_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.BodyScale_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BodyScale(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.BodyScale_getConcreteClassName(swigCPtr, this);
  }

  public BodyScale() {
    this(opensimModelJNI.new_BodyScale__SWIG_0(), true);
  }

  public BodyScale(BodyScale aBodyScale) {
    this(opensimModelJNI.new_BodyScale__SWIG_1(BodyScale.getCPtr(aBodyScale), aBodyScale), true);
  }

  public void copyData(BodyScale aBodyScale) {
    opensimModelJNI.BodyScale_copyData(swigCPtr, this, BodyScale.getCPtr(aBodyScale), aBodyScale);
  }

  public ArrayStr getAxisNames() {
    return new ArrayStr(opensimModelJNI.BodyScale_getAxisNames(swigCPtr, this), false);
  }

  public void setAxisNames(ArrayStr aAxisNames) {
    opensimModelJNI.BodyScale_setAxisNames(swigCPtr, this, ArrayStr.getCPtr(aAxisNames), aAxisNames);
  }

}
