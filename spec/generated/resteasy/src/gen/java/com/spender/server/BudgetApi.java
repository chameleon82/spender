package com.spender.server;

import com.spender.server.models.*;
import com.spender.server.BudgetApiService;
import com.spender.server.factories.BudgetApiServiceFactory;

import com.spender.server.models.Item;


import java.util.List;
import com.spender.server.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/budget")

@Produces({ "application/json" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:56:01.221+07:00")

public class BudgetApi  {
   private final BudgetApiService delegate = BudgetApiServiceFactory.getBudgetApi();


    @GET
    @Path("/items")
    
    @Produces({ "application/json" })
    public Response getBudgetItems(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBudgetItems(securityContext);
    }

}

