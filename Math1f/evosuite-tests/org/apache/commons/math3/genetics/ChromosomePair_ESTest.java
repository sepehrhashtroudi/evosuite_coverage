/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:30:33 GMT 2022
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.ChromosomePair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChromosomePair_ESTest extends ChromosomePair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChromosomePair chromosomePair0 = new ChromosomePair((Chromosome) null, (Chromosome) null);
      Chromosome chromosome0 = chromosomePair0.getFirst();
      assertNull(chromosome0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChromosomePair chromosomePair0 = new ChromosomePair((Chromosome) null, (Chromosome) null);
      Chromosome chromosome0 = chromosomePair0.getSecond();
      assertNull(chromosome0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Chromosome chromosome0 = mock(Chromosome.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(chromosome0).toString();
      ChromosomePair chromosomePair0 = new ChromosomePair(chromosome0, chromosome0);
      String string0 = chromosomePair0.toString();
      assertEquals("(null,null)", string0);
  }
}
