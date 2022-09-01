package com.spring.restwebmvc.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    @ApiModelProperty(value = "Firstname of Customer", required = true)
    private String firstname;
    private String lastname;
    @JsonProperty("customer_url")
    private String customerUrl;
}
