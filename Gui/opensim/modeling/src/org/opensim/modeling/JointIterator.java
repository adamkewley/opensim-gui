/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointIterator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public JointIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_JointIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(JointIterator iter) {
    return opensimModelJNI.JointIterator_equals(swigCPtr, this, JointIterator.getCPtr(iter), iter);
  }

  public Joint __ref__() {
    return new Joint(opensimModelJNI.JointIterator___ref__(swigCPtr, this), false);
  }

  public Joint __deref__() {
    long cPtr = opensimModelJNI.JointIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public JointIterator next() {
    return new JointIterator(opensimModelJNI.JointIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.JointIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.JointIterator_getConcreteClassName(swigCPtr, this);
  }

  public Vec3 get_location_in_parent(int i) {
    return new Vec3(opensimModelJNI.JointIterator_get_location_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_location_in_parent() {
    return new Vec3(opensimModelJNI.JointIterator_get_location_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 get_orientation_in_parent(int i) {
    return new Vec3(opensimModelJNI.JointIterator_get_orientation_in_parent__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_orientation_in_parent() {
    return new Vec3(opensimModelJNI.JointIterator_get_orientation_in_parent__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 get_location_in_child(int i) {
    return new Vec3(opensimModelJNI.JointIterator_get_location_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_location_in_child() {
    return new Vec3(opensimModelJNI.JointIterator_get_location_in_child__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 get_orientation_in_child(int i) {
    return new Vec3(opensimModelJNI.JointIterator_get_orientation_in_child__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 get_orientation_in_child() {
    return new Vec3(opensimModelJNI.JointIterator_get_orientation_in_child__SWIG_1(swigCPtr, this), false);
  }

  public CoordinateSet get_CoordinateSet(int i) {
    return new CoordinateSet(opensimModelJNI.JointIterator_get_CoordinateSet__SWIG_0(swigCPtr, this, i), false);
  }

  public CoordinateSet get_CoordinateSet() {
    return new CoordinateSet(opensimModelJNI.JointIterator_get_CoordinateSet__SWIG_1(swigCPtr, this), false);
  }

  public boolean get_reverse(int i) {
    return opensimModelJNI.JointIterator_get_reverse__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_reverse() {
    return opensimModelJNI.JointIterator_get_reverse__SWIG_1(swigCPtr, this);
  }

  public String getChildBodyName() {
    return opensimModelJNI.JointIterator_getChildBodyName(swigCPtr, this);
  }

  public Body getChildBody() {
    return new Body(opensimModelJNI.JointIterator_getChildBody(swigCPtr, this), false);
  }

  public Vec3 getLocationInChild() {
    return new Vec3(opensimModelJNI.JointIterator_getLocationInChild(swigCPtr, this), false);
  }

  public Vec3 getOrientationInChild() {
    return new Vec3(opensimModelJNI.JointIterator_getOrientationInChild(swigCPtr, this), false);
  }

  public String getParentBodyName() {
    return opensimModelJNI.JointIterator_getParentBodyName(swigCPtr, this);
  }

  public Body getParentBody() {
    return new Body(opensimModelJNI.JointIterator_getParentBody(swigCPtr, this), false);
  }

  public Vec3 getLocationInParent() {
    return new Vec3(opensimModelJNI.JointIterator_getLocationInParent(swigCPtr, this), false);
  }

  public Vec3 getOrientationInParent() {
    return new Vec3(opensimModelJNI.JointIterator_getOrientationInParent(swigCPtr, this), false);
  }

  public Transform getParentTransform() {
    return new Transform(opensimModelJNI.JointIterator_getParentTransform(swigCPtr, this), false);
  }

  public Transform getChildTransform() {
    return new Transform(opensimModelJNI.JointIterator_getChildTransform(swigCPtr, this), false);
  }

  public CoordinateSet getCoordinateSet() {
    return new CoordinateSet(opensimModelJNI.JointIterator_getCoordinateSet(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelJNI.JointIterator_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelJNI.JointIterator_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelJNI.JointIterator_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State s, Vector mobilityForces) {
    return new SpatialVec(opensimModelJNI.JointIterator_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(s), s, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public double calcPower(State s) {
    return opensimModelJNI.JointIterator_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public Geometry get_GeometrySet(int i) {
    return new Geometry(opensimModelJNI.JointIterator_get_GeometrySet(swigCPtr, this, i), false);
  }

  public Model getModel() {
    return new Model(opensimModelJNI.JointIterator_getModel(swigCPtr, this), false);
  }

  public int getGeometrySize() {
    return opensimModelJNI.JointIterator_getGeometrySize(swigCPtr, this);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelJNI.JointIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelJNI.JointIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelJNI.JointIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelJNI.JointIterator_getSystem(swigCPtr, this), false);
  }

  public Component getComponent(String name) {
    return new Component(opensimModelJNI.JointIterator_getComponent(swigCPtr, this, name), false);
  }

  public Component updComponent(String name) {
    return new Component(opensimModelJNI.JointIterator_updComponent(swigCPtr, this, name), false);
  }

  public int getNumStateVariables() {
    return opensimModelJNI.JointIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelJNI.JointIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelJNI.JointIterator_getNumConnectors(swigCPtr, this);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelJNI.JointIterator_getConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelJNI.JointIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelJNI.JointIterator_getOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.JointIterator_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_std__unique_ptrT_OpenSim__AbstractOutput_const_t_t__const_iterator(opensimModelJNI.JointIterator_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelJNI.JointIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelJNI.JointIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelJNI.JointIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelJNI.JointIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelJNI.JointIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelJNI.JointIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelJNI.JointIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelJNI.JointIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelJNI.JointIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelJNI.JointIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelJNI.JointIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public String getPathName() {
    return opensimModelJNI.JointIterator_getPathName(swigCPtr, this);
  }

  public void dumpPathName() {
    opensimModelJNI.JointIterator_dumpPathName(swigCPtr, this);
  }

  public BodiesList getBodiesList() {
    return new BodiesList(opensimModelJNI.JointIterator_getBodiesList(swigCPtr, this), true);
  }

  public MusclesList getMusclesList() {
    return new MusclesList(opensimModelJNI.JointIterator_getMusclesList(swigCPtr, this), true);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelJNI.JointIterator_getComponentsList(swigCPtr, this), true);
  }

  public ModelComponentList getModelComponentList() {
    return new ModelComponentList(opensimModelJNI.JointIterator_getModelComponentList(swigCPtr, this), true);
  }

  public JointsList getJointList() {
    return new JointsList(opensimModelJNI.JointIterator_getJointList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimModelJNI.JointIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimModelJNI.JointIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimModelJNI.JointIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimModelJNI.JointIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimModelJNI.JointIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimModelJNI.JointIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimModelJNI.JointIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimModelJNI.JointIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimModelJNI.JointIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimModelJNI.JointIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimModelJNI.JointIterator_updateXMLNode(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimModelJNI.JointIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimModelJNI.JointIterator_getDocumentFileName(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimModelJNI.JointIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimModelJNI.JointIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimModelJNI.JointIterator_toString(swigCPtr, this);
  }

}
