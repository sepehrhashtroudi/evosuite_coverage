var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":401,"id":61610,"methods":[{"el":65,"sc":3,"sl":37},{"el":93,"sc":3,"sl":70}],"name":"DefinitionsRemover","sl":31},{"el":147,"id":61679,"methods":[{"el":102,"sc":5,"sl":100},{"el":117,"sc":5,"sl":110},{"el":146,"sc":5,"sl":144}],"name":"DefinitionsRemover.Definition","sl":96},{"el":175,"id":61689,"methods":[{"el":164,"sc":5,"sl":158},{"el":169,"sc":5,"sl":166},{"el":174,"sc":5,"sl":171}],"name":"DefinitionsRemover.IncompleteDefinition","sl":153},{"el":189,"id":61698,"methods":[{"el":183,"sc":5,"sl":181},{"el":188,"sc":5,"sl":185}],"name":"DefinitionsRemover.UnknownDefinition","sl":180},{"el":206,"id":61702,"methods":[{"el":199,"sc":5,"sl":197},{"el":205,"sc":5,"sl":201}],"name":"DefinitionsRemover.ExternalNameOnlyDefinition","sl":195},{"el":225,"id":61706,"methods":[{"el":218,"sc":5,"sl":212},{"el":224,"sc":5,"sl":220}],"name":"DefinitionsRemover.FunctionArgumentDefinition","sl":211},{"el":249,"id":61712,"methods":[{"el":238,"sc":5,"sl":234},{"el":243,"sc":5,"sl":240},{"el":248,"sc":5,"sl":245}],"name":"DefinitionsRemover.FunctionDefinition","sl":230},{"el":264,"id":61720,"methods":[{"el":258,"sc":5,"sl":256},{"el":263,"sc":5,"sl":260}],"name":"DefinitionsRemover.NamedFunctionDefinition","sl":255},{"el":282,"id":61724,"methods":[{"el":275,"sc":5,"sl":271},{"el":281,"sc":5,"sl":277}],"name":"DefinitionsRemover.FunctionExpressionDefinition","sl":270},{"el":314,"id":61729,"methods":[{"el":294,"sc":5,"sl":290},{"el":303,"sc":5,"sl":296},{"el":308,"sc":5,"sl":305},{"el":313,"sc":5,"sl":310}],"name":"DefinitionsRemover.AssignmentDefinition","sl":287},{"el":365,"id":61742,"methods":[{"el":333,"sc":5,"sl":326},{"el":338,"sc":5,"sl":335},{"el":359,"sc":5,"sl":340},{"el":364,"sc":5,"sl":361}],"name":"DefinitionsRemover.ObjectLiteralPropertyDefinition","sl":320},{"el":400,"id":61759,"methods":[{"el":378,"sc":5,"sl":372},{"el":389,"sc":5,"sl":380},{"el":394,"sc":5,"sl":391},{"el":399,"sc":5,"sl":396}],"name":"DefinitionsRemover.VarDefinition","sl":370}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]