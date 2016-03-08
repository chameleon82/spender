package com.spender.server;

import com.spender.server.models.*;
import com.spender.server.UserIdApiService;
import com.spender.server.factories.UserIdApiServiceFactory;

import com.spender.server.models.AccountInfo;
import com.spender.server.models.Gain;
import com.spender.server.models.Error;


import java.util.List;
import com.spender.server.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/{userId}")

@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:52:05.922+07:00")

public class UserIdApi  {
   private final UserIdApiService delegate = UserIdApiServiceFactory.getUserIdApi();


    @GET
    
    
    @Produces({ "application/json" })
    public Response getUserAccountInfo( @PathParam("userId") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUserAccountInfo(userId,securityContext);
    }

    @GET
    @Path("/gain")
    
    @Produces({ "application/json" })
    public Response getGains( @PathParam("userId") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getGains(userId,securityContext);
    }

    @POST
    @Path("/gain")
    
    @Produces({ "application/json" })
    public Response addGain( @PathParam("userId") String userId, Gain body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addGain(userId,body,securityContext);
    }

}

