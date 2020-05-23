#SpringApplication
A Mobile class is created which has dependencies of Camera, Screen, Speaker classes which has-a relation.  

Below is the prototype of the classes

1. Class -> Mobile with Fields -> camera, speaker, screen 

2. Class -> Screen with Fields -> length, breadth

3. Class -> camera with Fields -> numberOfMegaPixels, color, brand

4. Class -> Speaker with Fields -> volumeLevelsInDB, speakerType


Following xml files have been created:-

1. mobileContext.xml  - Mobile 
2. screenContext.xml – Screen 
3. cameraContext.xml - Camera
4. speakerContext.xml – Speaker 

An App.java file has been created which will load the mobile class via Dependency Injection.

Also Autowiring has been used.

