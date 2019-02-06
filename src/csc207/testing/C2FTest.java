package csc207.testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class C2FTest extends SampleMethods {

  @Test
  void testC2f() {
    SampleMethods samp = new SampleMethods();
    int result = samp.c2f(0);
    assertEquals (32, result);
  }
  
  @Test
  void testsum() {
    SampleMethods samp1 = new SampleMethods();
    int[]values = { 1, 2, 3, 4};
    int result1 = samp1.sum(values);
    assertEquals (10, result1);
  }
  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, sum(values), "extreme values");
 } // testExtremes
  
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs

}
