var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":992,"id":40458,"methods":[{"el":70,"sc":5,"sl":67},{"el":95,"sc":3,"sl":90},{"el":99,"sc":3,"sl":97},{"el":119,"sc":3,"sl":101},{"el":135,"sc":3,"sl":121},{"el":216,"sc":3,"sl":154},{"el":226,"sc":3,"sl":222},{"el":307,"sc":11,"sl":300},{"el":318,"sc":3,"sl":232},{"el":363,"sc":3,"sl":330},{"el":378,"sc":3,"sl":365},{"el":394,"sc":3,"sl":384},{"el":404,"sc":7,"sl":401},{"el":406,"sc":3,"sl":399}],"name":"SideEffectsAnalysis","sl":53},{"el":63,"id":40458,"methods":[],"name":"SideEffectsAnalysis.LocationAbstractionMode","sl":58},{"el":426,"id":40584,"methods":[],"name":"SideEffectsAnalysis.AbstractMotionEnvironment","sl":420},{"el":458,"id":40584,"methods":[{"el":451,"sc":5,"sl":446},{"el":457,"sc":5,"sl":453}],"name":"SideEffectsAnalysis.IntraproceduralMotionEnvironment","sl":434},{"el":491,"id":40587,"methods":[{"el":484,"sc":5,"sl":478},{"el":490,"sc":5,"sl":486}],"name":"SideEffectsAnalysis.CrossModuleMotionEnvironment","sl":466},{"el":509,"id":40590,"methods":[{"el":503,"sc":5,"sl":501},{"el":508,"sc":5,"sl":505}],"name":"SideEffectsAnalysis.RawMotionEnvironment","sl":497},{"el":534,"id":40594,"methods":[{"el":525,"sc":5,"sl":522},{"el":529,"sc":5,"sl":527},{"el":533,"sc":5,"sl":531}],"name":"SideEffectsAnalysis.LocationSummary","sl":517},{"el":572,"id":40601,"methods":[],"name":"SideEffectsAnalysis.EffectLocation","sl":549},{"el":615,"id":40601,"methods":[{"el":614,"sc":5,"sl":602}],"name":"SideEffectsAnalysis.LocationAbstraction","sl":582},{"el":680,"id":40609,"methods":[{"el":637,"sc":5,"sl":634},{"el":642,"sc":5,"sl":639},{"el":650,"sc":5,"sl":644},{"el":658,"sc":5,"sl":652}],"name":"SideEffectsAnalysis.DegenerateLocationAbstraction","sl":625},{"el":679,"id":40625,"methods":[{"el":668,"sc":8,"sl":661},{"el":673,"sc":7,"sl":670},{"el":678,"sc":7,"sl":675}],"name":"SideEffectsAnalysis.DegenerateLocationAbstraction.DegenerateEffectLocation","sl":660},{"el":935,"id":40635,"methods":[{"el":736,"sc":5,"sl":730},{"el":773,"sc":5,"sl":741},{"el":789,"sc":9,"sl":783},{"el":793,"sc":5,"sl":779},{"el":835,"sc":5,"sl":798},{"el":840,"sc":5,"sl":837},{"el":849,"sc":5,"sl":847},{"el":878,"sc":5,"sl":854},{"el":886,"sc":5,"sl":883}],"name":"SideEffectsAnalysis.VisibilityLocationAbstraction","sl":708},{"el":934,"id":40710,"methods":[{"el":904,"sc":7,"sl":902},{"el":915,"sc":7,"sl":906},{"el":920,"sc":7,"sl":917},{"el":933,"sc":7,"sl":922}],"name":"SideEffectsAnalysis.VisibilityLocationAbstraction.VisibilityBasedEffectLocation","sl":898},{"el":991,"id":40723,"methods":[{"el":950,"sc":5,"sl":948},{"el":979,"sc":5,"sl":959},{"el":990,"sc":5,"sl":986}],"name":"SideEffectsAnalysis.VariableUseDeclarationMap","sl":941}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
