package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Datafetch")
public class appcontroller extends ExceptionThrower {

	@Value("${Env1}")
	private String env1;
	@Value("${Env2}")
	private String env2;
	@Value("${Env3}")
	private String env3;

	@RequestMapping(method = RequestMethod.GET)
	public List<String> getvalues()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add(env1);
		list.add(env2);
		list.add(env3);

		return list;
	}
}
