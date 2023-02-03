/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*
 *  Copyright 2001-2013 Stephen Colebourne
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
package org.joda.time.tz;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import org.joda.time.DateTimeZone;

/**
 * ZoneInfoProvider loads compiled data files as generated by
 * {@link ZoneInfoCompiler}.
 * <p>
 * ZoneInfoProvider is thread-safe and publicly immutable.
 *
 * @author Brian S O'Neill
 * @since 1.0
 */
public class ZoneInfoProvider implements Provider {public static class __CLR4_4_1gitgitl6loyozf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u0061\u006c\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005f\u0063\u006f\u0076\u0065\u0072\u0061\u0067\u0065\u002f\u0054\u0069\u006d\u0065\u0031\u0066\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1660019856889L,8589935092L,21538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The directory where the files are held. */
    private final File iFileDir;
    /** The resource path. */
    private final String iResourcePath;
    /** The class loader to use. */
    private final ClassLoader iLoader;
    /** Maps ids to strings or SoftReferences to DateTimeZones. */
    private final Map<String, Object> iZoneInfoMap;

    /**
     * ZoneInfoProvider searches the given directory for compiled data files.
     *
     * @throws IOException if directory or map file cannot be read
     */
    public ZoneInfoProvider(File fileDir) throws IOException {try{__CLR4_4_1gitgitl6loyozf.R.inc(21413);
        __CLR4_4_1gitgitl6loyozf.R.inc(21414);if ((((fileDir == null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21415)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21416)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21417);throw new IllegalArgumentException("No file directory provided");
        }
        }__CLR4_4_1gitgitl6loyozf.R.inc(21418);if ((((!fileDir.exists())&&(__CLR4_4_1gitgitl6loyozf.R.iget(21419)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21420)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21421);throw new IOException("File directory doesn't exist: " + fileDir);
        }
        }__CLR4_4_1gitgitl6loyozf.R.inc(21422);if ((((!fileDir.isDirectory())&&(__CLR4_4_1gitgitl6loyozf.R.iget(21423)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21424)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21425);throw new IOException("File doesn't refer to a directory: " + fileDir);
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21426);iFileDir = fileDir;
        __CLR4_4_1gitgitl6loyozf.R.inc(21427);iResourcePath = null;
        __CLR4_4_1gitgitl6loyozf.R.inc(21428);iLoader = null;

        __CLR4_4_1gitgitl6loyozf.R.inc(21429);iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * ZoneInfoProvider searches the given ClassLoader resource path for
     * compiled data files. Resources are loaded from the ClassLoader that
     * loaded this class.
     *
     * @throws IOException if directory or map file cannot be read
     */
    public ZoneInfoProvider(String resourcePath) throws IOException {
        this(resourcePath, null, false);__CLR4_4_1gitgitl6loyozf.R.inc(21431);try{__CLR4_4_1gitgitl6loyozf.R.inc(21430);
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * ZoneInfoProvider searches the given ClassLoader resource path for
     * compiled data files.
     *
     * @param loader ClassLoader to load compiled data files from. If null,
     * use system ClassLoader.
     * @throws IOException if directory or map file cannot be read
     */
    public ZoneInfoProvider(String resourcePath, ClassLoader loader)
        throws IOException
    {
        this(resourcePath, loader, true);__CLR4_4_1gitgitl6loyozf.R.inc(21433);try{__CLR4_4_1gitgitl6loyozf.R.inc(21432);
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * @param favorSystemLoader when true, use the system class loader if
     * loader null. When false, use the current class loader if loader is null.
     */
    private ZoneInfoProvider(String resourcePath,
                             ClassLoader loader, boolean favorSystemLoader) 
        throws IOException
    {try{__CLR4_4_1gitgitl6loyozf.R.inc(21434);
        __CLR4_4_1gitgitl6loyozf.R.inc(21435);if ((((resourcePath == null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21436)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21437)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21438);throw new IllegalArgumentException("No resource path provided");
        }
        }__CLR4_4_1gitgitl6loyozf.R.inc(21439);if ((((!resourcePath.endsWith("/"))&&(__CLR4_4_1gitgitl6loyozf.R.iget(21440)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21441)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21442);resourcePath += '/';
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21443);iFileDir = null;
        __CLR4_4_1gitgitl6loyozf.R.inc(21444);iResourcePath = resourcePath;

        __CLR4_4_1gitgitl6loyozf.R.inc(21445);if ((((loader == null && !favorSystemLoader)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21446)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21447)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21448);loader = getClass().getClassLoader();
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21449);iLoader = loader;

        __CLR4_4_1gitgitl6loyozf.R.inc(21450);iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * If an error is thrown while loading zone data, the exception is logged
     * to system error and null is returned for this and all future requests.
     * 
     * @param id  the id to load
     * @return the loaded zone
     */
    public DateTimeZone getZone(String id) {try{__CLR4_4_1gitgitl6loyozf.R.inc(21451);
        __CLR4_4_1gitgitl6loyozf.R.inc(21452);if ((((id == null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21453)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21454)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21455);return null;
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21456);Object obj = iZoneInfoMap.get(id);
        __CLR4_4_1gitgitl6loyozf.R.inc(21457);if ((((obj == null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21458)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21459)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21460);return null;
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21461);if ((((id.equals(obj))&&(__CLR4_4_1gitgitl6loyozf.R.iget(21462)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21463)==0&false))) {{
            // Load zone data for the first time.
            __CLR4_4_1gitgitl6loyozf.R.inc(21464);return loadZoneData(id);
        }

        }__CLR4_4_1gitgitl6loyozf.R.inc(21465);if ((((obj instanceof SoftReference<?>)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21466)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21467)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21468);@SuppressWarnings("unchecked")
            SoftReference<DateTimeZone> ref = (SoftReference<DateTimeZone>) obj;
            __CLR4_4_1gitgitl6loyozf.R.inc(21469);DateTimeZone tz = ref.get();
            __CLR4_4_1gitgitl6loyozf.R.inc(21470);if ((((tz != null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21471)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21472)==0&false))) {{
                __CLR4_4_1gitgitl6loyozf.R.inc(21473);return tz;
            }
            // Reference cleared; load data again.
            }__CLR4_4_1gitgitl6loyozf.R.inc(21474);return loadZoneData(id);
        }

        // If this point is reached, mapping must link to another.
        }__CLR4_4_1gitgitl6loyozf.R.inc(21475);return getZone((String)obj);
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * Gets a list of all the available zone ids.
     * 
     * @return the zone ids
     */
    public Set<String> getAvailableIDs() {try{__CLR4_4_1gitgitl6loyozf.R.inc(21476);
        // Return a copy of the keys rather than an umodifiable collection.
        // This prevents ConcurrentModificationExceptions from being thrown by
        // some JVMs if zones are opened while this set is iterated over.
        __CLR4_4_1gitgitl6loyozf.R.inc(21477);return new TreeSet<String>(iZoneInfoMap.keySet());
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * Called if an exception is thrown from getZone while loading zone data.
     * 
     * @param ex  the exception
     */
    protected void uncaughtException(Exception ex) {try{__CLR4_4_1gitgitl6loyozf.R.inc(21478);
        __CLR4_4_1gitgitl6loyozf.R.inc(21479);ex.printStackTrace();
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * Opens a resource from file or classpath.
     * 
     * @param name  the name to open
     * @return the input stream
     * @throws IOException if an error occurs
     */
    @SuppressWarnings("resource")
    private InputStream openResource(String name) throws IOException {try{__CLR4_4_1gitgitl6loyozf.R.inc(21480);
        __CLR4_4_1gitgitl6loyozf.R.inc(21481);InputStream in;
        __CLR4_4_1gitgitl6loyozf.R.inc(21482);if ((((iFileDir != null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21483)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21484)==0&false))) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21485);in = new FileInputStream(new File(iFileDir, name));
        } }else {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21486);String path = iResourcePath.concat(name);
            __CLR4_4_1gitgitl6loyozf.R.inc(21487);if ((((iLoader != null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21488)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21489)==0&false))) {{
                __CLR4_4_1gitgitl6loyozf.R.inc(21490);in = iLoader.getResourceAsStream(path);
            } }else {{
                __CLR4_4_1gitgitl6loyozf.R.inc(21491);in = ClassLoader.getSystemResourceAsStream(path);
            }
            }__CLR4_4_1gitgitl6loyozf.R.inc(21492);if ((((in == null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21493)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21494)==0&false))) {{
                __CLR4_4_1gitgitl6loyozf.R.inc(21495);StringBuilder buf = new StringBuilder(40)
                    .append("Resource not found: \"")
                    .append(path)
                    .append("\" ClassLoader: ")
                    .append((((iLoader != null )&&(__CLR4_4_1gitgitl6loyozf.R.iget(21496)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21497)==0&false))? iLoader.toString() : "system");
                __CLR4_4_1gitgitl6loyozf.R.inc(21498);throw new IOException(buf.toString());
            }
        }}
        }__CLR4_4_1gitgitl6loyozf.R.inc(21499);return in;
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * Loads the time zone data for one id.
     * 
     * @param id  the id to load
     * @return the zone
     */
    private DateTimeZone loadZoneData(String id) {try{__CLR4_4_1gitgitl6loyozf.R.inc(21500);
        __CLR4_4_1gitgitl6loyozf.R.inc(21501);InputStream in = null;
        __CLR4_4_1gitgitl6loyozf.R.inc(21502);try {
            __CLR4_4_1gitgitl6loyozf.R.inc(21503);in = openResource(id);
            __CLR4_4_1gitgitl6loyozf.R.inc(21504);DateTimeZone tz = DateTimeZoneBuilder.readFrom(in, id);
            __CLR4_4_1gitgitl6loyozf.R.inc(21505);iZoneInfoMap.put(id, new SoftReference<DateTimeZone>(tz));
            __CLR4_4_1gitgitl6loyozf.R.inc(21506);return tz;
        } catch (IOException ex) {
            __CLR4_4_1gitgitl6loyozf.R.inc(21507);uncaughtException(ex);
            __CLR4_4_1gitgitl6loyozf.R.inc(21508);iZoneInfoMap.remove(id);
            __CLR4_4_1gitgitl6loyozf.R.inc(21509);return null;
        } finally {
            __CLR4_4_1gitgitl6loyozf.R.inc(21510);try {
                __CLR4_4_1gitgitl6loyozf.R.inc(21511);if ((((in != null)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21512)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21513)==0&false))) {{
                    __CLR4_4_1gitgitl6loyozf.R.inc(21514);in.close();
                }
            }} catch (IOException ex) {
            }
        }
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Loads the zone info map.
     * 
     * @param in  the input stream
     * @return the map
     */
    private static Map<String, Object> loadZoneInfoMap(InputStream in) throws IOException {try{__CLR4_4_1gitgitl6loyozf.R.inc(21515);
        __CLR4_4_1gitgitl6loyozf.R.inc(21516);Map<String, Object> map = new ConcurrentHashMap<String, Object>();
        __CLR4_4_1gitgitl6loyozf.R.inc(21517);DataInputStream din = new DataInputStream(in);
        __CLR4_4_1gitgitl6loyozf.R.inc(21518);try {
            __CLR4_4_1gitgitl6loyozf.R.inc(21519);readZoneInfoMap(din, map);
        } finally {
            __CLR4_4_1gitgitl6loyozf.R.inc(21520);try {
                __CLR4_4_1gitgitl6loyozf.R.inc(21521);din.close();
            } catch (IOException ex) {
            }
        }
        __CLR4_4_1gitgitl6loyozf.R.inc(21522);map.put("UTC", new SoftReference<DateTimeZone>(DateTimeZone.UTC));
        __CLR4_4_1gitgitl6loyozf.R.inc(21523);return map;
    }finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

    /**
     * Reads the zone info map from file.
     * 
     * @param din  the input stream
     * @param zimap  gets filled with string id to string id mappings
     */
    private static void readZoneInfoMap(DataInputStream din, Map<String, Object> zimap) throws IOException {try{__CLR4_4_1gitgitl6loyozf.R.inc(21524);
        // Read the string pool.
        __CLR4_4_1gitgitl6loyozf.R.inc(21525);int size = din.readUnsignedShort();
        __CLR4_4_1gitgitl6loyozf.R.inc(21526);String[] pool = new String[size];
        __CLR4_4_1gitgitl6loyozf.R.inc(21527);for (int i=0; (((i<size)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21528)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21529)==0&false)); i++) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21530);pool[i] = din.readUTF().intern();
        }

        // Read the mappings.
        }__CLR4_4_1gitgitl6loyozf.R.inc(21531);size = din.readUnsignedShort();
        __CLR4_4_1gitgitl6loyozf.R.inc(21532);for (int i=0; (((i<size)&&(__CLR4_4_1gitgitl6loyozf.R.iget(21533)!=0|true))||(__CLR4_4_1gitgitl6loyozf.R.iget(21534)==0&false)); i++) {{
            __CLR4_4_1gitgitl6loyozf.R.inc(21535);try {
                __CLR4_4_1gitgitl6loyozf.R.inc(21536);zimap.put(pool[din.readUnsignedShort()], pool[din.readUnsignedShort()]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                __CLR4_4_1gitgitl6loyozf.R.inc(21537);throw new IOException("Corrupt zone info map");
            }
        }
    }}finally{__CLR4_4_1gitgitl6loyozf.R.flushNeeded();}}

}