/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import daos.GeneralDAO;
import models.Employee;
import org.hibernate.SessionFactory;

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
        
        //test getdata dao
        GeneralDAO<Employee> edao= new GeneralDAO<>(factory,Employee.class);
        for (Employee employee : edao.getData("gi")) {
            System.out.println(employee.getFirstName());
            System.out.println(employee.getLastName());
            System.out.println(employee.getJob().getTitle());   
        }
        
        
        
        
    }
    
}
