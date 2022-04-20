package annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import annotation.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testservice;

	public void save() {
		testservice.save();
		System.out.println("testController save");
	}

}
