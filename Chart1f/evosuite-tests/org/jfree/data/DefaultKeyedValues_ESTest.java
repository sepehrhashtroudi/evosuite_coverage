/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:12:29 GMT 2022
 */

package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultKeyedValues_ESTest extends DefaultKeyedValues_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      assertTrue(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Long long0 = new Long((-2749L));
      defaultKeyedValues1.setValue((Comparable) comparable0, (Number) long0);
      boolean boolean0 = defaultKeyedValues0.equals(defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<DefaultKeyedValues> comparable0 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double((-2636.34729114181));
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) double0);
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.removeValue((Comparable) double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<DefaultKeyedValues> comparable0 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double((-2636.34729114181));
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) double0);
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      assertEquals(2, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Byte byte0 = new Byte((byte) (-7));
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) byte0);
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      Number number0 = defaultKeyedValues0.getValue((Comparable) byte0);
      assertEquals((byte) (-7), number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Integer integer0 = new Integer((-322));
      defaultKeyedValues0.addValue((Comparable) integer0, (Number) integer0);
      defaultKeyedValues0.removeValue(0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      boolean boolean0 = defaultKeyedValues0.equals(defaultKeyedValues0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = new Byte((byte)0);
      defaultKeyedValues0.setValue((Comparable) byte0, 0.0);
      Number number0 = defaultKeyedValues0.getValue((Comparable) byte0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = new Byte((byte)31);
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      Number number0 = defaultKeyedValues0.getValue((Comparable) byte0);
      assertEquals((byte)31, number0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues0.setValue(comparable0, (Number) null);
      Number number0 = defaultKeyedValues0.getValue(0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<DefaultKeyedValues> comparable0 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Double double0 = new Double(0);
      defaultKeyedValues0.insertValue(0, (Comparable) comparable0, (Number) double0);
      defaultKeyedValues0.getValue(0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Byte byte0 = new Byte((byte)31);
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) byte0);
      Number number0 = defaultKeyedValues0.getValue(0);
      assertEquals((byte)31, number0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      Number number0 = defaultKeyedValues0.getValue(0);
      assertEquals((byte) (-110), number0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      List list0 = defaultKeyedValues0.getKeys();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      Comparable comparable0 = defaultKeyedValues0.getKey(0);
      assertEquals((byte) (-110), comparable0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(0);
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) integer0);
      int int0 = defaultKeyedValues0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<DefaultKeyedValues> comparable0 = (Comparable<DefaultKeyedValues>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      defaultKeyedValues0.addValue(comparable0, (-1290.142341));
      defaultKeyedValues0.setValue((Comparable) "{h/TZj/n+-{K0d.", 0.0);
      int int0 = defaultKeyedValues0.getIndex("{h/TZj/n+-{K0d.");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.sortByValues((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedValueComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.sortByKeys((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedValueComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      Byte byte0 = Byte.valueOf((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      Double double0 = new Double((-57.4575));
      defaultKeyedValues0.addValue((Comparable) double0, (Number) double0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.sortByKeys(sortOrder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to java.lang.Byte
         //
         verifyException("java.lang.Byte", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.setValue((Comparable) null, (double) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.removeValue((-1588));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = new Byte((byte) (-1));
      defaultKeyedValues0.insertValue(0, (Comparable) byte0, (double) (byte) (-21));
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(1, (Comparable) byte0, (double) (-21));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = Double.valueOf((double) (-1));
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue((-1), (Comparable) double0, (double) (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getValue((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getValue((-2512));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2512
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getKey((-2040));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2040
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double(0.0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.addValue((Comparable) null, (Number) double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double((-2636.34729114181));
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Float float0 = new Float(1.0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.setValue((Comparable) null, (Number) float0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.setValue((Comparable) "{h/TZj/n+-{K0d.", 0.0);
      int int0 = defaultKeyedValues0.getIndex("{h/TZj/n+-{K0d.");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      int int0 = defaultKeyedValues0.getIndex(comparable0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      int int0 = defaultKeyedValues0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.removeValue(249);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 249, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.hashCode();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(comparable0).toString();
      defaultKeyedValues0.insertValue(0, comparable0, (-2658.223760664662));
      Object object0 = defaultKeyedValues0.clone();
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Float float0 = new Float((double) 0);
      defaultKeyedValues0.setValue((Comparable) 0, (Number) float0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      defaultKeyedValues0.insertValue(0, comparable0, (-2658.223760664662));
      Object object0 = defaultKeyedValues0.clone();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      defaultKeyedValues0.sortByValues(sortOrder0);
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertEquals(2, defaultKeyedValues0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.addValue((Comparable) "SortOrder.DESCENDING", (Number) null);
      Object object0 = defaultKeyedValues0.clone();
      boolean boolean0 = defaultKeyedValues0.equals(object0);
      assertNotSame(object0, defaultKeyedValues0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = new Byte((byte) (-7));
      boolean boolean0 = defaultKeyedValues0.equals(byte0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Byte byte0 = new Byte((byte) (-7));
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) byte0);
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      defaultKeyedValues0.sortByKeys(sortOrder0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double((-1588));
      // Undeclared exception!
      try { 
        defaultKeyedValues0.removeValue((Comparable) double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (-1588.0) is not recognised.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Byte byte0 = new Byte((byte) (-7));
      defaultKeyedValues0.addValue((Comparable) comparable0, (Number) byte0);
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      defaultKeyedValues0.insertValue(0, (Comparable) byte0, (-1.0));
      assertEquals(2, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte) (-110));
      Double double0 = new Double((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.insertValue(0, (Comparable) double0, (Number) byte0);
      assertEquals(1, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double(0.0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(0, (Comparable) null, (Number) double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Long long0 = new Long(2484);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(2484, (Comparable) comparable0, (Number) long0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double(0);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue((-3577), (Comparable) double0, (Number) double0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.addValue((Comparable) null, (-2569.00991553267));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Float float0 = new Float(0.0F);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getValue((Comparable) float0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Key not found: 0.0
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.removeValue((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.DefaultKeyedValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      List list0 = defaultKeyedValues0.getKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getValue(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.setValue((Comparable) "org.jfree.data.KeyedValueComparatorType", (-1.0));
      Double double0 = new Double(1802.3597);
      // Undeclared exception!
      try { 
        defaultKeyedValues0.insertValue(1, (Comparable) "org.jfree.data.KeyedValueComparatorType", (Number) double0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      defaultKeyedValues0.clear();
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Double double0 = new Double((-2636.34729114181));
      defaultKeyedValues0.setValue((Comparable) double0, (Number) double0);
      defaultKeyedValues0.removeValue((Comparable) double0);
      assertEquals(0, defaultKeyedValues0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      Byte byte0 = Byte.valueOf((byte) (-110));
      defaultKeyedValues0.addValue((Comparable) byte0, (Number) byte0);
      DefaultKeyedValues defaultKeyedValues1 = new DefaultKeyedValues();
      boolean boolean0 = defaultKeyedValues0.equals(defaultKeyedValues1);
      assertFalse(defaultKeyedValues1.equals((Object)defaultKeyedValues0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      // Undeclared exception!
      try { 
        defaultKeyedValues0.getKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}