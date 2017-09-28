package com.bw.xpath.utilities.cxf;
import com.bw.xpath.utilities.XPathUtilities;
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
@XPathFunctionGroup(category="com.bw.xpath.utilities",prefix="XPathUtilities",namespace="java://com.bw.xpath.utilities.XPathUtilities",helpText="com.bw.xpath.utilities.XPathUtilities") public class XPathUtilitiesCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String uuid(  java.lang.String string1){
    return XPathUtilities.uuid(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="int2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String pad64(  java.lang.String string1,  int int2,  java.lang.String string3){
    return XPathUtilities.pad64(string1,int2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2")},helpText="") public java.lang.String concat64(  java.lang.String string1,  java.lang.String string2){
    return XPathUtilities.concat64(string1,string2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="string2"),@XPathFunctionParameter(name="string3")},helpText="") public java.lang.String concat364(  java.lang.String string1,  java.lang.String string2,  java.lang.String string3){
    return XPathUtilities.concat364(string1,string2,string3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="int2")},helpText="") public java.lang.String head64(  java.lang.String string1,  int int2){
    return XPathUtilities.head64(string1,int2);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="int2"),@XPathFunctionParameter(name="int3")},helpText="") public java.lang.String substring64(  java.lang.String string1,  int int2,  int int3){
    return XPathUtilities.substring64(string1,int2,int3);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1"),@XPathFunctionParameter(name="int2")},helpText="") public java.lang.String trim64(  java.lang.String string1,  int int2){
    return XPathUtilities.trim64(string1,int2);
  }
}
