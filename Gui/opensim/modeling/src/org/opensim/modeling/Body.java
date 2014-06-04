/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Body extends ModelComponent {
  private long swigCPtr;

  public Body(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Body_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Body obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Body(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Body safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Body_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Body_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Body_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Body_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Body(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Body_getConcreteClassName(swigCPtr, this);
  }

  public Body() {
    this(opensimModelJNI.new_Body__SWIG_0(), true);
  }

  public Body(String aName, double aMass, Vec3 aMassCenter, Inertia aInertia) {
    this(opensimModelJNI.new_Body__SWIG_1(aName, aMass, Vec3.getCPtr(aMassCenter), aMassCenter, Inertia.getCPtr(aInertia), aInertia), true);
  }

  public Body(Body aBody) {
    this(opensimModelJNI.new_Body__SWIG_2(Body.getCPtr(aBody), aBody), true);
  }

  public void copyData(Body aBody) {
    opensimModelJNI.Body_copyData(swigCPtr, this, Body.getCPtr(aBody), aBody);
  }

  public void addDisplayGeometry(String aGeometryFileName) {
    opensimModelJNI.Body_addDisplayGeometry(swigCPtr, this, aGeometryFileName);
  }

  public double getMass() {
    return opensimModelJNI.Body_getMass(swigCPtr, this);
  }

  public boolean setMass(double aMass) {
    return opensimModelJNI.Body_setMass(swigCPtr, this, aMass);
  }

  public void getMassCenter(Vec3 rVec) {
    opensimModelJNI.Body_getMassCenter(swigCPtr, this, Vec3.getCPtr(rVec), rVec);
  }

  public boolean setMassCenter(Vec3 aVec) {
    return opensimModelJNI.Body_setMassCenter(swigCPtr, this, Vec3.getCPtr(aVec), aVec);
  }

  public void getInertia(Mat33 rInertia) {
    opensimModelJNI.Body_getInertia__SWIG_0(swigCPtr, this, Mat33.getCPtr(rInertia), rInertia);
  }

  public boolean setInertia(Inertia aInertia) {
    return opensimModelJNI.Body_setInertia__SWIG_0(swigCPtr, this, Inertia.getCPtr(aInertia), aInertia);
  }

  public boolean hasJoint() {
    return opensimModelJNI.Body_hasJoint(swigCPtr, this);
  }

  public Joint getJoint() {
    return new Joint(opensimModelJNI.Body_getJoint(swigCPtr, this), false);
  }

  public void setJoint(Joint aJoint) {
    opensimModelJNI.Body_setJoint(swigCPtr, this, Joint.getCPtr(aJoint), aJoint);
  }

  public void scale(Vec3 aScaleFactors, boolean aScaleMass) {
    opensimModelJNI.Body_scale__SWIG_0(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors, aScaleMass);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelJNI.Body_scale__SWIG_1(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void scaleInertialProperties(Vec3 aScaleFactors, boolean aScaleMass) {
    opensimModelJNI.Body_scaleInertialProperties__SWIG_0(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors, aScaleMass);
  }

  public void scaleInertialProperties(Vec3 aScaleFactors) {
    opensimModelJNI.Body_scaleInertialProperties__SWIG_1(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void scaleMass(double aScaleFactor) {
    opensimModelJNI.Body_scaleMass(swigCPtr, this, aScaleFactor);
  }

  public VisibleObject getDisplayer() {
    long cPtr = opensimModelJNI.Body_getDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public VisibleObject updDisplayer() {
    long cPtr = opensimModelJNI.Body_updDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public int getIndex() {
    return opensimModelJNI.Body_getIndex(swigCPtr, this);
  }

  public void getScaleFactors(Vec3 aScaleFactors) {
    opensimModelJNI.Body_getScaleFactors(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void addWrapObject(WrapObject wrapObject) {
    opensimModelJNI.Body_addWrapObject(swigCPtr, this, WrapObject.getCPtr(wrapObject), wrapObject);
  }

  public WrapObject getWrapObject(String aName) {
    long cPtr = opensimModelJNI.Body_getWrapObject(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public WrapObjectSet getWrapObjectSet() {
    return new WrapObjectSet(opensimModelJNI.Body_getWrapObjectSet(swigCPtr, this), false);
  }

  public MassProperties getMassProperties() {
    return new MassProperties(opensimModelJNI.Body_getMassProperties(swigCPtr, this), true);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.Body_getNumStateVariables(swigCPtr, this);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.Body_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public void getCenterOfMass(double[] dCom) {
    opensimModelJNI.Body_getCenterOfMass(swigCPtr, this, dCom);
  }

  public void getInertia(ArrayDouble rInertia) {
    opensimModelJNI.Body_getInertia__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(rInertia), rInertia);
  }

  public void setInertia(ArrayDouble aInertia) {
    opensimModelJNI.Body_setInertia__SWIG_1(swigCPtr, this, ArrayDouble.getCPtr(aInertia), aInertia);
  }

}
