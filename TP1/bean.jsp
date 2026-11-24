
<!DOCTYPE html>
<html>
<head>
    <title>Person Information</title>
</head>
<body>

    <h1>Person Information</h1>

    <jsp:useBean id="person" class="isep.lab1.bean.Person" scope="page" />

    <jsp:setProperty name="person" property="*" />

    <table border="1">

        <tr>
            <th>Field</th>
            <th>Value</th>
        </tr>

        <tr>
            <td>First name</td>
            <td><jsp:getProperty name="person" property="firstName" /></td>
        </tr>

        <tr>
            <td>Last name</td>
            <td><jsp:getProperty name="person" property="lastName" /></td>
        </tr>

        <tr>
            <td>Birth date</td>
            <td><jsp:getProperty name="person" property="birthDay" /></td>
        </tr>

        <tr>
            <td>Sex</td>
            <td><jsp:getProperty name="person" property="sex" /></td>
        </tr>

    </table>

    <br>
    <a href="form-jsp.html">Go back</a>

</body>
</html>
