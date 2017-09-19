package spring.in.action.spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring.in.action.spittr.Spittle;
import spring.in.action.spittr.data.SpittleRepository;

/**
 * Created by shliangyan on 2017/9/19.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {

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
    public String processRegistration(Spittle spittle) {
        return "redirect:/spitter/spitter";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        return "profile";
    }
}
