/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AnalyticGeometry extends Geometry {
  private transient long swigCPtr;

  public AnalyticGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.AnalyticGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AnalyticGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_AnalyticGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AnalyticGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.AnalyticGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AnalyticGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.AnalyticGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.AnalyticGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.AnalyticGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AnalyticGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.AnalyticGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void setQuadrants(boolean[] quadrants) {
    opensimSimulationJNI.AnalyticGeometry_setQuadrants(swigCPtr, this, quadrants);
  }

  public void getQuadrants(boolean[] quadrants) {
    opensimSimulationJNI.AnalyticGeometry_getQuadrants(swigCPtr, this, quadrants);
  }

  public boolean isPiece() {
    return opensimSimulationJNI.AnalyticGeometry_isPiece(swigCPtr, this);
  }

}
