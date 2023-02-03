/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:58:25 GMT 2022
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
import org.jfree.data.KeyedObject;
import org.jfree.data.KeyedObjects;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KeyedObjects_ESTest extends KeyedObjects_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject("]!Y3&}vT0'", "]!Y3&}vT0'");
      keyedObjects0.insertValue(0, 0, "]!Y3&}vT0'");
      keyedObjects0.removeValue((Comparable) "]!Y3&}vT0'");
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject("]!Y3&}vT0'", "]!Y3&}vT0'");
      keyedObjects0.insertValue(0, 0, "]!Y3&}vT0'");
      Object object0 = keyedObjects0.getObject((Comparable) "]!Y3&}vT0'");
      assertEquals("]!Y3&}vT0'", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.addObject(comparable0, comparable0);
      keyedObjects0.removeValue(0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals(keyedObjects0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      keyedObjects0.setObject(integer0, (Object) null);
      Object object0 = keyedObjects0.getObject((Comparable) integer0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.insertValue(0, comparable0, comparable0);
      int int0 = keyedObjects0.getItemCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      keyedObjects0.setObject(comparable0, object0);
      keyedObjects0.setObject("v/DhyJ", (Object) null);
      int int0 = keyedObjects0.getIndex("v/DhyJ");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.sortByObjects((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedObjectComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.setObject(comparable0, "The key (");
      Comparable<String> comparable1 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.addObject(comparable1, comparable1);
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      // Undeclared exception!
      try { 
        keyedObjects0.sortByObjects(sortOrder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.sortByKeys((SortOrder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'order' argument.
         //
         verifyException("org.jfree.data.KeyedObjectComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      keyedObjects0.setObject(comparable0, object0);
      keyedObjects0.setObject("v/DhyJ", (Object) null);
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      // Undeclared exception!
      try { 
        keyedObjects0.sortByKeys(sortOrder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      SortOrder sortOrder0 = SortOrder.ASCENDING;
      // Undeclared exception!
      try { 
        keyedObjects0.setObject((Comparable) null, sortOrder0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getObject(3575);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3575, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getObject((-3123));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getKey(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getKey((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        keyedObjects0.addObject((Comparable) null, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.setObject("v/DhyJ", (Object) null);
      int int0 = keyedObjects0.getIndex("v/DhyJ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      keyedObjects0.setObject(comparable0, object0);
      int int0 = keyedObjects0.getIndex("v/DhyJ");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getIndex((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject("]!Y3&}vT0'", "]!Y3&}vT0'");
      Comparable comparable0 = keyedObjects0.getKey(0);
      assertEquals("]!Y3&}vT0'", comparable0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(0);
      keyedObjects0.setObject(comparable0, integer0);
      Object object0 = keyedObjects0.getObject(0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.hashCode();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.setObject(comparable0, comparable0);
      KeyedObjects keyedObjects1 = new KeyedObjects();
      boolean boolean0 = keyedObjects0.equals(keyedObjects1);
      assertFalse(keyedObjects1.equals((Object)keyedObjects0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      boolean boolean0 = keyedObjects0.equals(sortOrder0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = Integer.getInteger("o?G\fG<u$zs;cq<|", 1545);
      keyedObjects0.setObject(integer0, integer0);
      keyedObjects0.insertValue(0, integer0, "o?G\fG<u$zs;cq<|");
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        keyedObjects0.insertValue(0, (Comparable) null, object0);
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
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        keyedObjects0.insertValue(771, comparable0, comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 'position' out of bounds.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        keyedObjects0.insertValue((-1), comparable0, keyedObjects0);
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
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Integer integer0 = new Integer((-1));
      keyedObjects0.insertValue(0, integer0, integer0);
      keyedObjects0.setObject(integer0, keyedObjects0);
      assertEquals(1, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(comparable0).toString();
      // Undeclared exception!
      try { 
        keyedObjects0.getObject(comparable0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (null) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("YgL").when(comparable0).toString();
      keyedObjects0.setObject(comparable0, comparable0);
      List list0 = keyedObjects0.getKeys();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      List list0 = keyedObjects0.getKeys();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      keyedObjects0.setObject(comparable0, comparable0);
      Comparable<String> comparable1 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue(comparable1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The key (codegen.java.lang.Comparable$MockitoMock$752969642@0000000003) is not recognised.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.getObject((Comparable) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'key' argument.
         //
         verifyException("org.jfree.data.KeyedObjects", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      Comparable<KeyedObject> comparable0 = (Comparable<KeyedObject>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn("YgL", "YgL", "The key (", "org.jfree.data.KeyedObjectComparatorType").when(comparable0).toString();
      keyedObjects0.setObject(comparable0, comparable0);
      Object object0 = keyedObjects0.clone();
      boolean boolean0 = keyedObjects0.equals(object0);
      assertEquals(1, keyedObjects0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      int int0 = keyedObjects0.getItemCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      keyedObjects0.sortByKeys(sortOrder0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      // Undeclared exception!
      try { 
        keyedObjects0.removeValue(807);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 807, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      SortOrder sortOrder0 = SortOrder.DESCENDING;
      keyedObjects0.sortByObjects(sortOrder0);
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.clear();
      assertEquals(0, keyedObjects0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      KeyedObjects keyedObjects0 = new KeyedObjects();
      keyedObjects0.addObject("wY", "wY");
      keyedObjects0.removeValue((Comparable) "wY");
      assertEquals(0, keyedObjects0.getItemCount());
  }
}
