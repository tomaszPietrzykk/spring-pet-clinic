package pl.tomasz.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.tomasz.springpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({" ","/", "/index", "/index.html"})
    public String listOfOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}
