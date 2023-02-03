var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":2981,"id":11102,"methods":[{"el":104,"sc":5,"sl":102},{"el":117,"sc":5,"sl":111},{"el":133,"sc":5,"sl":125},{"el":143,"sc":5,"sl":141},{"el":154,"sc":5,"sl":151},{"el":164,"sc":5,"sl":162},{"el":178,"sc":5,"sl":172},{"el":189,"sc":5,"sl":186},{"el":215,"sc":5,"sl":199},{"el":225,"sc":5,"sl":223},{"el":240,"sc":5,"sl":233},{"el":254,"sc":5,"sl":247},{"el":267,"sc":5,"sl":265},{"el":279,"sc":5,"sl":277},{"el":295,"sc":5,"sl":292},{"el":313,"sc":5,"sl":307},{"el":331,"sc":5,"sl":325},{"el":348,"sc":5,"sl":342},{"el":363,"sc":5,"sl":356},{"el":384,"sc":5,"sl":375},{"el":399,"sc":5,"sl":392},{"el":422,"sc":5,"sl":411},{"el":440,"sc":5,"sl":434},{"el":452,"sc":5,"sl":447},{"el":466,"sc":5,"sl":461},{"el":482,"sc":5,"sl":476},{"el":500,"sc":5,"sl":494},{"el":521,"sc":5,"sl":509},{"el":550,"sc":5,"sl":533},{"el":563,"sc":5,"sl":561},{"el":584,"sc":5,"sl":572},{"el":612,"sc":5,"sl":595},{"el":634,"sc":5,"sl":622},{"el":663,"sc":5,"sl":646},{"el":684,"sc":5,"sl":672},{"el":712,"sc":5,"sl":695},{"el":733,"sc":5,"sl":721},{"el":761,"sc":5,"sl":744},{"el":785,"sc":5,"sl":769},{"el":800,"sc":5,"sl":794},{"el":810,"sc":5,"sl":808},{"el":820,"sc":5,"sl":818},{"el":830,"sc":5,"sl":828},{"el":840,"sc":5,"sl":838},{"el":853,"sc":5,"sl":851},{"el":865,"sc":5,"sl":863},{"el":879,"sc":5,"sl":877},{"el":892,"sc":5,"sl":890},{"el":904,"sc":5,"sl":902},{"el":916,"sc":5,"sl":914},{"el":930,"sc":5,"sl":928},{"el":944,"sc":5,"sl":942},{"el":956,"sc":5,"sl":954},{"el":970,"sc":5,"sl":968},{"el":982,"sc":5,"sl":980},{"el":996,"sc":5,"sl":994},{"el":1007,"sc":5,"sl":1005},{"el":1018,"sc":5,"sl":1016},{"el":1029,"sc":5,"sl":1027},{"el":1040,"sc":5,"sl":1038},{"el":1051,"sc":5,"sl":1049},{"el":1062,"sc":5,"sl":1060},{"el":1082,"sc":5,"sl":1075},{"el":1100,"sc":5,"sl":1093},{"el":1118,"sc":5,"sl":1111},{"el":1141,"sc":5,"sl":1131},{"el":1165,"sc":5,"sl":1153},{"el":1188,"sc":5,"sl":1177},{"el":1213,"sc":5,"sl":1211},{"el":1248,"sc":5,"sl":1242},{"el":1274,"sc":5,"sl":1269},{"el":1294,"sc":5,"sl":1287},{"el":1321,"sc":5,"sl":1316},{"el":1348,"sc":5,"sl":1343},{"el":1366,"sc":5,"sl":1358},{"el":1400,"sc":5,"sl":1380},{"el":1414,"sc":5,"sl":1412},{"el":1447,"sc":5,"sl":1427},{"el":1461,"sc":5,"sl":1459},{"el":1478,"sc":5,"sl":1473},{"el":1505,"sc":5,"sl":1489},{"el":1529,"sc":5,"sl":1516},{"el":1560,"sc":5,"sl":1542},{"el":1591,"sc":5,"sl":1570},{"el":1608,"sc":5,"sl":1601},{"el":1620,"sc":5,"sl":1618},{"el":1632,"sc":5,"sl":1630},{"el":1644,"sc":5,"sl":1642},{"el":1656,"sc":5,"sl":1654},{"el":1670,"sc":5,"sl":1667},{"el":1688,"sc":5,"sl":1681},{"el":1712,"sc":5,"sl":1697},{"el":1728,"sc":5,"sl":1720},{"el":1747,"sc":5,"sl":1737},{"el":1764,"sc":5,"sl":1755},{"el":1779,"sc":5,"sl":1777},{"el":1793,"sc":5,"sl":1791},{"el":1816,"sc":5,"sl":1806},{"el":1834,"sc":5,"sl":1829},{"el":1854,"sc":5,"sl":1845},{"el":1874,"sc":5,"sl":1864},{"el":1895,"sc":5,"sl":1884},{"el":1914,"sc":5,"sl":1904},{"el":1930,"sc":5,"sl":1928},{"el":1945,"sc":5,"sl":1943},{"el":1969,"sc":5,"sl":1964},{"el":2006,"sc":5,"sl":1986},{"el":2027,"sc":5,"sl":2014},{"el":2056,"sc":5,"sl":2036},{"el":2084,"sc":5,"sl":2067},{"el":2112,"sc":5,"sl":2094},{"el":2131,"sc":5,"sl":2119},{"el":2142,"sc":5,"sl":2140},{"el":2160,"sc":5,"sl":2157},{"el":2182,"sc":5,"sl":2174},{"el":2204,"sc":5,"sl":2196},{"el":2233,"sc":5,"sl":2222},{"el":2250,"sc":5,"sl":2242},{"el":2260,"sc":5,"sl":2258},{"el":2275,"sc":5,"sl":2273},{"el":2286,"sc":5,"sl":2284},{"el":2307,"sc":5,"sl":2295},{"el":2319,"sc":5,"sl":2317},{"el":2358,"sc":5,"sl":2331},{"el":2372,"sc":5,"sl":2370},{"el":2399,"sc":5,"sl":2386},{"el":2410,"sc":5,"sl":2408},{"el":2430,"sc":5,"sl":2419},{"el":2442,"sc":5,"sl":2440},{"el":2479,"sc":5,"sl":2454},{"el":2493,"sc":5,"sl":2491},{"el":2520,"sc":5,"sl":2507},{"el":2557,"sc":5,"sl":2555},{"el":2581,"sc":5,"sl":2579},{"el":2606,"sc":5,"sl":2604},{"el":2663,"sc":5,"sl":2646},{"el":2687,"sc":5,"sl":2672},{"el":2702,"sc":5,"sl":2696},{"el":2717,"sc":5,"sl":2709},{"el":2732,"sc":5,"sl":2729},{"el":2742,"sc":5,"sl":2740},{"el":2753,"sc":5,"sl":2751},{"el":2764,"sc":5,"sl":2761},{"el":2787,"sc":5,"sl":2776},{"el":2799,"sc":5,"sl":2795}],"name":"StrBuilder","sl":75},{"el":2832,"id":12341,"methods":[{"el":2812,"sc":9,"sl":2810},{"el":2821,"sc":9,"sl":2815},{"el":2831,"sc":9,"sl":2824}],"name":"StrBuilder.StrBuilderTokenizer","sl":2805},{"el":2923,"id":12356,"methods":[{"el":2849,"sc":9,"sl":2847},{"el":2855,"sc":9,"sl":2852},{"el":2864,"sc":9,"sl":2858},{"el":2885,"sc":9,"sl":2867},{"el":2898,"sc":9,"sl":2888},{"el":2904,"sc":9,"sl":2901},{"el":2910,"sc":9,"sl":2907},{"el":2916,"sc":9,"sl":2913},{"el":2922,"sc":9,"sl":2919}],"name":"StrBuilder.StrBuilderReader","sl":2838},{"el":2979,"id":12404,"methods":[{"el":2936,"sc":9,"sl":2934},{"el":2942,"sc":9,"sl":2939},{"el":2948,"sc":9,"sl":2945},{"el":2954,"sc":9,"sl":2951},{"el":2960,"sc":9,"sl":2957},{"el":2966,"sc":9,"sl":2963},{"el":2972,"sc":9,"sl":2969},{"el":2978,"sc":9,"sl":2975}],"name":"StrBuilder.StrBuilderWriter","sl":2929}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]