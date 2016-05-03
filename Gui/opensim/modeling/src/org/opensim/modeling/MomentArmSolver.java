/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MomentArmSolver extends Solver {
  private transient long swigCPtr;

  public MomentArmSolver(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.MomentArmSolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MomentArmSolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_MomentArmSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MomentArmSolver safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.MomentArmSolver_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MomentArmSolver(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.MomentArmSolver_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.MomentArmSolver_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.MomentArmSolver_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MomentArmSolver(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.MomentArmSolver_getConcreteClassName(swigCPtr, this);
  }

  public MomentArmSolver(Model model) {
    this(opensimModelSimulationJNI.new_MomentArmSolver(Model.getCPtr(model), model), true);
  }

  public double solve(State state, Coordinate coordinate, GeometryPath path) {
    return opensimModelSimulationJNI.MomentArmSolver_solve__SWIG_0(swigCPtr, this, State.getCPtr(state), state, Coordinate.getCPtr(coordinate), coordinate, GeometryPath.getCPtr(path), path);
  }

  public double solve(State state, Coordinate coordinate, ArrayPointForceDirection pfds) {
    return opensimModelSimulationJNI.MomentArmSolver_solve__SWIG_1(swigCPtr, this, State.getCPtr(state), state, Coordinate.getCPtr(coordinate), coordinate, ArrayPointForceDirection.getCPtr(pfds), pfds);
  }

}
