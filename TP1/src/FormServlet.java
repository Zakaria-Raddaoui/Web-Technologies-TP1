
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("FormServlet doPost executed");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthDay = request.getParameter("birthDay");
        String sex = request.getParameter("sex");

        Cookie cookie1 = new Cookie("firstName",
                URLEncoder.encode(firstName, "UTF-8"));

        Cookie cookie2 = new Cookie("LastName",
                URLEncoder.encode(lastName, "UTF-8"));

        Cookie cookie3 = new Cookie("birthDay",
                URLEncoder.encode(birthDay, "UTF-8"));

        Cookie cookie4 = new Cookie("Sex",
                URLEncoder.encode(sex, "UTF-8"));

        cookie1.setPath(request.getContextPath());
        cookie2.setPath(request.getContextPath());
        cookie3.setPath(request.getContextPath());
        cookie4.setPath(request.getContextPath());

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        response.addCookie(cookie4);
        System.out.println("Four cookies have been added to the response");
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Form Result</title></head>");
        out.println("<body>");

        out.println("<h2>Personal Information</h2>");

        out.println("<table border='1' cellpadding='8'>");
        out.println("<tr><th>First Name</th><td>" + firstName + "</td></tr>");
        out.println("<tr><th>Last Name</th><td>" + lastName + "</td></tr>");
        out.println("<tr><th>Birth Day</th><td>" + birthDay + "</td></tr>");
        out.println("<tr><th>Sex</th><td>" + sex + "</td></tr>");
        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}
