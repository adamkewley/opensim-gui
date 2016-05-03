/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTable extends DataTable {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTable(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TimeSeriesTable_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimModelCommonJNI.delete_TimeSeriesTable(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTable() {
    this(opensimModelCommonJNI.new_TimeSeriesTable__SWIG_0(), true);
  }

  public TimeSeriesTable(TimeSeriesTable arg0) {
    this(opensimModelCommonJNI.new_TimeSeriesTable__SWIG_1(TimeSeriesTable.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTable(DataTable datatable) {
    this(opensimModelCommonJNI.new_TimeSeriesTable__SWIG_3(DataTable.getCPtr(datatable), datatable), true);
  }

}
