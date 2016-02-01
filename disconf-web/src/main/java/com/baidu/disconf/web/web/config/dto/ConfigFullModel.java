package com.baidu.disconf.web.web.config.dto;

import java.util.List;

import com.baidu.disconf.web.service.app.bo.App;
import com.baidu.disconf.web.service.env.bo.Env;

/**
 * @author liaoqiqi
 * @version 2014-9-11
 */
public class ConfigFullModel {

    private List<App> apps;
    private Env env;
    private String version;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

	public List<App> getApps() {
		return apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	public Env getEnv() {
        return env;
    }

    public void setEnv(Env env) {
        this.env = env;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ConfigFullModel(List<App> apps, Env env, String version, String key) {
        super();
        this.apps = apps;
        this.env = env;
        this.version = version;
        this.key = key;
    }
}
