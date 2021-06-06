package dev.ttnm.core;

import org.pf4j.PluginManager;
import org.pf4j.spring.SpringPluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Core {

  private static final Logger LOGGER = LoggerFactory.getLogger("Core");

  public static void main(String[] args) throws IOException {
    LOGGER.info("Starting core server in version {} published by {}",
      Core.class.getPackage().getSpecificationVersion(),
      Core.class.getPackage().getSpecificationVendor());

    // Start Spring
    SpringApplication.run(Core.class, args);

    // Shutdown logic
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
    SpringPluginManager pluginManager = (SpringPluginManager) applicationContext.getBean(PluginManager.class);
    Runtime.getRuntime().addShutdownHook(new Thread(pluginManager::stopPlugins));
  }

}
