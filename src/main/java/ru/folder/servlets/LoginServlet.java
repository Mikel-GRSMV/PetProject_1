package ru.folder.servlets;

import ru.folder.repositories.UserRepositoryImpl;
import ru.folder.repositories.UserRepositoryInterface;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserRepositoryInterface userRepositoryInterface;

    @Override
    public void init() throws ServletException {
        this.userRepositoryInterface = new UserRepositoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/jsp/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        if (userRepositoryInterface.isExist(name, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", name);
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/home");
            requestDispatcher.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/signUp");
        }

    }
}
