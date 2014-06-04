/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactSphere extends ContactGeometry {
  private long swigCPtr;

  public ContactSphere(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ContactSphere_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactSphere obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ContactSphere(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactSphere safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ContactSphere_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactSphere(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ContactSphere_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ContactSphere_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ContactSphere_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactSphere(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ContactSphere_getConcreteClassName(swigCPtr, this);
  }

  public ContactSphere() {
    this(opensimModelJNI.new_ContactSphere__SWIG_0(), true);
  }

  public ContactSphere(double radius, Vec3 location, Body body) {
    this(opensimModelJNI.new_ContactSphere__SWIG_1(radius, Vec3.getCPtr(location), location, Body.getCPtr(body), body), true);
  }

  public ContactSphere(double radius, Vec3 location, Body body, String name) {
    this(opensimModelJNI.new_ContactSphere__SWIG_2(radius, Vec3.getCPtr(location), location, Body.getCPtr(body), body, name), true);
  }

  public ContactSphere(ContactSphere geom) {
    this(opensimModelJNI.new_ContactSphere__SWIG_3(ContactSphere.getCPtr(geom), geom), true);
  }

  public void copyData(ContactSphere source) {
    opensimModelJNI.ContactSphere_copyData(swigCPtr, this, ContactSphere.getCPtr(source), source);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimModelJNI.ContactSphere_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public double getRadius() {
    return opensimModelJNI.ContactSphere_getRadius(swigCPtr, this);
  }

  public void setRadius(double radius) {
    opensimModelJNI.ContactSphere_setRadius(swigCPtr, this, radius);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State s, ArrayDecorativeGeometry geometry) {
    opensimModelJNI.ContactSphere_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(s), s, ArrayDecorativeGeometry.getCPtr(geometry), geometry);
  }

}
