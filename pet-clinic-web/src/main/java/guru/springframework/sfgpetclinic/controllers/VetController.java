package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * Created by Gowtham C on 09/05/21.
 */

@RequestMapping("/vets")
@Controller
public class VetController {

  private final VetService vetService;

  public VetController(VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({"","/","index","index.html"})
  public String ListVets(Model model){

    model.addAttribute("vets",vetService.findAll());

  return "vets/index";
  }
}
