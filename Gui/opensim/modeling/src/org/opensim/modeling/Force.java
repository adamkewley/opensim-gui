/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Force extends ModelComponent {
  private long swigCPtr;

  public Force(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Force_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Force obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Force(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Force safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Force_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Force(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Force_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Force_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Force_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Force(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Force_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_isDisabled(Force source) {
    opensimModelJNI.Force_copyProperty_isDisabled(swigCPtr, this, Force.getCPtr(source), source);
  }

  public boolean get_isDisabled(int i) {
    return opensimModelJNI.Force_get_isDisabled__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_isDisabled(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Force_upd_isDisabled__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_isDisabled(int i, boolean value) {
    opensimModelJNI.Force_set_isDisabled__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_isDisabled(boolean value) {
    return opensimModelJNI.Force_append_isDisabled(swigCPtr, this, value);
  }

  public void constructProperty_isDisabled(boolean initValue) {
    opensimModelJNI.Force_constructProperty_isDisabled(swigCPtr, this, initValue);
  }

  public boolean get_isDisabled() {
    return opensimModelJNI.Force_get_isDisabled__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_isDisabled() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Force_upd_isDisabled__SWIG_1(swigCPtr, this), false);
  }

  public void set_isDisabled(boolean value) {
    opensimModelJNI.Force_set_isDisabled__SWIG_1(swigCPtr, this, value);
  }

  public boolean isDisabled(State s) {
    return opensimModelJNI.Force_isDisabled(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setDisabled(State s, boolean disabled) {
    opensimModelJNI.Force_setDisabled(swigCPtr, this, State.getCPtr(s), s, disabled);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.Force_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimModelJNI.Force_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public boolean hasGeometryPath() {
    return opensimModelJNI.Force_hasGeometryPath(swigCPtr, this);
  }

}
