/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerFrame extends OpenSimObject {
  private long swigCPtr;

  public MarkerFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MarkerFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MarkerFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerFrame safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MarkerFrame_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MarkerFrame_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MarkerFrame_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MarkerFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerFrame(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MarkerFrame_getConcreteClassName(swigCPtr, this);
  }

  public MarkerFrame() {
    this(opensimModelJNI.new_MarkerFrame__SWIG_0(), true);
  }

  public MarkerFrame(int aNumMarkers, int aFrameNumber, double aTime, Units aUnits) {
    this(opensimModelJNI.new_MarkerFrame__SWIG_1(aNumMarkers, aFrameNumber, aTime, Units.getCPtr(aUnits), aUnits), true);
  }

  public MarkerFrame(MarkerFrame aFrame) {
    this(opensimModelJNI.new_MarkerFrame__SWIG_2(MarkerFrame.getCPtr(aFrame), aFrame), true);
  }

  public void addMarker(Vec3 aCoords) {
    opensimModelJNI.MarkerFrame_addMarker(swigCPtr, this, Vec3.getCPtr(aCoords), aCoords);
  }

  public Vec3 getMarker(int aIndex) {
    return new Vec3(opensimModelJNI.MarkerFrame_getMarker(swigCPtr, this, aIndex), true);
  }

  public Vec3 updMarker(int aIndex) {
    return new Vec3(opensimModelJNI.MarkerFrame_updMarker(swigCPtr, this, aIndex), false);
  }

  public int getFrameNumber() {
    return opensimModelJNI.MarkerFrame_getFrameNumber(swigCPtr, this);
  }

  public void setFrameNumber(int aNumber) {
    opensimModelJNI.MarkerFrame_setFrameNumber(swigCPtr, this, aNumber);
  }

  public double getFrameTime() {
    return opensimModelJNI.MarkerFrame_getFrameTime(swigCPtr, this);
  }

  public void scale(double aScaleFactor) {
    opensimModelJNI.MarkerFrame_scale(swigCPtr, this, aScaleFactor);
  }

  public SimTKArrayVec3 getMarkers() {
    return new SimTKArrayVec3(opensimModelJNI.MarkerFrame_getMarkers(swigCPtr, this), false);
  }

}
