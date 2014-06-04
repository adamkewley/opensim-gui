/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CMCTool extends AbstractTool {
  private long swigCPtr;

  public CMCTool(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CMCTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CMCTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CMCTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CMCTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CMCTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CMCTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CMCTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CMCTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CMCTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CMCTool(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CMCTool_getConcreteClassName(swigCPtr, this);
  }

  public CMCTool() {
    this(opensimModelJNI.new_CMCTool__SWIG_0(), true);
  }

  public CMCTool(String aFileName, boolean aLoadModel) throws java.io.IOException {
    this(opensimModelJNI.new_CMCTool__SWIG_1(aFileName, aLoadModel), true);
  }

  public CMCTool(String aFileName) throws java.io.IOException {
    this(opensimModelJNI.new_CMCTool__SWIG_2(aFileName), true);
  }

  public CMCTool(CMCTool aObject) {
    this(opensimModelJNI.new_CMCTool__SWIG_3(CMCTool.getCPtr(aObject), aObject), true);
  }

  public ArrayStr getExcludedActuators() {
    return new ArrayStr(opensimModelJNI.CMCTool_getExcludedActuators(swigCPtr, this), false);
  }

  public void setExcludedActuators(ArrayStr excludedActs) {
    opensimModelJNI.CMCTool_setExcludedActuators(swigCPtr, this, ArrayStr.getCPtr(excludedActs), excludedActs);
  }

  public String getDesiredPointsFileName() {
    return opensimModelJNI.CMCTool_getDesiredPointsFileName(swigCPtr, this);
  }

  public void setDesiredPointsFileName(String aFileName) {
    opensimModelJNI.CMCTool_setDesiredPointsFileName(swigCPtr, this, aFileName);
  }

  public String getDesiredKinematicsFileName() {
    return opensimModelJNI.CMCTool_getDesiredKinematicsFileName(swigCPtr, this);
  }

  public void setDesiredKinematicsFileName(String aFileName) {
    opensimModelJNI.CMCTool_setDesiredKinematicsFileName(swigCPtr, this, aFileName);
  }

  public String getConstraintsFileName() {
    return opensimModelJNI.CMCTool_getConstraintsFileName(swigCPtr, this);
  }

  public void setConstraintsFileName(String aFileName) {
    opensimModelJNI.CMCTool_setConstraintsFileName(swigCPtr, this, aFileName);
  }

  public String getTaskSetFileName() {
    return opensimModelJNI.CMCTool_getTaskSetFileName(swigCPtr, this);
  }

  public void setTaskSetFileName(String aFileName) {
    opensimModelJNI.CMCTool_setTaskSetFileName(swigCPtr, this, aFileName);
  }

  public String getRRAControlsFileName() {
    return opensimModelJNI.CMCTool_getRRAControlsFileName(swigCPtr, this);
  }

  public void setRRAControlsFileName(String aFileName) {
    opensimModelJNI.CMCTool_setRRAControlsFileName(swigCPtr, this, aFileName);
  }

  public double getLowpassCutoffFrequency() {
    return opensimModelJNI.CMCTool_getLowpassCutoffFrequency(swigCPtr, this);
  }

  public void setLowpassCutoffFrequency(double aLowpassCutoffFrequency) {
    opensimModelJNI.CMCTool_setLowpassCutoffFrequency(swigCPtr, this, aLowpassCutoffFrequency);
  }

  public double getTimeWindow() {
    return opensimModelJNI.CMCTool_getTimeWindow(swigCPtr, this);
  }

  public void setTimeWindow(double aTargetDT) {
    opensimModelJNI.CMCTool_setTimeWindow(swigCPtr, this, aTargetDT);
  }

  public String getExternalLoadsFileName() {
    return opensimModelJNI.CMCTool_getExternalLoadsFileName(swigCPtr, this);
  }

  public void setExternalLoadsFileName(String aFileName) {
    opensimModelJNI.CMCTool_setExternalLoadsFileName(swigCPtr, this, aFileName);
  }

  public boolean getUseFastTarget() {
    return opensimModelJNI.CMCTool_getUseFastTarget(swigCPtr, this);
  }

  public void setUseFastTarget(boolean useFastTarget) {
    opensimModelJNI.CMCTool_setUseFastTarget(swigCPtr, this, useFastTarget);
  }

  public boolean run() throws java.io.IOException {
    return opensimModelJNI.CMCTool_run(swigCPtr, this);
  }

  public Storage getForceStorage() {
    return new Storage(opensimModelJNI.CMCTool_getForceStorage(swigCPtr, this), false);
  }

  public void setOriginalForceSet(ForceSet aForceSet) {
    opensimModelJNI.CMCTool_setOriginalForceSet(swigCPtr, this, ForceSet.getCPtr(aForceSet), aForceSet);
  }

}
