var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":198,"id":70073,"methods":[{"el":74,"sc":3,"sl":71},{"el":83,"sc":3,"sl":79},{"el":92,"sc":3,"sl":88},{"el":100,"sc":3,"sl":97},{"el":121,"sc":3,"sl":102},{"el":147,"sc":3,"sl":129},{"el":151,"sc":3,"sl":149},{"el":172,"sc":3,"sl":153}],"name":"SecureCompiler","sl":53},{"el":196,"id":70128,"methods":[{"el":183,"sc":5,"sl":179},{"el":187,"sc":5,"sl":185},{"el":191,"sc":5,"sl":189},{"el":195,"sc":5,"sl":193}],"name":"SecureCompiler.Report","sl":174}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]