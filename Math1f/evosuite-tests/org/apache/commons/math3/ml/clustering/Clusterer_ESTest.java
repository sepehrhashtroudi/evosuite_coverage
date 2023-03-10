/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 03:59:32 GMT 2022
 */

package org.apache.commons.math3.ml.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.DBSCANClusterer;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.FuzzyKMeansClusterer;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.distance.CanberraDistance;
import org.apache.commons.math3.ml.distance.ChebyshevDistance;
import org.apache.commons.math3.ml.distance.DistanceMeasure;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.ml.distance.ManhattanDistance;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Clusterer_ESTest extends Clusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      Well44497a well44497a0 = new Well44497a();
      RandomAdaptor randomAdaptor0 = new RandomAdaptor(well44497a0);
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(547, 547, 1068, manhattanDistance0, 1068, randomAdaptor0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 1068;
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      int[] intArray0 = new int[9];
      DoublePoint doublePoint1 = new DoublePoint(intArray0);
      double double0 = fuzzyKMeansClusterer0.distance(doublePoint0, doublePoint1);
      assertEquals(1068.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(24, 24, chebyshevDistance0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 0);
      List<? extends Cluster<DoublePoint>> list0 = multiKMeansPlusPlusClusterer0.cluster((Collection<DoublePoint>) null);
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DBSCANClusterer<DoublePoint> dBSCANClusterer0 = new DBSCANClusterer<DoublePoint>(795.5, 0);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      List<? extends Cluster<DoublePoint>> list0 = dBSCANClusterer0.cluster(linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      double[] doubleArray0 = new double[3];
      Well512a well512a0 = new Well512a((-1));
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE;
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 0, canberraDistance0, well512a0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      linkedList0.add(doublePoint0);
      List<? extends Cluster<DoublePoint>> list0 = kMeansPlusPlusClusterer0.cluster(linkedList0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-2601), (-2601), (DistanceMeasure) null);
      double[] doubleArray0 = new double[9];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.distance(doublePoint0, doublePoint0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.Clusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      double[] doubleArray0 = new double[8];
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(30, 2339, chebyshevDistance0);
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      int[] intArray0 = new int[6];
      DoublePoint doublePoint1 = new DoublePoint(intArray0);
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.distance(doublePoint0, doublePoint1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>(0, 4.831833881898182E203);
      Cluster<DoublePoint> cluster0 = new Cluster<DoublePoint>();
      int[] intArray0 = new int[7];
      DoublePoint doublePoint0 = new DoublePoint(intArray0);
      cluster0.addPoint(doublePoint0);
      List<DoublePoint> list0 = cluster0.getPoints();
      // Undeclared exception!
      try { 
        fuzzyKMeansClusterer0.cluster(list0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // array sums to zero
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      Well512a well512a0 = new Well512a(0);
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 0, canberraDistance0, well512a0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      try { 
        kMeansPlusPlusClusterer0.cluster(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(4648, 4648);
      Cluster<DoublePoint> cluster0 = new Cluster<DoublePoint>();
      List<DoublePoint> list0 = cluster0.getPoints();
      try { 
        kMeansPlusPlusClusterer0.cluster(list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (4,648)
         //
         verifyException("org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(2072, 2072, euclideanDistance0);
      try { 
        kMeansPlusPlusClusterer0.cluster((Collection<DoublePoint>) null);
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
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.FARTHEST_POINT;
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 2049, euclideanDistance0, (RandomGenerator) null, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FuzzyKMeansClusterer<DoublePoint> fuzzyKMeansClusterer0 = new FuzzyKMeansClusterer<DoublePoint>((-1), 2948.8, (-1), (DistanceMeasure) null);
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
  public void test12()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0);
      Cluster<DoublePoint> cluster0 = new Cluster<DoublePoint>();
      List<DoublePoint> list0 = cluster0.getPoints();
      // Undeclared exception!
      try { 
        kMeansPlusPlusClusterer0.cluster(list0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(30, 2339, chebyshevDistance0);
      DistanceMeasure distanceMeasure0 = kMeansPlusPlusClusterer0.getDistanceMeasure();
      assertSame(chebyshevDistance0, distanceMeasure0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      double[] doubleArray0 = new double[3];
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(30, 2339, chebyshevDistance0);
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      double double0 = kMeansPlusPlusClusterer0.distance(doublePoint0, doublePoint0);
      assertEquals(0.0, double0, 0.01);
  }
}
