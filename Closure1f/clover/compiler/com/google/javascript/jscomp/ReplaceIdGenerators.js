var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":390,"id":27921,"methods":[{"el":94,"sc":3,"sl":73},{"el":180,"sc":3,"sl":168},{"el":234,"sc":3,"sl":228},{"el":320,"sc":3,"sl":301},{"el":375,"sc":3,"sl":322},{"el":380,"sc":3,"sl":377},{"el":389,"sc":3,"sl":382}],"name":"ReplaceIdGenerators","sl":43},{"el":100,"id":27936,"methods":[],"name":"ReplaceIdGenerators.RenameStrategy","sl":96},{"el":105,"id":27936,"methods":[],"name":"ReplaceIdGenerators.NameSupplier","sl":102},{"el":133,"id":27936,"methods":[{"el":118,"sc":5,"sl":112},{"el":127,"sc":5,"sl":120},{"el":132,"sc":5,"sl":129}],"name":"ReplaceIdGenerators.ObfuscatedNameSuppier","sl":107},{"el":155,"id":27949,"methods":[{"el":141,"sc":5,"sl":139},{"el":149,"sc":5,"sl":143},{"el":154,"sc":5,"sl":151}],"name":"ReplaceIdGenerators.PseudoNameSuppier","sl":135},{"el":166,"id":27959,"methods":[{"el":161,"sc":5,"sl":158},{"el":165,"sc":5,"sl":162}],"name":"ReplaceIdGenerators.StableNameSupplier","sl":157},{"el":226,"id":27976,"methods":[{"el":225,"sc":5,"sl":184}],"name":"ReplaceIdGenerators.GatherGenerators","sl":182},{"el":295,"id":28031,"methods":[{"el":294,"sc":5,"sl":237}],"name":"ReplaceIdGenerators.ReplaceGenerators","sl":236}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
