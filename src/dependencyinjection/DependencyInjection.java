/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyinjection;

/**
 *
 * @author Ali
 */
public class DependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer customer=new Customer();
        customer.viewCustomerServices();
        
    }
    
}
