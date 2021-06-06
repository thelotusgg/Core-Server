package dev.ttnm.core;

import org.pf4j.spring.SpringPluginManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class SpringConfiguration {

  @Bean
  public SpringPluginManager pluginManager() {
    return new SpringPluginManager(new File("./plugins/").toPath());
  }

}