package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.*;

@WebServlet("/memContent.do")
public class MemContentController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		String cpath = request.getContextPath();
		MemberDAO dao = new MemberDAOImpl();
		MemberVO vo = dao.memberContent(num);
		
		//요청의뢰 객체를 생성
		request.setAttribute("vo", vo);
		RequestDispatcher rd = request.getRequestDispatcher("member/memContent.jsp"); // 요청을 의뢰할 객체를 적는다.
		rd.forward(request, response); // -------------------------▲ 서버에서 이루어 지는 포워딩 기술
	}

}
