/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2006 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.format;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Entry point for all tests in this package.
 * 
 * @version $Revision$ $Date$
 * 
 * @author Stephen Colebourne
 */
public class TestAll extends TestCase {static class __CLR4_4_118nb18nbl6loys09{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1660019859356L,8589935092L,57885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public TestAll(String testName) {
        super(testName);__CLR4_4_118nb18nbl6loys09.R.inc(57864);try{__CLR4_4_118nb18nbl6loys09.R.inc(57863);
    }finally{__CLR4_4_118nb18nbl6loys09.R.flushNeeded();}}

    public static Test suite() {try{__CLR4_4_118nb18nbl6loys09.R.inc(57865);
        __CLR4_4_118nb18nbl6loys09.R.inc(57866);TestSuite suite = new TestSuite();
        
        __CLR4_4_118nb18nbl6loys09.R.inc(57867);suite.addTest(TestDateTimeFormatter.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57868);suite.addTest(TestDateTimeFormat.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57869);suite.addTest(TestDateTimeFormatStyle.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57870);suite.addTest(TestISODateTimeFormat.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57871);suite.addTest(TestISODateTimeFormat_Fields.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57872);suite.addTest(TestISODateTimeFormatParsing.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57873);suite.addTest(TestDateTimeFormatterBuilder.suite());
        
        __CLR4_4_118nb18nbl6loys09.R.inc(57874);suite.addTest(TestPeriodFormatter.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57875);suite.addTest(TestPeriodFormat.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57876);suite.addTest(TestISOPeriodFormat.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57877);suite.addTest(TestISOPeriodFormatParsing.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57878);suite.addTest(TestPeriodFormatParsing.suite());
        __CLR4_4_118nb18nbl6loys09.R.inc(57879);suite.addTest(TestPeriodFormatterBuilder.suite());

        __CLR4_4_118nb18nbl6loys09.R.inc(57880);suite.addTest(TestTextFields.suite());

        __CLR4_4_118nb18nbl6loys09.R.inc(57881);return suite;
    }finally{__CLR4_4_118nb18nbl6loys09.R.flushNeeded();}}

    public static void main(String args[]) {try{__CLR4_4_118nb18nbl6loys09.R.inc(57882);
        __CLR4_4_118nb18nbl6loys09.R.inc(57883);String[] testCaseName = {
            TestAll.class.getName()
        };
        __CLR4_4_118nb18nbl6loys09.R.inc(57884);junit.textui.TestRunner.main(testCaseName);
    }finally{__CLR4_4_118nb18nbl6loys09.R.flushNeeded();}}

}
