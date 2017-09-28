package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.FString;
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
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="customString",namespace="java://com.tibco.tibcobw.customfunctions.FString",helpText="com.tibco.tibcobw.customfunctions.FString") public class FStringCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.Boolean isEmpty(  java.lang.String string1){
    return FString.isEmpty(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String difference(  java.lang.String string1,  java.lang.String string2){
    return FString.difference(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.Boolean isBlank(  java.lang.String string1){
    return FString.isBlank(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.Boolean isNotEmpty(  java.lang.String string1){
    return FString.isNotEmpty(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String capitalizeFully(  java.lang.String string1){
    return FString.capitalizeFully(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String ApplyRegexp(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return FString.ApplyRegexp(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.Boolean isNotBlank(  java.lang.String string1){
    return FString.isNotBlank(string1);
  }
}
