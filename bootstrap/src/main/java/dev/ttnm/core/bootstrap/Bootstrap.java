package dev.ttnm.core.bootstrap;

import dev.ttnm.core.Core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Bootstrap {

  public static void main(String[] args) throws IOException {
    File pluginDirectory = new File("plugins/");
    if (!pluginDirectory.exists()) pluginDirectory.mkdir();

    Files.copy(
      new File("health/target/health-1.0.0-SNAPSHOT.jar").toPath(),
      pluginDirectory.toPath().resolve("health.jar"),
      StandardCopyOption.REPLACE_EXISTING
    );

    Core.main(args);
  }

}
