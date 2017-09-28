package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.bwCustomFunctions;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="bwCustomFunctions",namespace="java://com.tibco.tibcobw.customfunctions.bwCustomFunctions",helpText="com.tibco.tibcobw.customfunctions.bwCustomFunctions") public class bwCustomFunctionsCustomXPathFunctionGroup {
  @XPathFunction(parameters={},helpText="") public float getRandom(){
    return bwCustomFunctions.getRandom();
  }
  @XPathFunction(parameters={},helpText="") public java.lang.String getUUID(){
    return bwCustomFunctions.getUUID();
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String getEnvString(  java.lang.String string1){
    return bwCustomFunctions.getEnvString(string1);
  }
  @XPathFunction(parameters={},helpText="") public java.lang.String getUUIDNoDashes(){
    return bwCustomFunctions.getUUIDNoDashes();
  }
  @XPathFunction(parameters={},helpText="") public java.lang.String getGUID(){
    return bwCustomFunctions.getGUID();
  }
  @XPathFunction(parameters={},helpText="") public java.lang.String getLocalHostname(){
    return bwCustomFunctions.getLocalHostname();
  }
  @XPathFunction(parameters={},helpText="") public java.lang.String getFS(){
    return bwCustomFunctions.getFS();
  }
}
