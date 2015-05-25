package com.lyon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lyon.form.FormTestObject;

@Controller
public class ViewController {
	
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("indexTest");
		view.addObject("formList", FormTestObject.getFormList());
		return view;
	}
	
	@RequestMapping("formTest")
	public ModelAndView formTest(String formId, String ver) {
		ModelAndView view = new ModelAndView();
		view.setViewName("formTest/v"+ver+"/formTest");
		view.addObject("formId", formId);
		return view;
	}
	
}