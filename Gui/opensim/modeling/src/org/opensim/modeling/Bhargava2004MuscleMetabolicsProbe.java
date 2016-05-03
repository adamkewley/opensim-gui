/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Bhargava2004MuscleMetabolicsProbe extends Probe {
  private transient long swigCPtr;

  public Bhargava2004MuscleMetabolicsProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Bhargava2004MuscleMetabolicsProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Bhargava2004MuscleMetabolicsProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Bhargava2004MuscleMetabolicsProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Bhargava2004MuscleMetabolicsProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Bhargava2004MuscleMetabolicsProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_activation_rate_on(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_activation_rate_on(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_activation_rate_on(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_activation_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_activation_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_activation_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_activation_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_activation_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_activation_rate_on(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_activation_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_activation_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_activation_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_activation_rate_on() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_activation_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_activation_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_activation_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_activation_rate_on(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_activation_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maintenance_rate_on(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_maintenance_rate_on(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_maintenance_rate_on(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_maintenance_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_maintenance_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_maintenance_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maintenance_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_maintenance_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maintenance_rate_on(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_maintenance_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_maintenance_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_maintenance_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_maintenance_rate_on() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_maintenance_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_maintenance_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_maintenance_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_maintenance_rate_on(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_maintenance_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_shortening_rate_on(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_shortening_rate_on(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_shortening_rate_on(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_shortening_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_shortening_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_shortening_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_shortening_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_shortening_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_shortening_rate_on(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_shortening_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_shortening_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_shortening_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_shortening_rate_on() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_shortening_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_shortening_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_shortening_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_shortening_rate_on(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_shortening_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_rate_on(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_basal_rate_on(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_basal_rate_on(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_basal_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_rate_on(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_basal_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_basal_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_basal_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_basal_rate_on() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_basal_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_rate_on(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_mechanical_work_rate_on(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_mechanical_work_rate_on(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_mechanical_work_rate_on(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_mechanical_work_rate_on(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_mechanical_work_rate_on(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_mechanical_work_rate_on__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_mechanical_work_rate_on(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_mechanical_work_rate_on(swigCPtr, this, value);
  }

  public void constructProperty_mechanical_work_rate_on(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_mechanical_work_rate_on(swigCPtr, this, initValue);
  }

  public boolean get_mechanical_work_rate_on() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_mechanical_work_rate_on__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_mechanical_work_rate_on() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_mechanical_work_rate_on__SWIG_1(swigCPtr, this), false);
  }

  public void set_mechanical_work_rate_on(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_mechanical_work_rate_on__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_enforce_minimum_heat_rate_per_muscle(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_enforce_minimum_heat_rate_per_muscle(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_enforce_minimum_heat_rate_per_muscle(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_enforce_minimum_heat_rate_per_muscle(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_enforce_minimum_heat_rate_per_muscle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_enforce_minimum_heat_rate_per_muscle(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, value);
  }

  public void constructProperty_enforce_minimum_heat_rate_per_muscle(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_enforce_minimum_heat_rate_per_muscle(swigCPtr, this, initValue);
  }

  public boolean get_enforce_minimum_heat_rate_per_muscle() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_enforce_minimum_heat_rate_per_muscle() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this), false);
  }

  public void set_enforce_minimum_heat_rate_per_muscle(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_enforce_minimum_heat_rate_per_muscle__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_normalized_fiber_length_dependence_on_maintenance_rate(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_normalized_fiber_length_dependence_on_maintenance_rate(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public PiecewiseLinearFunction get_normalized_fiber_length_dependence_on_maintenance_rate(int i) {
    return new PiecewiseLinearFunction(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_0(swigCPtr, this, i), false);
  }

  public PiecewiseLinearFunction upd_normalized_fiber_length_dependence_on_maintenance_rate(int i) {
    return new PiecewiseLinearFunction(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_normalized_fiber_length_dependence_on_maintenance_rate(int i, PiecewiseLinearFunction value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_0(swigCPtr, this, i, PiecewiseLinearFunction.getCPtr(value), value);
  }

  public int append_normalized_fiber_length_dependence_on_maintenance_rate(PiecewiseLinearFunction value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_normalized_fiber_length_dependence_on_maintenance_rate(swigCPtr, this, PiecewiseLinearFunction.getCPtr(value), value);
  }

  public void constructProperty_normalized_fiber_length_dependence_on_maintenance_rate(PiecewiseLinearFunction initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_normalized_fiber_length_dependence_on_maintenance_rate(swigCPtr, this, PiecewiseLinearFunction.getCPtr(initValue), initValue);
  }

  public PiecewiseLinearFunction get_normalized_fiber_length_dependence_on_maintenance_rate() {
    return new PiecewiseLinearFunction(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_1(swigCPtr, this), false);
  }

  public PiecewiseLinearFunction upd_normalized_fiber_length_dependence_on_maintenance_rate() {
    return new PiecewiseLinearFunction(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_1(swigCPtr, this), false);
  }

  public void set_normalized_fiber_length_dependence_on_maintenance_rate(PiecewiseLinearFunction value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_normalized_fiber_length_dependence_on_maintenance_rate__SWIG_1(swigCPtr, this, PiecewiseLinearFunction.getCPtr(value), value);
  }

  public void copyProperty_use_force_dependent_shortening_prop_constant(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_use_force_dependent_shortening_prop_constant(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_use_force_dependent_shortening_prop_constant(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_use_force_dependent_shortening_prop_constant__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_use_force_dependent_shortening_prop_constant(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_use_force_dependent_shortening_prop_constant__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_use_force_dependent_shortening_prop_constant(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_use_force_dependent_shortening_prop_constant__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_use_force_dependent_shortening_prop_constant(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_use_force_dependent_shortening_prop_constant(swigCPtr, this, value);
  }

  public void constructProperty_use_force_dependent_shortening_prop_constant(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_use_force_dependent_shortening_prop_constant(swigCPtr, this, initValue);
  }

  public boolean get_use_force_dependent_shortening_prop_constant() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_use_force_dependent_shortening_prop_constant__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_use_force_dependent_shortening_prop_constant() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_use_force_dependent_shortening_prop_constant__SWIG_1(swigCPtr, this), false);
  }

  public void set_use_force_dependent_shortening_prop_constant(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_use_force_dependent_shortening_prop_constant__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_coefficient(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_basal_coefficient(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_basal_coefficient(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_coefficient__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_basal_coefficient(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_coefficient__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_coefficient(int i, double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_coefficient__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_coefficient(double value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_basal_coefficient(swigCPtr, this, value);
  }

  public void constructProperty_basal_coefficient(double initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_basal_coefficient(swigCPtr, this, initValue);
  }

  public double get_basal_coefficient() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_coefficient__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_basal_coefficient() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_coefficient__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_coefficient(double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_coefficient__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_basal_exponent(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_basal_exponent(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_basal_exponent(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_exponent__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_basal_exponent(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_exponent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_basal_exponent(int i, double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_exponent__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_basal_exponent(double value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_basal_exponent(swigCPtr, this, value);
  }

  public void constructProperty_basal_exponent(double initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_basal_exponent(swigCPtr, this, initValue);
  }

  public double get_basal_exponent() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_basal_exponent__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_basal_exponent() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_basal_exponent__SWIG_1(swigCPtr, this), false);
  }

  public void set_basal_exponent(double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_basal_exponent__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_muscle_effort_scaling_factor(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_muscle_effort_scaling_factor(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public double get_muscle_effort_scaling_factor(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_muscle_effort_scaling_factor(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_muscle_effort_scaling_factor(int i, double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_muscle_effort_scaling_factor__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_muscle_effort_scaling_factor(double value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_muscle_effort_scaling_factor(swigCPtr, this, value);
  }

  public void constructProperty_muscle_effort_scaling_factor(double initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_muscle_effort_scaling_factor(swigCPtr, this, initValue);
  }

  public double get_muscle_effort_scaling_factor() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_muscle_effort_scaling_factor() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this), false);
  }

  public void set_muscle_effort_scaling_factor(double value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_muscle_effort_scaling_factor__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_include_negative_mechanical_work(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_include_negative_mechanical_work(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_include_negative_mechanical_work(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_include_negative_mechanical_work(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_include_negative_mechanical_work(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_include_negative_mechanical_work__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_include_negative_mechanical_work(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_include_negative_mechanical_work(swigCPtr, this, value);
  }

  public void constructProperty_include_negative_mechanical_work(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_include_negative_mechanical_work(swigCPtr, this, initValue);
  }

  public boolean get_include_negative_mechanical_work() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_include_negative_mechanical_work__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_include_negative_mechanical_work() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_include_negative_mechanical_work__SWIG_1(swigCPtr, this), false);
  }

  public void set_include_negative_mechanical_work(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_include_negative_mechanical_work__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_forbid_negative_total_power(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_forbid_negative_total_power(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_forbid_negative_total_power(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_forbid_negative_total_power__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_forbid_negative_total_power(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_forbid_negative_total_power__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_forbid_negative_total_power(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_forbid_negative_total_power__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_forbid_negative_total_power(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_forbid_negative_total_power(swigCPtr, this, value);
  }

  public void constructProperty_forbid_negative_total_power(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_forbid_negative_total_power(swigCPtr, this, initValue);
  }

  public boolean get_forbid_negative_total_power() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_forbid_negative_total_power__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_forbid_negative_total_power() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_forbid_negative_total_power__SWIG_1(swigCPtr, this), false);
  }

  public void set_forbid_negative_total_power(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_forbid_negative_total_power__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_report_total_metabolics_only(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_report_total_metabolics_only(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public boolean get_report_total_metabolics_only(int i) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_report_total_metabolics_only__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_report_total_metabolics_only(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_report_total_metabolics_only__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_report_total_metabolics_only(int i, boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_report_total_metabolics_only__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_report_total_metabolics_only(boolean value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_report_total_metabolics_only(swigCPtr, this, value);
  }

  public void constructProperty_report_total_metabolics_only(boolean initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_report_total_metabolics_only(swigCPtr, this, initValue);
  }

  public boolean get_report_total_metabolics_only() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_report_total_metabolics_only__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_report_total_metabolics_only() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_report_total_metabolics_only__SWIG_1(swigCPtr, this), false);
  }

  public void set_report_total_metabolics_only(boolean value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_report_total_metabolics_only__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Bhargava2004MuscleMetabolicsProbe source) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_copyProperty_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe.getCPtr(source), source);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet get_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i) {
    return new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i), false);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet upd_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i) {
    return new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(int i, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_0(swigCPtr, this, i, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public int append_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_append_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public void constructProperty_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet initValue) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_constructProperty_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(initValue), initValue);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet get_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet() {
    return new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_get_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this), false);
  }

  public Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet upd_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet() {
    return new Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_upd_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this), false);
  }

  public void set_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet(Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet value) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_set_Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet__SWIG_1(swigCPtr, this, Bhargava2004MuscleMetabolicsProbe_MetabolicMuscleParameterSet.getCPtr(value), value);
  }

  public Bhargava2004MuscleMetabolicsProbe() {
    this(opensimModelSimulationJNI.new_Bhargava2004MuscleMetabolicsProbe__SWIG_0(), true);
  }

  public Bhargava2004MuscleMetabolicsProbe(boolean activation_rate_on, boolean maintenance_rate_on, boolean shortening_rate_on, boolean basal_rate_on, boolean work_rate_on) {
    this(opensimModelSimulationJNI.new_Bhargava2004MuscleMetabolicsProbe__SWIG_1(activation_rate_on, maintenance_rate_on, shortening_rate_on, basal_rate_on, work_rate_on), true);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

  public int getNumMetabolicMuscles() {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getNumMetabolicMuscles(swigCPtr, this);
  }

  public void addMuscle(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_addMuscle__SWIG_0(swigCPtr, this, muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch);
  }

  public void addMuscle(String muscleName, double ratio_slow_twitch_fibers, double activation_constant_slow_twitch, double activation_constant_fast_twitch, double maintenance_constant_slow_twitch, double maintenance_constant_fast_twitch, double muscle_mass) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_addMuscle__SWIG_1(swigCPtr, this, muscleName, ratio_slow_twitch_fibers, activation_constant_slow_twitch, activation_constant_fast_twitch, maintenance_constant_slow_twitch, maintenance_constant_fast_twitch, muscle_mass);
  }

  public void removeMuscle(String muscleName) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_removeMuscle(swigCPtr, this, muscleName);
  }

  public void useProvidedMass(String muscleName, double providedMass) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_useProvidedMass(swigCPtr, this, muscleName, providedMass);
  }

  public void useCalculatedMass(String muscleName) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_useCalculatedMass(swigCPtr, this, muscleName);
  }

  public boolean isUsingProvidedMass(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_isUsingProvidedMass(swigCPtr, this, muscleName);
  }

  public double getMuscleMass(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getMuscleMass(swigCPtr, this, muscleName);
  }

  public double getRatioSlowTwitchFibers(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getRatioSlowTwitchFibers(swigCPtr, this, muscleName);
  }

  public void setRatioSlowTwitchFibers(String muscleName, double ratio) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setRatioSlowTwitchFibers(swigCPtr, this, muscleName, ratio);
  }

  public double getDensity(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getDensity(swigCPtr, this, muscleName);
  }

  public void setDensity(String muscleName, double density) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setDensity(swigCPtr, this, muscleName, density);
  }

  public double getSpecificTension(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getSpecificTension(swigCPtr, this, muscleName);
  }

  public void setSpecificTension(String muscleName, double specificTension) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setSpecificTension(swigCPtr, this, muscleName, specificTension);
  }

  public double getActivationConstantSlowTwitch(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getActivationConstantSlowTwitch(swigCPtr, this, muscleName);
  }

  public void setActivationConstantSlowTwitch(String muscleName, double c) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setActivationConstantSlowTwitch(swigCPtr, this, muscleName, c);
  }

  public double getActivationConstantFastTwitch(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getActivationConstantFastTwitch(swigCPtr, this, muscleName);
  }

  public void setActivationConstantFastTwitch(String muscleName, double c) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setActivationConstantFastTwitch(swigCPtr, this, muscleName, c);
  }

  public double getMaintenanceConstantSlowTwitch(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getMaintenanceConstantSlowTwitch(swigCPtr, this, muscleName);
  }

  public void setMaintenanceConstantSlowTwitch(String muscleName, double c) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setMaintenanceConstantSlowTwitch(swigCPtr, this, muscleName, c);
  }

  public double getMaintenanceConstantFastTwitch(String muscleName) {
    return opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_getMaintenanceConstantFastTwitch(swigCPtr, this, muscleName);
  }

  public void setMaintenanceConstantFastTwitch(String muscleName, double c) {
    opensimModelSimulationJNI.Bhargava2004MuscleMetabolicsProbe_setMaintenanceConstantFastTwitch(swigCPtr, this, muscleName, c);
  }

}
