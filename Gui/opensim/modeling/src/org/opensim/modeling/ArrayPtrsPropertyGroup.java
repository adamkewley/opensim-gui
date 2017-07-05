/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayPtrsPropertyGroup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayPtrsPropertyGroup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPtrsPropertyGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ArrayPtrsPropertyGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayPtrsPropertyGroup(int aCapacity) {
    this(opensimCommonJNI.new_ArrayPtrsPropertyGroup__SWIG_0(aCapacity), true);
  }

  public ArrayPtrsPropertyGroup() {
    this(opensimCommonJNI.new_ArrayPtrsPropertyGroup__SWIG_1(), true);
  }

  public ArrayPtrsPropertyGroup(ArrayPtrsPropertyGroup aArray) {
    this(opensimCommonJNI.new_ArrayPtrsPropertyGroup__SWIG_2(ArrayPtrsPropertyGroup.getCPtr(aArray), aArray), true);
  }

  public void clearAndDestroy() {
    opensimCommonJNI.ArrayPtrsPropertyGroup_clearAndDestroy(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_size(swigCPtr, this);
  }

  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject, int aStartIndex) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_getIndex__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject), aStartIndex);
  }

  public int getIndex(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_getIndex__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject));
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public boolean append(PropertyGroup aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_append__SWIG_0(swigCPtr, this, PropertyGroup.getCPtr(aObject), aObject);
  }

  public boolean append(ArrayPtrsPropertyGroup aArray) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_append__SWIG_1(swigCPtr, this, ArrayPtrsPropertyGroup.getCPtr(aArray), aArray);
  }

  public boolean insert(int aIndex, PropertyGroup aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_insert(swigCPtr, this, aIndex, PropertyGroup.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_remove__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject));
  }

  public boolean set(int aIndex, PropertyGroup aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_set(swigCPtr, this, aIndex, PropertyGroup.getCPtr(aObject), aObject);
  }

  public PropertyGroup get(int aIndex) {
    long cPtr = opensimCommonJNI.ArrayPtrsPropertyGroup_get__SWIG_0(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new PropertyGroup(cPtr, false);
  }

  public PropertyGroup get(String aName) {
    long cPtr = opensimCommonJNI.ArrayPtrsPropertyGroup_get__SWIG_1(swigCPtr, this, aName);
    return (cPtr == 0) ? null : new PropertyGroup(cPtr, false);
  }

  public PropertyGroup getLast() {
    long cPtr = opensimCommonJNI.ArrayPtrsPropertyGroup_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyGroup(cPtr, false);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_searchBinary__SWIG_0(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject), aFindFirst, aLo, aHi);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_searchBinary__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject), aFindFirst, aLo);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject, boolean aFindFirst) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_searchBinary__SWIG_2(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject), aFindFirst);
  }

  public int searchBinary(SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type aObject) {
    return opensimCommonJNI.ArrayPtrsPropertyGroup_searchBinary__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__add_constT_OpenSim__PropertyGroup_t__type.getCPtr(aObject));
  }

}
