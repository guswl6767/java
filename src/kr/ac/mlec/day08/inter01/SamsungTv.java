package kr.ac.mlec.day08.inter01;

public class SamsungTv {
       private String model;
       
       
       public SamsungTv() {
    	   System.out.println("삼성 tv를 구매하였습니다");
       }
       public void powerOn( ) {
    	   System.out.println("전원을 켭니다");
       }
       public void powerOff( ) {
    	   System.out.println("전원을 끕니다");
       }
       public void ChannelUp( ) {
    	   System.out.println("채널 번호를 올립니다");
       }
       public void ChannelDown( ) {
    	   System.out.println("채널 번호를 내립니다");
       }
       public void VolumUp( ) {
    	   System.out.println("볼륨를 올립니다");
       }
       public void VolumDown( ) {
    	   System.out.println("볼륨호를 올립니다");
       }
}
