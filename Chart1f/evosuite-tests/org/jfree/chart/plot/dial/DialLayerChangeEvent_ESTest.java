/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:28:39 GMT 2022
 */

package org.jfree.chart.plot.dial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialLayer;
import org.jfree.chart.plot.dial.DialLayerChangeEvent;
import org.jfree.chart.plot.dial.DialPointer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DialLayerChangeEvent_ESTest extends DialLayerChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DialPointer.Pointer dialPointer_Pointer0 = new DialPointer.Pointer((-1151));
      DialLayerChangeEvent dialLayerChangeEvent0 = new DialLayerChangeEvent(dialPointer_Pointer0);
      dialPointer_Pointer0.setVisible(false);
      DialLayer dialLayer0 = dialLayerChangeEvent0.getDialLayer();
      assertTrue(dialLayer0.isClippedToWindow());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArcDialFrame arcDialFrame0 = new ArcDialFrame();
      DialLayerChangeEvent dialLayerChangeEvent0 = new DialLayerChangeEvent(arcDialFrame0);
      DialLayer dialLayer0 = dialLayerChangeEvent0.getDialLayer();
      assertTrue(dialLayer0.isVisible());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DialLayerChangeEvent dialLayerChangeEvent0 = null;
      try {
        dialLayerChangeEvent0 = new DialLayerChangeEvent((DialLayer) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }
}
