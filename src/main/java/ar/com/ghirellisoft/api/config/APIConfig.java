package ar.com.ghirellisoft.api.config;

import ar.com.ghirellisoft.api.config.profile.ProfileDev;
import ar.com.ghirellisoft.api.config.profile.ProfileProd;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("dev.properties")
@Import({ProfileDev.class, ProfileProd.class})
@ComponentScan(basePackageClasses = { ProfileDev.class, ProfileProd.class })
public class APIConfig {
}
