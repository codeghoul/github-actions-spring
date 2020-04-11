package me.jysh.springcicddemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/")
  public ResponseEntity<String> getGreeted() {
    return ResponseEntity.ok("Hi! Welcome to my World!");
  }
}
