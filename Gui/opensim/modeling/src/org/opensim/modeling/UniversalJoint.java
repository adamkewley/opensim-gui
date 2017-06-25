/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class UniversalJoint extends Joint {
  private transient long swigCPtr;

  public UniversalJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.UniversalJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(UniversalJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_UniversalJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static UniversalJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.UniversalJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new UniversalJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.UniversalJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.UniversalJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.UniversalJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new UniversalJoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.UniversalJoint_getConcreteClassName(swigCPtr, this);
  }

  public Coordinate getCoordinate() {
    return new Coordinate(opensimSimulationJNI.UniversalJoint_getCoordinate__SWIG_0_0(swigCPtr, this), false);
  }

  public Coordinate updCoordinate() {
    return new Coordinate(opensimSimulationJNI.UniversalJoint_updCoordinate__SWIG_0_0(swigCPtr, this), false);
  }

  public Coordinate getCoordinate(UniversalJoint.Coord idx) {
    return new Coordinate(opensimSimulationJNI.UniversalJoint_getCoordinate__SWIG_1(swigCPtr, this, idx.swigValue()), false);
  }

  public Coordinate updCoordinate(UniversalJoint.Coord idx) {
    return new Coordinate(opensimSimulationJNI.UniversalJoint_updCoordinate__SWIG_1(swigCPtr, this, idx.swigValue()), false);
  }

  public UniversalJoint() {
    this(opensimSimulationJNI.new_UniversalJoint__SWIG_0(), true);
  }

  public UniversalJoint(String name, PhysicalFrame parent, PhysicalFrame child) {
    this(opensimSimulationJNI.new_UniversalJoint__SWIG_1(name, PhysicalFrame.getCPtr(parent), parent, PhysicalFrame.getCPtr(child), child), true);
  }

  public UniversalJoint(String name, PhysicalFrame parent, Vec3 locationInParent, Vec3 orientationInParent, PhysicalFrame child, Vec3 locationInChild, Vec3 orientationInChild) {
    this(opensimSimulationJNI.new_UniversalJoint__SWIG_2(name, PhysicalFrame.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, PhysicalFrame.getCPtr(child), child, Vec3.getCPtr(locationInChild), locationInChild, Vec3.getCPtr(orientationInChild), orientationInChild), true);
  }

  public final static class Coord {
    public final static UniversalJoint.Coord Rotation1X = new UniversalJoint.Coord("Rotation1X", opensimSimulationJNI.UniversalJoint_Coord_Rotation1X_get());
    public final static UniversalJoint.Coord Rotation2Y = new UniversalJoint.Coord("Rotation2Y", opensimSimulationJNI.UniversalJoint_Coord_Rotation2Y_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Coord swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Coord.class + " with value " + swigValue);
    }

    private Coord(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Coord(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Coord(String swigName, Coord swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Coord[] swigValues = { Rotation1X, Rotation2Y };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
