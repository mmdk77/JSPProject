package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.action.Action;
import board.action.BoardListAction;
import board.action.BoardViewAction;
import board.action.BoardWriteAction;
import board.action.BoardWriteformaction;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("ssss");
		request.setCharacterEncoding("UTF-8");
		doProcess(request,response);	//process로 전달함
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
	 doProcess(request,response);	//process로 전달함
	}

	
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String conpath=request.getContextPath();
		String uri=request.getRequestURI();
		
		String com=uri.substring(conpath.length());
		
		System.out.println(conpath);
		System.out.println("uri : "+uri);
		System.out.println("com : "+com);
	
		Action aa=null;
		
		if(com.equals("/list.board"))
		{
			aa=new BoardListAction();
			aa.execute(request, response);
		
		}else if(com.equals("/write.board"))
		{
			aa=new BoardWriteAction();
			aa.execute(request, response);
			
		}else if(com.equals("/writeform.board"))
		{
			aa=new BoardWriteformaction();
			aa.execute(request, response);
			
		}else if(com.equals("/update.board"))
		{
			
		}else if(com.equals("/view.board"))
		{
			aa=new BoardViewAction();
			aa.execute(request, response);
			
		}else if(com.equals("/delete.board"))
		{
			
		}
			
	
	}

}
