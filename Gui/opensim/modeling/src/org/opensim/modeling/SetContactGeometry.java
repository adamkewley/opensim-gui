/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetContactGeometry extends OpenSimObject {
  private transient long swigCPtr;

  public SetContactGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.SetContactGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetContactGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_SetContactGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetContactGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.SetContactGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetContactGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.SetContactGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.SetContactGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.SetContactGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetContactGeometry(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.SetContactGeometry_getConcreteClassName(swigCPtr, this);
  }

  public SetContactGeometry() {
    this(opensimModelSimulationJNI.new_SetContactGeometry__SWIG_0(), true);
  }

  public SetContactGeometry(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_SetContactGeometry__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetContactGeometry(String aFileName) {
    this(opensimModelSimulationJNI.new_SetContactGeometry__SWIG_2(aFileName), true);
  }

  public SetContactGeometry(SetContactGeometry aSet) {
    this(opensimModelSimulationJNI.new_SetContactGeometry__SWIG_3(SetContactGeometry.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimModelSimulationJNI.SetContactGeometry_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimModelSimulationJNI.SetContactGeometry_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimModelSimulationJNI.SetContactGeometry_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimModelSimulationJNI.SetContactGeometry_getSize(swigCPtr, this);
  }

  public int getIndex(ContactGeometry aObject, int aStartIndex) {
    return opensimModelSimulationJNI.SetContactGeometry_getIndex__SWIG_0(swigCPtr, this, ContactGeometry.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_getIndex__SWIG_1(swigCPtr, this, ContactGeometry.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimModelSimulationJNI.SetContactGeometry_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimModelSimulationJNI.SetContactGeometry_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetContactGeometry_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_adoptAndAppend(swigCPtr, this, ContactGeometry.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_cloneAndAppend(swigCPtr, this, ContactGeometry.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_insert(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimModelSimulationJNI.SetContactGeometry_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_remove__SWIG_1(swigCPtr, this, ContactGeometry.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimModelSimulationJNI.SetContactGeometry_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, ContactGeometry aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.SetContactGeometry_set__SWIG_0(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, ContactGeometry aObject) {
    return opensimModelSimulationJNI.SetContactGeometry_set__SWIG_1(swigCPtr, this, aIndex, ContactGeometry.getCPtr(aObject), aObject);
  }

  public ContactGeometry get(int aIndex) {
    return new ContactGeometry(opensimModelSimulationJNI.SetContactGeometry_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public ContactGeometry get(String aName) {
    return new ContactGeometry(opensimModelSimulationJNI.SetContactGeometry_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimModelSimulationJNI.SetContactGeometry_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimModelSimulationJNI.SetContactGeometry_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimModelSimulationJNI.SetContactGeometry_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimModelSimulationJNI.SetContactGeometry_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimModelSimulationJNI.SetContactGeometry_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimModelSimulationJNI.SetContactGeometry_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimModelSimulationJNI.SetContactGeometry_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimModelSimulationJNI.SetContactGeometry_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimModelSimulationJNI.SetContactGeometry_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimModelSimulationJNI.SetContactGeometry_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
