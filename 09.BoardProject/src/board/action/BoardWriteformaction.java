package board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardWriteformaction implements Action {

	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="./board/write.jsp";
		RequestDispatcher ss=request.getRequestDispatcher(url);
		ss.forward(request, response);
		
		
		System.out.println("BoardWriteformaction");
		
	}

}
