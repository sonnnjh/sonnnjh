package www.son.home;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import www.son.service.IF_MgrService;
import www.son.vo.MgrVO;

@Controller
public class MgrController {
	
	@Inject
	IF_MgrService mservice ;

	
	@GetMapping("main")
	public String main() throws Exception {
		return "mainMGR";
	}
	@GetMapping ("/add")
	public String input() throws Exception{
		return "addMGR";
	}
	@GetMapping ("/addSave")
	public String inputSave(@ModelAttribute MgrVO mvo) throws Exception{
		mservice.insert(mvo);
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String allList(Model model) throws Exception{
		List<MgrVO> allList = mservice.allList();
		model.addAttribute("allListMgr", allList);
		return "listMGR";
	}
	
	@GetMapping("/delNum")
	public String del(@RequestParam("num") String num) throws Exception{
		mservice.delete(num);
		return "redirect:list";
	}
	
	@GetMapping("/modNum")
	public String update(@RequestParam("num") int num, Model model) throws Exception{
		MgrVO mvo = mservice.update(num);
//		System.out.println(mvo.toString());
		model.addAttribute("modvo", mvo);
		return "modMGR";
	}
	
	@GetMapping("/modSave")
	public String updateSave(@ModelAttribute MgrVO mvo) throws Exception{
		mservice.updateSave(mvo);
		System.out.println(mvo.toString());
		return "redirect:list";
	}
	
	
}
