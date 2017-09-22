package spring.in.action.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import spring.in.action.spittr.Spittle;
import spring.in.action.spittr.data.SpittleRepository;

import javax.validation.Valid;

/**
 * Created by shliangyan on 2017/9/19.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Lazy
    @Autowired
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model, @RequestParam(value = "max") long max, @RequestParam("count") int count) {
        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    @RequestMapping(value = "/{spittleId}")
    public String spittle(@PathVariable long spittleId, Model model) {
        return "spittle";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spittle spittle, Errors errors, @RequestPart byte[] profilePicture) {
        if (errors.hasErrors()) {
            return "registerForm";
        }

        return "redirect:/spitter/spitter";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        return "profile";
    }
}
