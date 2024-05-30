package com.Samundeeswari.Velusamy.Controller;


import com.Samundeeswari.Velusamy.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EmployeeController {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

//        Employee employee = new Employee();
//          EmployeeServices.findEmployeeByName();
//          EmployeeServices.findEmployeeById();
          EmployeeServices.showOfficeCodesAsDepartment();

        factory.close();
        session.close();
    }


}




