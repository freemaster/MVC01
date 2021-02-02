package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/memInsertForm.do")
public class MemInsertFormController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//요청의뢰 객체를 생성
		//response.sendRedirect("member/memInsertForm.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("member/memInsertForm.jsp"); // 요청을 의뢰할 객체를 적는다.
		rd.forward(request, response); // -------------------------▲ 서버에서 이루어 지는 포워딩 기술
	}

}
