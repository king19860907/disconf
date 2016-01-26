package com.majun.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.majun.service.ChannelService;
import com.majun.service.ChannelWrapperService;

@Controller
public class TestController {

	@Resource(name = "channelService")
	private ChannelService channelService;
	
	@Resource(name = "channelWrapperService")
	private ChannelWrapperService channelWrapperService;
	
	@ResponseBody
	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public String index(){
		return String.valueOf(channelService.getChannelId());
	}
	
	@ResponseBody
	@RequestMapping(value = "/index2.htm", method = RequestMethod.GET)
	public String index2(){
		return String.valueOf(channelWrapperService.getChannelId());
	}
	
}
