<h1 align="center"> Testing Java </h1> <br>

## Table of Contents

- [Introduction](#introduction)
- [This&nbsp;respository](#thisrepository)
- [Dependencies](#dependencies)
- [Run&nbsp;Code](#runcode)
- [Platzi&nbsp;Course](#platzicourse)
- [Notes](#notes)

## Introduction

There are two ways to test the operation of an application, the manual one in which the inputs are entered manually and it is verified that the output is the same as expected, the other way is to do it automatically by writing code that performs these tests.

Writing test provides some benefits such as:
- Checks the requirements; it checks that the application is doing what it should do
- Documentation/Examples; provides information for using the application 
- Assist in TDD design
- Trust to the developer
- Confidence to refactor; it is possible to make improvements or modifications to the code without fear of breaking it.

#### Automatic testing
The automatic ones provide certain advantages:
- Automatic
- Rapid
- Scalable

However, they also have some disadvantages:
- Requires development time
- They are not always viable

#### Tests Types
There are different types of tests
- Unit testing. Checks the functionality of a single class or function.
- Integration testing. Checks how different components of the application are connected.
- Functional testing. Checks a functionality that can encompass different components of the application.
- End to end testing. It is similar to the functional one, but it goes through an entire execution path, such as the registration of a user.
- Stress testing. Intense testing used to check the stability of a application that will be used by many users.

#### TDD
Test-driven development (TDD) is a software development process created by Kent Beck, in which the tests are written before the application code. There are some advantages:
- Starting by writing test helps to think about the design
- If writing the test is difficult, perhaps the design is not suitable
- At the end will have the tests, with all its benefits

TDD Rules are:
1. You will only write test code until it fails
2. You will only write production code in order to pass the test that it had failed
3. You will not write more production code than necessary to pass the test

The above steps are repeated until complete the application requirements. 


## This&nbsp;repository
This repository contains the project that was developed throughout the Basic Course of Testing in Java, in which you learned to write code to verify the operation of applications, in addition you learned to use the jnuit library for unitary tests and mockito to simulate classes .

This project consists of different exercises such as:
- A password verifier (unit testing)
- A discount calculator (unit testing)
- A payment gateway (unit testing)
- A leap year calculator (unit testing)
- A movie consultant with a database (integration testing)


## Dependencies
- Install JDK 8 or later
- Install Intellj or another IDE thats supports JDK 8 or later and contains maven
- Add junit 4.13.2 or later
- Add mockito-core 3.11.1 or later
- Add spring-jdbc 5.1.3 or later

## Run&nbsp;Code
You can only run these projects using Intelli or another IDE what support maven.


## Platzi&nbsp;Course

Check out [Platzi's Testing in Java course](https://platzi.com/clases/testing-java/).


## Notes

Most commits correspond to sections of the course in which the project code was changed.
