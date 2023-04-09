package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface DriverConfig extends Config {

    @Key("base.url")
    @DefaultValue("https://www.dodopizza.ru/")
    String getBaseUrl();

    @Key("remote.url")
    String getRemoteURL();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

}
