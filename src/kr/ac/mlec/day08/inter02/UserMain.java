package kr.ac.mlec.day08.inter02;

public class UserMain {
     public static void main(String[] args) {
		//TV tv = new LGTV(); //묵시적 형변환
		TV tv = new SamsungTv();
		tv.poweOn();
		tv.soundUp();
		tv.channeldown();
		tv.channelUp();
		tv.soundUp();
		tv.mute();
		tv.poweOff();
	}
}
