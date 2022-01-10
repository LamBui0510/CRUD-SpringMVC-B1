package controller;

import model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class CustomerController {
    List<Customer> customers = CustomerService.customerList;
    CustomerService customerService = new CustomerService();
    @GetMapping("/showCustomer")
    public void show(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("customers", CustomerService.customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/showCustomer.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/create")
    public String addGet(){
        return "/createCustomer.jsp";
    }

    @PostMapping("/create")
    public void addPost(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String img = request.getParameter("img");
        customers.add(new Customer(id,name,email,img));
        try {
            response.sendRedirect("/showCustomer"); //???????? why not .jsp
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/edit")
    public String updateGet(HttpServletRequest request, HttpServletResponse response){
        int index = Integer.parseInt(request.getParameter("index"));
        request.setAttribute("customers",  CustomerService.customerList.get(index));
        return "/editCustomer.jsp";
    }
    @PostMapping("/edit")
    public String updatePost(HttpServletRequest request, HttpServletResponse response){
        int index = Integer.parseInt(request.getParameter("index"));
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email= request.getParameter("email");
        String img = request.getParameter("img");
        Customer customer = new Customer(id,name,email,img);
        customerService.edit(index, customer);
        request.setAttribute("customers", CustomerService.customerList);
        return "/showCustomer.jsp";
    }
    @GetMapping("/delete")
    public String deleteGet(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("index"));
        customerService.delete(id);
        return "/showCustomer";
    }


}
