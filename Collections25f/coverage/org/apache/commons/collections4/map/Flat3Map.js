var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1249,"id":8217,"methods":[{"el":106,"sc":5,"sl":104},{"el":117,"sc":5,"sl":114},{"el":167,"sc":5,"sl":126},{"el":179,"sc":5,"sl":174},{"el":188,"sc":5,"sl":186},{"el":236,"sc":5,"sl":197},{"el":280,"sc":5,"sl":244},{"el":366,"sc":5,"sl":290},{"el":391,"sc":5,"sl":374},{"el":415,"sc":5,"sl":396},{"el":429,"sc":5,"sl":427},{"el":579,"sc":5,"sl":437},{"el":595,"sc":5,"sl":585},{"el":617,"sc":5,"sl":609},{"el":734,"sc":5,"sl":729},{"el":953,"sc":5,"sl":948},{"el":1027,"sc":5,"sl":1022},{"el":1093,"sc":5,"sl":1086},{"el":1108,"sc":5,"sl":1098},{"el":1129,"sc":5,"sl":1117},{"el":1182,"sc":5,"sl":1137},{"el":1208,"sc":5,"sl":1189},{"el":1247,"sc":5,"sl":1215}],"name":"Flat3Map","sl":73},{"el":717,"id":8657,"methods":[{"el":630,"sc":9,"sl":627},{"el":634,"sc":9,"sl":632},{"el":643,"sc":9,"sl":636},{"el":652,"sc":9,"sl":645},{"el":667,"sc":9,"sl":654},{"el":682,"sc":9,"sl":669},{"el":703,"sc":9,"sl":684},{"el":708,"sc":9,"sl":705},{"el":716,"sc":9,"sl":710}],"name":"Flat3Map.FlatMapIterator","sl":622},{"el":779,"id":8738,"methods":[{"el":745,"sc":9,"sl":742},{"el":750,"sc":9,"sl":747},{"el":755,"sc":9,"sl":752},{"el":767,"sc":9,"sl":757},{"el":778,"sc":9,"sl":769}],"name":"Flat3Map.EntrySet","sl":739},{"el":890,"id":8765,"methods":[{"el":790,"sc":9,"sl":786},{"el":803,"sc":9,"sl":801},{"el":818,"sc":9,"sl":805},{"el":833,"sc":9,"sl":820},{"el":854,"sc":9,"sl":835},{"el":869,"sc":9,"sl":856},{"el":880,"sc":9,"sl":871},{"el":888,"sc":9,"sl":882}],"name":"Flat3Map.FlatMapEntry","sl":781},{"el":926,"id":8851,"methods":[{"el":902,"sc":9,"sl":900},{"el":906,"sc":9,"sl":904},{"el":914,"sc":9,"sl":908},{"el":924,"sc":9,"sl":916}],"name":"Flat3Map.EntryIterator","sl":892},{"el":939,"id":8871,"methods":[{"el":934,"sc":9,"sl":932},{"el":938,"sc":9,"sl":936}],"name":"Flat3Map.EntrySetIterator","sl":931},{"el":998,"id":8881,"methods":[{"el":964,"sc":9,"sl":961},{"el":969,"sc":9,"sl":966},{"el":974,"sc":9,"sl":971},{"el":979,"sc":9,"sl":976},{"el":986,"sc":9,"sl":981},{"el":997,"sc":9,"sl":988}],"name":"Flat3Map.KeySet","sl":958},{"el":1013,"id":8904,"methods":[{"el":1008,"sc":9,"sl":1005},{"el":1012,"sc":9,"sl":1010}],"name":"Flat3Map.KeySetIterator","sl":1003},{"el":1065,"id":8914,"methods":[{"el":1038,"sc":9,"sl":1035},{"el":1043,"sc":9,"sl":1040},{"el":1048,"sc":9,"sl":1045},{"el":1053,"sc":9,"sl":1050},{"el":1064,"sc":9,"sl":1055}],"name":"Flat3Map.Values","sl":1032},{"el":1080,"id":8933,"methods":[{"el":1075,"sc":9,"sl":1072},{"el":1079,"sc":9,"sl":1077}],"name":"Flat3Map.ValuesIterator","sl":1070}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
