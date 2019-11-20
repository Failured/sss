package com.example.demo.conterlloer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Team;
import com.example.demo.sevice.TeamService;

@Controller
public class indexcontroller {
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Team>teams=teamService.select();
		model.addAttribute("team", teams);
		return "index";
		
	}
	@RequestMapping("/sule")
	public String index2(Model model,int id) {
		Team team=teamService.selectbyid(id);
		model.addAttribute("teams", team);
		return "model";
		
	}
	
}
