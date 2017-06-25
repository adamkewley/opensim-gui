/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetMarkers extends OpenSimObject {
  private transient long swigCPtr;

  public SetMarkers(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetMarkers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetMarkers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetMarkers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetMarkers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetMarkers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetMarkers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetMarkers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetMarkers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetMarkers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetMarkers_getConcreteClassName(swigCPtr, this);
  }

  public SetMarkers() {
    this(opensimSimulationJNI.new_SetMarkers__SWIG_0(), true);
  }

  public SetMarkers(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetMarkers__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetMarkers(String aFileName) {
    this(opensimSimulationJNI.new_SetMarkers__SWIG_2(aFileName), true);
  }

  public SetMarkers(SetMarkers aSet) {
    this(opensimSimulationJNI.new_SetMarkers__SWIG_3(SetMarkers.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetMarkers_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetMarkers_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetMarkers_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetMarkers_getSize(swigCPtr, this);
  }

  public int getIndex(Marker aObject, int aStartIndex) {
    return opensimSimulationJNI.SetMarkers_getIndex__SWIG_0(swigCPtr, this, Marker.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Marker aObject) {
    return opensimSimulationJNI.SetMarkers_getIndex__SWIG_1(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetMarkers_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetMarkers_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMarkers_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Marker aObject) {
    return opensimSimulationJNI.SetMarkers_adoptAndAppend(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Marker aObject) {
    return opensimSimulationJNI.SetMarkers_cloneAndAppend(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Marker aObject) {
    return opensimSimulationJNI.SetMarkers_insert(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetMarkers_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Marker aObject) {
    return opensimSimulationJNI.SetMarkers_remove__SWIG_1(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetMarkers_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Marker aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetMarkers_set__SWIG_0(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Marker aObject) {
    return opensimSimulationJNI.SetMarkers_set__SWIG_1(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public Marker get(int aIndex) {
    return new Marker(opensimSimulationJNI.SetMarkers_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Marker get(String aName) {
    return new Marker(opensimSimulationJNI.SetMarkers_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetMarkers_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetMarkers_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetMarkers_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetMarkers_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetMarkers_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetMarkers_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetMarkers_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetMarkers_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetMarkers_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetMarkers_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
