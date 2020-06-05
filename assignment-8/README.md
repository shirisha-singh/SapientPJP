#Simple JAVA architecture tested using JUnit & Mockito

Given the architecture diagram from the manage an end to end program flow with following pointers has been created: (Database connectivity has been skipped)

![alt text](https://github.com/shirisha-singh/SapientPJP/blob/week-8/assignment-8/architectureDiagram.png?raw=true)

1. The client or CLI is the junit test case
2. The test cases to be written before the development code to test – with Mockito package com.training.mockito
3. The development test cases to be written are - for pass case, fail case and when the business logic throws exception (use custom exception )  com.training.tests 
4. Controller package should take the request and route to service layer com.training.controller 
5. The service layer will check if the data sent is valid (check if the name of the user is min 4 chars) – then send it to DAO layer  - com.training.service 
6. In the DAO layer once the object is got, put a message saying “Record Got Successfully” -com.training.dao 
7. Have appropriate contract / interfaces  - com.training.interfaces 
8. Keep all exception in – com.training.exceptions 

