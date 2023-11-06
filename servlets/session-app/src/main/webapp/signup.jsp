<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up | Session App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <style>
        form label sup {
            color: red;
        }
    </style>
</head>
<body class="vh-100 d-flex align-items-center justify-content-center">
    <form action="sign-up" method="POST" class="p-2 text-center border p-4 rounded">
        <h1>Session App</h1>
        <p>Enter your details to create a new account</p>
        <div class="mb-3">
            <label for="txt-name" class="form-label">Full name<sup>*</sup></label>
            <input pattern="^[A-Za-z ]+$" required type="text" class="form-control text-center" id="txt-name" placeholder="Enter your full name here">
        </div>
        <div class="mb-3">
            <label for="txt-email" class="form-label">Email address<sup>*</sup></label>
            <input required type="email" class="form-control text-center" id="txt-email" placeholder="Enter your email here">
        </div>
        <div class="mb-3">
            <label for="txt-password" class="form-label">Password<sup>*</sup></label>
            <input minlength="4" required type="password" class="form-control text-center" id="txt-password" placeholder="Enter your password here">
        </div>
        <div class="mb-3">
            <label for="txt-confirm-password" class="form-label">Confirm Password<sup>*</sup></label>
            <input minlength="4" required type="password" class="form-control text-center" id="txt-confirm-password" placeholder="Enter your password again here">
        </div>
        <div>
            <button class="btn btn-primary">Sign Up</button>
            <p class="pt-3 m-0">Already have an account?
                <a href="signin.jsp">Sign In</a>
            </p>
        </div>
    </form>
</body>
</html>