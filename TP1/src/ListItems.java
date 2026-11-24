import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ListItems")
public class ListItems extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        ArrayList<String> items = (ArrayList<String>) session.getAttribute("items");

        if (items == null) {
            items = new ArrayList<String>();
        }

        String item = request.getParameter("item");

        if (item != null && !item.trim().isEmpty()) {
            items.add(item);
        }

        session.setAttribute("items", items);

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Your Items</h2>");
        response.getWriter().println("<ul>");

        for (String currentItem : items) {
            response.getWriter().println("<li>" + currentItem + "</li>");
        }

        response.getWriter().println("</ul>");
        response.getWriter().println(
                "<a href='/TP1/items.html'>Add another item</a>");
        response.getWriter().println("</body></html>");
    }
}