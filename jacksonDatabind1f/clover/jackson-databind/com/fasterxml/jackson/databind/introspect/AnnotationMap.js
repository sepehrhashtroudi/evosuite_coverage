var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":100,"id":12946,"methods":[{"el":18,"sc":5,"sl":18},{"el":22,"sc":5,"sl":20},{"el":32,"sc":5,"sl":24},{"el":53,"sc":5,"sl":34},{"el":58,"sc":5,"sl":55},{"el":69,"sc":5,"sl":64},{"el":76,"sc":5,"sl":74},{"el":85,"sc":5,"sl":78},{"el":99,"sc":5,"sl":93}],"name":"AnnotationMap","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]