<div id="top"></div>
<br />
<div align="center">
<h3 align="center">Rest API application for Blind auction</h3>
  <p align="center">
    Restfull app created using spring boot .
  </p>
</div>

## Built With
* [JDK 21](https://openjdk.org/projects/jdk/21/)
* [Spring Boot](https://spring.io/projects/spring-boot) 
* [Maven](https://maven.apache.org/)

## Instruction to run the application
### Prerequisites
- Ensure Java, Maven, Git bash are installed on machine.
- Ensure all paths/classpaths for Java, Maven are set.

### Steps
- git clone https://github.com/sachy76/blind-auction-auth-server.git
- cd blind-auction-auth-server
- mvn clean install
- java -jar ./target/blind-auction-auth-server-0.0.1-SNAPSHOT.jar

## Operational Functionalities
### Defined users 
<table>
  <tr>
    <th>User</th>
    <th>Password</th>
  </tr>
  <tr>
    <td>seller-1</td>
    <td>secret1</td>
  </tr>
  <tr>
    <td>buyer-1</td>
    <td>secret2</td>
  </tr>
  <tr>
    <td>buyer-2</td>
    <td>secret3</td>
  </tr>
</table>

### Endpoints
### I've used Postman to call REST endpoints.
- Authenticate and generate new tockens for above users.
<table>
  <tr>
    <th>Rest Endpoint</th>
    <th>Authorization</th>
    <th>Credentials</th>
    <th>Body</th>
  </tr>
  <tr>
    <td>http://localhost:8090/oauth2/token</td>
    <td>Basic Auth</td>
    <td>from above table</td>
    <td>x-www-form-urlencoded, parameters (grant_type:client_credentials, scope:user.write)</td>
  </tr>
</table>
