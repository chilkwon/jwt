# jwt
https://start.spring.io/
![img.png](img.png)

go to https://mvnrepository.com/
download java JWT 
![img_1.png](img_1.png)
copy the below
<dependency>
<groupId>com.auth0</groupId>
<artifactId>java-jwt</artifactId>
<version>3.18.2</version>
</dependency>
and past the above dependency into pom.xml

JWT= Base64(Header).Base64(Payload).Base64(HS256Ecription(lowSig))

Set up application.properties
and create one RestController for testing.
#Step 1
Create user model and run springboot to create user table
#Step 2
Create SecurityConfig class
![img_2.png](img_2.png) 
That is basic security setting for JWT server.
We are not using formlogin and httpBasic and no session as well.
#Step 3
Create CorsConfig class under config package
![img_3.png](img_3.png)
After Creating CorsConfig class, need to add CorsConfig
into SecurityFilter inside of Security config.

![img_4.png](img_4.png)
Therefore, This server will allow all request ( Cross Origin)

For more information about CORS(Cross- Origin Resource Sharing)
https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS

you can use @CrossOrigin on every RestController. However, this case is not working
once the program needs authentication. So, For CORS, we need to creat CorsConfig class
and add it to the security filter.

#Step4
you can access all pages after the above steps.
![img_5.png](img_5.png)
![img_6.png](img_6.png)
![img_7.png](img_7.png)
![img_8.png](img_8.png)




