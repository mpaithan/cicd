package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.FCrypt;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="customCrypt",namespace="java://com.tibco.tibcobw.customfunctions.FCrypt",helpText="com.tibco.tibcobw.customfunctions.FCrypt") public class FCryptCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String getMD5(  java.lang.String string1,  java.lang.String string2){
    return FCrypt.getMD5(string1,string2);
  }
}
