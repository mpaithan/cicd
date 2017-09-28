package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.BwStatCustomFunctions;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="bwCoreStat",namespace="java://com.tibco.tibcobw.customfunctions.BwStatCustomFunctions",helpText="com.tibco.tibcobw.customfunctions.BwStatCustomFunctions") public class BwStatCustomFunctionsCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public java.lang.String removeLineBreaksFromStr(  java.lang.String string1){
    return BwStatCustomFunctions.removeLineBreaksFromStr(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="long1")},helpText="") public java.lang.String convertLongUTCToGMTStr(  long long1){
    return BwStatCustomFunctions.convertLongUTCToGMTStr(long1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="long1")},helpText="") public java.lang.String convertLongUTCToStr(  long long1){
    return BwStatCustomFunctions.convertLongUTCToStr(long1);
  }
  @XPathFunction(parameters={},helpText="") public long getCurrentUTC(){
    return BwStatCustomFunctions.getCurrentUTC();
  }
}
