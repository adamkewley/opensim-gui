/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IndexOutOfRangeSizeT extends OpenSimException {
  private transient long swigCPtr;

  public IndexOutOfRangeSizeT(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.IndexOutOfRangeSizeT_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IndexOutOfRangeSizeT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_IndexOutOfRangeSizeT(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IndexOutOfRangeSizeT(String file, long line, String func, long index, long min, long max) {
    this(opensimModelJNI.new_IndexOutOfRangeSizeT(file, line, func, index, min, max), true);
  }

}
