var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":199,"id":44690,"methods":[{"el":55,"sc":3,"sl":52},{"el":71,"sc":3,"sl":57},{"el":98,"sc":3,"sl":77},{"el":107,"sc":3,"sl":104}],"name":"MarkNoSideEffectCalls","sl":40},{"el":162,"id":44722,"methods":[{"el":117,"sc":5,"sl":115},{"el":161,"sc":5,"sl":119}],"name":"MarkNoSideEffectCalls.GatherNoSideEffectFunctions","sl":112},{"el":198,"id":44764,"methods":[{"el":173,"sc":5,"sl":171},{"el":197,"sc":5,"sl":175}],"name":"MarkNoSideEffectCalls.SetNoSideEffectCallProperty","sl":168}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]