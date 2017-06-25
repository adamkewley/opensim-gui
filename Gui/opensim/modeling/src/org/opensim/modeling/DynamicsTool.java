/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DynamicsTool extends Tool {
  private transient long swigCPtr;

  public DynamicsTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.DynamicsTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DynamicsTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_DynamicsTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static DynamicsTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.DynamicsTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new DynamicsTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.DynamicsTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DynamicsTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getConcreteClassName(swigCPtr, this);
  }

  public void disableModelForces(Model model, State s, ArrayStr forcesByNameOrGroup) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_disableModelForces(swigCPtr, this, Model.getCPtr(model), model, State.getCPtr(s), s, ArrayStr.getCPtr(forcesByNameOrGroup), forcesByNameOrGroup);
  }

  public ExternalLoads getExternalLoads() {
    return new ExternalLoads(opensimActuatorsAnalysesToolsJNI.DynamicsTool_getExternalLoads(swigCPtr, this), false);
  }

  public ExternalLoads updExternalLoads() {
    return new ExternalLoads(opensimActuatorsAnalysesToolsJNI.DynamicsTool_updExternalLoads(swigCPtr, this), false);
  }

  public String getExternalLoadsFileName() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getExternalLoadsFileName(swigCPtr, this);
  }

  public void setExternalLoadsFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setExternalLoadsFileName(swigCPtr, this, aFileName);
  }

  public void setModelFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setModelFileName(swigCPtr, this, aFileName);
  }

  public String getModelFileName() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getModelFileName(swigCPtr, this);
  }

  public void setStartTime(double d) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setStartTime(swigCPtr, this, d);
  }

  public double getStartTime() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getStartTime(swigCPtr, this);
  }

  public void setEndTime(double d) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setEndTime(swigCPtr, this, d);
  }

  public double getEndTime() {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_getEndTime(swigCPtr, this);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public void setExcludedForces(ArrayStr aExcluded) {
    opensimActuatorsAnalysesToolsJNI.DynamicsTool_setExcludedForces(swigCPtr, this, ArrayStr.getCPtr(aExcluded), aExcluded);
  }

  public boolean createExternalLoads(String aExternalLoadsFileName, Model aModel, Storage loadKinematics) {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_createExternalLoads__SWIG_0(swigCPtr, this, aExternalLoadsFileName, Model.getCPtr(aModel), aModel, Storage.getCPtr(loadKinematics), loadKinematics);
  }

  public boolean createExternalLoads(String aExternalLoadsFileName, Model aModel) {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_createExternalLoads__SWIG_1(swigCPtr, this, aExternalLoadsFileName, Model.getCPtr(aModel), aModel);
  }

  public boolean run() throws java.io.IOException {
    return opensimActuatorsAnalysesToolsJNI.DynamicsTool_run(swigCPtr, this);
  }

}
