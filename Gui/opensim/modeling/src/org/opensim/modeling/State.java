/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class State {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public State(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(State obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_State(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public State() {
    this(opensimModelJNI.new_State__SWIG_0(), true);
  }

  public void clear() {
    opensimModelJNI.State_clear(swigCPtr, this);
  }

  public void setNumSubsystems(int i) {
    opensimModelJNI.State_setNumSubsystems(swigCPtr, this, i);
  }

  public State(State arg0) {
    this(opensimModelJNI.new_State__SWIG_1(State.getCPtr(arg0), arg0), true);
  }

  public int getNumSubsystems() {
    return opensimModelJNI.State_getNumSubsystems(swigCPtr, this);
  }

  public Stage getSystemStage() {
    return new Stage(opensimModelJNI.State_getSystemStage(swigCPtr, this), false);
  }

  public void invalidateAll(Stage arg0) {
    opensimModelJNI.State_invalidateAll(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public void invalidateAllCacheAtOrAbove(Stage arg0) {
    opensimModelJNI.State_invalidateAllCacheAtOrAbove(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public int getNY() {
    return opensimModelJNI.State_getNY(swigCPtr, this);
  }

  public int getNQ() {
    return opensimModelJNI.State_getNQ__SWIG_0(swigCPtr, this);
  }

  public int getQStart() {
    return opensimModelJNI.State_getQStart__SWIG_0(swigCPtr, this);
  }

  public int getNU() {
    return opensimModelJNI.State_getNU__SWIG_0(swigCPtr, this);
  }

  public int getUStart() {
    return opensimModelJNI.State_getUStart__SWIG_0(swigCPtr, this);
  }

  public int getNZ() {
    return opensimModelJNI.State_getNZ__SWIG_0(swigCPtr, this);
  }

  public int getZStart() {
    return opensimModelJNI.State_getZStart__SWIG_0(swigCPtr, this);
  }

  public int getNYErr() {
    return opensimModelJNI.State_getNYErr(swigCPtr, this);
  }

  public int getNQErr() {
    return opensimModelJNI.State_getNQErr__SWIG_0(swigCPtr, this);
  }

  public int getQErrStart() {
    return opensimModelJNI.State_getQErrStart__SWIG_0(swigCPtr, this);
  }

  public int getNUErr() {
    return opensimModelJNI.State_getNUErr__SWIG_0(swigCPtr, this);
  }

  public int getUErrStart() {
    return opensimModelJNI.State_getUErrStart__SWIG_0(swigCPtr, this);
  }

  public int getNUDotErr() {
    return opensimModelJNI.State_getNUDotErr__SWIG_0(swigCPtr, this);
  }

  public int getNMultipliers() {
    return opensimModelJNI.State_getNMultipliers(swigCPtr, this);
  }

  public int getNEventTriggers() {
    return opensimModelJNI.State_getNEventTriggers(swigCPtr, this);
  }

  public int getNEventTriggersByStage(Stage arg0) {
    return opensimModelJNI.State_getNEventTriggersByStage(swigCPtr, this, Stage.getCPtr(arg0), arg0);
  }

  public SWIGTYPE_p_SystemEventTriggerIndex getEventTriggerStartByStage(Stage arg0) {
    return new SWIGTYPE_p_SystemEventTriggerIndex(opensimModelJNI.State_getEventTriggerStartByStage(swigCPtr, this, Stage.getCPtr(arg0), arg0), true);
  }

  public int getQStart(int arg0) {
    return opensimModelJNI.State_getQStart__SWIG_1(swigCPtr, this, arg0);
  }

  public int getNQ(int arg0) {
    return opensimModelJNI.State_getNQ__SWIG_1(swigCPtr, this, arg0);
  }

  public int getUStart(int arg0) {
    return opensimModelJNI.State_getUStart__SWIG_1(swigCPtr, this, arg0);
  }

  public int getNU(int arg0) {
    return opensimModelJNI.State_getNU__SWIG_1(swigCPtr, this, arg0);
  }

  public int getZStart(int arg0) {
    return opensimModelJNI.State_getZStart__SWIG_1(swigCPtr, this, arg0);
  }

  public int getNZ(int arg0) {
    return opensimModelJNI.State_getNZ__SWIG_1(swigCPtr, this, arg0);
  }

  public int getQErrStart(int arg0) {
    return opensimModelJNI.State_getQErrStart__SWIG_1(swigCPtr, this, arg0);
  }

  public int getNQErr(int arg0) {
    return opensimModelJNI.State_getNQErr__SWIG_1(swigCPtr, this, arg0);
  }

  public int getUErrStart(int arg0) {
    return opensimModelJNI.State_getUErrStart__SWIG_1(swigCPtr, this, arg0);
  }

  public int getNUErr(int arg0) {
    return opensimModelJNI.State_getNUErr__SWIG_1(swigCPtr, this, arg0);
  }

  public int getUDotErrStart(int arg0) {
    return opensimModelJNI.State_getUDotErrStart(swigCPtr, this, arg0);
  }

  public int getNUDotErr(int arg0) {
    return opensimModelJNI.State_getNUDotErr__SWIG_1(swigCPtr, this, arg0);
  }

  public Vector getEventTriggers() {
    return new Vector(opensimModelJNI.State_getEventTriggers(swigCPtr, this), false);
  }

  public Vector getEventTriggersByStage(Stage arg0) {
    return new Vector(opensimModelJNI.State_getEventTriggersByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0), false);
  }

  public Vector getEventTriggersByStage(int arg0, Stage arg1) {
    return new Vector(opensimModelJNI.State_getEventTriggersByStage__SWIG_1(swigCPtr, this, arg0, Stage.getCPtr(arg1), arg1), false);
  }

  public Vector updEventTriggers() {
    return new Vector(opensimModelJNI.State_updEventTriggers(swigCPtr, this), false);
  }

  public Vector updEventTriggersByStage(Stage arg0) {
    return new Vector(opensimModelJNI.State_updEventTriggersByStage__SWIG_0(swigCPtr, this, Stage.getCPtr(arg0), arg0), false);
  }

  public Vector updEventTriggersByStage(int arg0, Stage arg1) {
    return new Vector(opensimModelJNI.State_updEventTriggersByStage__SWIG_1(swigCPtr, this, arg0, Stage.getCPtr(arg1), arg1), false);
  }

  public Vector getQ(int arg0) {
    return new Vector(opensimModelJNI.State_getQ__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getU(int arg0) {
    return new Vector(opensimModelJNI.State_getU__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getZ(int arg0) {
    return new Vector(opensimModelJNI.State_getZ__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getUWeights(int arg0) {
    return new Vector(opensimModelJNI.State_getUWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getZWeights(int arg0) {
    return new Vector(opensimModelJNI.State_getZWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updQ(int arg0) {
    return new Vector(opensimModelJNI.State_updQ__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updU(int arg0) {
    return new Vector(opensimModelJNI.State_updU__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updZ(int arg0) {
    return new Vector(opensimModelJNI.State_updZ__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updUWeights(int arg0) {
    return new Vector(opensimModelJNI.State_updUWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updZWeights(int arg0) {
    return new Vector(opensimModelJNI.State_updZWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getQDot(int arg0) {
    return new Vector(opensimModelJNI.State_getQDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getUDot(int arg0) {
    return new Vector(opensimModelJNI.State_getUDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getZDot(int arg0) {
    return new Vector(opensimModelJNI.State_getZDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getQDotDot(int arg0) {
    return new Vector(opensimModelJNI.State_getQDotDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updQDot(int arg0) {
    return new Vector(opensimModelJNI.State_updQDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updUDot(int arg0) {
    return new Vector(opensimModelJNI.State_updUDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updZDot(int arg0) {
    return new Vector(opensimModelJNI.State_updZDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updQDotDot(int arg0) {
    return new Vector(opensimModelJNI.State_updQDotDot__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getQErr(int arg0) {
    return new Vector(opensimModelJNI.State_getQErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getUErr(int arg0) {
    return new Vector(opensimModelJNI.State_getUErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getUDotErr(int arg0) {
    return new Vector(opensimModelJNI.State_getUDotErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getMultipliers(int arg0) {
    return new Vector(opensimModelJNI.State_getMultipliers__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getQErrWeights(int arg0) {
    return new Vector(opensimModelJNI.State_getQErrWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector getUErrWeights(int arg0) {
    return new Vector(opensimModelJNI.State_getUErrWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updQErr(int arg0) {
    return new Vector(opensimModelJNI.State_updQErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updUErr(int arg0) {
    return new Vector(opensimModelJNI.State_updUErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updUDotErr(int arg0) {
    return new Vector(opensimModelJNI.State_updUDotErr__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updMultipliers(int arg0) {
    return new Vector(opensimModelJNI.State_updMultipliers__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updQErrWeights(int arg0) {
    return new Vector(opensimModelJNI.State_updQErrWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public Vector updUErrWeights(int arg0) {
    return new Vector(opensimModelJNI.State_updUErrWeights__SWIG_0(swigCPtr, this, arg0), false);
  }

  public double getTime() {
    return opensimModelJNI.State_getTime(swigCPtr, this);
  }

  public Vector getY() {
    return new Vector(opensimModelJNI.State_getY(swigCPtr, this), false);
  }

  public Vector getQ() {
    return new Vector(opensimModelJNI.State_getQ__SWIG_1(swigCPtr, this), false);
  }

  public Vector getU() {
    return new Vector(opensimModelJNI.State_getU__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZ() {
    return new Vector(opensimModelJNI.State_getZ__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUWeights() {
    return new Vector(opensimModelJNI.State_getUWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZWeights() {
    return new Vector(opensimModelJNI.State_getZWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUWeights() {
    return new Vector(opensimModelJNI.State_updUWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZWeights() {
    return new Vector(opensimModelJNI.State_updZWeights__SWIG_1(swigCPtr, this), false);
  }

  public SWIGTYPE_p_double updTime() {
    return new SWIGTYPE_p_double(opensimModelJNI.State_updTime(swigCPtr, this), false);
  }

  public Vector updY() {
    return new Vector(opensimModelJNI.State_updY(swigCPtr, this), false);
  }

  public void setTime(double t) {
    opensimModelJNI.State_setTime(swigCPtr, this, t);
  }

  public void setY(Vector y) {
    opensimModelJNI.State_setY(swigCPtr, this, Vector.getCPtr(y), y);
  }

  public Vector updQ() {
    return new Vector(opensimModelJNI.State_updQ__SWIG_1(swigCPtr, this), false);
  }

  public Vector updU() {
    return new Vector(opensimModelJNI.State_updU__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZ() {
    return new Vector(opensimModelJNI.State_updZ__SWIG_1(swigCPtr, this), false);
  }

  public void setQ(Vector q) {
    opensimModelJNI.State_setQ(swigCPtr, this, Vector.getCPtr(q), q);
  }

  public void setU(Vector u) {
    opensimModelJNI.State_setU(swigCPtr, this, Vector.getCPtr(u), u);
  }

  public void setZ(Vector z) {
    opensimModelJNI.State_setZ(swigCPtr, this, Vector.getCPtr(z), z);
  }

  public Vector getYDot() {
    return new Vector(opensimModelJNI.State_getYDot(swigCPtr, this), false);
  }

  public Vector getQDot() {
    return new Vector(opensimModelJNI.State_getQDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getZDot() {
    return new Vector(opensimModelJNI.State_getZDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUDot() {
    return new Vector(opensimModelJNI.State_getUDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getQDotDot() {
    return new Vector(opensimModelJNI.State_getQDotDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updYDot() {
    return new Vector(opensimModelJNI.State_updYDot(swigCPtr, this), false);
  }

  public Vector updQDot() {
    return new Vector(opensimModelJNI.State_updQDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updZDot() {
    return new Vector(opensimModelJNI.State_updZDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUDot() {
    return new Vector(opensimModelJNI.State_updUDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector updQDotDot() {
    return new Vector(opensimModelJNI.State_updQDotDot__SWIG_1(swigCPtr, this), false);
  }

  public Vector getYErr() {
    return new Vector(opensimModelJNI.State_getYErr(swigCPtr, this), false);
  }

  public Vector getQErr() {
    return new Vector(opensimModelJNI.State_getQErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUErr() {
    return new Vector(opensimModelJNI.State_getUErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUDotErr() {
    return new Vector(opensimModelJNI.State_getUDotErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector getMultipliers() {
    return new Vector(opensimModelJNI.State_getMultipliers__SWIG_1(swigCPtr, this), false);
  }

  public Vector getQErrWeights() {
    return new Vector(opensimModelJNI.State_getQErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector getUErrWeights() {
    return new Vector(opensimModelJNI.State_getUErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updQErrWeights() {
    return new Vector(opensimModelJNI.State_updQErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUErrWeights() {
    return new Vector(opensimModelJNI.State_updUErrWeights__SWIG_1(swigCPtr, this), false);
  }

  public Vector updYErr() {
    return new Vector(opensimModelJNI.State_updYErr(swigCPtr, this), false);
  }

  public Vector updQErr() {
    return new Vector(opensimModelJNI.State_updQErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUErr() {
    return new Vector(opensimModelJNI.State_updUErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updUDotErr() {
    return new Vector(opensimModelJNI.State_updUDotErr__SWIG_1(swigCPtr, this), false);
  }

  public Vector updMultipliers() {
    return new Vector(opensimModelJNI.State_updMultipliers__SWIG_1(swigCPtr, this), false);
  }

  public void getSystemStageVersions(SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t versions) {
    opensimModelJNI.State_getSystemStageVersions(swigCPtr, this, SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t.getCPtr(versions));
  }

  public Stage getLowestSystemStageDifference(SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t prevVersions) {
    return new Stage(opensimModelJNI.State_getLowestSystemStageDifference(swigCPtr, this, SWIGTYPE_p_SimTK__Array_T_int_unsigned_int_t.getCPtr(prevVersions)), true);
  }

  public void setSystemTopologyStageVersion(int topoVersion) {
    opensimModelJNI.State_setSystemTopologyStageVersion(swigCPtr, this, topoVersion);
  }

  public void autoUpdateDiscreteVariables() {
    opensimModelJNI.State_autoUpdateDiscreteVariables(swigCPtr, this);
  }

  public SWIGTYPE_p_String cacheToString() {
    return new SWIGTYPE_p_String(opensimModelJNI.State_cacheToString(swigCPtr, this), true);
  }

}
