#SpringApplication
A Mobile class is created which has dependencies of Camera, Screen, Speaker classes which has-a relation.  

Below is the prototype of the classes
Class -> Mobile 
Fields -> camera, speaker, screen 


Class -> Screen 
Fields -> length, breadth

Class -> camera 
Fields -> numberOfMegaPixels, color, brand

Class -> Speaker
Fields -> volumeLevelsInDB, speakerType

Following xml files have been created:-
mobileContext.xml  - Mobile 
screenContext.xml – Screen 
cameraContext.xml - Camera
speakerContext.xml – Speaker 

An App.java file has been craeted which will load the mobile class via Dependency Injection.

Also Autowiring has been used.

