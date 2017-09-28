package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.TableCorrespondance;
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
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="customTableTranscodification",namespace="java://com.tibco.tibcobw.customfunctions.TableCorrespondance",helpText="com.tibco.tibcobw.customfunctions.TableCorrespondance") public class TableCorrespondanceCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String getValue(  java.lang.String string1,  java.lang.String string2){
    return TableCorrespondance.getValue(string1,string2);
  }
  @XPathFunction(parameters={},helpText="") public com.tibco.tibcobw.customfunctions.TableCorrespondance getInstance(){
    return TableCorrespondance.getInstance();
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String getKeys(  java.lang.String string1,  java.lang.String string2){
    return TableCorrespondance.getKeys(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String putValue(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return TableCorrespondance.putValue(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3"),@XPathFunctionParameter(name="string4")},helpText="") public java.lang.String getValueOrDefaultOrError(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3,  java.lang.String string4){
    return TableCorrespondance.getValueOrDefaultOrError(string1,string2,string3,string4);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getValueOrDefault(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return TableCorrespondance.getValueOrDefault(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getKeysWithValues(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return TableCorrespondance.getKeysWithValues(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3"),@XPathFunctionParameter(name="string4")},helpText="") public java.lang.String addValue(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3,  java.lang.String string4){
    return TableCorrespondance.addValue(string1,string2,string3,string4);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String resetValues(  java.lang.String string1){
    return TableCorrespondance.resetValues(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String resetOneKeyValue(  java.lang.String string1,  java.lang.String string2){
    return TableCorrespondance.resetOneKeyValue(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String getValueOrError(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return TableCorrespondance.getValueOrError(string1,string2,string3);
  }
}
