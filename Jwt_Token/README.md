Signup(User Registration)

POST:http://localhost:8081/api/auth/signup

{
    "username":"xylo",
    "email":"xylo@gmail.com",
    "password":"123456",
    "role": ["user","admin"]
}

Signin (User Login)

POST: http://localhost:8081/api/auth/signin

{
    "username": "xylo",
    "password": "123456"
}

Testing User API

GET : http://localhost:8081/api/test/user

Header
Authorization : Bearer (token)

Testing Admin API

GET : http://localhost:8081/api/test/admin

Header
Authorization : Bearer (token)

Testing Public Api 

GET: http://localhost:8081/api/test/all

No Authorization



