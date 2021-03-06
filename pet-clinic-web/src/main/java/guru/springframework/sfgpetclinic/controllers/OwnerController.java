package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gowtham C on 09/05/21.
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"","/","/index", "/index.html"})
  public String ListOwners(Model model) {

    model.addAttribute("owners", ownerService.findAll());

    return "owners/index";
  }
}
