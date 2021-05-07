package kr.ac.mlec.day08.inter01;

public class UserMain {
       public static void main(String[] args) {
		
    	   
    	SamsungTv sam =  new SamsungTv();
    	sam.powerOn();
    	sam.VolumUp();
    	sam.VolumDown();
    	sam.ChannelDown();
    	sam.powerOff();
    	
    	LGTV lg = new LGTV();
    	lg.TurnOn();
    	lg.SoundUp();
    	lg.ChannelDown();
    	lg.TurnOff();
	}
}
