package com.sathya.example.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
	
	
    @NotBlank(message = "Product name is required")
    @Size(min = 3, max = 50, message = "Product name must be between 3 and 50 characters")
    private String proName;

    @Min(value = 0, message = "Product price must be a positive number")
    private double proPrice;

    @NotBlank(message = "Product brand is required")
    private String proBrand;

    @NotBlank(message = "Product description is required")
    @Size(max = 200, message = "Description cannot be longer than 200 characters")
    private String proDescription;

    @NotBlank(message = "Product category is required")
    private String proCategory;
}