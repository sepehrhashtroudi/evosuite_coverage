var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":401,"id":61432,"methods":[{"el":45,"sc":5,"sl":43},{"el":49,"sc":5,"sl":47},{"el":53,"sc":5,"sl":51},{"el":58,"sc":5,"sl":55},{"el":63,"sc":5,"sl":60},{"el":71,"sc":5,"sl":66},{"el":79,"sc":5,"sl":76},{"el":85,"sc":5,"sl":82},{"el":91,"sc":5,"sl":88},{"el":97,"sc":5,"sl":94},{"el":103,"sc":5,"sl":100},{"el":113,"sc":5,"sl":106},{"el":118,"sc":5,"sl":116},{"el":126,"sc":5,"sl":123},{"el":134,"sc":5,"sl":131},{"el":140,"sc":5,"sl":137},{"el":146,"sc":5,"sl":143},{"el":152,"sc":5,"sl":149},{"el":158,"sc":5,"sl":155},{"el":163,"sc":5,"sl":161},{"el":171,"sc":5,"sl":168},{"el":177,"sc":5,"sl":174},{"el":183,"sc":5,"sl":180},{"el":189,"sc":5,"sl":186},{"el":195,"sc":5,"sl":192},{"el":200,"sc":5,"sl":198},{"el":208,"sc":5,"sl":205},{"el":214,"sc":5,"sl":211},{"el":220,"sc":5,"sl":217},{"el":226,"sc":5,"sl":223},{"el":232,"sc":5,"sl":229},{"el":237,"sc":5,"sl":235},{"el":245,"sc":5,"sl":242},{"el":251,"sc":5,"sl":248},{"el":257,"sc":5,"sl":254},{"el":263,"sc":5,"sl":260},{"el":269,"sc":5,"sl":266},{"el":274,"sc":5,"sl":272},{"el":282,"sc":5,"sl":279},{"el":288,"sc":5,"sl":285},{"el":294,"sc":5,"sl":291},{"el":300,"sc":5,"sl":297},{"el":306,"sc":5,"sl":303},{"el":311,"sc":5,"sl":309},{"el":319,"sc":5,"sl":316},{"el":325,"sc":5,"sl":322},{"el":330,"sc":5,"sl":328},{"el":338,"sc":5,"sl":335},{"el":344,"sc":5,"sl":341},{"el":349,"sc":5,"sl":347},{"el":355,"sc":5,"sl":352},{"el":361,"sc":5,"sl":358},{"el":372,"sc":5,"sl":364},{"el":381,"sc":5,"sl":377},{"el":387,"sc":5,"sl":383},{"el":393,"sc":5,"sl":389},{"el":399,"sc":5,"sl":395}],"name":"TestPeriodFormat","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":106}],"name":"test_getDefault_checkRedundantSeparator","pass":true,"statements":[{"sl":107},{"sl":108},{"sl":111}]},"test_1090":{"methods":[{"sl":211}],"name":"test_wordBased_es_FormatOneField","pass":true,"statements":[{"sl":212},{"sl":213}]},"test_1234":{"methods":[{"sl":161}],"name":"test_wordBased_fr_cached","pass":true,"statements":[{"sl":162}]},"test_1322":{"methods":[{"sl":377}],"name":"test_wordBased_fr_from_de","pass":true,"statements":[{"sl":378},{"sl":379},{"sl":380}]},"test_1381":{"methods":[{"sl":66}],"name":"testSubclassableConstructor","pass":true,"statements":[{"sl":67},{"sl":70}]},"test_1411":{"methods":[{"sl":143}],"name":"test_wordBased_fr_formatTwoFields","pass":true,"statements":[{"sl":144},{"sl":145}]},"test_1424":{"methods":[{"sl":131}],"name":"test_wordBased_fr_formatStandard","pass":true,"statements":[{"sl":132},{"sl":133}]},"test_1455":{"methods":[{"sl":235}],"name":"test_wordBased_es_cached","pass":true,"statements":[{"sl":236}]},"test_1466":{"methods":[{"sl":168}],"name":"test_wordBased_pt_formatStandard","pass":true,"statements":[{"sl":169},{"sl":170}]},"test_1538":{"methods":[{"sl":341}],"name":"test_wordBased_ja_formatSingular","pass":true,"statements":[{"sl":342},{"sl":343}]},"test_1675":{"methods":[{"sl":383}],"name":"test_wordBased_fr_from_nl","pass":true,"statements":[{"sl":384},{"sl":385},{"sl":386}]},"test_1718":{"methods":[{"sl":223}],"name":"test_wordBased_es_parseOneField","pass":true,"statements":[{"sl":224},{"sl":225}]},"test_1857":{"methods":[{"sl":335}],"name":"test_wordBased_ja_formatMultiple","pass":true,"statements":[{"sl":336},{"sl":337}]},"test_1883":{"methods":[{"sl":364}],"name":"test_wordBased_ja_checkRedundantSeparator","pass":true,"statements":[{"sl":365},{"sl":367},{"sl":370}]},"test_196":{"methods":[{"sl":309}],"name":"test_wordBased_nl_cached","pass":true,"statements":[{"sl":310}]},"test_200":{"methods":[{"sl":303}],"name":"test_wordBased_nl_parseTwoFields","pass":true,"statements":[{"sl":304},{"sl":305}]},"test_2229":{"methods":[{"sl":347}],"name":"test_wordBased_ja_cached","pass":true,"statements":[{"sl":348}]},"test_2292":{"methods":[{"sl":88}],"name":"test_getDefault_formatTwoFields","pass":true,"statements":[{"sl":89},{"sl":90}]},"test_2331":{"methods":[{"sl":76}],"name":"test_getDefault_formatStandard","pass":true,"statements":[{"sl":77},{"sl":78}]},"test_2356":{"methods":[{"sl":205}],"name":"test_wordBased_es_formatStandard","pass":true,"statements":[{"sl":206},{"sl":207}]},"test_2380":{"methods":[{"sl":186}],"name":"test_wordBased_pt_parseOneField","pass":true,"statements":[{"sl":187},{"sl":188}]},"test_2428":{"methods":[{"sl":180}],"name":"test_wordBased_pt_formatTwoFields","pass":true,"statements":[{"sl":181},{"sl":182}]},"test_2471":{"methods":[{"sl":100}],"name":"test_getDefault_parseTwoFields","pass":true,"statements":[{"sl":101},{"sl":102}]},"test_2857":{"methods":[{"sl":254}],"name":"test_wordBased_de_formatTwoFields","pass":true,"statements":[{"sl":255},{"sl":256}]},"test_291":{"methods":[{"sl":229}],"name":"test_wordBased_es_parseTwoFields","pass":true,"statements":[{"sl":230},{"sl":231}]},"test_3005":{"methods":[{"sl":352}],"name":"test_wordBased_ja_parseOneField","pass":true,"statements":[{"sl":353},{"sl":354}]},"test_3023":{"methods":[{"sl":291}],"name":"test_wordBased_nl_formatTwoFields","pass":true,"statements":[{"sl":292},{"sl":293}]},"test_312":{"methods":[{"sl":149}],"name":"test_wordBased_fr_parseOneField","pass":true,"statements":[{"sl":150},{"sl":151}]},"test_313":{"methods":[{"sl":328}],"name":"test_wordBased_da_cached","pass":true,"statements":[{"sl":329}]},"test_3130":{"methods":[{"sl":123}],"name":"test_wordBased_default","pass":true,"statements":[{"sl":124},{"sl":125}]},"test_3148":{"methods":[{"sl":266}],"name":"test_wordBased_de_parseTwoFields","pass":true,"statements":[{"sl":267},{"sl":268}]},"test_3185":{"methods":[{"sl":116}],"name":"test_getDefault_cached","pass":true,"statements":[{"sl":117}]},"test_3227":{"methods":[{"sl":389}],"name":"test_wordBased_en_from_de","pass":true,"statements":[{"sl":390},{"sl":391},{"sl":392}]},"test_331":{"methods":[{"sl":395}],"name":"test_wordBased_en_from_nl","pass":true,"statements":[{"sl":396},{"sl":397},{"sl":398}]},"test_3313":{"methods":[{"sl":198}],"name":"test_wordBased_pt_cached","pass":true,"statements":[{"sl":199}]},"test_3361":{"methods":[{"sl":94}],"name":"test_getDefault_parseOneField","pass":true,"statements":[{"sl":95},{"sl":96}]},"test_3378":{"methods":[{"sl":260}],"name":"test_wordBased_de_parseOneField","pass":true,"statements":[{"sl":261},{"sl":262}]},"test_3634":{"methods":[{"sl":82}],"name":"test_getDefault_FormatOneField","pass":true,"statements":[{"sl":83},{"sl":84}]},"test_3734":{"methods":[{"sl":297}],"name":"test_wordBased_nl_parseOneField","pass":true,"statements":[{"sl":298},{"sl":299}]},"test_3812":{"methods":[{"sl":316}],"name":"test_wordBased_da_formatMultiple","pass":true,"statements":[{"sl":317},{"sl":318}]},"test_3830":{"methods":[{"sl":137}],"name":"test_wordBased_fr_FormatOneField","pass":true,"statements":[{"sl":138},{"sl":139}]},"test_3874":{"methods":[{"sl":248}],"name":"test_wordBased_de_FormatOneField","pass":true,"statements":[{"sl":249},{"sl":250}]},"test_3889":{"methods":[{"sl":217}],"name":"test_wordBased_es_formatTwoFields","pass":true,"statements":[{"sl":218},{"sl":219}]},"test_3944":{"methods":[{"sl":174}],"name":"test_wordBased_pt_FormatOneField","pass":true,"statements":[{"sl":175},{"sl":176}]},"test_3978":{"methods":[{"sl":279}],"name":"test_wordBased_nl_formatStandard","pass":true,"statements":[{"sl":280},{"sl":281}]},"test_475":{"methods":[{"sl":322}],"name":"test_wordBased_da_formatSinglular","pass":true,"statements":[{"sl":323},{"sl":324}]},"test_476":{"methods":[{"sl":192}],"name":"test_wordBased_pt_parseTwoFields","pass":true,"statements":[{"sl":193},{"sl":194}]},"test_575":{"methods":[{"sl":285}],"name":"test_wordBased_nl_FormatOneField","pass":true,"statements":[{"sl":286},{"sl":287}]},"test_799":{"methods":[{"sl":358}],"name":"test_wordBased_ja_parseTwoFields","pass":true,"statements":[{"sl":359},{"sl":360}]},"test_845":{"methods":[{"sl":155}],"name":"test_wordBased_fr_parseTwoFields","pass":true,"statements":[{"sl":156},{"sl":157}]},"test_893":{"methods":[{"sl":242}],"name":"test_wordBased_de_formatStandard","pass":true,"statements":[{"sl":243},{"sl":244}]},"test_925":{"methods":[{"sl":272}],"name":"test_wordBased_de_cached","pass":true,"statements":[{"sl":273}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1381], [1381], [], [], [1381], [], [], [], [], [], [2331], [2331], [2331], [], [], [], [3634], [3634], [3634], [], [], [], [2292], [2292], [2292], [], [], [], [3361], [3361], [3361], [], [], [], [2471], [2471], [2471], [], [], [], [10], [10], [10], [], [], [10], [], [], [], [], [3185], [3185], [], [], [], [], [], [3130], [3130], [3130], [], [], [], [], [], [1424], [1424], [1424], [], [], [], [3830], [3830], [3830], [], [], [], [1411], [1411], [1411], [], [], [], [312], [312], [312], [], [], [], [845], [845], [845], [], [], [], [1234], [1234], [], [], [], [], [], [1466], [1466], [1466], [], [], [], [3944], [3944], [3944], [], [], [], [2428], [2428], [2428], [], [], [], [2380], [2380], [2380], [], [], [], [476], [476], [476], [], [], [], [3313], [3313], [], [], [], [], [], [2356], [2356], [2356], [], [], [], [1090], [1090], [1090], [], [], [], [3889], [3889], [3889], [], [], [], [1718], [1718], [1718], [], [], [], [291], [291], [291], [], [], [], [1455], [1455], [], [], [], [], [], [893], [893], [893], [], [], [], [3874], [3874], [3874], [], [], [], [2857], [2857], [2857], [], [], [], [3378], [3378], [3378], [], [], [], [3148], [3148], [3148], [], [], [], [925], [925], [], [], [], [], [], [3978], [3978], [3978], [], [], [], [575], [575], [575], [], [], [], [3023], [3023], [3023], [], [], [], [3734], [3734], [3734], [], [], [], [200], [200], [200], [], [], [], [196], [196], [], [], [], [], [], [3812], [3812], [3812], [], [], [], [475], [475], [475], [], [], [], [313], [313], [], [], [], [], [], [1857], [1857], [1857], [], [], [], [1538], [1538], [1538], [], [], [], [2229], [2229], [], [], [], [3005], [3005], [3005], [], [], [], [799], [799], [799], [], [], [], [1883], [1883], [], [1883], [], [], [1883], [], [], [], [], [], [], [1322], [1322], [1322], [1322], [], [], [1675], [1675], [1675], [1675], [], [], [3227], [3227], [3227], [3227], [], [], [331], [331], [331], [331], [], [], []]