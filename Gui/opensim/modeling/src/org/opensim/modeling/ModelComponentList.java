/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ModelComponentList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelComponentList(Component root, ComponentFilter f) {
    this(opensimSimulationJNI.new_ModelComponentList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public ModelComponentList(Component root) {
    this(opensimSimulationJNI.new_ModelComponentList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public ModelComponentIterator begin() {
    return new ModelComponentIterator(opensimSimulationJNI.ModelComponentList_begin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__ModelComponent_const_t__type_t cbegin() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__ModelComponent_const_t__type_t(opensimSimulationJNI.ModelComponentList_cbegin(swigCPtr, this), true);
  }

  public ModelComponentIterator end() {
    return new ModelComponentIterator(opensimSimulationJNI.ModelComponentList_end__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__ModelComponent_const_t__type_t cend() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__ModelComponent_const_t__type_t(opensimSimulationJNI.ModelComponentList_cend(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimSimulationJNI.ModelComponentList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
