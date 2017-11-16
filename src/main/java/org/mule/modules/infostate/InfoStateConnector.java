package org.mule.modules.infostate;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import java.io.IOException;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.rest.HttpMethod;
import org.mule.api.annotations.rest.RestCall;
import org.mule.api.annotations.rest.RestUriParam;

import org.mule.modules.infostate.config.ConnectorConfig;

@Connector(name="info-state", friendlyName="InfoState")
public abstract class InfoStateConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name of a friend we want to greet
     * @return The greeting and reply to the selected friend.
     * @throws IOException Comment for Exception
     */
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    @RestCall(uri="https://myapiurl/{friend}", method=HttpMethod.GET)
    public abstract void greet(@RestUriParam("friend") String friend) throws IOException;
    
    
    @Processor
    @ReconnectOn(exceptions = { Exception.class })
    @RestCall(uri="http://services.groupkt.com/state/get/IND/{State}", method=HttpMethod.GET)
    public abstract String getStateInfo(@RestUriParam("State") String State) throws IOException;  
    
    

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}