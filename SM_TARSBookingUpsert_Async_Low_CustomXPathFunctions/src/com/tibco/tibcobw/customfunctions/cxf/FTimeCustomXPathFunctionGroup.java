package com.tibco.tibcobw.customfunctions.cxf;
import com.tibco.tibcobw.customfunctions.FTime;
import com.tibco.xml.cxf.common.annotations.XPathFunction;
import com.tibco.xml.cxf.common.annotations.XPathFunctionGroup;
import com.tibco.xml.cxf.common.annotations.XPathFunctionParameter;
import java.lang.String;
@XPathFunctionGroup(category="com.tibco.tibcobw.customfunctions",prefix="customTime",namespace="java://com.tibco.tibcobw.customfunctions.FTime",helpText="com.tibco.tibcobw.customfunctions.FTime") public class FTimeCustomXPathFunctionGroup {
  @XPathFunction(parameters={@XPathFunctionParameter(name="string1")},helpText="") public long XMLDateToTimestampMS(  java.lang.String string1){
    return FTime.XMLDateToTimestampMS(string1);
  }
  @XPathFunction(parameters={@XPathFunctionParameter(name="long1")},helpText="") public java.lang.String TimestampMSToXMLDate(  long long1){
    return FTime.TimestampMSToXMLDate(long1);
  }
  @XPathFunction(parameters={},helpText="") public long GetTStpMilliSecond(){
    return FTime.GetTStpMilliSecond();
  }
  @XPathFunction(parameters={},helpText="") public long GetTStpNanoSecond(){
    return FTime.GetTStpNanoSecond();
  }
}
