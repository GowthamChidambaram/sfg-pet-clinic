package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gowtham C on 08/05/21.
 */

@Controller
public class IndexController {

  @RequestMapping({"","/","index","index.html"})
  public String Index(){

    return "index";
  }
}
