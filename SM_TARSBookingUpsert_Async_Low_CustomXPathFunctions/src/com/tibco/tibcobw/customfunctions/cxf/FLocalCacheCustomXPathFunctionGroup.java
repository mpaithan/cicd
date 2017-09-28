package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.FLocalCache;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="customLocalCache",namespace="java://com.tibco.tibcobw.customfunctions.FLocalCache",helpText="com.tibco.tibcobw.customfunctions.FLocalCache") public class FLocalCacheCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String getValue(  java.lang.String string1,  java.lang.String string2){
    return FLocalCache.getValue(string1,string2);
  }
  @XPathFunction(parameters={},helpText="") public com.tibco.tibcobw.customfunctions.FLocalCache getInstance(){
    return FLocalCache.getInstance();
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String getKeys(  java.lang.String string1,  java.lang.String string2){
    return FLocalCache.getKeys(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String putValue(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return FLocalCache.putValue(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3"),@XPathFunctionParameter(name="string4")},helpText="") public java.lang.String getValueOrDefaultOrError(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3,  java.lang.String string4){
    return FLocalCache.getValueOrDefaultOrError(string1,string2,string3,string4);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getValueOrDefault(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return FLocalCache.getValueOrDefault(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getKeysWithValues(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return FLocalCache.getKeysWithValues(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3"),@XPathFunctionParameter(name="string4")},helpText="") public java.lang.String addValue(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3,  java.lang.String string4){
    return FLocalCache.addValue(string1,string2,string3,string4);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String resetValues(  java.lang.String string1){
    return FLocalCache.resetValues(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String resetOneKeyValue(  java.lang.String string1,  java.lang.String string2){
    return FLocalCache.resetOneKeyValue(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getValueOrError(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return FLocalCache.getValueOrError(string1,string2,string3);
  }
}
