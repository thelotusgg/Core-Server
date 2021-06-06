package dev.ttnm.core.health;

import dev.ttnm.core.SpringConfiguration;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HealthPlugin extends SpringPlugin {

  private static final Logger LOGGER = LoggerFactory.getLogger("Health");

  public HealthPlugin(PluginWrapper wrapper) {
    super(wrapper);
  }

  @Override
  public void start() {
  }

  @Override
  public void stop() {
    super.stop();
  }

  @Override
  protected ApplicationContext createApplicationContext() {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.setClassLoader(getWrapper().getPluginClassLoader());
    applicationContext.register(SpringConfiguration.class);
    applicationContext.refresh();

    return applicationContext;
  }

}
