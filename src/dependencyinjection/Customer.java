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
public class Customer {
    Services services=new Services("CoolServices");
    
    public String viewCustomerServices(){
        
        System.out.println(services.getName());
        return services.getName();
    }
}
