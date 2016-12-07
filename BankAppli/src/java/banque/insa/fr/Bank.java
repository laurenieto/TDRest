/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package banque.insa.fr;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author laure
 */

@Path("bank")
public class Bank {
    @Context
    private UriInfo context;

    /** Creates a new instance of Bank */
    public Bank() {
    }

    /**
     * Retrieves representation of an instance of banque.insa.fr.Bank
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getCredit(@QueryParam("name") String name) {
        return "vous voulez récupérer les info du compte" + name;
    }

    /**
     * PUT method for updating or creating an instance of Bank
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
