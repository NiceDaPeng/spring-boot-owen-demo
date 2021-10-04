package com.owen.controller;

import com.owen.entity.Customer;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String add(@Valid Customer customer, BindingResult result){
        System.out.println(result.getErrorCount());
        if (result.getErrorCount() > 0){
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringBuilder sb = new StringBuilder();
            for (FieldError fieldError : fieldErrors) {
                sb.append(fieldError.getField());
                sb.append(fieldError.getDefaultMessage());
                sb.append("\n");
                fieldError.getField();
                fieldError.getDefaultMessage();
            }
            return sb.toString();
        }
        System.out.println("请求成功");
        return "success";
    }

}
