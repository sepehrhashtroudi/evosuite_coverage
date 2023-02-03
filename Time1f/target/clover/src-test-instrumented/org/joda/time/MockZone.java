/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2007 Stephen Colebourne
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
package org.joda.time;

public class MockZone extends DateTimeZone {public static class __CLR4_4_1gnrgnrl6loyp44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1660019859356L,8589935092L,21616,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    long transition;
    int winterOffset;
    int sizeMillis;

    public MockZone(long transition, int winterOffset, int sizeSecs) {
        super("MockZone");__CLR4_4_1gnrgnrl6loyp44.R.inc(21592);try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21591);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21593);this.transition = transition;
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21594);this.winterOffset = winterOffset;
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21595);this.sizeMillis = sizeSecs * 1000;
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public int getOffset(long instant) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21596);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21597);return ((((instant < transition )&&(__CLR4_4_1gnrgnrl6loyp44.R.iget(21598)!=0|true))||(__CLR4_4_1gnrgnrl6loyp44.R.iget(21599)==0&false))? winterOffset : winterOffset + sizeMillis);
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public int getStandardOffset(long instant) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21600);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21601);return winterOffset;
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public long nextTransition(long instant) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21602);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21603);return ((((instant < transition )&&(__CLR4_4_1gnrgnrl6loyp44.R.iget(21604)!=0|true))||(__CLR4_4_1gnrgnrl6loyp44.R.iget(21605)==0&false))? transition : transition + 180L * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public long previousTransition(long instant) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21606);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21607);return ((((instant > transition )&&(__CLR4_4_1gnrgnrl6loyp44.R.iget(21608)!=0|true))||(__CLR4_4_1gnrgnrl6loyp44.R.iget(21609)==0&false))? transition : transition - 180L * DateTimeConstants.MILLIS_PER_DAY);
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public boolean isFixed() {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21610);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21611);return false;
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public String getNameKey(long instant) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21612);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21613);return null;
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}

    public boolean equals(Object object) {try{__CLR4_4_1gnrgnrl6loyp44.R.inc(21614);
        __CLR4_4_1gnrgnrl6loyp44.R.inc(21615);return false;
    }finally{__CLR4_4_1gnrgnrl6loyp44.R.flushNeeded();}}
}
