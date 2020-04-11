package me.jysh.springcicddemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class DemoControllerTest {

  @Autowired DemoController demoController;

  @Test
  public void getGreeted() {
    final ResponseEntity<String> greeted = demoController.getGreeted();
    Assertions.assertEquals(greeted.getBody(), "Hi! Welcome to my World!");
  }
}
