/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 03:55:12 GMT 2022
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.entity.TickLabelEntity;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TickLabelEntity_ESTest extends TickLabelEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickLabelEntity tickLabelEntity0 = null;
      try {
        tickLabelEntity0 = new TickLabelEntity((Shape) null, "org.jfree.chart.entity.TickLabelEntity", "org.jfree.chart.entity.TickLabelEntity");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.entity.ChartEntity", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double(0.0, 0.0, 3614.42246, 321.5625934);
      TickLabelEntity tickLabelEntity0 = new TickLabelEntity(rectangle2D_Double0, "b0DiCf6aZtq&[45f2VS", "b0DiCf6aZtq&[45f2VS");
      assertEquals("b0DiCf6aZtq&[45f2VS", tickLabelEntity0.getURLText());
  }
}
