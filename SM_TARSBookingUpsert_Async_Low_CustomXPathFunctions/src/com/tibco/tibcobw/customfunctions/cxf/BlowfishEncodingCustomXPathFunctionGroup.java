package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.BlowfishEncoding;
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
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="BlowfishEncoding",namespace="java://com.tibco.tibcobw.customfunctions.BlowfishEncoding",helpText="com.tibco.tibcobw.customfunctions.BlowfishEncoding") public class BlowfishEncodingCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String encodeToString(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return BlowfishEncoding.encodeToString(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String decodeFromBase64(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return BlowfishEncoding.decodeFromBase64(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String encodeToBase64(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return BlowfishEncoding.encodeToBase64(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String decodeFromString(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return BlowfishEncoding.decodeFromString(string1,string2,string3);
  }
}
