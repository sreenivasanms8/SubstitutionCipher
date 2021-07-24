<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body style="background-color:grey;">
<h1>DECRYPT</h1>

<form:form method="post" action="save">

<table>
	
	<tr>
		<td valign="top">Enter the CipherText to Decrypt:</td>
		<td><textarea name="ciphertext" style="height: 100px; width: 200px;"></textarea>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" name="action" value="Decrypt" /></td>
	</tr>
	
</table>

</form:form>
</body>