/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Property_Deprecated extends AbstractProperty {
  private long swigCPtr;

  public Property_Deprecated(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Property_Deprecated_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Property_Deprecated obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Property_Deprecated(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Property_Deprecated.PropertyType getPropertyType() {
    return Property_Deprecated.PropertyType.swigToEnum(opensimModelJNI.Property_Deprecated_getPropertyType(swigCPtr, this));
  }

  public boolean isArrayProperty() {
    return opensimModelJNI.Property_Deprecated_isArrayProperty(swigCPtr, this);
  }

  public void setMatchName(boolean aMatchName) {
    opensimModelJNI.Property_Deprecated_setMatchName(swigCPtr, this, aMatchName);
  }

  public boolean getMatchName() {
    return opensimModelJNI.Property_Deprecated_getMatchName(swigCPtr, this);
  }

  public boolean isEqualTo(AbstractProperty other) {
    return opensimModelJNI.Property_Deprecated_isEqualTo(swigCPtr, this, AbstractProperty.getCPtr(other), other);
  }

  public AbstractProperty clone() {
    long cPtr = opensimModelJNI.Property_Deprecated_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Property_Deprecated(cPtr, false);
  }

  public void readFromXMLElement(SWIGTYPE_p_SimTK__Xml__Element propertyElement, int versionNumber) {
    opensimModelJNI.Property_Deprecated_readFromXMLElement(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(propertyElement), versionNumber);
  }

  public void writeToXMLElement(SWIGTYPE_p_SimTK__Xml__Element propertyElement) {
    opensimModelJNI.Property_Deprecated_writeToXMLElement(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(propertyElement));
  }

  public int getNumValues() {
    return opensimModelJNI.Property_Deprecated_getNumValues(swigCPtr, this);
  }

  public void clearValues() {
    opensimModelJNI.Property_Deprecated_clearValues(swigCPtr, this);
  }

  public boolean isUnnamedProperty() {
    return opensimModelJNI.Property_Deprecated_isUnnamedProperty(swigCPtr, this);
  }

  public boolean isObjectProperty() {
    return opensimModelJNI.Property_Deprecated_isObjectProperty(swigCPtr, this);
  }

  public boolean isAcceptableObjectTag(String objectTypeTag) {
    return opensimModelJNI.Property_Deprecated_isAcceptableObjectTag(swigCPtr, this, objectTypeTag);
  }

  public OpenSimObject getValueAsObject(int index) {
    return new OpenSimObject(opensimModelJNI.Property_Deprecated_getValueAsObject__SWIG_0(swigCPtr, this, index), false);
  }

  public OpenSimObject getValueAsObject() {
    return new OpenSimObject(opensimModelJNI.Property_Deprecated_getValueAsObject__SWIG_1(swigCPtr, this), false);
  }

  public OpenSimObject updValueAsObject(int index) {
    return new OpenSimObject(opensimModelJNI.Property_Deprecated_updValueAsObject__SWIG_0(swigCPtr, this, index), false);
  }

  public OpenSimObject updValueAsObject() {
    return new OpenSimObject(opensimModelJNI.Property_Deprecated_updValueAsObject__SWIG_1(swigCPtr, this), false);
  }

  public void setValueAsObject(OpenSimObject obj, int index) {
    opensimModelJNI.Property_Deprecated_setValueAsObject__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(obj), obj, index);
  }

  public void setValueAsObject(OpenSimObject obj) {
    opensimModelJNI.Property_Deprecated_setValueAsObject__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(obj), obj);
  }

  public void setNull() {
    opensimModelJNI.Property_Deprecated_setNull(swigCPtr, this);
  }

  public void setType(Property_Deprecated.PropertyType aType) {
    opensimModelJNI.Property_Deprecated_setType(swigCPtr, this, aType.swigValue());
  }

  public Property_Deprecated.PropertyType getType() {
    return Property_Deprecated.PropertyType.swigToEnum(opensimModelJNI.Property_Deprecated_getType(swigCPtr, this));
  }

  public String getTypeName() {
    return opensimModelJNI.Property_Deprecated_getTypeName(swigCPtr, this);
  }

  public String toString() {
    return opensimModelJNI.Property_Deprecated_toString(swigCPtr, this);
  }

  public void setValue(boolean aValue) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_0(swigCPtr, this, aValue);
  }

  public boolean getValueBool() {
    return opensimModelJNI.Property_Deprecated_getValueBool(swigCPtr, this);
  }

  public void setValue(int aValue) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_1(swigCPtr, this, aValue);
  }

  public int getValueInt() {
    return opensimModelJNI.Property_Deprecated_getValueInt(swigCPtr, this);
  }

  public void setValue(double aValue) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_2(swigCPtr, this, aValue);
  }

  public double getValueDbl() {
    return opensimModelJNI.Property_Deprecated_getValueDbl(swigCPtr, this);
  }

  public void setValue(String aValue) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_3(swigCPtr, this, aValue);
  }

  public String getValueStr() {
    return opensimModelJNI.Property_Deprecated_getValueStr(swigCPtr, this);
  }

  public void setValue(int aSize, boolean[] aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_4(swigCPtr, this, aSize, aArray);
  }

  public void setValue(ArrayBool aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_5(swigCPtr, this, ArrayBool.getCPtr(aArray), aArray);
  }

  public ArrayBool getValueBoolArray() {
    return new ArrayBool(opensimModelJNI.Property_Deprecated_getValueBoolArray(swigCPtr, this), false);
  }

  public void setValue(int aSize, int[] aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_6(swigCPtr, this, aSize, aArray);
  }

  public void setValue(ArrayInt aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_7(swigCPtr, this, ArrayInt.getCPtr(aArray), aArray);
  }

  public ArrayInt getValueIntArray() {
    return new ArrayInt(opensimModelJNI.Property_Deprecated_getValueIntArray(swigCPtr, this), false);
  }

  public void setValue(int aSize, double[] aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_8(swigCPtr, this, aSize, aArray);
  }

  public void setValue(ArrayDouble aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_9(swigCPtr, this, ArrayDouble.getCPtr(aArray), aArray);
  }

  public ArrayDouble getValueDblArray() {
    return new ArrayDouble(opensimModelJNI.Property_Deprecated_getValueDblArray(swigCPtr, this), false);
  }

  public void setValue(int aSize, SWIGTYPE_p_std__string aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_10(swigCPtr, this, aSize, SWIGTYPE_p_std__string.getCPtr(aArray));
  }

  public void setValue(ArrayStr aArray) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_11(swigCPtr, this, ArrayStr.getCPtr(aArray), aArray);
  }

  public ArrayStr getValueStrArray() {
    return new ArrayStr(opensimModelJNI.Property_Deprecated_getValueStrArray(swigCPtr, this), false);
  }

  public boolean isValidObject(OpenSimObject aValue) {
    return opensimModelJNI.Property_Deprecated_isValidObject(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public OpenSimObject getValueObj() {
    return new OpenSimObject(opensimModelJNI.Property_Deprecated_getValueObj(swigCPtr, this), false);
  }

  public void setValue(OpenSimObject aValue) {
    opensimModelJNI.Property_Deprecated_setValue__SWIG_12(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public OpenSimObject getValueObjPtr() {
    long cPtr = opensimModelJNI.Property_Deprecated_getValueObjPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public OpenSimObject getValueObjPtr(int index) {
    long cPtr = opensimModelJNI.Property_Deprecated_getValueObjPtr__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void appendValue(OpenSimObject obj) {
    opensimModelJNI.Property_Deprecated_appendValue(swigCPtr, this, OpenSimObject.getCPtr(obj), obj);
  }

  public void clearObjArray() {
    opensimModelJNI.Property_Deprecated_clearObjArray(swigCPtr, this);
  }

  public int getArraySize() {
    return opensimModelJNI.Property_Deprecated_getArraySize(swigCPtr, this);
  }

  public final static class PropertyType {
    public final static Property_Deprecated.PropertyType None = new Property_Deprecated.PropertyType("None", opensimModelJNI.Property_Deprecated_None_get());
    public final static Property_Deprecated.PropertyType Bool = new Property_Deprecated.PropertyType("Bool");
    public final static Property_Deprecated.PropertyType Int = new Property_Deprecated.PropertyType("Int");
    public final static Property_Deprecated.PropertyType Dbl = new Property_Deprecated.PropertyType("Dbl");
    public final static Property_Deprecated.PropertyType Str = new Property_Deprecated.PropertyType("Str");
    public final static Property_Deprecated.PropertyType Obj = new Property_Deprecated.PropertyType("Obj");
    public final static Property_Deprecated.PropertyType ObjPtr = new Property_Deprecated.PropertyType("ObjPtr");
    public final static Property_Deprecated.PropertyType BoolArray = new Property_Deprecated.PropertyType("BoolArray");
    public final static Property_Deprecated.PropertyType IntArray = new Property_Deprecated.PropertyType("IntArray");
    public final static Property_Deprecated.PropertyType DblArray = new Property_Deprecated.PropertyType("DblArray");
    public final static Property_Deprecated.PropertyType StrArray = new Property_Deprecated.PropertyType("StrArray");
    public final static Property_Deprecated.PropertyType ObjArray = new Property_Deprecated.PropertyType("ObjArray");
    public final static Property_Deprecated.PropertyType DblVec = new Property_Deprecated.PropertyType("DblVec");
    public final static Property_Deprecated.PropertyType DblVec3 = new Property_Deprecated.PropertyType("DblVec3");
    public final static Property_Deprecated.PropertyType Transform = new Property_Deprecated.PropertyType("Transform");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PropertyType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PropertyType.class + " with value " + swigValue);
    }

    private PropertyType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PropertyType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PropertyType(String swigName, PropertyType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PropertyType[] swigValues = { None, Bool, Int, Dbl, Str, Obj, ObjPtr, BoolArray, IntArray, DblArray, StrArray, ObjArray, DblVec, DblVec3, Transform };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
