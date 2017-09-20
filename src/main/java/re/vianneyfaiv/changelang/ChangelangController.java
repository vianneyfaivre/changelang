package re.vianneyfaiv.changelang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChangelangController {

	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}
