package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1,"lam","lam@gmail.com","https://tapchilamdep.com/wp-content/uploads/2019/10/Kieu-toc-nu-dep-giup-guong-mat-bung-sang.jpg"));
        customerList.add(new Customer(2,"lami","lami@gmail.com","https://image-us.eva.vn/upload/2-2018/images/2018-04-24/be9e2216f9b49edb0d794e95173f8e2b-1524504006-59-width564height705.jpg"));
        customerList.add(new Customer(3,"lame","lame@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSUDPk18Mg2D2Xavs4PuXiX9dHeT5paj3mmA&usqp=CAU"));
    }
    public void add(Customer customer){
        customerList.add(customer);
    }
    public void edit(int id, Customer customer){
        customerList.set(id,customer);
    }
    public void delete(int id){
        customerList.remove(id);
    }
    public List<Customer> show(){
        return customerList;
    }
}
