package com.majun.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.majun.service.ChannelService;

@Controller
public class TestController {

	@Resource(name = "channelService")
	private ChannelService channelService;
	
	@ResponseBody
	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public String index(){
		return String.valueOf(channelService.getChannelId());
	}
	
}
