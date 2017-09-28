package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.Base64Encoding;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="Base64Encoding",namespace="java://com.tibco.tibcobw.customfunctions.Base64Encoding",helpText="com.tibco.tibcobw.customfunctions.Base64Encoding") public class Base64EncodingCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String decode(  java.lang.String string1){
    return Base64Encoding.decode(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String encode(  java.lang.String string1){
    return Base64Encoding.encode(string1);
  }
}
