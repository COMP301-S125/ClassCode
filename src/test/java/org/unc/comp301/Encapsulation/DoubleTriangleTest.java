package org.unc.comp301.Encapsulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleTriangleTest {

  @Test
  public void testToString() {
    DoubleTriangle tri = new DoubleTriangle(0,0,2,0,1,2);
    assertEquals("(0.0,0.0),(2.0,0.0),(1.0,2.0)",tri.toString());
  }
}
