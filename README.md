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

