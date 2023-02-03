/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 21:31:19 GMT 2022
 */

package org.apache.commons.math3.genetics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.genetics.BinaryMutation;
import org.apache.commons.math3.genetics.Chromosome;
import org.apache.commons.math3.genetics.CycleCrossover;
import org.apache.commons.math3.genetics.ElitisticListPopulation;
import org.apache.commons.math3.genetics.FixedElapsedTime;
import org.apache.commons.math3.genetics.FixedGenerationCount;
import org.apache.commons.math3.genetics.GeneticAlgorithm;
import org.apache.commons.math3.genetics.MutationPolicy;
import org.apache.commons.math3.genetics.NPointCrossover;
import org.apache.commons.math3.genetics.OnePointCrossover;
import org.apache.commons.math3.genetics.OrderedCrossover;
import org.apache.commons.math3.genetics.Population;
import org.apache.commons.math3.genetics.RandomKeyMutation;
import org.apache.commons.math3.genetics.SelectionPolicy;
import org.apache.commons.math3.genetics.TournamentSelection;
import org.apache.commons.math3.genetics.UniformCrossover;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497b;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeneticAlgorithm_ESTest extends GeneticAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OrderedCrossover<Object> orderedCrossover0 = new OrderedCrossover<Object>();
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(orderedCrossover0, 1.0, randomKeyMutation0, 0.0, (SelectionPolicy) null);
      geneticAlgorithm0.getSelectionPolicy();
      assertEquals(1.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(2045222521);
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.8248282026775123, randomKeyMutation0, 0.8248282026775123, tournamentSelection0);
      double double0 = geneticAlgorithm0.getMutationRate();
      assertEquals(0.8248282026775123, geneticAlgorithm0.getCrossoverRate(), 0.01);
      assertEquals(0.8248282026775123, double0, 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NPointCrossover<String> nPointCrossover0 = new NPointCrossover<String>(1);
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(1);
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(nPointCrossover0, 1, randomKeyMutation0, 1, tournamentSelection0);
      double double0 = geneticAlgorithm0.getCrossoverRate();
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(1.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FixedElapsedTime fixedElapsedTime0 = new FixedElapsedTime(0L, timeUnit0);
      geneticAlgorithm0.evolve((Population) null, fixedElapsedTime0);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FixedElapsedTime fixedElapsedTime0 = new FixedElapsedTime(0L, timeUnit0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      linkedList0.add((Chromosome) null);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 865, 1.0);
      geneticAlgorithm0.evolve(elitisticListPopulation0, fixedElapsedTime0);
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NPointCrossover<String> nPointCrossover0 = new NPointCrossover<String>(1);
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(1);
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(nPointCrossover0, 1, randomKeyMutation0, 1, tournamentSelection0);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.nextGeneration(elitisticListPopulation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tournament arity (1) cannot be bigger than population size (0)
         //
         verifyException("org.apache.commons.math3.genetics.TournamentSelection", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CycleCrossover<Object> cycleCrossover0 = new CycleCrossover<Object>(true);
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(1248);
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(cycleCrossover0, 0.0, randomKeyMutation0, 1.0, tournamentSelection0);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.nextGeneration((Population) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NPointCrossover<String> nPointCrossover0 = new NPointCrossover<String>(1);
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(1);
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(nPointCrossover0, 1, randomKeyMutation0, 1, tournamentSelection0);
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(1, 1);
      TimeUnit timeUnit0 = TimeUnit.MICROSECONDS;
      FixedElapsedTime fixedElapsedTime0 = new FixedElapsedTime(1, timeUnit0);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.evolve(elitisticListPopulation0, fixedElapsedTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tournament arity (1) cannot be bigger than population size (0)
         //
         verifyException("org.apache.commons.math3.genetics.TournamentSelection", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OrderedCrossover<Object> orderedCrossover0 = new OrderedCrossover<Object>();
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(orderedCrossover0, 1.0, randomKeyMutation0, 0.0, (SelectionPolicy) null);
      FixedGenerationCount fixedGenerationCount0 = new FixedGenerationCount(34);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.evolve((Population) null, fixedGenerationCount0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 865, 0.0);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.nextGeneration(elitisticListPopulation0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FixedElapsedTime fixedElapsedTime0 = new FixedElapsedTime(25L, timeUnit0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 865, 1.0);
      // Undeclared exception!
      try { 
        geneticAlgorithm0.evolve(elitisticListPopulation0, fixedElapsedTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population limit has to be positive
         //
         verifyException("org.apache.commons.math3.genetics.ListPopulation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
      FixedElapsedTime fixedElapsedTime0 = new FixedElapsedTime(0L, timeUnit0);
      LinkedList<Chromosome> linkedList0 = new LinkedList<Chromosome>();
      ElitisticListPopulation elitisticListPopulation0 = new ElitisticListPopulation(linkedList0, 865, 0.0);
      geneticAlgorithm0.evolve(elitisticListPopulation0, fixedElapsedTime0);
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UniformCrossover<String> uniformCrossover0 = new UniformCrossover<String>(0.5);
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(238);
      GeneticAlgorithm geneticAlgorithm0 = null;
      try {
        geneticAlgorithm0 = new GeneticAlgorithm(uniformCrossover0, 0.5, binaryMutation0, 1806.5177031636313, tournamentSelection0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // mutation rate (1,806.518)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CycleCrossover<String> cycleCrossover0 = new CycleCrossover<String>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(97);
      GeneticAlgorithm geneticAlgorithm0 = null;
      try {
        geneticAlgorithm0 = new GeneticAlgorithm(cycleCrossover0, 0.0, binaryMutation0, (-1.0), tournamentSelection0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // mutation rate (-1)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NPointCrossover<String> nPointCrossover0 = new NPointCrossover<String>(58);
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection(58);
      GeneticAlgorithm geneticAlgorithm0 = null;
      try {
        geneticAlgorithm0 = new GeneticAlgorithm(nPointCrossover0, 58, randomKeyMutation0, (-1953.81), tournamentSelection0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // crossover rate (58)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      TournamentSelection tournamentSelection0 = new TournamentSelection(2103229103);
      GeneticAlgorithm geneticAlgorithm0 = null;
      try {
        geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, (-1.7825632143220438), (MutationPolicy) null, (-1.7825632143220438), tournamentSelection0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // crossover rate (-1.783)
         //
         verifyException("org.apache.commons.math3.genetics.GeneticAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      double double0 = geneticAlgorithm0.getCrossoverRate();
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CycleCrossover<String> cycleCrossover0 = new CycleCrossover<String>();
      RandomKeyMutation randomKeyMutation0 = new RandomKeyMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2177));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(cycleCrossover0, 0.0, randomKeyMutation0, 0.0, tournamentSelection0);
      int int0 = geneticAlgorithm0.getGenerationsEvolved();
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      double double0 = geneticAlgorithm0.getMutationRate();
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      geneticAlgorithm0.getSelectionPolicy();
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      geneticAlgorithm0.getCrossoverPolicy();
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      Well44497b well44497b0 = new Well44497b(intArray0);
      GeneticAlgorithm.setRandomGenerator(well44497b0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OnePointCrossover<Integer> onePointCrossover0 = new OnePointCrossover<Integer>();
      BinaryMutation binaryMutation0 = new BinaryMutation();
      TournamentSelection tournamentSelection0 = new TournamentSelection((-2378));
      GeneticAlgorithm geneticAlgorithm0 = new GeneticAlgorithm(onePointCrossover0, 0.0, binaryMutation0, 0.0, tournamentSelection0);
      geneticAlgorithm0.getMutationPolicy();
      assertEquals(0, geneticAlgorithm0.getGenerationsEvolved());
      assertEquals(0.0, geneticAlgorithm0.getMutationRate(), 0.01);
      assertEquals(0.0, geneticAlgorithm0.getCrossoverRate(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RandomGenerator randomGenerator0 = GeneticAlgorithm.getRandomGenerator();
      assertNotNull(randomGenerator0);
  }
}
