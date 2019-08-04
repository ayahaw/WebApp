package webapp;

import AppLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "login")
public class login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User userObject = new User();

        request.setAttribute("username", request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("password"));
        request.setAttribute("date", new Date().toString());

        if (userObject.isValidUserCredentials(request.getParameter("loginname"), request.getParameter("password"))) {
            request.getRequestDispatcher("/Welcom.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Username or Password, Try again..");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("username", request.getParameter("loginname"));
        request.setAttribute("password", request.getParameter("password"));
        request.setAttribute("date", new Date().toString());

        request.getRequestDispatcher("/Welcom.jsp").forward(request, response);


       /* PrintWriter out = response.getWriter();
        out.print("User_name: " + request.getParameter("loginname") + " Password: " +
                request.getParameter("password"));*/
    }
}
