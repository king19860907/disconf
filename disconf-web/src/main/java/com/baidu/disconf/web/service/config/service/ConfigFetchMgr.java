package com.baidu.disconf.web.service.config.service;

import java.util.List;

import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.baidu.disconf.core.common.json.ValueVo;
import com.baidu.disconf.web.service.app.bo.App;
import com.baidu.disconf.web.service.config.bo.Config;

/**
 * @author knightliao
 */
public interface ConfigFetchMgr {

    /**
     * @param appId
     * @param envId
     * @param env
     * @param key
     * @param disConfigTypeEnum
     *
     * @return
     */
    ValueVo getConfItemByParameter(Long appId, Long envId, String version, String key);

    /**
     * @param appId
     * @param envId
     * @param env
     * @param key
     * @param disConfigTypeEnum
     *
     * @return
     */
    Config getConfByParameter(Long appId, Long envId, String env, String key, DisConfigTypeEnum disConfigTypeEnum);
    
    /**
     * @param appIds
     * @param envId
     * @param env
     * @param key
     * @param disConfigTypeEnum
     *
     * @return
     */
    List<Config> getConfByParameter(List<App> apps, Long envId, String env, String key, DisConfigTypeEnum disConfigTypeEnum);

}
