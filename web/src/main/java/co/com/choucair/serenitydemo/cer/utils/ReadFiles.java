package co.com.choucair.serenitydemo.cer.utils;

import co.com.choucair.serenitydemo.cer.models.Account;
import co.com.choucair.serenitydemo.cer.models.Category;
import co.com.choucair.serenitydemo.cer.models.Product;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadFiles {

    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    private static final String CONFIG_CATEGORY = "category.";

    public static Category readCategory(String subCategory){
        LOGGER.info("Se crea existosamente el objeto subCategory.");
        return new  Category(
                CONF.getProperty(CONFIG_CATEGORY + subCategory + ".name"),
                CONF.getProperty(CONFIG_CATEGORY + subCategory + ".subName")
        );
    }


}
