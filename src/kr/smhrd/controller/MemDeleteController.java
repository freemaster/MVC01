package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.*;

@WebServlet("/memDelete.do")
public class MemDeleteController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));

		MemberDAO dao = new MemberDAOImpl();
		int cnt = dao.memberDelete(num);
		if (cnt > 0) {
			response.sendRedirect("memList.do");
			System.out.println("삭제 성공");
		} else {
			throw new ServletException("error");
		}
	}

}
