package com.spender.server.factories;

import com.spender.server.UserIdApiService;
import com.spender.server.impl.UserIdApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:56:01.221+07:00")
public class UserIdApiServiceFactory {

   private final static UserIdApiService service = new UserIdApiServiceImpl();

   public static UserIdApiService getUserIdApi()
   {
      return service;
   }
}
