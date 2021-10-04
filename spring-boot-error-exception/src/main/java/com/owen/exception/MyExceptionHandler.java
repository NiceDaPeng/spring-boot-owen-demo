package com.owen.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler
    public ModelAndView handler(Exception e){
        ModelAndView md = new ModelAndView();
        md.setViewName("error");
        md.addObject("message",e.getMessage());
        return md;
    }
}
