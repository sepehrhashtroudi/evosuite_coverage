var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":847,"id":21474,"methods":[{"el":85,"sc":3,"sl":79},{"el":99,"sc":3,"sl":87},{"el":110,"sc":3,"sl":101},{"el":118,"sc":3,"sl":112},{"el":159,"sc":3,"sl":120},{"el":702,"sc":3,"sl":696}],"name":"Normalize","sl":65},{"el":183,"id":21513,"methods":[{"el":177,"sc":5,"sl":167},{"el":182,"sc":5,"sl":179}],"name":"Normalize.FindExposeAnnotations","sl":164},{"el":213,"id":21530,"methods":[{"el":194,"sc":5,"sl":192},{"el":212,"sc":5,"sl":196}],"name":"Normalize.RewriteExposedProperties","sl":188},{"el":267,"id":21553,"methods":[{"el":228,"sc":5,"sl":224},{"el":233,"sc":5,"sl":230},{"el":266,"sc":5,"sl":235}],"name":"Normalize.PropagateConstantAnnotationsOverVars","sl":218},{"el":344,"id":21583,"methods":[{"el":281,"sc":5,"sl":278},{"el":291,"sc":5,"sl":283},{"el":343,"sc":5,"sl":295}],"name":"Normalize.VerifyConstants","sl":272},{"el":691,"id":21633,"methods":[{"el":363,"sc":5,"sl":360},{"el":371,"sc":5,"sl":365},{"el":378,"sc":5,"sl":373},{"el":413,"sc":5,"sl":380},{"el":448,"sc":5,"sl":418},{"el":464,"sc":5,"sl":458},{"el":497,"sc":5,"sl":482},{"el":523,"sc":5,"sl":502},{"el":551,"sc":5,"sl":532},{"el":611,"sc":5,"sl":564},{"el":638,"sc":5,"sl":621},{"el":676,"sc":5,"sl":644},{"el":690,"sc":5,"sl":683}],"name":"Normalize.NormalizeStatements","sl":356},{"el":817,"id":21840,"methods":[{"el":770,"sc":5,"sl":716},{"el":816,"sc":5,"sl":788}],"name":"Normalize.DuplicateDeclarationHandler","sl":707},{"el":846,"id":21895,"methods":[{"el":829,"sc":5,"sl":824},{"el":834,"sc":5,"sl":831},{"el":840,"sc":5,"sl":836},{"el":845,"sc":5,"sl":842}],"name":"Normalize.ScopeTicklingCallback","sl":822}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]