package kr.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.*;

@WebServlet("/memList.do")
public class MemListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAOImpl();
		List<MemberVO> list = dao.memberList();

		//요청의뢰 객체를 생성
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("member/memList.jsp"); // 요청을 의뢰할 객체를 적는다.
		rd.forward(request, response); // -------------------------▲ 서버에서 이루어 지는 포워딩 기술
	}

}
