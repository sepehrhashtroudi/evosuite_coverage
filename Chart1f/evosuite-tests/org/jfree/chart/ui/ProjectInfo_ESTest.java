/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 27 01:59:13 GMT 2022
 */

package org.jfree.chart.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ui.Contributor;
import org.jfree.chart.ui.ProjectInfo;
import org.jfree.data.time.TimeSeriesTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProjectInfo_ESTest extends ProjectInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, (short)2, 2);
      ProjectInfo projectInfo0 = new ProjectInfo((String) null, (String) null, (String) null, bufferedImage0, (String) null, "", (String) null);
      BufferedImage bufferedImage1 = (BufferedImage)projectInfo0.getLogo();
      assertEquals(0, bufferedImage1.getMinY());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      projectInfo0.setLicenceText("The 'seriesKey' cannot be null.");
      String string0 = projectInfo0.getLicenceText();
      assertEquals("The 'seriesKey' cannot be null.", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo("Unknown 'series' key.", "Unknown 'series' key.", "", (Image) null, "", "Unknown 'series' key.", "");
      String string0 = projectInfo0.getLicenceText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      Stack<JPanel> stack0 = new Stack<JPanel>();
      projectInfo0.setContributors(stack0);
      List list0 = projectInfo0.getContributors();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      Stack<String> stack0 = new Stack<String>();
      stack0.add("org.jfree.data.xy.DefaultIntervalXYDataset version :.\nnull.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:null\nCONTRIBUTORS:None\nOTHER LIBRARIES USED BY org.jfree.data.xy.DefaultIntervalXYDataset:None\norg.jfree.data.xy.DefaultIntervalXYDataset LICENCE TERMS:\nnull");
      projectInfo0.setContributors(stack0);
      List list0 = projectInfo0.getContributors();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      ArrayList<TimeSeriesTableModel> arrayList0 = new ArrayList<TimeSeriesTableModel>();
      arrayList0.add((TimeSeriesTableModel) null);
      projectInfo0.setContributors(arrayList0);
      // Undeclared exception!
      try { 
        projectInfo0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.ui.ProjectInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      ArrayList<RoundingMode> arrayList0 = new ArrayList<RoundingMode>();
      RoundingMode roundingMode0 = RoundingMode.HALF_UP;
      arrayList0.add(roundingMode0);
      projectInfo0.setContributors(arrayList0);
      // Undeclared exception!
      try { 
        projectInfo0.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.math.RoundingMode cannot be cast to org.jfree.chart.ui.Contributor
         //
         verifyException("org.jfree.chart.ui.ProjectInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      String string0 = projectInfo0.getLicenceText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo("", "", "", (Image) null, "", "", "");
      projectInfo0.addLibrary(projectInfo0);
      String string0 = projectInfo0.toString();
      assertEquals(" version .\n.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:\nCONTRIBUTORS:None\nOTHER LIBRARIES USED BY :  ().\n LICENCE TERMS:\n", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      ArrayList<Contributor> arrayList0 = new ArrayList<Contributor>();
      Contributor contributor0 = new Contributor("5", ",GDH]`L^B;C+");
      arrayList0.add(contributor0);
      projectInfo0.setContributors(arrayList0);
      String string0 = projectInfo0.toString();
      assertEquals("null version null.\nnull.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:null\nCONTRIBUTORS:5 (,GDH]`L^B;C+).\nOTHER LIBRARIES USED BY null:None\nnull LICENCE TERMS:\nnull", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      List list0 = projectInfo0.getContributors();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo("", "", "", (Image) null, "", "", "");
      projectInfo0.setLogo((Image) null);
      assertEquals("", projectInfo0.getInfo());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProjectInfo projectInfo0 = new ProjectInfo();
      Image image0 = projectInfo0.getLogo();
      assertNull(image0);
  }
}
