/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:56:26 GMT 2022
 */

package org.jfree.data.resources;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.resources.DataPackageResources_pl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataPackageResources_pl_ESTest extends DataPackageResources_pl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataPackageResources_pl dataPackageResources_pl0 = new DataPackageResources_pl();
      Object[][] objectArray0 = dataPackageResources_pl0.getContents();
      assertEquals(2, objectArray0.length);
  }
}