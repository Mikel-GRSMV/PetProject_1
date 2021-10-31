<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Hello User!
    </div>
    <div class="form-style-2-heading">
        Please login!
    </div>
    <form method="post" action="/login">

        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label>

        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>

        <input type="submit" value="sign up">

    </form>
</div>

</body>
</html>