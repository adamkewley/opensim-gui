/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetMarkerWeights extends OpenSimObject {
  private transient long swigCPtr;

  public SetMarkerWeights(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetMarkerWeights_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetMarkerWeights obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetMarkerWeights(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetMarkerWeights safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetMarkerWeights_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetMarkerWeights(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetMarkerWeights_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetMarkerWeights_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetMarkerWeights_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetMarkerWeights(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetMarkerWeights_getConcreteClassName(swigCPtr, this);
  }

  public SetMarkerWeights() {
    this(opensimSimulationJNI.new_SetMarkerWeights__SWIG_0(), true);
  }

  public SetMarkerWeights(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetMarkerWeights__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetMarkerWeights(String aFileName) {
    this(opensimSimulationJNI.new_SetMarkerWeights__SWIG_2(aFileName), true);
  }

  public SetMarkerWeights(SetMarkerWeights aSet) {
    this(opensimSimulationJNI.new_SetMarkerWeights__SWIG_3(SetMarkerWeights.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetMarkerWeights_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetMarkerWeights_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetMarkerWeights_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetMarkerWeights_getSize(swigCPtr, this);
  }

  public int getIndex(MarkerWeight aObject, int aStartIndex) {
    return opensimSimulationJNI.SetMarkerWeights_getIndex__SWIG_0(swigCPtr, this, MarkerWeight.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_getIndex__SWIG_1(swigCPtr, this, MarkerWeight.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetMarkerWeights_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetMarkerWeights_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMarkerWeights_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_adoptAndAppend(swigCPtr, this, MarkerWeight.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_cloneAndAppend(swigCPtr, this, MarkerWeight.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_insert(swigCPtr, this, aIndex, MarkerWeight.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetMarkerWeights_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_remove__SWIG_1(swigCPtr, this, MarkerWeight.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetMarkerWeights_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, MarkerWeight aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetMarkerWeights_set__SWIG_0(swigCPtr, this, aIndex, MarkerWeight.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, MarkerWeight aObject) {
    return opensimSimulationJNI.SetMarkerWeights_set__SWIG_1(swigCPtr, this, aIndex, MarkerWeight.getCPtr(aObject), aObject);
  }

  public MarkerWeight get(int aIndex) {
    return new MarkerWeight(opensimSimulationJNI.SetMarkerWeights_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public MarkerWeight get(String aName) {
    return new MarkerWeight(opensimSimulationJNI.SetMarkerWeights_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetMarkerWeights_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetMarkerWeights_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetMarkerWeights_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetMarkerWeights_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetMarkerWeights_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetMarkerWeights_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetMarkerWeights_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMarkerWeights_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetMarkerWeights_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetMarkerWeights_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
