var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":477,"id":6465,"methods":[{"el":88,"sc":5,"sl":71},{"el":103,"sc":5,"sl":100},{"el":126,"sc":5,"sl":117},{"el":142,"sc":5,"sl":136},{"el":167,"sc":5,"sl":164},{"el":187,"sc":5,"sl":180},{"el":199,"sc":5,"sl":197},{"el":208,"sc":5,"sl":206},{"el":218,"sc":5,"sl":216},{"el":227,"sc":5,"sl":225},{"el":245,"sc":5,"sl":243},{"el":263,"sc":5,"sl":261},{"el":281,"sc":5,"sl":279},{"el":300,"sc":5,"sl":298},{"el":320,"sc":5,"sl":317},{"el":330,"sc":5,"sl":328},{"el":347,"sc":5,"sl":342},{"el":363,"sc":5,"sl":358},{"el":377,"sc":5,"sl":375},{"el":393,"sc":5,"sl":388},{"el":407,"sc":5,"sl":405},{"el":424,"sc":5,"sl":419},{"el":435,"sc":5,"sl":433},{"el":449,"sc":5,"sl":444},{"el":462,"sc":5,"sl":457},{"el":475,"sc":5,"sl":472}],"name":"Weeks","sl":42}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1278":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":419}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":420},{"sl":421},{"sl":423}]},"test_1330":{"methods":[{"sl":71},{"sl":279}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":280}]},"test_1332":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":328}],"name":"testFactory_parseWeeks_String","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":182},{"sl":183},{"sl":185},{"sl":186},{"sl":198},{"sl":329}]},"test_1371":{"methods":[{"sl":328}],"name":"testConstants","pass":true,"statements":[{"sl":329}]},"test_151":{"methods":[{"sl":71},{"sl":243}],"name":"testToStandardDays","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":244}]},"test_1527":{"methods":[{"sl":71},{"sl":164},{"sl":197},{"sl":328}],"name":"testFactory_standardWeeksIn_RPeriod","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":165},{"sl":166},{"sl":198},{"sl":329}]},"test_159":{"methods":[{"sl":71},{"sl":328}],"name":"testToStandardWeeks_months","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":329}]},"test_1626":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":375},{"sl":388}],"name":"testMinus_Weeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":376},{"sl":389},{"sl":390},{"sl":392}]},"test_1662":{"methods":[{"sl":71},{"sl":197},{"sl":457}],"name":"testIsLessThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":458},{"sl":459},{"sl":461}]},"test_1670":{"methods":[{"sl":71},{"sl":197},{"sl":216}],"name":"testGetFieldType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":217}]},"test_1777":{"methods":[{"sl":71},{"sl":216}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":217}]},"test_2079":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":75},{"sl":76},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_2128":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testFactory_weeks_int","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_2155":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":433}],"name":"testNegated","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":434}]},"test_2336":{"methods":[{"sl":71},{"sl":328}],"name":"testToStandardWeeks_years","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":329}]},"test_2561":{"methods":[{"sl":71},{"sl":197},{"sl":328}],"name":"testGetMethods","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":329}]},"test_2686":{"methods":[{"sl":71},{"sl":197},{"sl":317}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":318},{"sl":319}]},"test_2688":{"methods":[{"sl":71},{"sl":197},{"sl":444}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":445},{"sl":446},{"sl":448}]},"test_28":{"methods":[{"sl":71},{"sl":261}],"name":"testToStandardHours","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":262}]},"test_3099":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342}],"name":"testPlus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346}]},"test_3149":{"methods":[{"sl":71},{"sl":117},{"sl":197},{"sl":216},{"sl":328}],"name":"testFactory_weeksBetween_RPartial","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":118},{"sl":119},{"sl":120},{"sl":122},{"sl":124},{"sl":125},{"sl":198},{"sl":217},{"sl":329}]},"test_3161":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_3236":{"methods":[{"sl":71},{"sl":298}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":299}]},"test_334":{"methods":[{"sl":71},{"sl":197},{"sl":225}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":226}]},"test_3398":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_359":{"methods":[{"sl":71},{"sl":100},{"sl":197},{"sl":328}],"name":"testFactory_weeksBetween_RInstant","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":101},{"sl":102},{"sl":198},{"sl":329}]},"test_3666":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_470":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":375}],"name":"testMinus_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":376}]},"test_526":{"methods":[{"sl":71},{"sl":136},{"sl":197},{"sl":328}],"name":"testFactory_weeksIn_RInterval","pass":true,"statements":[{"sl":72},{"sl":73},{"sl":74},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":137},{"sl":138},{"sl":140},{"sl":141},{"sl":198},{"sl":329}]},"test_552":{"methods":[{"sl":71},{"sl":197},{"sl":472}],"name":"testToString","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":198},{"sl":474}]},"test_554":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":405}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":406}]},"test_562":{"methods":[{"sl":71}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78}]},"test_763":{"methods":[{"sl":71},{"sl":206}],"name":"testSerialization","pass":true,"statements":[{"sl":72},{"sl":79},{"sl":80},{"sl":207}]},"test_803":{"methods":[{"sl":71},{"sl":180},{"sl":197},{"sl":225},{"sl":472}],"name":"testWeeks","pass":true,"statements":[{"sl":72},{"sl":85},{"sl":86},{"sl":182},{"sl":185},{"sl":186},{"sl":198},{"sl":226},{"sl":474}]},"test_869":{"methods":[{"sl":71},{"sl":197},{"sl":328},{"sl":342},{"sl":358}],"name":"testPlus_Weeks","pass":true,"statements":[{"sl":72},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":85},{"sl":86},{"sl":198},{"sl":329},{"sl":343},{"sl":344},{"sl":346},{"sl":359},{"sl":360},{"sl":362}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3236, 28, 3161, 1527, 2155, 869, 2079, 554, 359, 2336, 763, 1777, 2688, 470, 562, 151, 3666, 3398, 2561, 3099, 159, 2686, 1670, 1278, 2128, 334, 1330, 3149, 1332, 526, 1662, 552, 1626, 803], [3236, 28, 3161, 1527, 2155, 869, 2079, 554, 359, 2336, 763, 1777, 2688, 470, 562, 151, 3666, 3398, 2561, 3099, 159, 2686, 1670, 1278, 2128, 334, 1330, 3149, 1332, 526, 1662, 552, 1626, 803], [1527, 359, 2336, 159, 2128, 3149, 1332, 526], [1527, 359, 2336, 159, 2128, 3149, 1332, 526], [1527, 2079, 2128, 1332], [1527, 2079, 2128, 1332], [3236, 28, 3161, 1527, 869, 554, 470, 562, 151, 3666, 3398, 3099, 1278, 2128, 1330, 1332, 1626], [3236, 28, 3161, 1527, 869, 554, 470, 562, 151, 3666, 3398, 3099, 1278, 2128, 1330, 1332, 1626], [869, 2079, 359, 763, 1777, 1278, 2128, 3149, 526, 1626], [869, 2079, 359, 763, 1777, 1278, 2128, 3149, 526, 1626], [2079, 2128], [2079, 2128], [2128], [2128], [1527, 2155, 869, 2079, 554, 359, 2688, 470, 2561, 3099, 2686, 1670, 1278, 2128, 334, 3149, 1332, 526, 1662, 552, 1626, 803], [1527, 2155, 869, 2079, 554, 359, 2688, 470, 2561, 3099, 2686, 1670, 1278, 2128, 334, 3149, 1332, 526, 1662, 552, 1626, 803], [], [], [], [], [], [], [], [], [], [], [], [], [], [359], [359], [359], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3149], [3149], [3149], [3149], [], [3149], [], [3149], [3149], [], [], [], [], [], [], [], [], [], [], [526], [526], [526], [], [526], [526], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1527], [1527], [1527], [], [], [], [], [], [], [], [], [], [], [], [], [], [1332, 803], [], [1332, 803], [1332], [], [1332, 803], [1332, 803], [], [], [], [], [], [], [], [], [], [], [1527, 2155, 869, 2079, 554, 359, 2688, 470, 2561, 3099, 2686, 1670, 1278, 2128, 334, 3149, 1332, 526, 1662, 552, 1626, 803], [1527, 2155, 869, 2079, 554, 359, 2688, 470, 2561, 3099, 2686, 1670, 1278, 2128, 334, 3149, 1332, 526, 1662, 552, 1626, 803], [], [], [], [], [], [], [], [763], [763], [], [], [], [], [], [], [], [], [1777, 1670, 3149], [1777, 1670, 3149], [], [], [], [], [], [], [], [334, 803], [334, 803], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [151], [151], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [28], [28], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1330], [1330], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3236], [3236], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2686], [2686], [2686], [], [], [], [], [], [], [], [], [1527, 2155, 869, 2079, 554, 359, 2336, 470, 1371, 2561, 3099, 159, 1278, 2128, 3149, 1332, 526, 1626], [1527, 2155, 869, 2079, 554, 359, 2336, 470, 1371, 2561, 3099, 159, 1278, 2128, 3149, 1332, 526, 1626], [], [], [], [], [], [], [], [], [], [], [], [], [869, 470, 3099, 1626], [869, 470, 3099, 1626], [869, 470, 3099, 1626], [], [869, 470, 3099, 1626], [], [], [], [], [], [], [], [], [], [], [], [869], [869], [869], [], [869], [], [], [], [], [], [], [], [], [], [], [], [], [470, 1626], [470, 1626], [], [], [], [], [], [], [], [], [], [], [], [1626], [1626], [1626], [], [1626], [], [], [], [], [], [], [], [], [], [], [], [], [554], [554], [], [], [], [], [], [], [], [], [], [], [], [], [1278], [1278], [1278], [], [1278], [], [], [], [], [], [], [], [], [], [2155], [2155], [], [], [], [], [], [], [], [], [], [2688], [2688], [2688], [], [2688], [], [], [], [], [], [], [], [], [1662], [1662], [1662], [], [1662], [], [], [], [], [], [], [], [], [], [], [552, 803], [], [552, 803], [], [], []]