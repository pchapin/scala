<?xml version="1.0" ?>

<!-- FILE   : IML.xsl
     SUBJECT: Style sheet to convert Issue Markup Language into XHTML.
     
To Do:

+ ... all manner of things.

+ This style sheet is extremely pathetic. It needs more help than I have space to mention here.

-->

<xsl:stylesheet version="1.0" xmlns:iml="http://vortex.cis.vtc.edu/xml/IML_0.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns="http://www.w3.org/1999/xhtml">

  <xsl:output method="xml"/>

  <xsl:template match="iml:issue-set">
    <html xmlns="http://www.w3.org/1999/xhtml" lang="en-US">
      <head>
        <!-- Probably eventually the title should come from the IML document. -->
        <title>Issue List</title>
        <link rel="stylesheet" href="default.css" type="text/css"/>
      </head>
      <body>
        <h1>Issue List</h1>
        <hr/>

        <!-- Note that I don't handle nested issue-sets at this time. -->
        <xsl:apply-templates select="iml:issue"/>

      </body>
    </html>
  </xsl:template>

  <!-- The following template formats an issue. -->
  <xsl:template match="iml:issue">
    <h2>ISSUE</h2>
    <p>
      <xsl:value-of select="iml:summary"/>
    </p>
    <xsl:apply-templates select="iml:creation-date"/>
    <xsl:apply-templates select="iml:comments"/>
    <hr/>
  </xsl:template>

  <!-- The following template formats an absolute datetime. -->
  <xsl:template match="iml:creation-date">
    <p>
      <xsl:value-of select="iml:date"/>
    </p>
  </xsl:template>

  <!-- The following template formats a comments element. -->
  <xsl:template match="iml:comments">
    <xsl:for-each select="iml:comment">
      <xsl:copy-of select="iml:notes"/>
    </xsl:for-each>
  </xsl:template>

</xsl:stylesheet>
