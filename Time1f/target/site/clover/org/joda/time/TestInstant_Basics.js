var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":593,"id":29513,"methods":[{"el":77,"sc":5,"sl":75},{"el":81,"sc":5,"sl":79},{"el":85,"sc":5,"sl":83},{"el":95,"sc":5,"sl":87},{"el":105,"sc":5,"sl":97},{"el":112,"sc":5,"sl":108},{"el":143,"sc":5,"sl":115},{"el":173,"sc":5,"sl":145},{"el":181,"sc":5,"sl":175},{"el":205,"sc":5,"sl":183},{"el":247,"sc":5,"sl":219},{"el":254,"sc":5,"sl":250},{"el":260,"sc":5,"sl":256},{"el":285,"sc":5,"sl":262},{"el":292,"sc":5,"sl":288},{"el":298,"sc":5,"sl":294},{"el":323,"sc":5,"sl":300},{"el":330,"sc":5,"sl":326},{"el":336,"sc":5,"sl":332},{"el":361,"sc":5,"sl":338},{"el":379,"sc":5,"sl":364},{"el":385,"sc":5,"sl":382},{"el":392,"sc":5,"sl":388},{"el":399,"sc":5,"sl":394},{"el":408,"sc":5,"sl":401},{"el":425,"sc":5,"sl":410},{"el":441,"sc":5,"sl":427},{"el":448,"sc":5,"sl":443},{"el":457,"sc":5,"sl":450},{"el":474,"sc":5,"sl":459},{"el":491,"sc":5,"sl":476},{"el":497,"sc":5,"sl":493},{"el":509,"sc":5,"sl":500},{"el":528,"sc":5,"sl":512},{"el":550,"sc":5,"sl":531},{"el":558,"sc":5,"sl":553},{"el":568,"sc":5,"sl":560},{"el":576,"sc":5,"sl":571},{"el":586,"sc":5,"sl":578},{"el":591,"sc":5,"sl":589}],"name":"TestInstant_Basics","sl":39},{"el":217,"id":29618,"methods":[{"el":210,"sc":9,"sl":208},{"el":213,"sc":9,"sl":211},{"el":216,"sc":9,"sl":214}],"name":"TestInstant_Basics.MockInstant","sl":207}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1198":{"methods":[{"sl":364}],"name":"testSerialization","pass":true,"statements":[{"sl":365},{"sl":367},{"sl":368},{"sl":369},{"sl":370},{"sl":371},{"sl":373},{"sl":374},{"sl":375},{"sl":376},{"sl":378}]},"test_1583":{"methods":[{"sl":326}],"name":"testIsAfter_long","pass":true,"statements":[{"sl":327},{"sl":328},{"sl":329}]},"test_1634":{"methods":[{"sl":571}],"name":"testMinus_long","pass":true,"statements":[{"sl":572},{"sl":573},{"sl":574},{"sl":575}]},"test_1727":{"methods":[{"sl":476}],"name":"testToMutableDateTime_Chronology","pass":true,"statements":[{"sl":477},{"sl":478},{"sl":479},{"sl":480},{"sl":482},{"sl":483},{"sl":484},{"sl":485},{"sl":487},{"sl":488},{"sl":489},{"sl":490}]},"test_175":{"methods":[{"sl":211},{"sl":219}],"name":"testCompareTo","pass":true,"statements":[{"sl":212},{"sl":220},{"sl":221},{"sl":222},{"sl":223},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":236},{"sl":237},{"sl":239},{"sl":240}]},"test_1759":{"methods":[{"sl":459}],"name":"testToMutableDateTime_DateTimeZone","pass":true,"statements":[{"sl":460},{"sl":461},{"sl":462},{"sl":463},{"sl":465},{"sl":466},{"sl":467},{"sl":468},{"sl":470},{"sl":471},{"sl":472},{"sl":473}]},"test_1858":{"methods":[{"sl":250}],"name":"testIsEqual_long","pass":true,"statements":[{"sl":251},{"sl":252},{"sl":253}]},"test_1874":{"methods":[{"sl":427}],"name":"testToDateTime_Chronology","pass":true,"statements":[{"sl":428},{"sl":429},{"sl":430},{"sl":431},{"sl":433},{"sl":434},{"sl":435},{"sl":436},{"sl":438},{"sl":439},{"sl":440}]},"test_1900":{"methods":[{"sl":256}],"name":"testIsEqualNow","pass":true,"statements":[{"sl":257},{"sl":258},{"sl":259}]},"test_2022":{"methods":[{"sl":553}],"name":"testPlus_long","pass":true,"statements":[{"sl":554},{"sl":555},{"sl":556},{"sl":557}]},"test_2140":{"methods":[{"sl":211},{"sl":262}],"name":"testIsEqual_RI","pass":true,"statements":[{"sl":212},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":270},{"sl":271},{"sl":272},{"sl":274},{"sl":275},{"sl":276},{"sl":277},{"sl":279},{"sl":280},{"sl":282},{"sl":283},{"sl":284}]},"test_2154":{"methods":[{"sl":512}],"name":"testWithDurationAdded_long_int","pass":true,"statements":[{"sl":513},{"sl":514},{"sl":515},{"sl":516},{"sl":518},{"sl":519},{"sl":521},{"sl":522},{"sl":523},{"sl":525},{"sl":526},{"sl":527}]},"test_2256":{"methods":[{"sl":578}],"name":"testMinus_RD","pass":true,"statements":[{"sl":579},{"sl":580},{"sl":581},{"sl":582},{"sl":584},{"sl":585}]},"test_2523":{"methods":[{"sl":108}],"name":"testTest","pass":true,"statements":[{"sl":109},{"sl":110},{"sl":111}]},"test_2545":{"methods":[{"sl":443}],"name":"testToMutableDateTime","pass":true,"statements":[{"sl":444},{"sl":445},{"sl":446},{"sl":447}]},"test_2572":{"methods":[{"sl":401}],"name":"testToDateTimeISO","pass":true,"statements":[{"sl":402},{"sl":403},{"sl":404},{"sl":405},{"sl":406},{"sl":407}]},"test_2643":{"methods":[{"sl":560}],"name":"testPlus_RD","pass":true,"statements":[{"sl":561},{"sl":562},{"sl":563},{"sl":564},{"sl":566},{"sl":567}]},"test_272":{"methods":[{"sl":183},{"sl":211},{"sl":214}],"name":"testEqualsHashCode","pass":true,"statements":[{"sl":184},{"sl":185},{"sl":186},{"sl":187},{"sl":188},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":198},{"sl":199},{"sl":200},{"sl":202},{"sl":203},{"sl":204},{"sl":212},{"sl":215}]},"test_2736":{"methods":[{"sl":175}],"name":"testGetMethods","pass":true,"statements":[{"sl":176},{"sl":178},{"sl":179},{"sl":180}]},"test_2763":{"methods":[{"sl":211},{"sl":338}],"name":"testIsAfter_RI","pass":true,"statements":[{"sl":212},{"sl":339},{"sl":340},{"sl":341},{"sl":342},{"sl":343},{"sl":344},{"sl":346},{"sl":347},{"sl":348},{"sl":350},{"sl":351},{"sl":352},{"sl":353},{"sl":355},{"sl":356},{"sl":358},{"sl":359},{"sl":360}]},"test_3054":{"methods":[{"sl":115}],"name":"testGet_DateTimeFieldType","pass":true,"statements":[{"sl":116},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140}]},"test_3160":{"methods":[{"sl":145}],"name":"testGet_DateTimeField","pass":true,"statements":[{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":162},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170}]},"test_3188":{"methods":[{"sl":493}],"name":"testToDate","pass":true,"statements":[{"sl":494},{"sl":495},{"sl":496}]},"test_3493":{"methods":[{"sl":294}],"name":"testIsBeforeNow","pass":true,"statements":[{"sl":295},{"sl":296},{"sl":297}]},"test_3578":{"methods":[{"sl":382}],"name":"testToString","pass":true,"statements":[{"sl":383},{"sl":384}]},"test_3635":{"methods":[{"sl":410}],"name":"testToDateTime_DateTimeZone","pass":true,"statements":[{"sl":411},{"sl":412},{"sl":413},{"sl":414},{"sl":416},{"sl":417},{"sl":418},{"sl":419},{"sl":421},{"sl":422},{"sl":423},{"sl":424}]},"test_3674":{"methods":[{"sl":388}],"name":"testToInstant","pass":true,"statements":[{"sl":389},{"sl":390},{"sl":391}]},"test_3708":{"methods":[{"sl":531}],"name":"testWithDurationAdded_RD_int","pass":true,"statements":[{"sl":532},{"sl":533},{"sl":534},{"sl":535},{"sl":537},{"sl":538},{"sl":540},{"sl":541},{"sl":543},{"sl":544},{"sl":545},{"sl":547},{"sl":548},{"sl":549}]},"test_3905":{"methods":[{"sl":450}],"name":"testToMutableDateTimeISO","pass":true,"statements":[{"sl":451},{"sl":452},{"sl":453},{"sl":454},{"sl":455},{"sl":456}]},"test_3985":{"methods":[{"sl":332}],"name":"testIsAfterNow","pass":true,"statements":[{"sl":333},{"sl":334},{"sl":335}]},"test_4040":{"methods":[{"sl":589}],"name":"testImmutable","pass":true,"statements":[{"sl":590}]},"test_591":{"methods":[{"sl":500}],"name":"testWithMillis_long","pass":true,"statements":[{"sl":501},{"sl":502},{"sl":503},{"sl":504},{"sl":506},{"sl":507},{"sl":508}]},"test_679":{"methods":[{"sl":211},{"sl":300}],"name":"testIsBefore_RI","pass":true,"statements":[{"sl":212},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":308},{"sl":309},{"sl":310},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":317},{"sl":318},{"sl":320},{"sl":321},{"sl":322}]},"test_758":{"methods":[{"sl":288}],"name":"testIsBefore_long","pass":true,"statements":[{"sl":289},{"sl":290},{"sl":291}]},"test_884":{"methods":[{"sl":394}],"name":"testToDateTime","pass":true,"statements":[{"sl":395},{"sl":396},{"sl":397},{"sl":398}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2523], [2523], [2523], [2523], [], [], [], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [3054], [], [], [], [], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [3160], [], [], [], [], [2736], [2736], [], [2736], [2736], [2736], [], [], [272], [272], [272], [272], [272], [272], [272], [272], [272], [272], [], [272], [272], [272], [272], [272], [272], [272], [], [272], [272], [272], [], [], [], [], [], [], [2140, 679, 2763, 175, 272], [2140, 679, 2763, 175, 272], [], [272], [272], [], [], [], [175], [175], [175], [175], [175], [175], [175], [], [175], [175], [175], [], [175], [175], [175], [175], [], [175], [175], [], [175], [175], [], [], [], [], [], [], [], [], [], [1858], [1858], [1858], [1858], [], [], [1900], [1900], [1900], [1900], [], [], [2140], [2140], [2140], [2140], [2140], [2140], [2140], [], [2140], [2140], [2140], [], [2140], [2140], [2140], [2140], [], [2140], [2140], [], [2140], [2140], [2140], [], [], [], [758], [758], [758], [758], [], [], [3493], [3493], [3493], [3493], [], [], [679], [679], [679], [679], [679], [679], [679], [], [679], [679], [679], [], [679], [679], [679], [679], [], [679], [679], [], [679], [679], [679], [], [], [], [1583], [1583], [1583], [1583], [], [], [3985], [3985], [3985], [3985], [], [], [2763], [2763], [2763], [2763], [2763], [2763], [2763], [], [2763], [2763], [2763], [], [2763], [2763], [2763], [2763], [], [2763], [2763], [], [2763], [2763], [2763], [], [], [], [1198], [1198], [], [1198], [1198], [1198], [1198], [1198], [], [1198], [1198], [1198], [1198], [], [1198], [], [], [], [3578], [3578], [3578], [], [], [], [3674], [3674], [3674], [3674], [], [], [884], [884], [884], [884], [884], [], [], [2572], [2572], [2572], [2572], [2572], [2572], [2572], [], [], [3635], [3635], [3635], [3635], [3635], [], [3635], [3635], [3635], [3635], [], [3635], [3635], [3635], [3635], [], [], [1874], [1874], [1874], [1874], [1874], [], [1874], [1874], [1874], [1874], [], [1874], [1874], [1874], [], [], [2545], [2545], [2545], [2545], [2545], [], [], [3905], [3905], [3905], [3905], [3905], [3905], [3905], [], [], [1759], [1759], [1759], [1759], [1759], [], [1759], [1759], [1759], [1759], [], [1759], [1759], [1759], [1759], [], [], [1727], [1727], [1727], [1727], [1727], [], [1727], [1727], [1727], [1727], [], [1727], [1727], [1727], [1727], [], [], [3188], [3188], [3188], [3188], [], [], [], [591], [591], [591], [591], [591], [], [591], [591], [591], [], [], [], [2154], [2154], [2154], [2154], [2154], [], [2154], [2154], [], [2154], [2154], [2154], [], [2154], [2154], [2154], [], [], [], [3708], [3708], [3708], [3708], [3708], [], [3708], [3708], [], [3708], [3708], [], [3708], [3708], [3708], [], [3708], [3708], [3708], [], [], [], [2022], [2022], [2022], [2022], [2022], [], [], [2643], [2643], [2643], [2643], [2643], [], [2643], [2643], [], [], [], [1634], [1634], [1634], [1634], [1634], [], [], [2256], [2256], [2256], [2256], [2256], [], [2256], [2256], [], [], [], [4040], [4040], [], [], []]
