package com.sds.icto.web.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Param
 */
@WebServlet("/param")
public class Param extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Param() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String hobby[] = request.getParameterValues("hobby");
		String job = request.getParameter("job");
		
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("당신이 입력한 정보입니다.<hr>");
		out.println("아이디 : ");
		out.println(id);
		out.println("<br>비밀번호 : ");
		out.println(pwd);
		out.println("<br>나이 : ");
		out.println(age);
		out.println("<br>성별 : ");
		out.println(gender);
		if(hobby ==null){
			out.print("<br>선택한 항복이 없습니다.");
		}else{
			out.println("<br>취미 : ");
			for(String input_hobby : hobby){
				out.print(input_hobby + " ");
			}
		}
		out.println("<br>직업 : ");
		out.println(job);
		
		
		
	}

}
