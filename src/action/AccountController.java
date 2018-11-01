package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService as;
	@RequestMapping("/account_execute.action")
	public ModelAndView execute(String from,String to,double money){
		System.out.println("nihao");
		as.remit(from, to, money);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("message.jsp");
		String msg="成功";
		mav.addObject("message",msg);
		return mav;
	}
}
