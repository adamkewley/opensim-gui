/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Component extends OpenSimObject {
  private long swigCPtr;

  public Component(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Component_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Component obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Component(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Component safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Component_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Component_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Component_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Component_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Component_getConcreteClassName(swigCPtr, this);
  }

  public void finalizeFromProperties() {
    opensimModelJNI.Component_finalizeFromProperties(swigCPtr, this);
  }

  public void connect(Component root) {
    opensimModelJNI.Component_connect(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void disconnect() {
    opensimModelJNI.Component_disconnect(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.Component_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.Component_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void setPropertiesFromState(State state) {
    opensimModelJNI.Component_setPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.Component_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.Component_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.Component_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.Component_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.Component_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.Component_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.Component_getConnector(swigCPtr, this, i), false);
  }

  public AbstractConnector updConnector(int i) {
    return new AbstractConnector(opensimModelJNI.Component_updConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.Component_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.Component_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.Component_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.Component_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.Component_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.Component_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.Component_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.Component_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.Component_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimModelJNI.Component_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.Component_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.Component_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.Component_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.Component_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.Component_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.Component_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.Component_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.Component_dumpPathName(swigCPtr, this);
  }

  public BodiesList getBodiesList() {
    return new BodiesList(opensimModelJNI.Component_getBodiesList(swigCPtr, this), true);
  }

  public MusclesList getMusclesList() {
    return new MusclesList(opensimModelJNI.Component_getMusclesList(swigCPtr, this), true);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelJNI.Component_getComponentsList(swigCPtr, this), true);
  }

  public ModelComponentList getModelComponentList() {
    return new ModelComponentList(opensimModelJNI.Component_getModelComponentList(swigCPtr, this), true);
  }

  public JointsList getJointList() {
    return new JointsList(opensimModelJNI.Component_getJointList(swigCPtr, this), true);
  }

}
