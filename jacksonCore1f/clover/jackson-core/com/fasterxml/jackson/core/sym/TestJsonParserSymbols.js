var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":105,"id":15419,"methods":[{"el":33,"sc":5,"sl":30},{"el":47,"sc":5,"sl":35},{"el":52,"sc":5,"sl":49},{"el":66,"sc":5,"sl":54},{"el":89,"sc":5,"sl":74},{"el":104,"sc":5,"sl":91}],"name":"TestJsonParserSymbols","sl":14},{"el":26,"id":15419,"methods":[{"el":24,"sc":9,"sl":24},{"el":25,"sc":9,"sl":25}],"name":"TestJsonParserSymbols.MyJsonFactory","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
