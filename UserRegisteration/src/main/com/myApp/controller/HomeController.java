package main.com.myApp.controller;


import main.com.myApp.config.AppConfig;
import main.com.myApp.dao.HomeDao;
import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.time.LocalDate;

@Controller
public class HomeController {
    @Autowired
    private HomeDao homeDao;
    @RequestMapping("/")
    public String home() {
        return "homepage";
    }
    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) throws SQLException {
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        LocalDate date = LocalDate.parse(request.getParameter("date"));

        User user = new User(date, city, email, lName, fName);

        // save to DB
        homeDao.saveUser(user);
        model.addAttribute("fName", request.getParameter("fName"));
        model.addAttribute("lName", request.getParameter("lName"));
        model.addAttribute("email", request.getParameter("email"));
        model.addAttribute("date", request.getParameter("date"));
        model.addAttribute("city", request.getParameter("city"));

        return "resultPage";
    }
}
