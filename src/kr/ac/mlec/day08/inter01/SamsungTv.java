package kr.ac.mlec.day08.inter01;

public class SamsungTv {
       private String model;
       
       
       public SamsungTv() {
    	   System.out.println("�Ｚ tv�� �����Ͽ����ϴ�");
       }
       public void powerOn( ) {
    	   System.out.println("������ �մϴ�");
       }
       public void powerOff( ) {
    	   System.out.println("������ ���ϴ�");
       }
       public void ChannelUp( ) {
    	   System.out.println("ä�� ��ȣ�� �ø��ϴ�");
       }
       public void ChannelDown( ) {
    	   System.out.println("ä�� ��ȣ�� �����ϴ�");
       }
       public void VolumUp( ) {
    	   System.out.println("������ �ø��ϴ�");
       }
       public void VolumDown( ) {
    	   System.out.println("����ȣ�� �ø��ϴ�");
       }
}
