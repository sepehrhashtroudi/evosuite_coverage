var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1414,"id":30639,"methods":[{"el":117,"sc":3,"sl":115},{"el":120,"sc":3,"sl":120},{"el":124,"sc":3,"sl":123},{"el":169,"sc":3,"sl":129},{"el":460,"sc":3,"sl":444},{"el":992,"sc":3,"sl":978},{"el":1021,"sc":3,"sl":995},{"el":1050,"sc":3,"sl":1027},{"el":1185,"sc":3,"sl":1053},{"el":1233,"sc":3,"sl":1187},{"el":1247,"sc":3,"sl":1235},{"el":1261,"sc":3,"sl":1249},{"el":1266,"sc":3,"sl":1264},{"el":1272,"sc":3,"sl":1269},{"el":1278,"sc":3,"sl":1275},{"el":1296,"sc":3,"sl":1280},{"el":1312,"sc":3,"sl":1298},{"el":1327,"sc":3,"sl":1320},{"el":1338,"sc":3,"sl":1330},{"el":1368,"sc":3,"sl":1344}],"name":"TightenTypes","sl":74},{"el":261,"id":30675,"methods":[{"el":185,"sc":5,"sl":181},{"el":188,"sc":5,"sl":187},{"el":191,"sc":5,"sl":190},{"el":196,"sc":5,"sl":193},{"el":208,"sc":5,"sl":198},{"el":211,"sc":5,"sl":211},{"el":219,"sc":5,"sl":213},{"el":224,"sc":5,"sl":222},{"el":231,"sc":5,"sl":227},{"el":234,"sc":5,"sl":234},{"el":245,"sc":5,"sl":237},{"el":253,"sc":5,"sl":248},{"el":256,"sc":5,"sl":256},{"el":260,"sc":5,"sl":258}],"name":"TightenTypes.ConcreteScope","sl":176},{"el":307,"id":30727,"methods":[{"el":273,"sc":5,"sl":269},{"el":276,"sc":5,"sl":276},{"el":279,"sc":5,"sl":279},{"el":281,"sc":5,"sl":281},{"el":284,"sc":5,"sl":284},{"el":288,"sc":5,"sl":286},{"el":292,"sc":5,"sl":290},{"el":302,"sc":5,"sl":298},{"el":306,"sc":5,"sl":304}],"name":"TightenTypes.ConcreteSlot","sl":264},{"el":320,"id":30749,"methods":[],"name":"TightenTypes.Action","sl":317},{"el":334,"id":30749,"methods":[{"el":333,"sc":5,"sl":327}],"name":"TightenTypes.Assignment","sl":323},{"el":354,"id":30754,"methods":[{"el":347,"sc":5,"sl":341},{"el":353,"sc":5,"sl":349}],"name":"TightenTypes.VariableAssignAction","sl":337},{"el":390,"id":30761,"methods":[{"el":370,"sc":5,"sl":362},{"el":389,"sc":5,"sl":378}],"name":"TightenTypes.PropertyAssignAction","sl":357},{"el":438,"id":30775,"methods":[{"el":403,"sc":5,"sl":400},{"el":408,"sc":5,"sl":405},{"el":417,"sc":5,"sl":411},{"el":429,"sc":5,"sl":423},{"el":437,"sc":5,"sl":431}],"name":"TightenTypes.FunctionCallBuilder","sl":393},{"el":484,"id":30809,"methods":[{"el":477,"sc":5,"sl":472},{"el":483,"sc":5,"sl":479}],"name":"TightenTypes.ExternFunctionCall","sl":467},{"el":548,"id":30815,"methods":[{"el":505,"sc":5,"sl":497},{"el":547,"sc":5,"sl":507}],"name":"TightenTypes.FunctionCall","sl":487},{"el":584,"id":30850,"methods":[{"el":562,"sc":5,"sl":556},{"el":583,"sc":5,"sl":564}],"name":"TightenTypes.NativeCallFunctionCall","sl":551},{"el":975,"id":30870,"methods":[{"el":594,"sc":5,"sl":591},{"el":762,"sc":5,"sl":597},{"el":768,"sc":5,"sl":765},{"el":776,"sc":5,"sl":771},{"el":805,"sc":5,"sl":782},{"el":820,"sc":5,"sl":807},{"el":828,"sc":5,"sl":822},{"el":859,"sc":5,"sl":834},{"el":902,"sc":5,"sl":861},{"el":920,"sc":5,"sl":904},{"el":957,"sc":5,"sl":922},{"el":974,"sc":5,"sl":959}],"name":"TightenTypes.CreateScope","sl":587},{"el":1413,"id":31415,"methods":[{"el":1383,"sc":5,"sl":1379},{"el":1387,"sc":5,"sl":1385},{"el":1395,"sc":5,"sl":1389},{"el":1407,"sc":5,"sl":1397},{"el":1412,"sc":5,"sl":1409}],"name":"TightenTypes.ConcreteJSTypePair","sl":1374}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]