package kr.ac.mlec.day08.inter02;

public class SamsungTv implements TV {

	
	   public SamsungTv() {
		   System.out.println("�Ｚ ���� ��");
	   }
	@Override
	public void poweOn() {
		 System.out.println("�Ｚ poweOn");
		// TODO Auto-generated method stub

	}

	@Override
	public void poweOff() {
		 System.out.println("�ＺpoweOff");
		// TODO Auto-generated method stub

	}

	@Override
	public void soundUp() {
		 System.out.println("�ＺsoundUp");
		// TODO Auto-generated method stub

	}

	@Override
	public void soundDown() {
		 System.out.println("�Ｚ soundDown");
		// TODO Auto-generated method stub

	}

	@Override
	public void channelUp() {
		 System.out.println("�Ｚ channelUp");
		// TODO Auto-generated method stub

	}

	@Override
	public void channeldown() {
		 System.out.println("�Ｚ channeldown");
		// TODO Auto-generated method stub

	}

	@Override
	public void mute() {
		 System.out.println("�Ｚ mute");
		// TODO Auto-generated method stub

	}

}
