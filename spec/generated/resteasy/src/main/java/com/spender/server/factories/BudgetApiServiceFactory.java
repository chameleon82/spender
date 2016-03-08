package com.spender.server.factories;

import com.spender.server.BudgetApiService;
import com.spender.server.impl.BudgetApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:56:01.221+07:00")
public class BudgetApiServiceFactory {

   private final static BudgetApiService service = new BudgetApiServiceImpl();

   public static BudgetApiService getBudgetApi()
   {
      return service;
   }
}
