package com.spender.server;

import com.spender.server.*;
import com.spender.server.models.*;


import com.spender.server.models.Item;


import java.util.List;
import com.spender.server.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:52:05.922+07:00")

public abstract class BudgetApiService {
  
      public abstract Response getBudgetItems(SecurityContext securityContext)
      throws NotFoundException;
  
}

