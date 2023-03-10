/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 26 19:46:08 GMT 2022
 */

package org.jfree.data.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDBCCategoryDataset_ESTest extends JDBCCategoryDataset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnCount();
      doReturn("JPRCv&^ZXw>>\"").when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(2).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Object) null).when(resultSet0).getObject(anyInt());
      doReturn((String) null).when(resultSet0).getString(anyInt());
      doReturn(true).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(2);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'columnKey' argument.
         //
         verifyException("org.jfree.data.KeyedObjects2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1174).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(0, 0, 0, 0, 0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSetMetaData resultSetMetaData1 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((String) null, (String) null, (String) null).when(resultSet0).getString(anyInt());
      doReturn(true, true, true, false).when(resultSet0).next();
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Statement statement1 = mock(Statement.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0, (Statement) null).when(connection0).createStatement();
      String string0 = "";
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
      jDBCCategoryDataset0.getRowCount();
      boolean boolean0 = true;
      jDBCCategoryDataset0.setTranspose(boolean0);
      jDBCCategoryDataset0.setTranspose(boolean0);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1174).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(0, 0, 0, 0, 0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSetMetaData resultSetMetaData1 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((String) null, (String) null).when(resultSet0).getString(anyInt());
      doReturn(true, true, false).when(resultSet0).next();
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Statement statement1 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(statement1).executeQuery(anyString());
      Statement statement2 = mock(Statement.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0, statement1).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "pVQ;S;R\"h\"2]]I eP");
      jDBCCategoryDataset0.getRowCount();
      jDBCCategoryDataset0.setTranspose(true);
      jDBCCategoryDataset0.setTranspose(true);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("pVQ;S;R\"h\"2]]I eP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      XYDatasetTableModel xYDatasetTableModel0 = new XYDatasetTableModel(timeTableXYDataset0);
      jDBCCategoryDataset0.removeChangeListener(xYDatasetTableModel0);
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(4530L);
      try { 
        jDBCCategoryDataset0.executeQuery("");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null).when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((String) null).when(resultSet0).getString(anyInt());
      doReturn(true, false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(2);
      jDBCCategoryDataset0.executeQuery(connection1, "");
      int int0 = 93;
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.removeRow(int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(2);
      jDBCCategoryDataset0.executeQuery(connection1, "");
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.removeRow(93);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1174).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      jDBCCategoryDataset0.executeQuery(connection1, "");
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.removeRow(93);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "");
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1174).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0, (Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      int int0 = jDBCCategoryDataset0.getRowCount();
      assertEquals(0, int0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      jDBCCategoryDataset0.setTranspose(true);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      jDBCCategoryDataset0.setTranspose(true);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnCount();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      String string0 = "";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // JDBCCategoryDataset.executeQuery() : insufficient columns returned from the database.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(statement0).executeQuery(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      String string0 = "org.jfree.data.xy.XYSeriesCollection";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "org.jfree.data.xy.XYSeriesCollection");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = "z)Vbj\\#=&L#H{Td";
      String string1 = "org.jfree.data.time.RegularTimePeriod";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("z)Vbj#=&L#H{Td", "org.jfree.data.time.RegularTimePeriod", "45Vu3%X", "45Vu3%X");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // No suitable driver found for z)Vbj#=&L#H{Td
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = "i7+#O)ACxO";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("i7+#O)ACxO", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.time.TimePeriodValuesCollection", "org.jfree.data.time.TimePeriodValuesCollection");
        fail("Expecting exception: SQLException");
      
      } catch(Throwable e) {
         //
         // No suitable driver found for i7+#O)ACxO
         //
         verifyException("java.sql.DriverManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      boolean boolean0 = jDBCCategoryDataset0.getTranspose();
      assertTrue(boolean0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Connection connection0 = null;
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((Connection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // A connection must be supplied.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = null;
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((String) null, (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection1).createStatement();
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery(connection1, "org.jfree.data.jdbc.JDBCCategoryDataset");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("|x_a", "|x_a", "|x_a", "");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset("DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.", "DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.", "DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.", "DefaultIntervalCategoryDataset: the number of categories in the start value dataset does not match the number of categories in the end value dataset.");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(Throwable e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((Connection) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // A connection must be supplied.
         //
         verifyException("org.jfree.data.jdbc.JDBCCategoryDataset", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      String string0 = "";
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnCount();
      doReturn("", "").when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(2, 2).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((Object) null, (Object) null).when(resultSet0).getObject(anyInt());
      doReturn("~U%bcl[)p2bGr", "jzQf:hDk").when(resultSet0).getString(anyInt());
      doReturn(true, true, false).when(resultSet0).next();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection1).createStatement();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(2);
      jDBCCategoryDataset0.executeQuery(connection1, "");
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.removeRow(93);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 93, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "";
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset((String) null, (String) null, (String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      assertNotNull(jDBCCategoryDataset0);
      assertTrue(jDBCCategoryDataset0.getTranspose());
      
      jDBCCategoryDataset0.setTranspose(false);
      assertFalse(jDBCCategoryDataset0.getTranspose());
      
      boolean boolean0 = jDBCCategoryDataset0.getTranspose();
      assertFalse(boolean0);
      assertFalse(jDBCCategoryDataset0.getTranspose());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = null;
      try {
        jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(1174).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSetMetaData0).getColumnName(anyInt());
      doReturn(0, 0, 0, 0, 0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn((String) null).when(resultSet0).getString(anyInt());
      doReturn(true, false).when(resultSet0).next();
      ResultSet resultSet1 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(statement0).executeQuery(anyString());
      Statement statement1 = mock(Statement.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0, (Statement) null).when(connection0).createStatement();
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0, "");
      jDBCCategoryDataset0.getRowCount();
      jDBCCategoryDataset0.setTranspose(true);
      jDBCCategoryDataset0.setTranspose(true);
      // Undeclared exception!
      try { 
        jDBCCategoryDataset0.executeQuery("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
