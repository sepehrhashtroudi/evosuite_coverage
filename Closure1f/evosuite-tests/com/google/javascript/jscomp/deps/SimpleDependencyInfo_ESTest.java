/*
 * This file was automatically generated by EvoSuite
 * Thu Feb 16 10:27:15 GMT 2023
 */

package com.google.javascript.jscomp.deps;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.deps.SimpleDependencyInfo;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleDependencyInfo_ESTest extends SimpleDependencyInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("al_lzWr;Vt-&|<!", "~Ip.}", linkedList0, linkedList0);
      SimpleDependencyInfo simpleDependencyInfo1 = new SimpleDependencyInfo("al_lzWr;Vt-&|<!", "al_lzWr;Vt-&|<!", linkedList0, linkedList0);
      // Undeclared exception!
      try { 
        simpleDependencyInfo0.equals(simpleDependencyInfo1);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/base/Objects
         //
         verifyException("com.google.javascript.jscomp.deps.SimpleDependencyInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo((String) null, (String) null, linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.getPathRelativeToClosureBase();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("", "", (List<String>) null, (List<String>) null);
      String string0 = simpleDependencyInfo0.getPathRelativeToClosureBase();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo((String) null, (String) null, linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("", "", linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("", "", (List<String>) null, (List<String>) null);
      // Undeclared exception!
      try { 
        simpleDependencyInfo0.getRequires();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("", "=;5RD", (List<String>) null, (List<String>) null);
      // Undeclared exception!
      try { 
        simpleDependencyInfo0.getProvides();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      boolean boolean0 = simpleDependencyInfo0.equals("m");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.getName();
      assertEquals("m", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.getPathRelativeToClosureBase();
      assertEquals("m", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      Collection<String> collection0 = simpleDependencyInfo0.getProvides();
      assertFalse(collection0.contains("m"));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      String string0 = simpleDependencyInfo0.toString();
      assertEquals("DependencyInfo(relativePath='m', path='m', provides=[], requires=[])", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleDependencyInfo simpleDependencyInfo0 = new SimpleDependencyInfo("m", "m", linkedList0, linkedList0);
      Collection<String> collection0 = simpleDependencyInfo0.getRequires();
      assertFalse(collection0.contains("m"));
  }
}
