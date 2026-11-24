package lab.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import lab.mvc.model.Person;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read information from the form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthDay = request.getParameter("birthDay");
        String sex = request.getParameter("sex");

        Person person = new Person(firstName, lastName, birthDay, sex);

        request.setAttribute("person", person);

        int year = Integer.parseInt(birthDay.substring(0, 4));

        RequestDispatcher dispatcher;

        if (year < 1990) {
            dispatcher = getServletContext().getRequestDispatcher("/web/old.jsp");
        } else {
            dispatcher = getServletContext().getRequestDispatcher("/web/young.jsp");
        }

        dispatcher.include(request, response);
    }
}