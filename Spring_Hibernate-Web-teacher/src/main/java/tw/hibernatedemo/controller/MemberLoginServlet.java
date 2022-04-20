package tw.hibernatedemo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.service.MemberService;


@WebServlet("/userLogin")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MemberLoginServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		Map<String, String> errorMsgMap = new HashMap<String, String>();
		
		// 將 errorMsgMap 放入 request 物件內，識別字串為 ErrorMsgKey
		request.setAttribute("ErrorMsgKey", errorMsgMap);
		
		HttpSession httpSession = request.getSession();
		
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		
		MemberService memberService = new MemberService();
		
		Member tmpMember = memberService.checkLogin(username, password);
		
		if(tmpMember != null) {
			httpSession.setAttribute("loginOK", tmpMember.getMemberName());
		} else {
			errorMsgMap.put("LoginError", "帳號密碼不存在，請重新輸入");
		}
		
		if(errorMsgMap.isEmpty()) {
			// 沒錯誤，傳到 loginOK.jsp
			RequestDispatcher rd = request.getRequestDispatcher("loginOK.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		
	}

}
