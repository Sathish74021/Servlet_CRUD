package Session_Tracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pragiee")
public class Sample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		Cookie c = new Cookie("one", id);
		Cookie c1 = new Cookie("two", name);
		req.setAttribute(name, c1);
		
	}

}
