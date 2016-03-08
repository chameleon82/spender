package com.spender.server.impl;

import com.spender.server.*;
import com.spender.server.models.*;


import com.spender.server.models.AccountInfo;
import com.spender.server.models.Gain;
import com.spender.server.models.Error;


import java.util.List;
import com.spender.server.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:52:05.922+07:00")

public class UserIdApiServiceImpl extends UserIdApiService {
  
      @Override
      public Response getUserAccountInfo(String userId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response getGains(String userId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response addGain(String userId,Gain body,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}

