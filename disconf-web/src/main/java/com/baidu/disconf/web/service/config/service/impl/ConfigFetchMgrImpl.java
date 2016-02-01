package com.baidu.disconf.web.service.config.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.disconf.core.common.constants.Constants;
import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.baidu.disconf.core.common.json.ValueVo;
import com.baidu.disconf.web.service.app.bo.App;
import com.baidu.disconf.web.service.config.bo.Config;
import com.baidu.disconf.web.service.config.dao.ConfigDao;
import com.baidu.disconf.web.service.config.service.ConfigFetchMgr;
import com.baidu.disconf.web.service.config.utils.ConfigUtils;

/**
 * @author knightliao
 */
@Service
public class ConfigFetchMgrImpl implements ConfigFetchMgr {

    protected static final Logger LOG = LoggerFactory.getLogger(ConfigFetchMgrImpl.class);

    @Autowired
    private ConfigDao configDao;

    /**
     * 根据详细参数获取配置
     */
    @Override
    public Config getConfByParameter(Long appId, Long envId, String env, String key,
                                     DisConfigTypeEnum disConfigTypeEnum) {

        Config config = configDao.getByParameter(appId, envId, env, key, disConfigTypeEnum);
        return config;
    }

    /**
     * 根据详细参数获取配置返回
     */
    public ValueVo getConfItemByParameter(Long appId, Long envId, String version, String key) {

        Config config = configDao.getByParameter(appId, envId, version, key, DisConfigTypeEnum.ITEM);
        if (config == null) {
            return ConfigUtils.getErrorVo("cannot find this config");
        }

        ValueVo valueVo = new ValueVo();
        valueVo.setValue(config.getValue());
        valueVo.setStatus(Constants.OK);

        return valueVo;
    }

	@Override
	public List<Config> getConfByParameter(List<App> apps, Long envId, String env, String key,
			DisConfigTypeEnum disConfigTypeEnum) {
		List<Config> list = new ArrayList<Config>();
		for(App app : apps){
			Config config = this.getConfByParameter(app.getId(), envId, env, key, disConfigTypeEnum);
			if(config != null){
				list.add(config);
			}
		}
		return list;
	}
}
