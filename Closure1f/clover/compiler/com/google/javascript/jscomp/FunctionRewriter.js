var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":532,"id":40754,"methods":[{"el":55,"sc":3,"sl":53},{"el":104,"sc":3,"sl":57},{"el":115,"sc":3,"sl":111},{"el":120,"sc":3,"sl":117}],"name":"FunctionRewriter","sl":47},{"el":151,"id":40790,"methods":[{"el":134,"sc":5,"sl":130},{"el":142,"sc":5,"sl":139},{"el":150,"sc":5,"sl":147}],"name":"FunctionRewriter.Reduction","sl":125},{"el":191,"id":40799,"methods":[{"el":171,"sc":5,"sl":167},{"el":185,"sc":5,"sl":173},{"el":190,"sc":5,"sl":188}],"name":"FunctionRewriter.ReductionGatherer","sl":158},{"el":224,"id":40812,"methods":[{"el":223,"sc":5,"sl":215}],"name":"FunctionRewriter.Reducer","sl":196},{"el":255,"id":40820,"methods":[{"el":245,"sc":5,"sl":242},{"el":254,"sc":5,"sl":247}],"name":"FunctionRewriter.EmptyFunctionReducer","sl":235},{"el":279,"id":40828,"methods":[{"el":278,"sc":5,"sl":267}],"name":"FunctionRewriter.SingleReturnStatementReducer","sl":261},{"el":337,"id":40840,"methods":[{"el":301,"sc":5,"sl":298},{"el":314,"sc":5,"sl":303},{"el":336,"sc":5,"sl":322}],"name":"FunctionRewriter.IdentityReducer","sl":290},{"el":391,"id":40865,"methods":[{"el":360,"sc":5,"sl":357},{"el":374,"sc":5,"sl":362},{"el":390,"sc":5,"sl":383}],"name":"FunctionRewriter.ReturnConstantReducer","sl":348},{"el":450,"id":40885,"methods":[{"el":413,"sc":5,"sl":410},{"el":432,"sc":5,"sl":415},{"el":449,"sc":5,"sl":441}],"name":"FunctionRewriter.GetterReducer","sl":402},{"el":531,"id":40909,"methods":[{"el":474,"sc":5,"sl":471},{"el":493,"sc":5,"sl":476},{"el":530,"sc":5,"sl":502}],"name":"FunctionRewriter.SetterReducer","sl":461}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]