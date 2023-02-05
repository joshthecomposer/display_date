package com.jw.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/date")
	public String getDate(Model model) {
	
		
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		String date = formatter.format(new Date());
		model.addAttribute("date", date);
		
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String getTime(Model model) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
		String date = formatter.format(new Date());
		model.addAttribute("date",date);
		
		return "date.jsp";
	}
}
