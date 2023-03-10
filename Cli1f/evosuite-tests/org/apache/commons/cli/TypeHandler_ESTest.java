/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 20 01:02:47 GMT 2022
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.net.URL;
import java.util.Date;
import org.apache.commons.cli.TypeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<String> class0 = String.class;
      Object object0 = TypeHandler.createValue("", (Object) class0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.TypeHandler");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      File file0 = TypeHandler.createFile(".5=3[e>$bbAn?>!f[");
      assertEquals(0L, file0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertFalse(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = TypeHandler.createFile("/,_= ZK:o@f2:u_*");
      assertEquals("/", file0.getParent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("#KNHbmO^}kPm}j-({I");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "v09[(\"Sq1?");
      File file0 = TypeHandler.createFile("#KNHbmO^}kPm}j-({I");
      assertEquals(0L, file0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class class0 = TypeHandler.createClass("org.apache.commons.cli.PatternOptionBuilder");
      assertEquals("class org.apache.commons.cli.PatternOptionBuilder", class0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createValue(")~'V", (Object) ")~'V");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Class
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeHandler.createValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object object0 = TypeHandler.createValue("D*_dGoK-cxy2(>6.", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Date date0 = TypeHandler.createDate("D*_dGoK-cxy2(>6.");
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue("", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<String> class0 = String.class;
      Object object0 = TypeHandler.createValue("D*_dGoK-cxy2(>6.", class0);
      assertEquals("D*_dGoK-cxy2(>6.", object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.AlreadySelectedException");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = TypeHandler.createURL("D*_dGoK-cxy2(>6.");
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File[] fileArray0 = TypeHandler.createFiles("D*_dGoK-cxy2(>6.");
      assertNull(fileArray0);
  }

//  @Test(timeout = 4000)
//  public void test20()  throws Throwable  {
//      // Undeclared exception!
//      try {
//        TypeHandler.createNumber("org.apache.commons.cli.AlreadySelectedException");
//        fail("Expecting exception: NoClassDefFoundError");
//
//      } catch(NoClassDefFoundError e) {
//         //
//         // org/apache/commons/lang/math/NumberUtils
//         //
//         verifyException("org.apache.commons.cli.TypeHandler", e);
//      }
//  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class class0 = TypeHandler.createClass("D*_dGoK-cxy2(>6.");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object object0 = TypeHandler.createValue("D*_dGoK-cxy2(>6.", (Object) class0);
      assertNull(object0);
  }
}
