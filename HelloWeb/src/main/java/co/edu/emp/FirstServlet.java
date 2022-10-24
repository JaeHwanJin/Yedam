package co.edu.emp;

import java.io.IOException;

import javax.servlet.ServletException;

// 서블릿이 되려면 HttpServlet 상속
// init() -> service() 구현

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init()호출."); // 인스턴스가 생성 될 때 한번만 실행
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println("service() 호출."); // FristServlet 호출될때마다 실행
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy() 호출.");
	}

}
