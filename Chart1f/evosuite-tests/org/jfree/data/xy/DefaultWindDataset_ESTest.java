/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 21:14:03 GMT 2022
 */

package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.time.Week;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.WindDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultWindDataset_ESTest extends DefaultWindDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getWindDirection(17, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 17, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getSeriesKey(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: 0
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getItemCount(2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: 2
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][7];
      List list0 = DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][3];
      Object[][][] objectArray1 = new Object[5][2][0];
      objectArray1[0] = objectArray0;
      objectArray1[1] = objectArray0;
      objectArray1[2] = objectArray0;
      objectArray1[3] = objectArray0;
      objectArray1[4] = objectArray0;
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray1);
      int int0 = defaultWindDataset0.getSeriesCount();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DefaultWindDataset.seriesNameListFromDataArray((Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getY(0, (-7));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getX(2326, 2326);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2326, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getWindForce((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset((Object[][][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[][][] objectArray0 = new Object[2][4][6];
      Object[][] objectArray1 = new Object[9][3];
      Object[] objectArray2 = new Object[7];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      objectArray2[0] = (Object) defaultWindDataset0;
      objectArray2[1] = (Object) defaultWindDataset0;
      objectArray1[0] = objectArray2;
      objectArray0[0] = objectArray1;
      DefaultWindDataset defaultWindDataset1 = null;
      try {
        defaultWindDataset1 = new DefaultWindDataset(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jfree.data.xy.DefaultWindDataset cannot be cast to java.lang.Number
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[][][] objectArray0 = new Object[4][6][0];
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[9];
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(stringArray0, (Object[][][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[4];
      Object[][][] objectArray0 = new Object[2][2][9];
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(stringArray0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of series keys does not match the number of series in the data array.
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "k";
      Object[][][] objectArray0 = new Object[2][4][0];
      Object[][] objectArray1 = new Object[4][1];
      objectArray1[0] = (Object[]) stringArray0;
      objectArray0[0] = objectArray1;
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(stringArray0, objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<WindDataItem> arrayList0 = new ArrayList<WindDataItem>();
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(arrayList0, (Object[][][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[][] objectArray0 = new Object[2][2];
      List list0 = DefaultWindDataset.seriesNameListFromDataArray(objectArray0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Stack<Double> stack0 = new Stack<Double>();
      Object[][][] objectArray0 = new Object[0][2][1];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(stack0, objectArray0);
      // Undeclared exception!
      try { 
        defaultWindDataset0.getWindDirection(1, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][][] objectArray0 = new Object[2][4][0];
      Object[][] objectArray1 = new Object[4][1];
      objectArray0[0] = objectArray1;
      objectArray0[1] = objectArray0[0];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        defaultWindDataset0.getWindForce(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      int int0 = defaultWindDataset0.getSeriesCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][][] objectArray0 = new Object[2][5][8];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        defaultWindDataset0.getX(0, 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      Object object0 = defaultWindDataset0.clone();
      boolean boolean0 = defaultWindDataset0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object[][][] objectArray0 = new Object[3][4][9];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      boolean boolean0 = defaultWindDataset0.equals(defaultWindDataset0);
      assertEquals(3, defaultWindDataset0.getSeriesCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[][] objectArray0 = new Object[3][3];
      Object[][][] objectArray1 = new Object[5][2][0];
      objectArray1[0] = objectArray0;
      objectArray1[1] = objectArray0;
      objectArray1[2] = objectArray0;
      objectArray1[3] = objectArray0;
      objectArray1[4] = objectArray0;
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray1);
      Object object0 = new Object();
      boolean boolean0 = defaultWindDataset0.equals(object0);
      assertEquals(5, defaultWindDataset0.getSeriesCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getSeriesKey(3313);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: 3313
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getSeriesKey((-1220));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: -1220
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[][][] objectArray0 = new Object[0][6][8];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      // Undeclared exception!
      try { 
        defaultWindDataset0.getItemCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: 0
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object[][][] objectArray0 = new Object[0][7][5];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      // Undeclared exception!
      try { 
        defaultWindDataset0.getItemCount((-2921));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid series index: -2921
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Long long0 = new Long(0);
      Object[][][] objectArray0 = new Object[1][1][8];
      Object[][] objectArray1 = new Object[4][6];
      Object[] objectArray2 = new Object[3];
      objectArray2[0] = (Object) long0;
      objectArray1[0] = objectArray2;
      objectArray0[0] = objectArray1;
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      assertEquals(1, defaultWindDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<Byte> linkedList0 = new LinkedList<Byte>();
      Object[][][] objectArray0 = new Object[3][4][9];
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(linkedList0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of series keys does not match the number of series in the data array.
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset((List) null, (Object[][][]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'seriesKeys' argument.
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object[][][] objectArray0 = new Object[3][4][9];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      Week week0 = new Week();
      defaultWindDataset0.indexOf(week0);
      assertEquals(3, defaultWindDataset0.getSeriesCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getWindDirection((-2668), (-2668));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getY((-2326), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      // Undeclared exception!
      try { 
        defaultWindDataset0.getX((-3932), (-3932));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][][] objectArray0 = new Object[2][4][0];
      DefaultWindDataset defaultWindDataset0 = null;
      try {
        defaultWindDataset0 = new DefaultWindDataset(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.jfree.data.xy.DefaultWindDataset", e);
      }
  }
}
