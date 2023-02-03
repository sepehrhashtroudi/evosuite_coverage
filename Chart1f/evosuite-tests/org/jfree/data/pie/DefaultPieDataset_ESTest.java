/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:15:53 GMT 2022
 */

package org.jfree.data.pie;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Week;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultPieDataset_ESTest extends DefaultPieDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      BigInteger bigInteger0 = BigInteger.ONE;
      defaultPieDataset0.setValue((Comparable) "ut&H", (Number) bigInteger0);
      defaultPieDataset0.setSelected((Comparable) "ut&H", false);
      assertEquals(1, defaultPieDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
      Quarter quarter0 = new Quarter();
      defaultKeyedValuesDataset0.setValue((Comparable) quarter0, (Number) (byte) (-91));
      boolean boolean0 = defaultPieDataset0.equals(defaultKeyedValuesDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      defaultKeyedValuesDataset0.setValue((Comparable) (byte) (-91), 0.0);
      defaultKeyedValuesDataset0.setValue((Comparable) (byte) (-91), (Number) bigInteger0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Number number0 = defaultKeyedValuesDataset0.getValue(0);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      defaultKeyedValuesDataset0.sortByKeys(sortOrder0);
      assertEquals("SortOrder.DESCENDING", sortOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      defaultKeyedValuesDataset0.remove(fixedMillisecond0);
      assertEquals((-471L), fixedMillisecond0.getLastMillisecond());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Integer integer0 = Integer.valueOf(48);
      defaultKeyedValuesDataset0.setValue((Comparable) integer0, (double) 48);
      boolean boolean0 = defaultKeyedValuesDataset0.isSelected(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-469L));
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-5);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      Number number0 = defaultKeyedValuesDataset0.getValue((Comparable) fixedMillisecond0);
      assertSame(number0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Quarter quarter0 = new Quarter();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      jDBCPieDataset0.setValue((Comparable) quarter0, (double) 4);
      Number number0 = jDBCPieDataset0.getValue((Comparable) quarter0);
      assertEquals(4.0, number0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Week week0 = new Week(0, (-1));
      defaultPieDataset0.setValue((Comparable) week0, (double) 0);
      Number number0 = defaultPieDataset0.getValue((Comparable) week0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-469L));
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      Number number0 = defaultKeyedValuesDataset0.getValue((Comparable) fixedMillisecond0);
      assertEquals((short)255, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-5);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      Number number0 = defaultKeyedValuesDataset0.getValue(0);
      assertSame(number0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Week week0 = new Week(0, (-1));
      defaultPieDataset0.setValue((Comparable) week0, (double) 0);
      Number number0 = defaultPieDataset0.getValue(0);
      assertNotNull(number0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Integer integer0 = Integer.valueOf(29);
      defaultKeyedValuesDataset0.setValue((Comparable) integer0, (double) 29);
      Number number0 = defaultKeyedValuesDataset0.getValue(0);
      assertEquals(29.0, number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-1);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      Number number0 = defaultKeyedValuesDataset0.getValue(0);
      assertSame(number0, bigInteger0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      defaultPieDataset0.insertValue(0, (Comparable) "org.jfree.data.time.FixedMillisecond", (double) (-1305));
      Comparable comparable0 = defaultPieDataset0.getKey(0);
      assertEquals("org.jfree.data.time.FixedMillisecond", comparable0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      int int0 = defaultPieDataset0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Locale locale0 = new Locale("", "$", "");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Quarter quarter0 = new Quarter(date0);
      defaultKeyedValuesDataset0.setValue((Comparable) quarter0, 0.0);
      int int0 = defaultKeyedValuesDataset0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Week week0 = new Week(0, (-1));
      defaultPieDataset0.setValue((Comparable) week0, (double) 0);
      int int0 = defaultPieDataset0.getIndex(week0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      defaultKeyedValuesDataset0.setValue((Comparable) (byte) (-91), 0.0);
      int int0 = defaultKeyedValuesDataset0.getIndex((byte) (-91));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.sortByValues((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedObjectComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      BigInteger bigInteger0 = BigInteger.ONE;
      defaultPieDataset0.setValue((Comparable) "ut&H", (Number) bigInteger0);
      defaultPieDataset0.setValue((Comparable) bigInteger0, 0.0);
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      // Undeclared exception!
      try { 
        defaultPieDataset0.sortByKeys(sortOrder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.math.BigInteger
         //
         verifyException("java.math.BigInteger", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      // Undeclared exception!
      try { 
        jDBCPieDataset0.setValue((Comparable) null, (Number) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.setValue((Comparable) null, 0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      // Undeclared exception!
      try { 
        defaultKeyedValuesDataset0.setSelected((Comparable) fixedMillisecond0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (Wed Dec 31 23:59:59 GMT 1969) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultKeyedValues defaultKeyedValues0 = new DefaultKeyedValues();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValues0);
      // Undeclared exception!
      try { 
        defaultPieDataset0.setSelected((Comparable) null, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      jDBCPieDataset0.insertValue(0, (Comparable) "", (double) 0);
      // Undeclared exception!
      try { 
        jDBCPieDataset0.setSelected((Comparable) "", true, false);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to org.jfree.data.SelectableValue
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.setSelected((Comparable) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValuesDataset0.remove((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      // Undeclared exception!
      try { 
        defaultKeyedValuesDataset0.isSelected(fixedMillisecond0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (Wed Dec 31 23:59:59 GMT 1969) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      // Undeclared exception!
      try { 
        defaultPieDataset0.insertValue(1653, (Comparable) null, (Number) integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      defaultPieDataset0.insertValue(0, (Comparable) "org.jfree.data.time.FixedMillisecond", (double) (-1305));
      // Undeclared exception!
      try { 
        defaultPieDataset0.getValue((Comparable) "org.jfree.data.time.FixedMillisecond");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to org.jfree.data.SelectableValue
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.getValue((-85));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      // Undeclared exception!
      try { 
        defaultKeyedValuesDataset0.getKey((-1368));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.getIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      defaultKeyedValuesDataset0.insertValue((int) (byte)0, (Comparable) (byte) (-91), 0.0);
      DefaultPieDataset defaultPieDataset0 = null;
      try {
        defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Double cannot be cast to org.jfree.data.SelectableValue
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-469L));
      RegularTimePeriod regularTimePeriod0 = fixedMillisecond0.previous();
      byte[] byteArray0 = new byte[5];
      RegularTimePeriod regularTimePeriod1 = fixedMillisecond0.previous();
      defaultKeyedValuesDataset0.setValue((Comparable) regularTimePeriod1, (Number) (byte)0);
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) regularTimePeriod0, (Number) bigInteger0);
      assertEquals((-470L), regularTimePeriod0.getSerialIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCPieDataset0.getKey(9);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 9, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      defaultKeyedValuesDataset0.fireSelectionEvent();
      assertEquals(0, defaultKeyedValuesDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      int int0 = defaultKeyedValuesDataset0.getIndex((byte) (-91));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      byte[] byteArray0 = new byte[8];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultPieDataset0.insertValue(0, (Comparable) "", (Number) bigInteger0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Integer integer0 = Integer.valueOf(29);
      defaultKeyedValuesDataset0.setValue((Comparable) integer0, (double) 29);
      defaultKeyedValuesDataset0.clearSelection();
      assertEquals(1, defaultKeyedValuesDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[8];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      defaultKeyedValuesDataset0.setSelected((Comparable) fixedMillisecond0, true, true);
      assertEquals(1, defaultKeyedValuesDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      defaultKeyedValuesDataset0.setSelected((Comparable) fixedMillisecond0, false, false);
      assertEquals(1, defaultKeyedValuesDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[5];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
      defaultPieDataset0.setValue((Comparable) (byte) (-91), (double) (byte) (-5));
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (-2033.9242633203796));
      Quarter quarter0 = new Quarter();
      defaultKeyedValuesDataset0.setValue((Comparable) quarter0, (Number) (byte) (-91));
      boolean boolean0 = defaultPieDataset0.equals(defaultKeyedValuesDataset0);
      assertEquals(2, defaultPieDataset0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      Object object0 = defaultPieDataset0.clone();
      boolean boolean0 = defaultPieDataset0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, defaultPieDataset0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
      defaultPieDataset0.setValue((Comparable) (byte) (-91), 0.0);
      Quarter quarter0 = new Quarter();
      defaultKeyedValuesDataset0.setValue((Comparable) quarter0, (Number) (byte) (-91));
      boolean boolean0 = defaultPieDataset0.equals(defaultKeyedValuesDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      Integer integer0 = JLayeredPane.POPUP_LAYER;
      boolean boolean0 = jDBCPieDataset0.equals(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      boolean boolean0 = defaultPieDataset0.equals(defaultPieDataset0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
      defaultPieDataset0.setValue((Comparable) (byte) (-91), 0.0);
      boolean boolean0 = defaultPieDataset0.equals(defaultKeyedValuesDataset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      Integer integer0 = Integer.valueOf(29);
      defaultKeyedValuesDataset0.setValue((Comparable) integer0, (double) 29);
      defaultKeyedValuesDataset0.clear();
      assertEquals(0, defaultKeyedValuesDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      defaultPieDataset0.clear();
      assertEquals(0, defaultPieDataset0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCPieDataset0.getValue((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.getValue((Comparable) "ut&H");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (ut&H) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      Number number0 = jDBCPieDataset0.getValue(3278);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = null;
      try {
        defaultPieDataset0 = new DefaultPieDataset((KeyedValues) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'data' argument.
         //
         verifyException("org.jfree.data.pie.DefaultPieDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.setSelected((Comparable) "ut&H", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (ut&H) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      jDBCPieDataset0.hashCode();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      List list0 = defaultKeyedValuesDataset0.getKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      Quarter quarter0 = new Quarter();
      // Undeclared exception!
      try { 
        jDBCPieDataset0.insertValue(113, (Comparable) quarter0, (double) 113);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      byte[] byteArray0 = new byte[8];
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      defaultKeyedValuesDataset0.setValue((Comparable) fixedMillisecond0, (Number) bigInteger0);
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset(defaultKeyedValuesDataset0);
      defaultPieDataset0.setValue((Comparable) (byte) (-91), 0.0);
      Quarter quarter0 = new Quarter();
      defaultKeyedValuesDataset0.setValue((Comparable) quarter0, (Number) (byte) (-91));
      boolean boolean0 = defaultPieDataset0.equals(defaultKeyedValuesDataset0);
      assertEquals(2, defaultPieDataset0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultPieDataset defaultPieDataset0 = new DefaultPieDataset();
      // Undeclared exception!
      try { 
        defaultPieDataset0.isSelected((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-471L));
      // Undeclared exception!
      try { 
        defaultKeyedValuesDataset0.remove(fixedMillisecond0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (org.jfree.data.time.FixedMillisecond@0000000006) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultKeyedValuesDataset defaultKeyedValuesDataset0 = new DefaultKeyedValuesDataset();
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      defaultKeyedValuesDataset0.sortByValues(sortOrder0);
      assertEquals("SortOrder.ASCENDING", sortOrder0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCPieDataset jDBCPieDataset0 = new JDBCPieDataset(connection0);
      // Undeclared exception!
      try { 
        jDBCPieDataset0.sortByKeys((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedObjectComparator", e);
      }
  }
}
