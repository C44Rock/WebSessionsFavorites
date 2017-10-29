package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("favs")
@Controller
public class FavoriteThingsController {
	
	@RequestMapping(path = "/colorPage1", method = RequestMethod.GET)
	public String displayColor() {
		return "colorPage1";
	}
	
	@RequestMapping(path = "/colorPage1", method = RequestMethod.POST)
	public String handleColor(@RequestParam String color, ModelMap model) {
		FavoriteThingsModel favs = new FavoriteThingsModel();
		favs.setColor(color);
		model.addAttribute("favs", favs);
		
		return "redirect:/foodPage2";
	}
	
	@RequestMapping(path = "/foodPage2", method = RequestMethod.GET)
	public String displayFood() {
		return "/foodPage2";
	}
	
	@RequestMapping(path = "/foodPage2", method = RequestMethod.POST) 
	public String handleFood(@RequestParam String food, ModelMap model) {
		FavoriteThingsModel favs = (FavoriteThingsModel)model.get("favs");
		favs.setFood(food);
		model.addAttribute("favs", favs);
		
		return "redirect:/seasonPage3";
	}
	
	@RequestMapping(path = "/seasonPage3", method = RequestMethod.GET)
	public String displaySeasons() {
		return "/seasonPage3";
	}
	
	@RequestMapping(path = "/seasonPage3", method = RequestMethod.POST)
	public String handleSeason(@RequestParam String season, ModelMap model) {
		FavoriteThingsModel favs = (FavoriteThingsModel)model.get("favs");
		favs.setSeason(season);
		model.addAttribute("favs", favs);
		
		return "redirect:/summary";
	}
	
	@RequestMapping(path = "/summary", method = RequestMethod.GET)
	public String displaySummary(HttpServletRequest request, ModelMap model) {
		FavoriteThingsModel favs = (FavoriteThingsModel)model.get("favs");
		
		request.setAttribute("favs", favs);
		return "/summary";
	}
	
	
}
