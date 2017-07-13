package co.zw.arfel.clothing.controller;


import co.zw.arfel.clothing.model.Drug;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import co.zw.arfel.clothing.service.DrugService;

import javax.inject.Inject;
import java.util.List;


@Controller
@RequestMapping("/drug")
public class DrugController extends BaseController{

    private final Logger logger = LoggerFactory.getLogger(DrugController.class);
    @Inject
    private DrugService drugService;

        @RequestMapping(value = "/add", method = RequestMethod.GET)
        public ModelAndView add() {
            ModelAndView modelAndView = new ModelAndView();
            Drug drug = new Drug();
            modelAndView.addObject("title", APP_PREFIX+"Create/ Edit Drug");
            modelAndView.addObject("drug", drug);
            modelAndView.setViewName("drug/add");
            return modelAndView;
        }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String save(@ModelAttribute("drug") @Validated Drug drug,
                       BindingResult result, SessionStatus status,
                       final RedirectAttributes redirectAttributes) throws Exception
    {
        if (result.hasErrors()) {
            return "drug/add";
        }
        else {redirectAttributes.addFlashAttribute("css", "success");
            if (drug.isNew()) {
                redirectAttributes.addFlashAttribute("msg", "City added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "City updated successfully!");
            }
        }
        System.out.println("$$$$$$$$$$$$$"+drug);
        drugService.save(drug);
        return "redirect:drug/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {

        List<Drug> drugs = drugService.findAll().get();
        logger.debug("drug - add() is executed!");

        model.addAttribute("list", drugs);

        return "/drug/list";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
    public String deleteDrug(@PathVariable("id") Long id) {
        Long drugId = drugService.findOne(id).get().getId();
        drugService.delete(drugId);
        return "redirect:/drug/list";
    }

    @RequestMapping(value="item.update",method= RequestMethod.GET)
    public String getUpdateForm(@RequestParam("id") Long id, Model model){
        Drug drug=drugService.findOne(id).get();
        model.addAttribute("item",drug);
        return "/UpdateItem";

    }

}


