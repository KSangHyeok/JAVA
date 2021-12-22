package util02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DanServlet01
 */
@WebServlet("/DanServlet01")
public class DanServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; char=utf-8");
		String Dan=req.getParameter("Dan");
		String outstr="";
		if(Dan==null) {
			outstr=("No Dan number");
		}else {
			int num1=Integer.parseInt(Dan);
			for(int i=1;i<10;i++) {
				outstr+=num1+"x"+i+"="+(num1*i)+"<br>";
			}
		}
		outstr="<html><head><title>곱셈~</title></head><body>"+outstr+"</body></html>";
		PrintWriter out=response.getWriter();
		out.println(outstr);
		
		
		
		//		response.setContentType("text/html; char=utf-8");
//		PrintWriter out=response.getWriter();
//		String str1=req.getParameter("Dan");		
//		if(str1==null) return;		
//		int Dan=Integer.parseInt(str1);
//		out.println("<html><head><title>곱셈~</title></head><body>");		
//		for(int i=1; i<10; i++) {
//		out.println(Dan+"x"+i+"="+Dan*i+"<br>");};
//		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
