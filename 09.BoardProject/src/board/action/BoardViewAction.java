package board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		BoardDAO dao=new BoardDAO();
		
		int num=Integer.parseInt(request.getParameter("num"));
		Board bd=dao.selectOneBoardByNum(num);
		dao.updateHits(num);
		String url="./board/view.jsp";
		
		request.setAttribute("bd", bd);
		RequestDispatcher ss=request.getRequestDispatcher(url);
		ss.forward(request, response);
		
	}

}
