package util01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class memberServlet
 */
@WebServlet("/memberServlet")
public class memberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public memberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String realname = req.getParameter("realname");
		String idname = req.getParameter("idname");
		String gender = req.getParameter("gender");
		String passcode = req.getParameter("passcode");
		String passcode1 = req.getParameter("passcode1");
		String mobile = req.getParameter("mobile");
		String[] arInt = req.getParameterValues("interest");
		String outstr = "<html><head><title>회원가입</title></head><body>";

		outstr += "실명 :" + realname + "<br>성별 :" + gender + "<br>아이디 :" + idname + "<br>비밀번호 :" + passcode
				+ "<br>비밀번호확인 :" + passcode1 + "<br>모바일번호 :" + mobile + "<br>관심분야 :";

		if (arInt == null) {
			outstr += "선택된 것이 없습니다";
		} else {
			for (int i = 0; i < arInt.length; i++) {
				outstr += arInt[i] + "&nbsp&nbsp";
			}
			outstr += "</body></html>";
		}
		out.println(outstr);

	}

}
