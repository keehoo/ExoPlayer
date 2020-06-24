package com.google.android.exoplayer2.ui;

import static org.junit.Assert.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import org.junit.Test;

public class PlayerControlViewTest {

  @Test
  public void test() {

//    ZonedDateTime.from(Instant.ofEpochMilli(System.currentTimeMillis()));

    LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault());


  }
}