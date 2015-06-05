package board.action;

import java.io.IOException;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import board.dto.Board;

public class BoardWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("BoardWrite");
		
		Board bd=new Board();
		/*String name=request.getParameter("name");
		String sub=request.getParameter("sub");
		String con=request.getParameter("con");*/
		
		ServletContext context = request.getServletContext();
		String upload = context.getRealPath("upload");
		System.out.println(upload);
		
		MultipartRequest multi = new MultipartRequest(request,upload,10*1024*1024,"UTF-8", new DefaultFileRenamePolicy());
		
		String name = multi.getParameter("name");
		String sub = multi.getParameter("sub");
		String con = multi.getParameter("con");
		String file = multi.getFilesystemName("file");
		
		bd.setName(name);
		bd.setTitle(sub);
		bd.setContent(con);
		bd.setAttachment(file);
		
		BoardDAO dao=new BoardDAO();
		int r=dao.insertBoard(bd);
		
		if(r!=0)
		{
			try {
				response.sendRedirect("list.board");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
