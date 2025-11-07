<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>


        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    </head>
    <body class="bg-light" background="${pageContext.request.contextPath}/resources/images/background.jpg">
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-md-6">
                <div class="card shadow-lg p-4 rounded-4">
                <h1 class="text-center mb-4 fw-bold">User Form</h1>
                <form:form action="processForm" modelAttribute="userModel">
                    <div class="mb-3">
                        <form:input cssClass="form-control" type="text" placeholder="username"  path="userName"/>
                    </div>
                    <div class="mb-3">
                        <form:input cssClass="form-control" path="password" type="password" placeholder="password"/>
                    </div>
                    <div class="mb-3">
                        <form:select cssClass="form-select form-select-lg w-100" path="country">
                            <form:option value="Brazil" label="Brazil"/>
                            <form:option value="Egypt" label="Egypt"/>
                        </form:select>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Preferred Programming Language</label>
                    <div class="mb-2">
                        Java<form:radiobutton  path="programmingLanguage"  value="java"/>
                        C#<form:radiobutton path="programmingLanguage" value="c#"/>
                        PHP<form:radiobutton path="programmingLanguage" value="php"/>
                    </div>
                    </div>

                    <div>
                        <label class="form-label">
                            Preferred Operating System
                        </label>
                    </div>
                    <div >
                        Windows<form:checkbox path="os" value="windows"/>
                        Linux<form:checkbox path="os" value="linux"/>
                        Mac<form:checkbox path="os" value="mac"/>
                    </div>
                    <div class="d-grid">
                        <button type="submit" class="btn btn-danger btn-lg fw-semibold w-100">Submit</button>
                    </div>
                </form:form>
                </div>
                </div>
            </div>
        </div>
    </body>
</html>

