<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h2> Listado de Personas </h2>
	<logic:notEmpty name="personas">
		<ul>
			<logic:iterate id="persona" name="personas">
				<li>
					<bean:write name="persona" property="nombre"/>
					<bean:write name="persona" property="apellido"/>
				</li>
			</logic:iterate>
		</ul>		
	</logic:notEmpty>
	<logic:empty name="personas">
		<h4>No se encontraron elementos en la lista</h4>		
	</logic:empty>
	
	<br/>
	
	<html:link page="/inicio.do">Regresar</html:link>
</body>
</html:html>