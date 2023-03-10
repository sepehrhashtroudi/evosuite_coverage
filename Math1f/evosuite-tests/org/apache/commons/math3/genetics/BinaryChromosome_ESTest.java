/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:27:02 GMT 2022
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math3.genetics.BinaryChromosome;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BinaryChromosome_ESTest extends BinaryChromosome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<Integer> list0 = BinaryChromosome.randomBinaryRepresentation(0);
      assertFalse(list0.contains(0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        BinaryChromosome.randomBinaryRepresentation((-3900));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -3900
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BinaryChromosome.randomBinaryRepresentation(1468);
      BinaryChromosome.randomBinaryRepresentation(1468);
      BinaryChromosome.randomBinaryRepresentation(3539);
      // Undeclared exception!
      BinaryChromosome.randomBinaryRepresentation(3539);
  }
}
