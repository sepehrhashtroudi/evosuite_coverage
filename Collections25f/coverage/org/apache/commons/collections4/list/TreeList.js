var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1120,"id":1462,"methods":[{"el":76,"sc":5,"sl":74},{"el":90,"sc":5,"sl":84},{"el":103,"sc":5,"sl":99},{"el":113,"sc":5,"sl":110},{"el":124,"sc":5,"sl":120},{"el":135,"sc":5,"sl":131},{"el":149,"sc":5,"sl":143},{"el":164,"sc":5,"sl":157},{"el":175,"sc":5,"sl":172},{"el":190,"sc":5,"sl":182},{"el":209,"sc":5,"sl":199},{"el":232,"sc":5,"sl":222},{"el":249,"sc":5,"sl":242},{"el":265,"sc":5,"sl":257},{"el":275,"sc":5,"sl":270},{"el":290,"sc":5,"sl":286}],"name":"TreeList","sl":58},{"el":976,"id":1541,"methods":[{"el":337,"sc":9,"sl":329},{"el":348,"sc":9,"sl":346},{"el":389,"sc":9,"sl":371},{"el":398,"sc":9,"sl":396},{"el":407,"sc":9,"sl":405},{"el":425,"sc":9,"sl":413},{"el":444,"sc":9,"sl":430},{"el":460,"sc":9,"sl":452},{"el":472,"sc":9,"sl":467},{"el":484,"sc":9,"sl":479},{"el":500,"sc":9,"sl":493},{"el":515,"sc":9,"sl":502},{"el":529,"sc":9,"sl":517},{"el":537,"sc":9,"sl":535},{"el":544,"sc":9,"sl":542},{"el":553,"sc":9,"sl":551},{"el":562,"sc":9,"sl":560},{"el":589,"sc":9,"sl":570},{"el":601,"sc":9,"sl":591},{"el":613,"sc":9,"sl":603},{"el":669,"sc":9,"sl":620},{"el":694,"sc":9,"sl":675},{"el":704,"sc":9,"sl":699},{"el":716,"sc":9,"sl":709},{"el":725,"sc":9,"sl":721},{"el":732,"sc":9,"sl":730},{"el":739,"sc":9,"sl":737},{"el":756,"sc":9,"sl":741},{"el":773,"sc":9,"sl":758},{"el":785,"sc":9,"sl":781},{"el":797,"sc":9,"sl":793},{"el":903,"sc":9,"sl":810},{"el":975,"sc":9,"sl":960}],"name":"TreeList.AVLNode","sl":305},{"el":1118,"id":1941,"methods":[{"el":1022,"sc":9,"sl":1015},{"el":1035,"sc":9,"sl":1031},{"el":1039,"sc":9,"sl":1037},{"el":1054,"sc":9,"sl":1041},{"el":1058,"sc":9,"sl":1056},{"el":1074,"sc":9,"sl":1060},{"el":1078,"sc":9,"sl":1076},{"el":1082,"sc":9,"sl":1080},{"el":1100,"sc":9,"sl":1084},{"el":1108,"sc":9,"sl":1102},{"el":1117,"sc":9,"sl":1110}],"name":"TreeList.TreeListIterator","sl":981}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
