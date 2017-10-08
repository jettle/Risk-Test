package datiao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sex = request.getParameter("sex");//性别
		int age = Integer.parseInt(request.getParameter("age"));//年龄
		String emotion = request.getParameter("emotion");
		String city = request.getParameter("city");
		//将获取的jsp表单数据，作为参数传递给接口函数。
		double result = BasicInfor.getbasicDate(sex,age,emotion,city);
		float result1 = (float)result*100;
		request.setAttribute("result", result1+"%");
		request.getRequestDispatcher("cheated.jsp").forward(request, response);
		
	}
}
