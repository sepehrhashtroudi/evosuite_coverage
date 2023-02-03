/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 20:04:21 GMT 2022
 */

package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.general.DatasetGroup;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatasetGroup_ESTest extends DatasetGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup("");
      String string0 = datasetGroup0.getID();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup("K");
      Object object0 = datasetGroup0.clone();
      boolean boolean0 = datasetGroup0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup("oRxgX");
      boolean boolean0 = datasetGroup0.equals("oRxgX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup("K");
      boolean boolean0 = datasetGroup0.equals(datasetGroup0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DatasetGroup datasetGroup0 = null;
      try {
        datasetGroup0 = new DatasetGroup((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'id' argument.
         //
         verifyException("org.jfree.data.general.DatasetGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup("<");
      DatasetGroup datasetGroup1 = new DatasetGroup(";");
      boolean boolean0 = datasetGroup0.equals(datasetGroup1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup();
      DatasetGroup datasetGroup1 = (DatasetGroup)datasetGroup0.clone();
      assertEquals("NOID", datasetGroup1.getID());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DatasetGroup datasetGroup0 = new DatasetGroup();
      String string0 = datasetGroup0.getID();
      assertEquals("NOID", string0);
  }
}
