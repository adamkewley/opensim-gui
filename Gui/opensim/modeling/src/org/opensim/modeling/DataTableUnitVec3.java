/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DataTableUnitVec3 extends AbstractDataTable {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected DataTableUnitVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.DataTableUnitVec3_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataTableUnitVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_DataTableUnitVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DataTableUnitVec3() {
    this(opensimCommonJNI.new_DataTableUnitVec3__SWIG_0(), true);
  }

  public DataTableUnitVec3(DataTableUnitVec3 arg0) {
    this(opensimCommonJNI.new_DataTableUnitVec3__SWIG_1(DataTableUnitVec3.getCPtr(arg0), arg0), true);
  }

  public DataTableUnitVec3(String filename, String tablename) {
    this(opensimCommonJNI.new_DataTableUnitVec3__SWIG_2(filename, tablename), true);
  }

  public DataTable flatten() {
    return new DataTable(opensimCommonJNI.DataTableUnitVec3_flatten__SWIG_0(swigCPtr, this), true);
  }

  public DataTable flatten(StdVectorString suffixes) {
    return new DataTable(opensimCommonJNI.DataTableUnitVec3_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public long numComponentsPerElement() {
    return opensimCommonJNI.DataTableUnitVec3_numComponentsPerElement(swigCPtr, this);
  }

  public void appendRow(double indRow, SWIGTYPE_p_std__initializer_listT_SimTK__UnitVecT_double_1_t_t container) {
    opensimCommonJNI.DataTableUnitVec3_appendRow__SWIG_1(swigCPtr, this, indRow, SWIGTYPE_p_std__initializer_listT_SimTK__UnitVecT_double_1_t_t.getCPtr(container));
  }

  public void appendRow(double indRow, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_appendRow__SWIG_3(swigCPtr, this, indRow, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public void appendRow(double indRow, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_appendRow__SWIG_4(swigCPtr, this, indRow, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getRowAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getRowAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getRow(double ind) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getRow(swigCPtr, this, ind), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updRowAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updRowAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updRow(double ind) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updRow(swigCPtr, this, ind), true);
  }

  public void setRowAtIndex(long index, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_setRowAtIndex__SWIG_0(swigCPtr, this, index, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public void setRowAtIndex(long index, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_setRowAtIndex__SWIG_1(swigCPtr, this, index, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public void setRow(double ind, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_setRow__SWIG_0(swigCPtr, this, ind, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public void setRow(double ind, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t depRow) {
    opensimCommonJNI.DataTableUnitVec3_setRow__SWIG_1(swigCPtr, this, ind, SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depRow));
  }

  public void removeRowAtIndex(long index) {
    opensimCommonJNI.DataTableUnitVec3_removeRowAtIndex(swigCPtr, this, index);
  }

  public void removeRow(double ind) {
    opensimCommonJNI.DataTableUnitVec3_removeRow(swigCPtr, this, ind);
  }

  public StdVectorDouble getIndependentColumn() {
    return new StdVectorDouble(opensimCommonJNI.DataTableUnitVec3_getIndependentColumn(swigCPtr, this), false);
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__UnitVecT_double_1_t_t container) {
    opensimCommonJNI.DataTableUnitVec3_appendColumn__SWIG_1(swigCPtr, this, columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__UnitVecT_double_1_t_t.getCPtr(container));
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_SimTK__Vector_T_SimTK__UnitVecT_double_1_t_t depCol) {
    opensimCommonJNI.DataTableUnitVec3_appendColumn__SWIG_3(swigCPtr, this, columnLabel, SWIGTYPE_p_SimTK__Vector_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depCol));
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t depCol) {
    opensimCommonJNI.DataTableUnitVec3_appendColumn__SWIG_4(swigCPtr, this, columnLabel, SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depCol));
  }

  public void removeColumnAtIndex(long index) {
    opensimCommonJNI.DataTableUnitVec3_removeColumnAtIndex(swigCPtr, this, index);
  }

  public void removeColumn(String columnLabel) {
    opensimCommonJNI.DataTableUnitVec3_removeColumn(swigCPtr, this, columnLabel);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t getDependentColumnAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t getDependentColumn(String columnLabel) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t updDependentColumnAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t updDependentColumn(String columnLabel) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public void setIndependentValueAtIndex(long rowIndex, double value) {
    opensimCommonJNI.DataTableUnitVec3_setIndependentValueAtIndex(swigCPtr, this, rowIndex, value);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t getMatrix() {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getMatrix(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t getMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_getMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t updMatrix() {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updMatrix(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t updMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.DataTableUnitVec3_updMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth, long precision) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_0(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth, precision);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_2(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_3(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_4(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels);
  }

  public String toString(StdVectorInt rows) {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_5(swigCPtr, this, StdVectorInt.getCPtr(rows), rows);
  }

  public String toString() {
    return opensimCommonJNI.DataTableUnitVec3_toString__SWIG_6(swigCPtr, this);
  }

  public DataTableUnitVec3 clone() {
    long cPtr = opensimCommonJNI.DataTableUnitVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DataTableUnitVec3(cPtr, true);
  }

}
