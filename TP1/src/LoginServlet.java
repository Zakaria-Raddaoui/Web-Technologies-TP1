import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession();
        session.setAttribute("user", username);

        response.setContentType("text/html");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Welcome, " + username + "!</h2>");
        response.getWriter().println("<p>You are now logged in.</p>");
        response.getWriter().println("<a href='/TP1/items.html'>Go to Items</a>");
        response.getWriter().println("</body></html>");
    }
}