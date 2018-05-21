/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Millard2012EquilibriumMuscleList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Millard2012EquilibriumMuscleList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Millard2012EquilibriumMuscleList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Millard2012EquilibriumMuscleList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Millard2012EquilibriumMuscleList(Component root, ComponentFilter f) {
    this(opensimSimulationJNI.new_Millard2012EquilibriumMuscleList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public Millard2012EquilibriumMuscleList(Component root) {
    this(opensimSimulationJNI.new_Millard2012EquilibriumMuscleList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public Millard2012EquilibriumMuscleIterator begin() {
    return new Millard2012EquilibriumMuscleIterator(opensimSimulationJNI.Millard2012EquilibriumMuscleList_begin(swigCPtr, this), true);
  }

  public Millard2012EquilibriumMuscleIterator end() {
    return new Millard2012EquilibriumMuscleIterator(opensimSimulationJNI.Millard2012EquilibriumMuscleList_end(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimSimulationJNI.Millard2012EquilibriumMuscleList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
