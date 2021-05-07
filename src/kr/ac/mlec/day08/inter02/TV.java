package kr.ac.mlec.day08.inter02;

public interface TV {
     
	/* public static final*/ int MAX_VOLUME_SIZE = 60;
	int MIN_VOLUME_SIZE = 0;
	
	/*public abstract*/void poweOn();
	void poweOff();
	void soundUp();
	void soundDown();
	void channelUp();
	void channeldown();
	void mute();
}
