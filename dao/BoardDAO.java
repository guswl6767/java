package kr.co.mlec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.ac.mlec.util.ConnectionFactory;
import kr.ac.mlec.util.JDBCClose;
import kr.co.mlec.vo.BoardVO;

/**
 * ����Ŭ database�� tbl_board�� CRUD�ϱ� ���� Ŭ����
 */
public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	
	/**
	 * tbl_board���� �Խù� ��ȣ�� �ش� �Խù� ��ȸ �޼ҵ�
	 */
	public BoardVO selectByNo(int boardNo) {
		BoardVO board = null;
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, content, view_cnt, reg_date ");
			sql.append("  from tbl_board ");
			sql.append(" where no = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, boardNo);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int 	no 		= rs.getInt("no");
				String 	title 	= rs.getString("title");
				String 	content = rs.getString("content");
				int 	viewCnt = rs.getInt("view_cnt");
				String 	regDate = rs.getString("reg_date");
				
				board = new BoardVO(no, title, content, viewCnt, regDate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return board;
	}
	
	/**
	 * tbl_board�� ��ü�Խñ��� ��ȸ�ϴ� �޼ҵ�
	 */
	public List<BoardVO> selectAll() {
		
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, content, view_cnt, reg_date ");
			sql.append("  from tbl_board ");
			sql.append(" order by no desc ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int 	no 		= rs.getInt("no");
				String 	title 	= rs.getString("title");
				String 	content = rs.getString("content");
				int 	viewCnt = rs.getInt("view_cnt");
				String 	regDate = rs.getString("reg_date");
				
				BoardVO board = new BoardVO(no, title, content, viewCnt, regDate);
				
				boardList.add(board);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return boardList;
	}

	/**
	 * tbl_board �Խñ��� ���(insert)�ϴ� �޼ҵ�
	 */
	public void insert(BoardVO board) {
				
		try {
			conn = new ConnectionFactory().getConnection();

			StringBuilder sql = new StringBuilder();
			sql.append("insert into tbl_board(no, title, content) ");
			sql.append(" values(seq_tbl_board_no.nextval, ?, ?) ");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	/**
	 * tbl_board �Խñ��� �����ϴ� �޼ҵ�
	 */
	public void update() {
	}
}






