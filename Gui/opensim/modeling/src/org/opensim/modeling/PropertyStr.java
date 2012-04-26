/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PropertyStr extends Property_Deprecated {
  private long swigCPtr;

  public PropertyStr(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PropertyStr_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PropertyStr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PropertyStr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PropertyStr() {
    this(opensimModelJNI.new_PropertyStr__SWIG_0(), true);
  }

  public PropertyStr(String aName, String aValue) {
    this(opensimModelJNI.new_PropertyStr__SWIG_1(aName, aValue), true);
  }

  public PropertyStr(PropertyStr aProperty) {
    this(opensimModelJNI.new_PropertyStr__SWIG_2(PropertyStr.getCPtr(aProperty), aProperty), true);
  }

  public AbstractProperty clone() {
    long cPtr = opensimModelJNI.PropertyStr_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyStr(cPtr, false);
  }

  public String getTypeName() {
    return opensimModelJNI.PropertyStr_getTypeName(swigCPtr, this);
  }

  public void setValue(String aValue) {
    opensimModelJNI.PropertyStr_setValue(swigCPtr, this, aValue);
  }

  public String getValueStr() {
    return opensimModelJNI.PropertyStr_getValueStr(swigCPtr, this);
  }

  public String toString() {
    return opensimModelJNI.PropertyStr_toString(swigCPtr, this);
  }

  public void clearValue() {
    opensimModelJNI.PropertyStr_clearValue(swigCPtr, this);
  }

  public static String getDefaultStr() {
    return opensimModelJNI.PropertyStr_getDefaultStr();
  }

  public boolean isValidFileName() {
    return opensimModelJNI.PropertyStr_isValidFileName(swigCPtr, this);
  }

}
