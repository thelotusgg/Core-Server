package dev.ttnm.pexa.health.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping("/alive")
  public boolean isAlive() {
    return true;
  }

  @GetMapping("/healthy")
  public boolean isHealthy() {
    return true;
  }

}
