var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":624,"id":61130,"methods":[{"el":65,"sc":3,"sl":63},{"el":69,"sc":3,"sl":67},{"el":73,"sc":3,"sl":71},{"el":96,"sc":3,"sl":75},{"el":103,"sc":3,"sl":98},{"el":156,"sc":3,"sl":105},{"el":192,"sc":3,"sl":158},{"el":206,"sc":3,"sl":198},{"el":229,"sc":3,"sl":212}],"name":"MakeDeclaredNamesUnique","sl":45},{"el":256,"id":61234,"methods":[],"name":"MakeDeclaredNamesUnique.Renamer","sl":234},{"el":417,"id":61234,"methods":[{"el":276,"sc":5,"sl":274},{"el":281,"sc":5,"sl":278},{"el":286,"sc":5,"sl":283},{"el":290,"sc":5,"sl":288},{"el":294,"sc":5,"sl":292},{"el":307,"sc":5,"sl":299},{"el":334,"sc":5,"sl":313},{"el":358,"sc":5,"sl":341},{"el":372,"sc":5,"sl":363},{"el":384,"sc":5,"sl":377},{"el":389,"sc":5,"sl":386},{"el":407,"sc":5,"sl":391},{"el":416,"sc":5,"sl":409}],"name":"MakeDeclaredNamesUnique.ContextualRenameInverter","sl":261},{"el":504,"id":61324,"methods":[{"el":440,"sc":5,"sl":437},{"el":448,"sc":5,"sl":445},{"el":456,"sc":5,"sl":453},{"el":478,"sc":5,"sl":461},{"el":483,"sc":5,"sl":480},{"el":490,"sc":5,"sl":488},{"el":494,"sc":5,"sl":492},{"el":498,"sc":5,"sl":496},{"el":503,"sc":5,"sl":500}],"name":"MakeDeclaredNamesUnique.ContextualRenamer","sl":430},{"el":571,"id":61360,"methods":[{"el":531,"sc":5,"sl":521},{"el":539,"sc":5,"sl":533},{"el":555,"sc":5,"sl":541},{"el":560,"sc":5,"sl":557},{"el":565,"sc":5,"sl":562},{"el":570,"sc":5,"sl":567}],"name":"MakeDeclaredNamesUnique.InlineRenamer","sl":515},{"el":592,"id":61387,"methods":[{"el":586,"sc":5,"sl":581},{"el":591,"sc":5,"sl":588}],"name":"MakeDeclaredNamesUnique.BoilerplateRenamer","sl":577},{"el":622,"id":61392,"methods":[{"el":602,"sc":5,"sl":599},{"el":608,"sc":5,"sl":604},{"el":613,"sc":5,"sl":610},{"el":617,"sc":5,"sl":615},{"el":621,"sc":5,"sl":619}],"name":"MakeDeclaredNamesUnique.WhitelistedRenamer","sl":595}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]