var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1449,"id":13458,"methods":[{"el":167,"sc":3,"sl":137},{"el":177,"sc":3,"sl":172},{"el":202,"sc":3,"sl":179},{"el":222,"sc":3,"sl":204},{"el":239,"sc":3,"sl":224},{"el":253,"sc":3,"sl":244},{"el":265,"sc":3,"sl":258},{"el":271,"sc":3,"sl":267},{"el":287,"sc":3,"sl":273},{"el":341,"sc":3,"sl":289},{"el":346,"sc":3,"sl":343},{"el":351,"sc":3,"sl":348},{"el":362,"sc":3,"sl":353},{"el":373,"sc":3,"sl":364},{"el":383,"sc":3,"sl":375},{"el":393,"sc":3,"sl":385},{"el":404,"sc":3,"sl":395},{"el":417,"sc":3,"sl":406},{"el":450,"sc":3,"sl":430},{"el":457,"sc":3,"sl":453},{"el":467,"sc":3,"sl":459},{"el":471,"sc":3,"sl":469},{"el":1419,"sc":3,"sl":1239},{"el":1424,"sc":3,"sl":1422},{"el":1428,"sc":3,"sl":1426},{"el":1432,"sc":3,"sl":1430},{"el":1436,"sc":3,"sl":1434},{"el":1440,"sc":3,"sl":1438},{"el":1444,"sc":3,"sl":1442},{"el":1448,"sc":3,"sl":1446}],"name":"IRFactory","sl":81},{"el":1237,"id":13684,"methods":[{"el":481,"sc":5,"sl":474},{"el":505,"sc":5,"sl":492},{"el":519,"sc":5,"sl":507},{"el":532,"sc":5,"sl":521},{"el":542,"sc":5,"sl":534},{"el":568,"sc":5,"sl":553},{"el":577,"sc":5,"sl":570},{"el":582,"sc":5,"sl":579},{"el":594,"sc":5,"sl":584},{"el":608,"sc":5,"sl":596},{"el":617,"sc":5,"sl":610},{"el":629,"sc":5,"sl":619},{"el":637,"sc":5,"sl":631},{"el":645,"sc":5,"sl":639},{"el":651,"sc":5,"sl":647},{"el":657,"sc":5,"sl":653},{"el":664,"sc":5,"sl":659},{"el":682,"sc":5,"sl":666},{"el":693,"sc":5,"sl":684},{"el":707,"sc":5,"sl":695},{"el":791,"sc":5,"sl":709},{"el":802,"sc":5,"sl":793},{"el":814,"sc":5,"sl":804},{"el":819,"sc":5,"sl":816},{"el":824,"sc":5,"sl":821},{"el":849,"sc":5,"sl":826},{"el":854,"sc":5,"sl":851},{"el":868,"sc":5,"sl":856},{"el":875,"sc":5,"sl":873},{"el":889,"sc":5,"sl":877},{"el":894,"sc":5,"sl":891},{"el":935,"sc":5,"sl":896},{"el":945,"sc":4,"sl":941},{"el":950,"sc":5,"sl":947},{"el":956,"sc":5,"sl":952},{"el":967,"sc":5,"sl":958},{"el":985,"sc":5,"sl":969},{"el":994,"sc":5,"sl":987},{"el":999,"sc":5,"sl":996},{"el":1028,"sc":5,"sl":1001},{"el":1051,"sc":5,"sl":1030},{"el":1061,"sc":5,"sl":1053},{"el":1067,"sc":5,"sl":1063},{"el":1102,"sc":5,"sl":1069},{"el":1140,"sc":5,"sl":1104},{"el":1150,"sc":5,"sl":1142},{"el":1164,"sc":5,"sl":1152},{"el":1174,"sc":5,"sl":1166},{"el":1182,"sc":5,"sl":1176},{"el":1190,"sc":5,"sl":1184},{"el":1201,"sc":5,"sl":1192},{"el":1208,"sc":5,"sl":1203},{"el":1215,"sc":5,"sl":1210},{"el":1222,"sc":5,"sl":1217},{"el":1229,"sc":5,"sl":1224},{"el":1236,"sc":5,"sl":1231}],"name":"IRFactory.TransformDispatcher","sl":473}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
