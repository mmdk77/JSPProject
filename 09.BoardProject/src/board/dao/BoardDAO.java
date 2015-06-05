package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import board.dto.Board;

public class BoardDAO {
	
	
	private Connection db=null;
	private PreparedStatement sm=null;
	private ResultSet re=null;
	
//dao
	public BoardDAO()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			db=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserd","jsp1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로드 오류");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("db연결 오류");
		}
		
	}
	
	
	public int insertBoard(Board bo)
	{
		
		String sql="insert into board values(board_seq.nextval,?,?,?,default,default,?)";
		try {
			sm = db.prepareStatement(sql);
			sm.setString(1, bo.getName());
			sm.setString(2, bo.getTitle());
			sm.setString(3, bo.getContent());
			sm.setString(4, bo.getAttachment());
			
			 int r=sm.executeUpdate();
			
			 if(r!=0)
				{
					return r;
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}
	
	//리스트
	public List<Board> selectAllBoard()
	{
		String sql="select * from board order by num desc";
		
		List<Board> ll=new ArrayList<Board>();
		
		
		
		try {
			sm = db.prepareStatement(sql);
			re=sm.executeQuery();
			while(re.next())
			{
				Board bd=new Board();
				bd.setNum(re.getInt("num"));
				bd.setName(re.getString("name"));
				bd.setTitle(re.getString("title"));
				bd.setContent(re.getString("content"));
				bd.setHits(re.getInt("hits"));
				bd.setWdate(re.getDate("wdate"));
				ll.add(bd);
			}
			return ll;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	public Board selectOneBoardByNum(int num)
	{
		String sql="select * from board where num="+num;
		
	
		try {
			sm = db.prepareStatement(sql);
			re=sm.executeQuery();
			re.next();
			
				Board bd=new Board();
				bd.setNum(re.getInt("num"));
				bd.setName(re.getString("name"));
				bd.setTitle(re.getString("title"));
				bd.setContent(re.getString("content"));
				bd.setHits(re.getInt("hits"));
				bd.setWdate(re.getDate("wdate"));
				bd.setAttachment(re.getString("attachment"));
			return bd;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
	
	public void updateHits(int num)
	{
		String sql = "update board set hits=hits+1 where num="+num;
			try {
				sm = db.prepareStatement(sql);
				sm.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
	
	public int updateBoard(Board board)
	{
		String sql = "update board"
		return 0;
	}
	
	
	public int deleteBoard(int num)
	{
	
		return 0;
	}
	
}
