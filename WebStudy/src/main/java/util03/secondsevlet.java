package util03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class secondsevlet
 */
@WebServlet("/secondsevlet")
public class secondsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public secondsevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; char=utf-8");
		PrintWriter out=response.getWriter();
		String str1=req.getParameter("n1");
		String str2=req.getParameter("n2");
		String str3=req.getParameter("n3");
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		int n3=Integer.parseInt(str3);
		int x1=(int)(((-n2)+Math.sqrt(Math.pow(n2,2)-(4*n1*n3)))/(2*n1));
		int x2=(int)(((-n2)-Math.sqrt(Math.pow(n2,2)-(4*n1*n3)))/(2*n1));
		out.println("<html><head><title>근의공식</title></head><body>");
		out.println(x1+"<br>");
		out.println(x2);
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
