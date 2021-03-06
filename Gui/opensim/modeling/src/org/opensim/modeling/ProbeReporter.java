/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ProbeReporter extends Analysis {
  private transient long swigCPtr;

  public ProbeReporter(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ProbeReporter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ProbeReporter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_ProbeReporter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ProbeReporter safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ProbeReporter_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ProbeReporter(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ProbeReporter_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ProbeReporter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ProbeReporter(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_getConcreteClassName(swigCPtr, this);
  }

  public ProbeReporter(Model aModel) {
    this(opensimActuatorsAnalysesToolsJNI.new_ProbeReporter__SWIG_0(Model.getCPtr(aModel), aModel), true);
  }

  public ProbeReporter() {
    this(opensimActuatorsAnalysesToolsJNI.new_ProbeReporter__SWIG_1(), true);
  }

  public ProbeReporter(String aFileName) {
    this(opensimActuatorsAnalysesToolsJNI.new_ProbeReporter__SWIG_2(aFileName), true);
  }

  public ProbeReporter(ProbeReporter aObject) {
    this(opensimActuatorsAnalysesToolsJNI.new_ProbeReporter__SWIG_3(ProbeReporter.getCPtr(aObject), aObject), true);
  }

  public Storage getProbeStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.ProbeReporter_getProbeStorage(swigCPtr, this), false);
  }

  public Storage updProbeStorage() {
    return new Storage(opensimActuatorsAnalysesToolsJNI.ProbeReporter_updProbeStorage(swigCPtr, this), false);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.ProbeReporter_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public int begin(State s) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_begin(swigCPtr, this, State.getCPtr(s), s);
  }

  public int step(State s, int setNumber) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_step(swigCPtr, this, State.getCPtr(s), s, setNumber);
  }

  public int end(State s) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_end(swigCPtr, this, State.getCPtr(s), s);
  }

  public void disableIntegrationOnlyProbes() {
    opensimActuatorsAnalysesToolsJNI.ProbeReporter_disableIntegrationOnlyProbes(swigCPtr, this);
  }

  public int printResults(String aBaseName, String aDir, double aDT, String aExtension) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_printResults__SWIG_0(swigCPtr, this, aBaseName, aDir, aDT, aExtension);
  }

  public int printResults(String aBaseName, String aDir, double aDT) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_printResults__SWIG_1(swigCPtr, this, aBaseName, aDir, aDT);
  }

  public int printResults(String aBaseName, String aDir) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_printResults__SWIG_2(swigCPtr, this, aBaseName, aDir);
  }

  public int printResults(String aBaseName) {
    return opensimActuatorsAnalysesToolsJNI.ProbeReporter_printResults__SWIG_3(swigCPtr, this, aBaseName);
  }

}
