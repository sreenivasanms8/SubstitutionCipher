<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body style="background-color:grey;">
<h1>ENCRYPT</h1>

<form:form method="post" action="save">

<table>
	
	<tr>
		<td valign="top">Enter the message to Encrypt (only lower-case letters):</td>
		<td><textarea name="message" style="height: 100px; width: 300px;"></textarea>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" name="action" value="Encrypt" /></td>
	</tr>
	
</table>

</form:form>
</body>