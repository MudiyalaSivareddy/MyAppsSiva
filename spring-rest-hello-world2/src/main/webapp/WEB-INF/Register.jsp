<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  

<style>  
.error{color:red}  
</style>  
</head>  
<body>  
 

<form:form action="/" modelAttribute="emp"><br>
Eid(*): <form:input  path="eid"/> <br><br>
Name: <form:input path="name"/> <br>
<form:errors path="name" cssClass="error"/><br>  
Age: <form:input  path="age"/>  
<div class="alert alert-danger" role="alert">
<form:errors path="age" cssClass="error"/><br><br>
</div>
<input type="submit" value="submit">  
</form:form>  
</body>  
</html>  