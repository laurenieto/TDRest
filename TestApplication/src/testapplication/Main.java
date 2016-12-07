/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testapplication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author laure
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client cl = Client.create();
        WebResource r = cl.resource("http://localhost:8080/BankAppli/resources/bank?name=laure");
        String result = r.get(String.class);
        System.out.println(result);
    }



}
