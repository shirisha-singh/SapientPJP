package com.shirisha.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("mobileContext.xml");
		
		Mobile mobile = (Mobile)factory.getBean("mobile");
		mobile.setScreen(200, 200);
		mobile.setCamera(24.3, "grey", "Lumix");
		mobile.setSpeaker(120, "subwoofers");
		
		System.out.println("\n#########SCREEN#########\n");
		mobile.useScreen();
		System.out.println("\n#########CAMERA#########\n");
		mobile.useCamera();
		System.out.println("\n#########SPEAKER#########\n");
		mobile.useSpeaker();
		
	}

}
