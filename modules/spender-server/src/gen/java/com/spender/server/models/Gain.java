package com.spender.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;





/**
 * Статья дохода
 **/

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-08T16:52:05.922+07:00")
public class Gain   {
  
  private Integer id = null;
  private Integer amount = null;
  private Integer item = null;
  private String name = null;

  
  /**
   * Идентификатор статьи дохода
   **/
  
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * Сумма
   **/
  
  @JsonProperty("amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  
  /**
   * Статья дохода
   **/
  
  @JsonProperty("item")
  public Integer getItem() {
    return item;
  }
  public void setItem(Integer item) {
    this.item = item;
  }

  
  /**
   * Описание дохода
   **/
  
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gain gain = (Gain) o;
    return Objects.equals(id, gain.id) &&
        Objects.equals(amount, gain.amount) &&
        Objects.equals(item, gain.item) &&
        Objects.equals(name, gain.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, item, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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



