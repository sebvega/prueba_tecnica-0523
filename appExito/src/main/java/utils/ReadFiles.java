package utils;

import models.Independent;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;


public class ReadFiles {
    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String CONFIG_INDEPENDENT = "independent.";

    public static Independent readIndependent(String independent) {
        return new Independent(
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".email"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".password"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".firstName"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".lastName"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".id"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".year"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".month"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".day"),
                CONF.getProperty(CONFIG_INDEPENDENT + independent + ".cellphone")
        );
    }
}
