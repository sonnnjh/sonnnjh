package www.son.home;


import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.son.service.IF_TravelService;
import www.son.vo.TravelVO;

@Controller
public class TravelController {
	
	@Inject
	IF_TravelService tservice;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() throws Exception {
		return "home";
	}
	
	@RequestMapping(value="input", method=RequestMethod.GET)
	public String input() throws Exception{
		return "inputForm";
	}
	
	@RequestMapping(value="inputSave", method=RequestMethod.POST)
	public String inputSave(@ModelAttribute TravelVO tvo) throws Exception{
		System.out.println(tvo.toString());
		tservice.insert(tvo);
		return "redirect:tList"; //매핑의 이름이다
	}
	
	@RequestMapping(value="tList", method=RequestMethod.GET)
	public String list(Model model) throws Exception{
		List<TravelVO> list = tservice.allList();
		model.addAttribute("list", list);
		return "trList";
	}
}
