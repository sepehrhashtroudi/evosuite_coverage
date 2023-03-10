/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 00:45:18 GMT 2022
 */

package org.jfree.chart.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.StrokeMap;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StrokeMap_ESTest extends StrokeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      StrokeMap strokeMap1 = new StrokeMap();
      assertTrue(strokeMap1.equals((Object)strokeMap0));
      
      BasicStroke basicStroke0 = new BasicStroke();
      Comparable<StrokeMap> comparable0 = (Comparable<StrokeMap>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(1246).when(comparable0).compareTo(any(org.jfree.chart.util.StrokeMap.class));
      strokeMap1.put(comparable0, basicStroke0);
      boolean boolean0 = strokeMap0.equals(strokeMap1);
      assertFalse(strokeMap1.equals((Object)strokeMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      Comparable<BasicStroke> comparable1 = (Comparable<BasicStroke>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable1).compareTo(any(java.awt.BasicStroke.class));
      BasicStroke basicStroke0 = new BasicStroke();
      strokeMap0.put(comparable1, basicStroke0);
      BasicStroke basicStroke1 = (BasicStroke)strokeMap0.getStroke(comparable0);
      assertEquals(0, basicStroke1.getLineJoin());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(any());
      BasicStroke basicStroke0 = new BasicStroke(1047.5253F, 0, 0);
      strokeMap0.put(comparable0, basicStroke0);
      // Undeclared exception!
      try { 
        strokeMap0.put(0.0, basicStroke0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // codegen.java.lang.Comparable$MockitoMock$1122822202 cannot be cast to java.lang.Double
         //
         verifyException("java.lang.Double", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparable0).compareTo(anyString());
      strokeMap0.put(comparable0, (Stroke) null);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        strokeMap0.getStroke(integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(266, 266, 266, 266, 0).when(comparable0).compareTo(any());
      float[] floatArray0 = new float[7];
      floatArray0[2] = (float) 266;
      BasicStroke basicStroke0 = new BasicStroke(266, 0, 0, 3186.0F, floatArray0, 0);
      strokeMap0.put(comparable0, basicStroke0);
      Object object0 = strokeMap0.clone();
      //  // Unstable assertion: assertFalse(object0.equals((Object)strokeMap0));
      
      boolean boolean0 = strokeMap0.equals(object0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0, 0).when(comparable0).compareTo(anyString());
      strokeMap0.put(comparable0, (Stroke) null);
      Object object0 = strokeMap0.clone();
      boolean boolean0 = strokeMap0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((-2445)).when(comparable0).compareTo(any());
      strokeMap0.put(comparable0, (Stroke) null);
      StrokeMap strokeMap1 = new StrokeMap();
      boolean boolean0 = strokeMap0.equals(strokeMap1);
      assertFalse(strokeMap1.equals((Object)strokeMap0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      boolean boolean0 = strokeMap0.equals(strokeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      boolean boolean0 = strokeMap0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      BasicStroke basicStroke0 = new BasicStroke();
      // Undeclared exception!
      try { 
        strokeMap0.put((Comparable) null, basicStroke0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.StrokeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      strokeMap0.put(0.0, (Stroke) null);
      boolean boolean0 = strokeMap0.containsKey(0.0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      boolean boolean0 = strokeMap0.containsKey(0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      // Undeclared exception!
      try { 
        strokeMap0.getStroke((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.chart.util.StrokeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Stroke stroke0 = strokeMap0.getStroke(comparable0);
      assertNull(stroke0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrokeMap strokeMap0 = new StrokeMap();
      strokeMap0.clear();
  }
}
