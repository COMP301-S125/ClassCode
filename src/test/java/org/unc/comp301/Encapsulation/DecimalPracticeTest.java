package org.unc.comp301.Encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;


public class DecimalPracticeTest {

  private final double EPSILON = 0.000001;

  @Test
  public void timesThree() {
    //assertEquals(0.3, DecimalPractice.timesThree(.1)); <- doesn't work.
    assertTrue(Math.abs(0.3-DecimalPractice.timesThree(.1)) < EPSILON);
  }
}