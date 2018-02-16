package com.employees.resources;
import com.employees.db.MySQL;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class employees{

    @GET
    @Path("/salary/{last_name}")
    @Produces(MediaType.APPLICATION_JSON)

    public String getSalary(@PathParam("last_name") String last_name){

        String Salary = new MySQL().getSalary(last_name);
        System.out.println(Salary);
        String result = "{\"salary\":\""+Salary+"\"}";
        System.out.println(result);

        return result;

    }
}
