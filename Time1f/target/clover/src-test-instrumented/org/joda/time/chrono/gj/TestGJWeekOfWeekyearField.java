/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2005 Stephen Colebourne
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
package org.joda.time.chrono.gj;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

/**
 * 
 * @author Brian S O'Neill
 */
class TestGJWeekOfWeekyearField extends TestGJDateTimeField {static class __CLR4_4_115911591l6loyrmu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1660019859356L,8589935092L,53484,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public TestGJWeekOfWeekyearField(TestGJChronology chrono) {
        super(DateTimeFieldType.weekOfWeekyear(),
              (long)(TestGJChronology.MILLIS_PER_DAY * 7), chrono);__CLR4_4_115911591l6loyrmu.R.inc(53462);try{__CLR4_4_115911591l6loyrmu.R.inc(53461);
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public int get(long millis) {try{__CLR4_4_115911591l6loyrmu.R.inc(53463);
        __CLR4_4_115911591l6loyrmu.R.inc(53464);return iChronology.isoFromMillis(millis)[1];
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public long set(long millis, int value) {try{__CLR4_4_115911591l6loyrmu.R.inc(53465);
        __CLR4_4_115911591l6loyrmu.R.inc(53466);int[] wwd = iChronology.isoFromMillis(millis);
        __CLR4_4_115911591l6loyrmu.R.inc(53467);return iChronology.getTimeOnlyMillis(millis)
            + iChronology.millisFromISO(wwd[0], value, wwd[2]);
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public long add(long millis, long value) {try{__CLR4_4_115911591l6loyrmu.R.inc(53468);
        __CLR4_4_115911591l6loyrmu.R.inc(53469);return iChronology.dayOfYear().add(millis, value * 7);
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public DurationField getRangeDurationField() {try{__CLR4_4_115911591l6loyrmu.R.inc(53470);
        __CLR4_4_115911591l6loyrmu.R.inc(53471);return iChronology.weeks();
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public int getMinimumValue() {try{__CLR4_4_115911591l6loyrmu.R.inc(53472);
        __CLR4_4_115911591l6loyrmu.R.inc(53473);return 1;
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public int getMaximumValue() {try{__CLR4_4_115911591l6loyrmu.R.inc(53474);
        __CLR4_4_115911591l6loyrmu.R.inc(53475);return 53;
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public int getMaximumValue(long millis) {try{__CLR4_4_115911591l6loyrmu.R.inc(53476);
        // Move millis to end of weekyear.
        __CLR4_4_115911591l6loyrmu.R.inc(53477);millis = iChronology.weekyear().roundFloor(millis);
        __CLR4_4_115911591l6loyrmu.R.inc(53478);millis = iChronology.weekyear().add(millis, 1);
        __CLR4_4_115911591l6loyrmu.R.inc(53479);millis = iChronology.dayOfYear().add(millis, -1);
        __CLR4_4_115911591l6loyrmu.R.inc(53480);return get(millis);
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}

    public long roundFloor(long millis) {try{__CLR4_4_115911591l6loyrmu.R.inc(53481);
        __CLR4_4_115911591l6loyrmu.R.inc(53482);int[] wwd = iChronology.isoFromMillis(millis);
        __CLR4_4_115911591l6loyrmu.R.inc(53483);return iChronology.millisFromISO(wwd[0], wwd[1], 1);
    }finally{__CLR4_4_115911591l6loyrmu.R.flushNeeded();}}
}
