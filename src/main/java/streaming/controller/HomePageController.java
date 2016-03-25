/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import streaming.entity.Effacemoi;
import streaming.service.EffacemoiCrudService;

/**
 *
 * @author tom
 */
@Controller
@RequestMapping(value = "/effacemoi")
public class HomePageController {
    
    @Autowired
    private EffacemoiCrudService effacemoiCrudService;
    
    @RequestMapping(value = "detail/{idDuRecord}", method = RequestMethod.GET)
    public String detail(@PathVariable(value="idDuRecord")long monId) {
        System.out.println("***********************IIIICIIII*************");
        System.out.println(monId);
        return "redirect:/effacemoi/lister";

    }
    
    @RequestMapping(value = "ajouter", method = RequestMethod.POST)
    public String ajouterPost(@ModelAttribute ( value = "monEffaceMoi") Effacemoi em) {
//        em.setNom("nom");
//        em.setPrenom("prenom");

        effacemoiCrudService.save(em);
        return "redirect:/effacemoi/lister";

    }

    @RequestMapping(value = "ajouter", method = RequestMethod.GET)
    public String ajouter(Model model) {
        
        model.addAttribute("monEffaceMoi", new Effacemoi());

        return "effacemoi_ajouter";

    }

    @RequestMapping(value = "lister", method = RequestMethod.GET)
    public String lister(Model model) {
        
        Iterable<Effacemoi> liste = effacemoiCrudService.findAll();

        model.addAttribute("liste", liste);

        return "lister";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {

        System.out.println("Passe par là");

        return "home";
    }
}
