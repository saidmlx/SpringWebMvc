package io.saidmlx.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Hello{

  @RequestMapping(value= "/", method = RequestMethod.GET )
  public String wellcome(){
    return "wellcome";
  }

  @RequestMapping(value= "/wellcome/{name}", method = RequestMethod.GET )
  public ModelAndView sayWellcome(@PathVariable( value = "name") String name ){
    System.out.println(name);
    ModelAndView model = new ModelAndView();
    model.setViewName("sayWellcome");
    model.addObject("name",name);
    return model;
  }
}
