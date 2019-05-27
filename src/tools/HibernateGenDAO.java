/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controller.EmployeeController;
import daos.GeneralDAO;
import models.Employee;
import org.hibernate.SessionFactory;
import controller.EmployeeController;
import java.math.BigDecimal;
import java.util.Date;
import models.Department;
import models.Job;

/**
 *
 * @author ASUS
 */
public class HibernateGenDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
        
        //test getById
//        System.out.println(edao.getById(new Integer(100)).getFirstName());
//        System.out.println(employeeController.getById("100").getFirstName());
        
        
        //test getdata  (getall & search)dao
        GeneralDAO<Employee> edao= new GeneralDAO<>(factory,Employee.class);
//        for (Employee employee : edao.getData("")) {
//            System.out.println(employee.getFirstName());
//            System.out.println(employee.getLastName());
//            System.out.println(employee.getJob().getTitle());
//            System.out.println(employee.getHireDate());
//            System.out.println(employee.getEmail());
//        }
        
        
        EmployeeController employeeController = new EmployeeController(factory);
        
        //test getall controller
        for (Employee employee : employeeController.getAll()) {
            System.out.println(employee.getFirstName());
            System.out.println(employee.getLastName());
        }

        //test search controller
//        System.out.println(employeeController.search("SKING"));
        
        


        //test insert
//        Employee employee = new Employee(560, "gede", "banget", "n@mail.com", "098970", new Date("12/01/2019"), new BigDecimal(23), new BigDecimal(0.2), new Department(new Short("90")), new Employee(100), new Job("AD_PRES"));
//        System.out.println(edao.saveOrDelete(employee, false));
//        System.out.println(employeeController.save("900", "gian", "luigi", "a@mail.com", "098970", "12/01/2019", "23", "0.2", "90", "100", "AD_PRES"));
//            
        
        //test update  
//        Employee employee1 = new Employee(560, "gianny", "luigi", "a@mail.com", "098970", new Date("12/01/2019"), new BigDecimal(23), new BigDecimal(0.2), new Department(new Short("90")), new Employee(100), new Job("AD_PRES"));
//        System.out.println(employeeController.save("900", "gianny", "luigi", "a@mail.com", "098970", "12/01/2019]", "1000000", "90000", "90", "104", "AD_PRES"));
//        
        //test delete
//        System.out.println(edao.saveOrDelete(new Employee(900), true));
//        System.out.println(employeeController.delete("900"));
        
        
    }
    
}
