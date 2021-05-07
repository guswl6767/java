package kr.co.mlec.dao;

import java.util.Scanner;

import kr.co.mlec.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		
		/*
		 	��ȸ�� �Խù� ��ȣ �Է� : 3
		 	3�� �Խù��� �����ϴ�
		 	or
		 	�Խù���ȣ : 3
		 	���� : XXXX
		 	���� : XXXX
		 	��ȸ�� : X
		 	����� : xxxx-xx-xx
		 	selectByNo()
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȸ�� �Խù� ��ȣ �Է� : ");
		int no = sc.nextInt();
		
		BoardDAO dao = new BoardDAO();
		BoardVO board = dao.selectByNo(no); 
		if(board == null) {
			System.out.println(no + "�� �Խù��� �����ϴ�");
		} else {
			System.out.println("��  ȣ : " + board.getNo());
			System.out.println("��  �� : " + board.getTitle());
			System.out.println("��  �� : " +  board.getContent());
			System.out.println("��ȸ�� : " + board.getViewCnt());
			System.out.println("����� : " + board.getRegDate());
		}
		
		/*
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = dao.selectAll();
		System.out.println("��ȸ�� �Խù��� : " + boardList.size() + "��");
		
		for(BoardVO b : boardList) {
			System.out.println(b);
		}
		*/
		
		/*
		BoardDAO dao = new BoardDAO();
		
		BoardVO board = new BoardVO();
		board.setTitle("�ȳ��ϼ���");
		board.setContent("�����λ��մϴ�");
		
		dao.insert(board);
		System.out.println("���ԿϷ�...");
		*/
	}
}











