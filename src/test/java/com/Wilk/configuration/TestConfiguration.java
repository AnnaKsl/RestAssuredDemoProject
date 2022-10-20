package com.Wilk.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:common.properties")

public interface TestConfiguration extends Config{
    @Key("baseUrl")
    String getBaseUrl();

}
