package com.tibco.tibcobw.legacy.transco.customfunctions.cxf;
import com.tibco.tibcobw.legacy.transco.customfunctions.TranscoCustomFunctions;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.Boolean;
import java.lang.String;
import java.lang.String;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.legacy.transco.customfunctions",prefix="legTransco",namespace="java://com.tibco.tibcobw.legacy.transco.customfunctions.TranscoCustomFunctions",helpText="com.tibco.tibcobw.legacy.transco.customfunctions.TranscoCustomFunctions") public class TranscoCustomFunctionsCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String toUpperCaseLocation(  java.lang.String string1){
    return TranscoCustomFunctions.toUpperCaseLocation(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String toUpperCaseAccountBusinessName(  java.lang.String string1){
    return TranscoCustomFunctions.toUpperCaseAccountBusinessName(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="boolean2")},helpText="") public java.lang.String removeAndReplaceCharsAccountName(  java.lang.String string1,  boolean boolean2){
    return TranscoCustomFunctions.removeAndReplaceCharsAccountName(string1,boolean2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="boolean2")},helpText="") public java.lang.String toUpperCaseFirstLastName(  java.lang.String string1,  java.lang.Boolean boolean2){
    return TranscoCustomFunctions.toUpperCaseFirstLastName(string1,boolean2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String removeAndReplaceCharsLocation(  java.lang.String string1){
    return TranscoCustomFunctions.removeAndReplaceCharsLocation(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String removeAndReplaceCharsName(  java.lang.String string1){
    return TranscoCustomFunctions.removeAndReplaceCharsName(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String toUpperCaseWithoutAccentForSearch(  java.lang.String string1){
    return TranscoCustomFunctions.toUpperCaseWithoutAccentForSearch(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.Boolean checkEmail(  java.lang.String string1){
    return TranscoCustomFunctions.checkEmail(string1);
  }
}
