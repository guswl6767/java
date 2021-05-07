package kr.co.mlec.dao;

import java.util.Scanner;

import kr.co.mlec.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) {
		
		/*
		 	조회할 게시물 번호 입력 : 3
		 	3번 게시물을 없습니다
		 	or
		 	게시물번호 : 3
		 	제목 : XXXX
		 	내용 : XXXX
		 	조회수 : X
		 	등록일 : xxxx-xx-xx
		 	selectByNo()
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 게시물 번호 입력 : ");
		int no = sc.nextInt();
		
		BoardDAO dao = new BoardDAO();
		BoardVO board = dao.selectByNo(no); 
		if(board == null) {
			System.out.println(no + "번 게시물이 없습니다");
		} else {
			System.out.println("번  호 : " + board.getNo());
			System.out.println("제  목 : " + board.getTitle());
			System.out.println("내  용 : " +  board.getContent());
			System.out.println("조회수 : " + board.getViewCnt());
			System.out.println("등록일 : " + board.getRegDate());
		}
		
		/*
		BoardDAO dao = new BoardDAO();
		List<BoardVO> boardList = dao.selectAll();
		System.out.println("조회된 게시물수 : " + boardList.size() + "개");
		
		for(BoardVO b : boardList) {
			System.out.println(b);
		}
		*/
		
		/*
		BoardDAO dao = new BoardDAO();
		
		BoardVO board = new BoardVO();
		board.setTitle("안녕하세요");
		board.setContent("가입인사합니다");
		
		dao.insert(board);
		System.out.println("삽입완료...");
		*/
	}
}











