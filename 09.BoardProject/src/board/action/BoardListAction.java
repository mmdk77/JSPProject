package board.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BoardDAO dao=new BoardDAO();
		
		
		List<Board> list=dao.selectAllBoard();
		
		String url="./board/list.jsp";
		
		request.setAttribute("list", list);
		
		RequestDispatcher ss=request.getRequestDispatcher(url);
		ss.forward(request, response);
		System.out.println("BoardListAction");
	}

}
