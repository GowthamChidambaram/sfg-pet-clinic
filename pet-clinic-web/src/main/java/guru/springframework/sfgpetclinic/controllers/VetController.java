package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gowtham C on 09/05/21.
 */

@Controller
public class VetController {

  @RequestMapping({"/vets","/vets/index","/vets/index.html"})
  public String Index(){

    return "vets/index";
  }
}
