package com.spender.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;





/**
 * ������� ���������� �� ��������
 **/

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:56:01.221+07:00")
public class AccountInfo   {
  
  private Integer balance = null;

  
  /**
   **/
  
  @JsonProperty("balance")
  public Integer getBalance() {
    return balance;
  }
  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(balance, accountInfo.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



