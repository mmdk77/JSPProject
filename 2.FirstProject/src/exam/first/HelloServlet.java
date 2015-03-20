package exam.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet") //@이노테이션("/URL 맵핑")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//한글처리
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");// test2와 같아야함.
		String id = request.getParameter("ID");
		String pwd = request.getParameter("pwd");
		
		out.print("Hello-GET<br>");
		out.print("이름 : "+name+"<br>");
		out.print(id+"<br>");
		out.print(pwd+"<br>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset = UTF-8"); //한글을 지원 해줌
		request.setCharacterEncoding("UTF-8"); 				  //요청시 한글을 지원 해줌
		
		PrintWriter out = response.getWriter();
		
		out.print("Hello-POST<br>");
		
		String name = request.getParameter("name");
		String id = request.getParameter("ID");
		String pwd = request.getParameter("pwd");
		
		out.print("이름 : "+name+"<br>");
		out.print(id+"<br>");
		out.print(pwd+"<br");
	}

}
