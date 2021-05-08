package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gowtham C on 09/05/21.
 */

@RequestMapping("/vets")
@Controller
public class VetController {

  @RequestMapping({"","index","index.html"})
  public String ListVets(){

    return "vets/index";
  }
}
