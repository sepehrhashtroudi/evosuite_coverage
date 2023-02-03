/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 04:00:33 GMT 2022
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
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer;
import org.apache.commons.math3.ml.distance.CanberraDistance;
import org.apache.commons.math3.ml.distance.ChebyshevDistance;
import org.apache.commons.math3.ml.distance.EarthMoversDistance;
import org.apache.commons.math3.ml.distance.EuclideanDistance;
import org.apache.commons.math3.ml.distance.ManhattanDistance;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiKMeansPlusPlusClusterer_ESTest extends MultiKMeansPlusPlusClusterer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-668));
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1);
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      double[] doubleArray0 = new double[3];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      linkedList0.add(doublePoint0);
      DoublePoint doublePoint1 = new DoublePoint(intArray0);
      linkedList0.add(doublePoint1);
      linkedList0.add(doublePoint1);
      List<CentroidCluster<DoublePoint>> list0 = multiKMeansPlusPlusClusterer0.cluster(linkedList0);
      assertEquals(1, multiKMeansPlusPlusClusterer0.getNumTrials());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(32, 32, chebyshevDistance0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, (-624));
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      multiKMeansPlusPlusClusterer0.cluster(linkedList0);
      assertEquals((-624), multiKMeansPlusPlusClusterer0.getNumTrials());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-668));
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1);
      int int0 = multiKMeansPlusPlusClusterer0.getNumTrials();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(32, 32, chebyshevDistance0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, (-624));
      int int0 = multiKMeansPlusPlusClusterer0.getNumTrials();
      assertEquals((-624), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(1, 1);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, (-302));
      multiKMeansPlusPlusClusterer0.getClusterer();
      assertEquals((-302), multiKMeansPlusPlusClusterer0.getNumTrials());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-668));
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1);
      multiKMeansPlusPlusClusterer0.getClusterer();
      assertEquals(1, multiKMeansPlusPlusClusterer0.getNumTrials());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EuclideanDistance euclideanDistance0 = new EuclideanDistance();
      Well512a well512a0 = new Well512a();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-633066204), (-633066204), euclideanDistance0, well512a0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1597);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      try { 
        multiKMeansPlusPlusClusterer0.cluster(linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (0)
         //
         verifyException("org.apache.commons.math3.random.BitsStreamGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ChebyshevDistance chebyshevDistance0 = new ChebyshevDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 1, chebyshevDistance0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1);
      DoublePoint doublePoint0 = new DoublePoint((double[]) null);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      centroidCluster0.addPoint(doublePoint0);
      // Undeclared exception!
      try { 
        multiKMeansPlusPlusClusterer0.cluster(list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.util.MathArrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-1048), 652);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1002);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      int[] intArray0 = new int[0];
      DoublePoint doublePoint0 = new DoublePoint(intArray0);
      linkedList0.add(doublePoint0);
      double[] doubleArray0 = new double[8];
      DoublePoint doublePoint1 = new DoublePoint(doubleArray0);
      linkedList0.add(doublePoint1);
      // Undeclared exception!
      try { 
        multiKMeansPlusPlusClusterer0.cluster(linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1243);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      // Undeclared exception!
      try { 
        multiKMeansPlusPlusClusterer0.cluster(linkedList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = null;
      try {
        multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>((KMeansPlusPlusClusterer<DoublePoint>) null, 32767);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.ml.clustering.MultiKMeansPlusPlusClusterer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>((-1048), 652);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 1002);
      LinkedList<DoublePoint> linkedList0 = new LinkedList<DoublePoint>();
      double[] doubleArray0 = new double[8];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      linkedList0.add(doublePoint0);
      // Undeclared exception!
      multiKMeansPlusPlusClusterer0.cluster(linkedList0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ManhattanDistance manhattanDistance0 = new ManhattanDistance();
      KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_POINTS_NUMBER;
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, (-361), manhattanDistance0, (RandomGenerator) null, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 26);
      try { 
        multiKMeansPlusPlusClusterer0.cluster((Collection<DoublePoint>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null is not allowed
         //
         verifyException("org.apache.commons.math3.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EarthMoversDistance earthMoversDistance0 = new EarthMoversDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 0, earthMoversDistance0, (RandomGenerator) null);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 0);
      multiKMeansPlusPlusClusterer0.getClusterer();
      assertEquals(0, multiKMeansPlusPlusClusterer0.getNumTrials());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EarthMoversDistance earthMoversDistance0 = new EarthMoversDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(0, 0, earthMoversDistance0, (RandomGenerator) null);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 0);
      int int0 = multiKMeansPlusPlusClusterer0.getNumTrials();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CanberraDistance canberraDistance0 = new CanberraDistance();
      KMeansPlusPlusClusterer<DoublePoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<DoublePoint>(2601, (-2349), canberraDistance0);
      MultiKMeansPlusPlusClusterer<DoublePoint> multiKMeansPlusPlusClusterer0 = new MultiKMeansPlusPlusClusterer<DoublePoint>(kMeansPlusPlusClusterer0, 368);
      double[] doubleArray0 = new double[3];
      DoublePoint doublePoint0 = new DoublePoint(doubleArray0);
      CentroidCluster<DoublePoint> centroidCluster0 = new CentroidCluster<DoublePoint>(doublePoint0);
      List<DoublePoint> list0 = centroidCluster0.getPoints();
      try { 
        multiKMeansPlusPlusClusterer0.cluster(list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is smaller than, or equal to, the minimum (2,601)
         //
         verifyException("org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer", e);
      }
  }
}
