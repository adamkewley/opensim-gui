/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTableQuaternion extends DataTableQuaternion {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTableQuaternion(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TimeSeriesTableQuaternion_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTableQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_TimeSeriesTableQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTableQuaternion() {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_0(), true);
  }

  public TimeSeriesTableQuaternion(TimeSeriesTableQuaternion arg0) {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_1(TimeSeriesTableQuaternion.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTableQuaternion(StdVectorDouble indVec, SWIGTYPE_p_SimTK__Matrix_T_SimTK__Quaternion_t depData, StdVectorString labels) {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_2(StdVectorDouble.getCPtr(indVec), indVec, SWIGTYPE_p_SimTK__Matrix_T_SimTK__Quaternion_t.getCPtr(depData), StdVectorString.getCPtr(labels), labels), true);
  }

  public TimeSeriesTableQuaternion(DataTableQuaternion datatable) {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_3(DataTableQuaternion.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTableQuaternion(String filename) {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_4(filename), true);
  }

  public TimeSeriesTableQuaternion(String filename, String tablename) {
    this(opensimCommonJNI.new_TimeSeriesTableQuaternion__SWIG_5(filename, tablename), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t getNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t(opensimCommonJNI.TimeSeriesTableQuaternion_getNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t getNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t(opensimCommonJNI.TimeSeriesTableQuaternion_getNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t updNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t(opensimCommonJNI.TimeSeriesTableQuaternion_updNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t updNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__Quaternion_t(opensimCommonJNI.TimeSeriesTableQuaternion_updNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVector_T_SimTK__Quaternion_t averageRow(double beginTime, double endTime) {
    return new SWIGTYPE_p_SimTK__RowVector_T_SimTK__Quaternion_t(opensimCommonJNI.TimeSeriesTableQuaternion_averageRow(swigCPtr, this, beginTime, endTime), true);
  }

  public TimeSeriesTableQuaternion clone() {
    long cPtr = opensimCommonJNI.TimeSeriesTableQuaternion_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeSeriesTableQuaternion(cPtr, true);
  }

  public TimeSeriesTable flatten() {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableQuaternion_flatten__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTable flatten(StdVectorString suffixes) {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableQuaternion_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

}
