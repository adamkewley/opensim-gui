/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelHasNoSystem extends OpenSimException {
  private transient long swigCPtr;

  public ModelHasNoSystem(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelHasNoSystem_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelHasNoSystem obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelHasNoSystem(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ModelHasNoSystem(String file, long line, String func, String modelName) {
    this(opensimSimulationJNI.new_ModelHasNoSystem(file, line, func, modelName), true);
  }

}
