@echo off

javac Database.java
javac Input.java
javac -cp .;jna-5.13.0.jar;jna-platform-5.13.0.jar Logger.java
javac RouteHandler.java
javac PasswordHasher.java
javac ManagerCookie.java

pause