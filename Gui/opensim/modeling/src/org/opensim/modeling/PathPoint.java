/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathPoint extends AbstractPathPoint {
  private transient long swigCPtr;

  public PathPoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PathPoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathPoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PathPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathPoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PathPoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathPoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PathPoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PathPoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PathPoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathPoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PathPoint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location(PathPoint source) {
    opensimSimulationJNI.PathPoint_copyProperty_location(swigCPtr, this, PathPoint.getCPtr(source), source);
  }

  public Vec3 get_location(int i) {
    return new Vec3(opensimSimulationJNI.PathPoint_get_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location(int i) {
    return new Vec3(opensimSimulationJNI.PathPoint_upd_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location(int i, Vec3 value) {
    opensimSimulationJNI.PathPoint_set_location__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location(Vec3 value) {
    return opensimSimulationJNI.PathPoint_append_location(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location(Vec3 initValue) {
    opensimSimulationJNI.PathPoint_constructProperty_location(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location() {
    return new Vec3(opensimSimulationJNI.PathPoint_get_location__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location() {
    return new Vec3(opensimSimulationJNI.PathPoint_upd_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_location(Vec3 value) {
    opensimSimulationJNI.PathPoint_set_location__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public PathPoint() {
    this(opensimSimulationJNI.new_PathPoint(), true);
  }

  public void setLocationCoord(State s, int aXYZ, double aValue) {
    opensimSimulationJNI.PathPoint_setLocationCoord(swigCPtr, this, State.getCPtr(s), s, aXYZ, aValue);
  }

  public Vec3 getLocation(State s) {
    return new Vec3(opensimSimulationJNI.PathPoint_getLocation(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public void setLocation(Vec3 location) {
    opensimSimulationJNI.PathPoint_setLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void changeBodyPreserveLocation(State s, PhysicalFrame body) {
    opensimSimulationJNI.PathPoint_changeBodyPreserveLocation(swigCPtr, this, State.getCPtr(s), s, PhysicalFrame.getCPtr(body), body);
  }

  public void scale(Vec3 scaleFactors) {
    opensimSimulationJNI.PathPoint_scale(swigCPtr, this, Vec3.getCPtr(scaleFactors), scaleFactors);
  }

  public Vec3 getdPointdQ(State s) {
    return new Vec3(opensimSimulationJNI.PathPoint_getdPointdQ(swigCPtr, this, State.getCPtr(s), s), true);
  }

}
