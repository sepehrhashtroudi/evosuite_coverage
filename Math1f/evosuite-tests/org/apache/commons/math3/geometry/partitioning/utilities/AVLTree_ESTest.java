/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:35:03 GMT 2022
 */

package org.apache.commons.math3.geometry.partitioning.utilities;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AVLTree_ESTest extends AVLTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("T");
      aVLTree0.insert("T");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node1 = aVLTree0.getSmallest();
      aVLTree_Node0.delete();
      aVLTree_Node0.delete();
      aVLTree_Node1.getNext();
      assertEquals(4, aVLTree0.size());
      assertNotSame(aVLTree_Node1, aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      aVLTree_Node0.insert("v1OJdJ");
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getNext();
      aVLTree_Node0.insert("1W]Sw<G`W$<9D");
      aVLTree_Node0.insert("Ps!I^:W)?bs{hO;");
      aVLTree_Node1.insert("");
      aVLTree_Node1.delete();
      aVLTree_Node1.getPrevious();
      assertEquals(4, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      aVLTree0.insert("");
      aVLTree0.insert("");
      aVLTree0.insert("X=0LSlj|>g4Q#],");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getLargest();
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("1T");
      aVLTree0.insert("1T");
      aVLTree0.insert("");
      aVLTree0.getSmallest();
      assertEquals(4, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getSmallest();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getSmallest();
      assertSame(aVLTree_Node1, aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("j^xD);@s@e{X.<");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("");
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getLargest();
      assertSame(aVLTree_Node1, aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.getNotSmaller((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      AVLTree.Node aVLTree_Node0 = aVLTree0.new Node((Integer) null, (AVLTree.Node) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      Integer integer0 = new Integer(0);
      aVLTree0.insert(integer0);
      boolean boolean0 = aVLTree0.delete(integer0);
      assertTrue(aVLTree0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      // Undeclared exception!
      try { 
        aVLTree0.getNotSmaller((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      Integer integer0 = new Integer(0);
      aVLTree0.insert(integer0);
      // Undeclared exception!
      try { 
        aVLTree0.getNotLarger((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("0S");
      assertEquals(6, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      aVLTree0.insert("btA7eV");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("btA7eV");
      int int0 = aVLTree_Node0.size();
      assertEquals(3, aVLTree0.size());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("V&!K<ABO");
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger(";=CI;p3}K");
      aVLTree_Node0.delete();
      aVLTree_Node0.delete();
      assertEquals(2, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("1T");
      aVLTree0.insert("1T");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger(";=CI;p3}K");
      aVLTree_Node0.delete();
      assertEquals(3, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree_Node0.delete();
      assertEquals(6, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      aVLTree_Node0.insert("");
      aVLTree_Node0.insert("v1OJdJ");
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getNext();
      aVLTree_Node0.insert("1W]Sw<G`W$<9D");
      aVLTree_Node0.insert("Ps!I^:W)?bs{hO;");
      aVLTree_Node1.insert("");
      aVLTree_Node0.delete();
      assertEquals(5, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      aVLTree_Node0.insert("");
      aVLTree_Node0.insert("1W]Sw<G`W$<9D");
      aVLTree_Node0.insert("Ps!I^:W)?bs{hO;");
      aVLTree_Node0.delete();
      assertEquals(3, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("Tm3");
      assertEquals(7, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("uB");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("btA7eV");
      aVLTree0.insert("btA7eV");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
      aVLTree0.insert("/p1b+,.=");
      aVLTree_Node0.insert("");
      aVLTree0.insert("/p1b+,.=");
      assertEquals(6, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      aVLTree_Node0.insert("v1OJdJ");
      aVLTree_Node0.insert("");
      aVLTree_Node0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$1");
      aVLTree_Node0.insert("Ps!I^:W)?bs{hO;");
      aVLTree_Node0.delete();
      assertEquals(4, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      aVLTree_Node0.insert("v1OJdJ");
      aVLTree_Node0.insert("1W]Sw<G`W$<9D");
      aVLTree_Node0.insert("");
      aVLTree_Node0.delete();
      assertEquals(3, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("");
      aVLTree0.insert("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger(";=CI;p3}K");
      aVLTree_Node0.delete();
      assertEquals(3, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree_Node0.delete();
      assertEquals(5, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$1");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger(";=CI;p3}K");
      aVLTree_Node0.delete();
      assertEquals(1, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getLargest();
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getNext();
      assertNull(aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("");
      aVLTree_Node0.delete();
      aVLTree_Node0.getPrevious();
      assertEquals(1, aVLTree0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      boolean boolean0 = aVLTree0.delete("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      //  // Unstable assertion: assertEquals(6, aVLTree0.size());
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("r!uLjh}");
      int int0 = aVLTree0.size();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("");
      aVLTree0.insert("btA7eV");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      assertNotNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree$Skew");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("btA7eV");
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      Integer integer0 = Integer.decode("1");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger(integer0);
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VA,LUES");
      aVLTree0.insert("$VA,LUES");
      boolean boolean0 = aVLTree0.delete("0S");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getLargest();
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      AVLTree.Node aVLTree_Node0 = aVLTree0.getSmallest();
      assertNull(aVLTree_Node0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      int int0 = aVLTree0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("Dp,Nr0Ez-NB96PM~`}L");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotSmaller("Dp,Nr0Ez-NB96PM~`}L");
      aVLTree_Node0.delete();
      boolean boolean0 = aVLTree0.isEmpty();
      assertEquals(0, aVLTree0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("Dp,Nr0Ez-NB96PM~`}L");
      boolean boolean0 = aVLTree0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      boolean boolean0 = aVLTree0.delete((Integer) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert(";=CI;p3}K");
      aVLTree0.insert("");
      aVLTree0.insert("");
      AVLTree.Node aVLTree_Node0 = aVLTree0.getNotLarger("");
      AVLTree.Node aVLTree_Node1 = aVLTree_Node0.getPrevious();
      assertEquals(3, aVLTree0.size());
      assertNotSame(aVLTree_Node0, aVLTree_Node1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AVLTree<Integer> aVLTree0 = new AVLTree<Integer>();
      aVLTree0.insert((Integer) null);
      assertTrue(aVLTree0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AVLTree<String> aVLTree0 = new AVLTree<String>();
      aVLTree0.insert("$VALUES");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert("r!uLjh}");
      aVLTree0.insert(",x #Bc=q=(ur+M");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      aVLTree0.insert("org.apache.commons.math3.geometry.partitioning.utilities.AVLTree");
      assertFalse(aVLTree0.isEmpty());
  }
}