<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Older Person</title>
</head>
<body>

    <h2>you were born before 1990</h2>

    <jsp:useBean id="person" type="lab.mvc.model.Person" scope="request" />

    <p>First Name: <jsp:getProperty name="person" property="firstName" /></p>

    <p>Last Name: <jsp:getProperty name="person" property="lastName" /></p>

    <p>Birth Day: <jsp:getProperty name="person" property="birthDay" /></p>

    <p>Sex: <jsp:getProperty name="person" property="sex" /></p>

</body>
</html>