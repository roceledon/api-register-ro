package zophyro.cl.register.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zophyro.cl.register.model.client.LoginRequest;
import zophyro.cl.register.service.LoginService;
import zophyro.cl.register.model.client.Login;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/register")
@Component
public class LoginResource {

    @Autowired
    LoginService loginService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Login save(final LoginRequest loginRequest) {
        return loginService.save(loginRequest);
    }

    @GET
    @Path("/user/{userId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Login> findByUserId(@PathParam("userId") final String userId){
        return loginService.findByUserId(userId);
    }

    @GET
    @Path("/email/{email}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Login> findByEmail(@PathParam("email") final String email){
        return loginService.findByEmail(email);
    }
}