<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<title></title>
</head>

<body style="background-color:grey;">
<h1>The Encrypted Message is:</h1>
<c:out value="${finalEncrypted}"/>
</body>

</html>