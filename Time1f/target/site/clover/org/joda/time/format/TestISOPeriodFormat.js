var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":210,"id":61243,"methods":[{"el":62,"sc":5,"sl":60},{"el":66,"sc":5,"sl":64},{"el":70,"sc":5,"sl":68},{"el":80,"sc":5,"sl":72},{"el":90,"sc":5,"sl":82},{"el":98,"sc":5,"sl":93},{"el":116,"sc":5,"sl":101},{"el":136,"sc":5,"sl":118},{"el":154,"sc":5,"sl":139},{"el":172,"sc":5,"sl":157},{"el":190,"sc":5,"sl":175},{"el":208,"sc":5,"sl":193}],"name":"TestISOPeriodFormat","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1255":{"methods":[{"sl":139}],"name":"testFormatAlternate","pass":true,"statements":[{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":150},{"sl":151},{"sl":152},{"sl":153}]},"test_1614":{"methods":[{"sl":101}],"name":"testFormatStandard","pass":true,"statements":[{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":107},{"sl":108},{"sl":109},{"sl":110},{"sl":112},{"sl":113},{"sl":114},{"sl":115}]},"test_1796":{"methods":[{"sl":93}],"name":"testSubclassableConstructor","pass":true,"statements":[{"sl":94},{"sl":97}]},"test_1854":{"methods":[{"sl":193}],"name":"testFormatAlternateExtendedWithWeeks","pass":true,"statements":[{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":199},{"sl":200},{"sl":201},{"sl":202},{"sl":204},{"sl":205},{"sl":206},{"sl":207}]},"test_1974":{"methods":[{"sl":175}],"name":"testFormatAlternateWithWeeks","pass":true,"statements":[{"sl":176},{"sl":177},{"sl":178},{"sl":179},{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":186},{"sl":187},{"sl":188},{"sl":189}]},"test_2608":{"methods":[{"sl":157}],"name":"testFormatAlternateExtended","pass":true,"statements":[{"sl":158},{"sl":159},{"sl":160},{"sl":161},{"sl":163},{"sl":164},{"sl":165},{"sl":166},{"sl":168},{"sl":169},{"sl":170},{"sl":171}]},"test_2714":{"methods":[{"sl":118}],"name":"testFormatStandard_negative","pass":true,"statements":[{"sl":119},{"sl":120},{"sl":122},{"sl":123},{"sl":125},{"sl":126},{"sl":128},{"sl":129},{"sl":131},{"sl":132},{"sl":134},{"sl":135}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1796], [1796], [], [], [1796], [], [], [], [1614], [1614], [1614], [1614], [1614], [], [1614], [1614], [1614], [1614], [], [1614], [1614], [1614], [1614], [], [], [2714], [2714], [2714], [], [2714], [2714], [], [2714], [2714], [], [2714], [2714], [], [2714], [2714], [], [2714], [2714], [], [], [], [1255], [1255], [1255], [1255], [1255], [], [1255], [1255], [1255], [1255], [], [1255], [1255], [1255], [1255], [], [], [], [2608], [2608], [2608], [2608], [2608], [], [2608], [2608], [2608], [2608], [], [2608], [2608], [2608], [2608], [], [], [], [1974], [1974], [1974], [1974], [1974], [], [1974], [1974], [1974], [1974], [], [1974], [1974], [1974], [1974], [], [], [], [1854], [1854], [1854], [1854], [1854], [], [1854], [1854], [1854], [1854], [], [1854], [1854], [1854], [1854], [], [], []]
