package com.shirisha.SpringApplication;

public class Speaker {

	private int volumeLevelsInDB = 100;
	private String speakerType = "loudspeaker";
	
	public int getVolumeLevels() {
		return volumeLevelsInDB;
	}

	public void setVolumeLevels(int volumeLevels) {
		this.volumeLevelsInDB = volumeLevels;
	}

	public String getSpeakerType() {
		return speakerType;
	}

	public void setSpeakerType(String speakerType) {
		this.speakerType = speakerType;
	}

	public void playSong()
	{
		System.out.println("Speaker type: "+ this.getSpeakerType()
				+ "\nSpeaker sound level(in db): "+ this.volumeLevelsInDB
				+ "\n\nStart playing song...\n");
	}
}
