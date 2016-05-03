/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetContactGeometry extends SetContactGeometry {
  private transient long swigCPtr;

  public ModelComponentSetContactGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ModelComponentSetContactGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetContactGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ModelComponentSetContactGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetContactGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetContactGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetContactGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ModelComponentSetContactGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ModelComponentSetContactGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetContactGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetContactGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ModelComponentSetContactGeometry_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetContactGeometry() {
    this(opensimModelSimulationJNI.new_ModelComponentSetContactGeometry__SWIG_0(), true);
  }

  public ModelComponentSetContactGeometry(Model model) {
    this(opensimModelSimulationJNI.new_ModelComponentSetContactGeometry__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetContactGeometry(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_ModelComponentSetContactGeometry__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetContactGeometry(Model model, String fileName) {
    this(opensimModelSimulationJNI.new_ModelComponentSetContactGeometry__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetContactGeometry(ModelComponentSetContactGeometry source) {
    this(opensimModelSimulationJNI.new_ModelComponentSetContactGeometry__SWIG_4(ModelComponentSetContactGeometry.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, ContactGeometry aObject) {
    return opensimModelSimulationJNI.ModelComponentSetContactGeometry_insert(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, ContactGeometry aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.ModelComponentSetContactGeometry_set__SWIG_0(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, ContactGeometry aObject) {
    return opensimModelSimulationJNI.ModelComponentSetContactGeometry_set__SWIG_1(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelSimulationJNI.ModelComponentSetContactGeometry_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimModelSimulationJNI.ModelComponentSetContactGeometry_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimModelSimulationJNI.ModelComponentSetContactGeometry_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.ModelComponentSetContactGeometry_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
