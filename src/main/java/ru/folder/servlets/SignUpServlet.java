package ru.folder.servlets;

import ru.folder.models.User;
import ru.folder.repositories.UserRepositoryInterface;
import ru.folder.repositories.UserRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    private UserRepositoryInterface userRepositoryInterface;

    @Override
    public void init() throws ServletException {
        this.userRepositoryInterface = new UserRepositoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> ourUsers = userRepositoryInterface.findUser();
        request.setAttribute("usersFromOurFakeStorage", ourUsers);
        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/jsp/signUp-jstl.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name"); //запрос на имя
        String password = request.getParameter("password"); //запрос на пароль
        LocalDate localDate = LocalDate.parse(request.getParameter("localDate")); //запрос на localDate


        User ourUserDoPost = new User(name, password, localDate);//создали User'а с полученными данными
        userRepositoryInterface.save(ourUserDoPost); //добавили в хранилище



        doGet(request, response);
   }
}
