/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetMarkers extends OpenSimObject {
  private long swigCPtr;

  public SetMarkers(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SetMarkers_SWIGUpcast(cPtr), cMemoryOwn);
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
        opensimModelJNI.delete_SetMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SetMarkers() {
    this(opensimModelJNI.new_SetMarkers__SWIG_0(), true);
  }

  public SetMarkers(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelJNI.new_SetMarkers__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetMarkers(String aFileName) {
    this(opensimModelJNI.new_SetMarkers__SWIG_2(aFileName), true);
  }

  public SetMarkers(SetMarkers aSet) {
    this(opensimModelJNI.new_SetMarkers__SWIG_3(SetMarkers.getCPtr(aSet), aSet), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.SetMarkers_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setup() {
    opensimModelJNI.SetMarkers_setup(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelJNI.SetMarkers_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean getMemoryOwner() {
    return opensimModelJNI.SetMarkers_getMemoryOwner(swigCPtr, this);
  }

  public boolean computeNewCapacity(int aMinCapacity, SWIGTYPE_p_int rNewCapacity) {
    return opensimModelJNI.SetMarkers_computeNewCapacity(swigCPtr, this, aMinCapacity, SWIGTYPE_p_int.getCPtr(rNewCapacity));
  }

  public boolean ensureCapacity(int aCapacity) {
    return opensimModelJNI.SetMarkers_ensureCapacity(swigCPtr, this, aCapacity);
  }

  public void trim() {
    opensimModelJNI.SetMarkers_trim(swigCPtr, this);
  }

  public int getCapacity() {
    return opensimModelJNI.SetMarkers_getCapacity(swigCPtr, this);
  }

  public void setCapacityIncrement(int aIncrement) {
    opensimModelJNI.SetMarkers_setCapacityIncrement(swigCPtr, this, aIncrement);
  }

  public int getCapacityIncrement() {
    return opensimModelJNI.SetMarkers_getCapacityIncrement(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimModelJNI.SetMarkers_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelJNI.SetMarkers_getSize(swigCPtr, this);
  }

  public int getIndex(Marker aObject, int aStartIndex) {
    return opensimModelJNI.SetMarkers_getIndex__SWIG_0(swigCPtr, this, Marker.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Marker aObject) {
    return opensimModelJNI.SetMarkers_getIndex__SWIG_1(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelJNI.SetMarkers_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelJNI.SetMarkers_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelJNI.SetMarkers_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean append(Marker aObject) {
    return opensimModelJNI.SetMarkers_append(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Marker aObject) {
    return opensimModelJNI.SetMarkers_insert(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelJNI.SetMarkers_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Marker aObject) {
    return opensimModelJNI.SetMarkers_remove__SWIG_1(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelJNI.SetMarkers_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Marker aObject, boolean preserveGroups) {
    return opensimModelJNI.SetMarkers_set__SWIG_0(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Marker aObject) {
    return opensimModelJNI.SetMarkers_set__SWIG_1(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public Marker get(int aIndex) {
    return new Marker(opensimModelJNI.SetMarkers_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Marker get(String aName) {
    return new Marker(opensimModelJNI.SetMarkers_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.SetMarkers_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelJNI.SetMarkers_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public Marker getLast() {
    long cPtr = opensimModelJNI.SetMarkers_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new Marker(cPtr, false);
  }

  public int searchBinary(Marker aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimModelJNI.SetMarkers_searchBinary__SWIG_0(swigCPtr, this, Marker.getCPtr(aObject), aObject, aFindFirst, aLo, aHi);
  }

  public int searchBinary(Marker aObject, boolean aFindFirst, int aLo) {
    return opensimModelJNI.SetMarkers_searchBinary__SWIG_1(swigCPtr, this, Marker.getCPtr(aObject), aObject, aFindFirst, aLo);
  }

  public int searchBinary(Marker aObject, boolean aFindFirst) {
    return opensimModelJNI.SetMarkers_searchBinary__SWIG_2(swigCPtr, this, Marker.getCPtr(aObject), aObject, aFindFirst);
  }

  public int searchBinary(Marker aObject) {
    return opensimModelJNI.SetMarkers_searchBinary__SWIG_3(swigCPtr, this, Marker.getCPtr(aObject), aObject);
  }

  public int getNumGroups() {
    return opensimModelJNI.SetMarkers_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelJNI.SetMarkers_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelJNI.SetMarkers_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelJNI.SetMarkers_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelJNI.SetMarkers_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelJNI.SetMarkers_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelJNI.SetMarkers_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelJNI.SetMarkers_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}