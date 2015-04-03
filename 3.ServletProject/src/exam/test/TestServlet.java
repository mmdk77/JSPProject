package exam.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		//String 변수 ==> out.print(String에 있던 변수 사용)
		String gender = request.getParameter("gender");
		String id = request.getParameter("id");
		String color = request.getParameter("myColor");
		String email = request.getParameter("myEmail"); //getParameter html의 name값을 불러옴
		
		String subject = request.getParameter("subject");
		String txt = request.getParameter("txt");
		
		String[] hobby = request.getParameterValues("hobby");  //getParameterValues는 값을 여러개 불러옴. 배열 사용.
		
		PrintWriter out = response.getWriter();
		
		out.print(gender+"<br>");
		out.print(id+"<br>");
		out.print("<font color = '"+color +"'>"+ color + "</font><br>");
		out.print(email+"<br>");
		out.print(subject+"<br>");
		out.print(txt+"<br>");
		
		if(hobby == null){
			out.print("선택하세요.");
		}
		else
			for(int i=0; i<hobby.length; i++){
				out.print(hobby[i]);
			}
		out.close();
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
