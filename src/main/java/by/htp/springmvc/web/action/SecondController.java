package by.htp.springmvc.web.action;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SecondController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) throws Exception {
		System.out.println("contr");
		return "index";
	}
}
