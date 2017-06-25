/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ConstraintSet extends ModelComponentSetConstraints {
  private transient long swigCPtr;

  public ConstraintSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ConstraintSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConstraintSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ConstraintSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ConstraintSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ConstraintSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ConstraintSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ConstraintSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ConstraintSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ConstraintSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ConstraintSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ConstraintSet_getConcreteClassName(swigCPtr, this);
  }

  public ConstraintSet() {
    this(opensimSimulationJNI.new_ConstraintSet__SWIG_0(), true);
  }

  public ConstraintSet(Model model) {
    this(opensimSimulationJNI.new_ConstraintSet__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ConstraintSet(Model model, String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ConstraintSet__SWIG_2(Model.getCPtr(model), model, aFileName, aUpdateFromXMLNode), true);
  }

  public ConstraintSet(Model model, String aFileName) {
    this(opensimSimulationJNI.new_ConstraintSet__SWIG_3(Model.getCPtr(model), model, aFileName), true);
  }

  public ConstraintSet(ConstraintSet aAbsConstraintSet) {
    this(opensimSimulationJNI.new_ConstraintSet__SWIG_4(ConstraintSet.getCPtr(aAbsConstraintSet), aAbsConstraintSet), true);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimSimulationJNI.ConstraintSet_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
