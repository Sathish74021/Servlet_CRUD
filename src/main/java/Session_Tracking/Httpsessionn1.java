package Session_Tracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/c1")
public class Httpsessionn1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		HttpSession ht=req.getSession();
		ht.setAttribute("username", id);
		ht.setAttribute("pass", name);
		resp.sendRedirect("file2");
	}

}
