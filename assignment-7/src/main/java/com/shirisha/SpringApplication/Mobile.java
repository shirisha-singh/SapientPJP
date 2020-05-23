package com.shirisha.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	ApplicationContext factoryScreen = new ClassPathXmlApplicationContext("screenContext.xml");
	
	@Autowired
	ApplicationContext factoryCamera = new ClassPathXmlApplicationContext("cameraContext.xml");
	
	@Autowired
	ApplicationContext factorySpeaker = new ClassPathXmlApplicationContext("speakerContext.xml");
	
	private Screen screen = (Screen)factoryScreen.getBean("screen");
	private Camera camera = (Camera)factoryCamera.getBean("camera");
	private Speaker speaker = (Speaker)factorySpeaker.getBean("speaker");
	
	public void useScreen()
	{
		screen.display();
	}
	
	public Screen getScreen() {
		return screen;
	}

	public void setScreen(int length, int breadth) {
		this.screen.setLength(length);
		this.screen.setBreadth(breadth);
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(double numberOfMegaPixels, String color, String brand) {
		this.camera.setColor(color);
		this.camera.setBrand(brand);
		this.camera.setNumberOfMegaPixels(numberOfMegaPixels);
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(int volumeLevels, String speakerType) {
		this.speaker.setSpeakerType(speakerType);
		this.speaker.setVolumeLevels(volumeLevels);
	}

	public void useCamera()
	{
		camera.click();
		camera.record();
	}
	
	public void useSpeaker()
	{
		speaker.playSong();
	}
	

}
