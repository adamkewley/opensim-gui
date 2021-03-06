/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimTKArrayRotation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public SimTKArrayRotation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SimTKArrayRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_SimTKArrayRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimTKArrayRotation() {
    this(opensimSimbodyJNI.new_SimTKArrayRotation__SWIG_0(), true);
  }

  public SimTKArrayRotation(long n) {
    this(opensimSimbodyJNI.new_SimTKArrayRotation__SWIG_1(n), true);
  }

  public SimTKArrayRotation(long n, Rotation initVal) {
    this(opensimSimbodyJNI.new_SimTKArrayRotation__SWIG_2(n, Rotation.getCPtr(initVal), initVal), true);
  }

  public SimTKArrayRotation(SimTKArrayRotation src) {
    this(opensimSimbodyJNI.new_SimTKArrayRotation__SWIG_3(SimTKArrayRotation.getCPtr(src), src), true);
  }

  public SimTKArrayRotation(Rotation first, Rotation last1, DontCopy arg2) {
    this(opensimSimbodyJNI.new_SimTKArrayRotation__SWIG_4(Rotation.getCPtr(first), first, Rotation.getCPtr(last1), last1, DontCopy.getCPtr(arg2), arg2), true);
  }

  public SimTKArrayRotation deallocate() {
    return new SimTKArrayRotation(opensimSimbodyJNI.SimTKArrayRotation_deallocate(swigCPtr, this), false);
  }

  public void assign(long n, Rotation fillValue) {
    opensimSimbodyJNI.SimTKArrayRotation_assign(swigCPtr, this, n, Rotation.getCPtr(fillValue), fillValue);
  }

  public void fill(Rotation fillValue) {
    opensimSimbodyJNI.SimTKArrayRotation_fill(swigCPtr, this, Rotation.getCPtr(fillValue), fillValue);
  }

  public void swap(SimTKArrayRotation other) {
    opensimSimbodyJNI.SimTKArrayRotation_swap(swigCPtr, this, SimTKArrayRotation.getCPtr(other), other);
  }

  public SimTKArrayRotation adoptData(Rotation newData, long dataSize, long dataCapacity) {
    return new SimTKArrayRotation(opensimSimbodyJNI.SimTKArrayRotation_adoptData__SWIG_0(swigCPtr, this, Rotation.getCPtr(newData), newData, dataSize, dataCapacity), false);
  }

  public SimTKArrayRotation adoptData(Rotation newData, long dataSize) {
    return new SimTKArrayRotation(opensimSimbodyJNI.SimTKArrayRotation_adoptData__SWIG_1(swigCPtr, this, Rotation.getCPtr(newData), newData, dataSize), false);
  }

  public SimTKArrayRotation shareData(Rotation newData, long dataSize) {
    return new SimTKArrayRotation(opensimSimbodyJNI.SimTKArrayRotation_shareData__SWIG_0(swigCPtr, this, Rotation.getCPtr(newData), newData, dataSize), false);
  }

  public SimTKArrayRotation shareData(Rotation first, Rotation last1) {
    return new SimTKArrayRotation(opensimSimbodyJNI.SimTKArrayRotation_shareData__SWIG_1(swigCPtr, this, Rotation.getCPtr(first), first, Rotation.getCPtr(last1), last1), false);
  }

  public long size() {
    return opensimSimbodyJNI.SimTKArrayRotation_size(swigCPtr, this);
  }

  public long max_size() {
    return opensimSimbodyJNI.SimTKArrayRotation_max_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimSimbodyJNI.SimTKArrayRotation_empty(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.SimTKArrayRotation_capacity(swigCPtr, this);
  }

  public void resize(long n) {
    opensimSimbodyJNI.SimTKArrayRotation_resize__SWIG_0(swigCPtr, this, n);
  }

  public void resize(long n, Rotation initVal) {
    opensimSimbodyJNI.SimTKArrayRotation_resize__SWIG_1(swigCPtr, this, n, Rotation.getCPtr(initVal), initVal);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.SimTKArrayRotation_reserve(swigCPtr, this, n);
  }

  public void shrink_to_fit() {
    opensimSimbodyJNI.SimTKArrayRotation_shrink_to_fit(swigCPtr, this);
  }

  public long allocated() {
    return opensimSimbodyJNI.SimTKArrayRotation_allocated(swigCPtr, this);
  }

  public boolean isOwner() {
    return opensimSimbodyJNI.SimTKArrayRotation_isOwner(swigCPtr, this);
  }

  public Rotation cbegin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_cbegin(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation begin() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation cend() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_cend(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation end() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t crbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t(opensimSimbodyJNI.SimTKArrayRotation_crbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t rbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t(opensimSimbodyJNI.SimTKArrayRotation_rbegin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t crend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t(opensimSimbodyJNI.SimTKArrayRotation_crend(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t rend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__Rotation_T_double_t_const_p_t(opensimSimbodyJNI.SimTKArrayRotation_rend__SWIG_0(swigCPtr, this), true);
  }

  public Rotation cdata() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_cdata(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation data() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation at(long i) {
    return new Rotation(opensimSimbodyJNI.SimTKArrayRotation_at__SWIG_0(swigCPtr, this, i), false);
  }

  public Rotation getElt(long i) {
    return new Rotation(opensimSimbodyJNI.SimTKArrayRotation_getElt(swigCPtr, this, i), false);
  }

  public Rotation updElt(long i) {
    return new Rotation(opensimSimbodyJNI.SimTKArrayRotation_updElt(swigCPtr, this, i), false);
  }

  public Rotation front() {
    return new Rotation(opensimSimbodyJNI.SimTKArrayRotation_front__SWIG_0(swigCPtr, this), false);
  }

  public Rotation back() {
    return new Rotation(opensimSimbodyJNI.SimTKArrayRotation_back__SWIG_0(swigCPtr, this), false);
  }

  public void push_back(Rotation value) {
    opensimSimbodyJNI.SimTKArrayRotation_push_back__SWIG_0(swigCPtr, this, Rotation.getCPtr(value), value);
  }

  public void push_back() {
    opensimSimbodyJNI.SimTKArrayRotation_push_back__SWIG_1(swigCPtr, this);
  }

  public Rotation raw_push_back() {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_raw_push_back(swigCPtr, this);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public void pop_back() {
    opensimSimbodyJNI.SimTKArrayRotation_pop_back(swigCPtr, this);
  }

  public Rotation erase(Rotation first, Rotation last1) {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_erase__SWIG_0(swigCPtr, this, Rotation.getCPtr(first), first, Rotation.getCPtr(last1), last1);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation erase(Rotation p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_erase__SWIG_1(swigCPtr, this, Rotation.getCPtr(p), p);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation eraseFast(Rotation p) {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_eraseFast(swigCPtr, this, Rotation.getCPtr(p), p);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public void clear() {
    opensimSimbodyJNI.SimTKArrayRotation_clear(swigCPtr, this);
  }

  public Rotation insert(Rotation p, long n, Rotation value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_insert__SWIG_0(swigCPtr, this, Rotation.getCPtr(p), p, n, Rotation.getCPtr(value), value);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

  public Rotation insert(Rotation p, Rotation value) {
    long cPtr = opensimSimbodyJNI.SimTKArrayRotation_insert__SWIG_1(swigCPtr, this, Rotation.getCPtr(p), p, Rotation.getCPtr(value), value);
    return (cPtr == 0) ? null : new Rotation(cPtr, false);
  }

}
