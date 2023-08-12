package com.LabourDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LabourDetails.Entity.LabourInfo;
import com.LabourDetails.Service.LabourDetailsService;



@Controller
public class LabourDetailsController {
	
	@Autowired
	private LabourDetailsService labourDetailsService;
	
    //http://localhost:8080/view
	@RequestMapping("/view")
	public String viewLabourInfo() {
		return "create_labour_details_page";
		
	} 
	@RequestMapping("/create_labour_details_page")
	public String registerOneLabour(LabourInfo labour,Model model) {
		labourDetailsService.saveOneLabour(labour);
		model.addAttribute("msg", "Saved !!");
		return "create_labour_details_page";
		
		
	}
	@RequestMapping("/seelist")
	public String getAllLabours(Model model) {
		List<LabourInfo> labours=labourDetailsService.getAllList();
		model.addAttribute("labours", labours);
		System.out.println(labours);
		return "list_all";
		
	}
	@RequestMapping("/delete")
	public String deleteInfo(@RequestParam("id") long id,ModelMap modelmap) {
		labourDetailsService.deleteOneInfo(id);
		List<LabourInfo> labours=labourDetailsService.getAllList();
		modelmap.addAttribute("labours", labours);
		System.out.println(labours);
		return "list_all";
		
	}
	@RequestMapping("/update")
	public String updateLabourInfo(@RequestParam("id") long id,ModelMap modelmap) {
		LabourInfo labour=labourDetailsService.getLabourInfo(id);
		modelmap.addAttribute("labourInfo", labour);
		return "update_labour_page";
		
	}
	@RequestMapping("/update_labour_page")
	public String updateInfo(LabourInfo labour,Model model) {
		labourDetailsService.saveOneLabour(labour);
		List<LabourInfo> labours=labourDetailsService.getAllList();
		model.addAttribute("labours", labours);
		System.out.println(labours);
		
		model.addAttribute("msg", "Labour Updated Successfully !!");
		return "list_all";
		
		
	}
	

	
	
	
	
}
