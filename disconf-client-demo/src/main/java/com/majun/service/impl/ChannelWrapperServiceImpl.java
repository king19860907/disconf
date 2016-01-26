package com.majun.service.impl;

import com.majun.service.ChannelService;
import com.majun.service.ChannelWrapperService;

public class ChannelWrapperServiceImpl implements ChannelWrapperService {
	
	private ChannelService channelService;

	@Override
	public Long getChannelId() {
		return channelService.getChannelId();
	}

	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}

}
