/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 19 06:31:09 GMT 2022
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundaryAttribute_ESTest extends BoundaryAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector2D vector2D0 = new Vector2D((-118.301163), (-118.301163));
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BoundaryAttribute<Euclidean2D> boundaryAttribute0 = new BoundaryAttribute<Euclidean2D>(subLine0, subLine0);
      SubHyperplane<Euclidean2D> subHyperplane0 = boundaryAttribute0.getPlusOutside();
      assertSame(subLine0, subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      SubPlane subPlane0 = new SubPlane((Hyperplane<Euclidean3D>) null, polygonsSet0);
      BoundaryAttribute<Euclidean3D> boundaryAttribute0 = new BoundaryAttribute<Euclidean3D>(subPlane0, subPlane0);
      SubHyperplane<Euclidean3D> subHyperplane0 = boundaryAttribute0.getPlusInside();
      assertSame(subPlane0, subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoundaryAttribute<Euclidean1D> boundaryAttribute0 = new BoundaryAttribute<Euclidean1D>((SubHyperplane<Euclidean1D>) null, (SubHyperplane<Euclidean1D>) null);
      SubHyperplane<Euclidean1D> subHyperplane0 = boundaryAttribute0.getPlusInside();
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoundaryAttribute<Euclidean1D> boundaryAttribute0 = new BoundaryAttribute<Euclidean1D>((SubHyperplane<Euclidean1D>) null, (SubHyperplane<Euclidean1D>) null);
      SubHyperplane<Euclidean1D> subHyperplane0 = boundaryAttribute0.getPlusOutside();
      assertNull(subHyperplane0);
  }
}
