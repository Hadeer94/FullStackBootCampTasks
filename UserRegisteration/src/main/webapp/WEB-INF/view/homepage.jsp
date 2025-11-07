<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
    <div class="container mt-5">
        <h2 class="text-center mb-4">User Registration</h2>
        <form action="${pageContext.request.contextPath}/processForm" method="get" class="w-50 mx-auto">
            <div class="mb-3">
                <label class="form-label">First Name</label>
                <input class="form-control" type="text" placeholder="Enter First Name" name="fName">
            </div>
            <div class="mb-3">
                <label class="form-label">Last Name</label>
                <input class="form-control" type="text" placeholder="Enter Last Name" name="lName">
            </div>
            <div class="mb-3">
                <label class="form-label">Email Address</label>
                <input class="form-control" type="email" placeholder="Enter Email" name="email">
            </div>
            <div class="mb-3">
                <label class="form-label">Date Of Birth</label>
                <input class="form-control" type="date" placeholder name="date">
            </div>
            <div class="mb-3">
                <label class="form-label">City</label>
                <input class="form-control" type="text" placeholder name="city">
            </div>

            <input type="submit" class="btn btn-primary">
        </form>
    </div>
    </body>
</html>

