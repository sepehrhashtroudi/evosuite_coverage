/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:02:15 GMT 2022
 */

package org.apache.commons.math3.ml.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;
import org.apache.commons.math3.ml.distance.CanberraDistance;
import org.apache.commons.math3.ml.distance.ChebyshevDistance;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.ml.distance.ManhattanDistance;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FuzzyKMeansClusterer_ESTest extends FuzzyKMeansClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(226, 226, 1259, euclideanDistance0);
      assertEquals(226.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(226, fuzzyKMeansClusterer0.getK());
      assertEquals(1259, fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(275, 275, 735, canberraDistance0, 1077.1467528, (RandomGenerator) null);
      fuzzyKMeansClusterer0.getRandomGenerator();
      assertEquals(275, fuzzyKMeansClusterer0.getK());
      assertEquals(735, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(1077.1467528, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(275.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      Well19937a well19937a0 = new Well19937a(0L);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(822, 2980.9580078125, 0, chebyshevDistance0, 0, well19937a0);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals(2980.9580078125, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0, int0);
      assertEquals(0.0, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(822, fuzzyKMeansClusterer0.getK());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(275, 275, 735, canberraDistance0, 1077.1467528, (RandomGenerator) null);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals(1077.1467528, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(275, fuzzyKMeansClusterer0.getK());
      assertEquals(735, int0);
      assertEquals(275.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 313.242);
      int int0 = fuzzyKMeansClusterer0.getK();
      assertEquals(0, int0);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(313.242, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 313.242);
      DistanceMeasure distanceMeasure0 = fuzzyKMeansClusterer0.getDistanceMeasure();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer1 = new FuzzyKMeansClusterer<DoublePoint>((-4039), 313.242, (-4039), distanceMeasure0);
      int int0 = fuzzyKMeansClusterer1.getK();
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals((-4039), int0);
      assertEquals(0.001, fuzzyKMeansClusterer1.getEpsilon(), 0.01);
      assertEquals(313.242, fuzzyKMeansClusterer1.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      Well19937a well19937a0 = new Well19937a(0L);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(822, 2980.9580078125, 0, chebyshevDistance0, 0, well19937a0);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals(822, fuzzyKMeansClusterer0.getK());
      assertEquals(0, fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(2980.9580078125, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      Well44497a well44497a0 = new Well44497a((-288));
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-288), 3202.173983533, (-288), manhattanDistance0, (-288), well44497a0);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals((-288), fuzzyKMeansClusterer0.getK());
      assertEquals(3202.173983533, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals((-288.0), double0, 0.01);
      assertEquals((-288), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 313.242);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      fuzzyKMeansClusterer0.cluster(linkedList0);
      fuzzyKMeansClusterer0.getClusters();
      assertEquals(313.242, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(232, 232);
      try { 
        fuzzyKMeansClusterer0.cluster((Collection<DoublePoint>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-1), 2378.4551291334);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(linkedList0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-853), (-1.0), (-553), manhattanDistance0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-1385), (-1.1623181434592597E-259));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -0 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 313.242);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      double[] doubleArray0 = new double[8];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      linkedList0.add(doublePoint0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      Well44497a well44497a0 = new Well44497a();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(877, 3171.0, 877, euclideanDistance0, 2117.025146061602, well44497a0);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      try { 
        fuzzyKMeansClusterer0.cluster(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (877)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 313.242);
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      fuzzyKMeansClusterer0.cluster(linkedList0);
      double double0 = fuzzyKMeansClusterer0.getObjectiveFunctionValue();
      assertEquals(313.242, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 557.6434508474022, 0, chebyshevDistance0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getObjectiveFunctionValue();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1023, 2978.57929856669);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getMembershipMatrix();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // illegal state
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 1139.97066008542);
      double[] doubleArray0 = new double[6];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      fuzzyKMeansClusterer0.cluster(list0);
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.getMembershipMatrix();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math3.linear.MatrixUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      Well44497a well44497a0 = new Well44497a(775);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = null;
      try {
        fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-194), 0.01934296265244484, (-194), canberraDistance0, (-194), well44497a0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0.019 is smaller than, or equal to, the minimum (1)
         //
         verifyException("org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 557.6434508474022, 0, chebyshevDistance0);
      fuzzyKMeansClusterer0.getClusters();
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(557.6434508474022, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0, fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1023, 2978.57929856669);
      double double0 = fuzzyKMeansClusterer0.getEpsilon();
      assertEquals(0.001, double0, 0.01);
      assertEquals(1023, fuzzyKMeansClusterer0.getK());
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(2978.57929856669, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(232, 232);
      fuzzyKMeansClusterer0.getDataPoints();
      assertEquals(232, fuzzyKMeansClusterer0.getK());
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(232.0, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1023, 2978.57929856669);
      int int0 = fuzzyKMeansClusterer0.getK();
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(2978.57929856669, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(1023, int0);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1023, 2978.57929856669);
      int int0 = fuzzyKMeansClusterer0.getMaxIterations();
      assertEquals((-1), int0);
      assertEquals(1023, fuzzyKMeansClusterer0.getK());
      assertEquals(2978.57929856669, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(1023, 2978.57929856669);
      double double0 = fuzzyKMeansClusterer0.getFuzziness();
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
      assertEquals(1023, fuzzyKMeansClusterer0.getK());
      assertEquals(2978.57929856669, double0, 0.01);
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 1139.97066008542);
      fuzzyKMeansClusterer0.getRandomGenerator();
      assertEquals(0.001, fuzzyKMeansClusterer0.getEpsilon(), 0.01);
      assertEquals(0, fuzzyKMeansClusterer0.getK());
      assertEquals(1139.97066008542, fuzzyKMeansClusterer0.getFuzziness(), 0.01);
      assertEquals((-1), fuzzyKMeansClusterer0.getMaxIterations());
  }
}