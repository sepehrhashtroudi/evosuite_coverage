/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 04:02:59 GMT 2022
 */

package org.jfree.chart.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.entity.CategoryLabelEntity;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CategoryLabelEntity_ESTest extends CategoryLabelEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rectangle2D.Double rectangle2D_Double0 = new Rectangle2D.Double();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity((Comparable) null, rectangle2D_Double0, "", "");
      Comparable comparable0 = categoryLabelEntity0.getKey();
      assertNull(comparable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      CategoryLabelEntity categoryLabelEntity0 = null;
      try {
        categoryLabelEntity0 = new CategoryLabelEntity(comparable0, (Shape) null, (String) null, "Vw6'X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'area' argument.
         //
         verifyException("org.jfree.chart.entity.ChartEntity", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, "[+HW", "[+HW");
      Object object0 = categoryLabelEntity0.clone();
      boolean boolean0 = categoryLabelEntity0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      Integer integer0 = new Integer((-666));
      CategoryLabelEntity categoryLabelEntity1 = new CategoryLabelEntity(integer0, rectangle2D_Float0, " onMouseOver=\"return stm(['", "");
      boolean boolean0 = categoryLabelEntity0.equals(categoryLabelEntity1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      boolean boolean0 = categoryLabelEntity0.equals(categoryLabelEntity0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      Integer integer0 = new Integer((-666));
      boolean boolean0 = categoryLabelEntity0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      categoryLabelEntity0.hashCode();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("<area shape=\"").when(comparable0).toString();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      String string0 = categoryLabelEntity0.toString();
      assertEquals("CategoryLabelEntity: category=<area shape=\", tooltip= onMouseOver=\"return stm([', url= onMouseOver=\"return stm(['", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("<area shape=\"").when(comparable0).toString();
      Rectangle2D.Float rectangle2D_Float0 = new Rectangle2D.Float();
      CategoryLabelEntity categoryLabelEntity0 = new CategoryLabelEntity(comparable0, rectangle2D_Float0, " onMouseOver=\"return stm(['", " onMouseOver=\"return stm(['");
      Comparable comparable1 = categoryLabelEntity0.getKey();
      assertNotNull(comparable1);
  }
}
