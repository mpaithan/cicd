<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"	
 	xmlns:gv="http://www.tibco.com/pe/DeployedVarsType"> 	
	
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:param name="ApplicationName"/>	
	<xsl:template  xmlns="http://soa.coe.com/CommonTypes/Mediation/Framework/GVForStarters/Starters.xsd" match="/"> 
	<xsl:variable name="PathName_1" select="gv:GlobalVariables/CORE_REMEDIATION/Starters" />
    <xsl:variable name="PathName_2" select="gv:GlobalVariables/CORE_LOG/Starters/" />	

<StarterList>
	<xsl:if test="$ApplicationName='CORE_REMEDIATION'">
		<xsl:for-each select="$PathName_1/*">
		<Starter>
			<ProcessFullPath>
				<xsl:value-of select="."/>
        		</ProcessFullPath>
			<Name/>
		</Starter>
		</xsl:for-each>
	</xsl:if>
		
	<xsl:if test="$ApplicationName='CORE_LOG'">
		<xsl:for-each select="$PathName_2/*">
		<Starter>
			<ProcessFullPath>
				<xsl:value-of select="."/>
        		</ProcessFullPath>
			<Name/>
		</Starter>
		</xsl:for-each>
	</xsl:if>
</StarterList>
</xsl:template>
</xsl:stylesheet>
