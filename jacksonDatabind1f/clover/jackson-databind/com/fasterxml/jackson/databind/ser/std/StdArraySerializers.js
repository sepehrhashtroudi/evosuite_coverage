var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":668,"id":4928,"methods":[{"el":37,"sc":5,"sl":27},{"el":39,"sc":5,"sl":39},{"el":48,"sc":5,"sl":45}],"name":"StdArraySerializers","sl":23},{"el":78,"id":4940,"methods":[{"el":71,"sc":9,"sl":68},{"el":77,"sc":9,"sl":73}],"name":"StdArraySerializers.TypedPrimitiveArraySerializer","sl":60},{"el":153,"id":4946,"methods":[{"el":93,"sc":9,"sl":93},{"el":102,"sc":9,"sl":99},{"el":107,"sc":9,"sl":104},{"el":113,"sc":9,"sl":109},{"el":118,"sc":9,"sl":115},{"el":123,"sc":9,"sl":120},{"el":132,"sc":9,"sl":125},{"el":140,"sc":9,"sl":134},{"el":152,"sc":9,"sl":142}],"name":"StdArraySerializers.BooleanArraySerializer","sl":87},{"el":214,"id":4976,"methods":[{"el":168,"sc":9,"sl":166},{"el":173,"sc":9,"sl":170},{"el":181,"sc":9,"sl":175},{"el":192,"sc":9,"sl":183},{"el":201,"sc":9,"sl":194},{"el":213,"sc":9,"sl":203}],"name":"StdArraySerializers.ByteArraySerializer","sl":163},{"el":292,"id":5000,"methods":[{"el":223,"sc":9,"sl":223},{"el":226,"sc":9,"sl":224},{"el":231,"sc":9,"sl":228},{"el":236,"sc":9,"sl":233},{"el":242,"sc":9,"sl":238},{"el":247,"sc":9,"sl":244},{"el":252,"sc":9,"sl":249},{"el":270,"sc":9,"sl":254},{"el":279,"sc":9,"sl":272},{"el":291,"sc":9,"sl":281}],"name":"StdArraySerializers.ShortArraySerializer","sl":217},{"el":372,"id":5042,"methods":[{"el":305,"sc":9,"sl":305},{"el":310,"sc":9,"sl":307},{"el":324,"sc":9,"sl":312},{"el":341,"sc":9,"sl":326},{"el":349,"sc":9,"sl":343},{"el":359,"sc":9,"sl":351},{"el":371,"sc":9,"sl":361}],"name":"StdArraySerializers.CharArraySerializer","sl":302},{"el":441,"id":5084,"methods":[{"el":381,"sc":9,"sl":381},{"el":390,"sc":9,"sl":387},{"el":395,"sc":9,"sl":392},{"el":401,"sc":9,"sl":397},{"el":406,"sc":9,"sl":403},{"el":411,"sc":9,"sl":408},{"el":420,"sc":9,"sl":413},{"el":428,"sc":9,"sl":422},{"el":440,"sc":9,"sl":430}],"name":"StdArraySerializers.IntArraySerializer","sl":375},{"el":519,"id":5114,"methods":[{"el":450,"sc":9,"sl":450},{"el":454,"sc":9,"sl":451},{"el":459,"sc":9,"sl":456},{"el":464,"sc":9,"sl":461},{"el":470,"sc":9,"sl":466},{"el":475,"sc":9,"sl":472},{"el":480,"sc":9,"sl":477},{"el":498,"sc":9,"sl":482},{"el":506,"sc":9,"sl":500},{"el":518,"sc":9,"sl":508}],"name":"StdArraySerializers.LongArraySerializer","sl":444},{"el":598,"id":5156,"methods":[{"el":530,"sc":9,"sl":528},{"el":534,"sc":9,"sl":531},{"el":539,"sc":9,"sl":536},{"el":544,"sc":9,"sl":541},{"el":550,"sc":9,"sl":546},{"el":555,"sc":9,"sl":552},{"el":560,"sc":9,"sl":557},{"el":577,"sc":9,"sl":562},{"el":585,"sc":9,"sl":579},{"el":597,"sc":9,"sl":587}],"name":"StdArraySerializers.FloatArraySerializer","sl":522},{"el":667,"id":5198,"methods":[{"el":607,"sc":9,"sl":607},{"el":616,"sc":9,"sl":613},{"el":621,"sc":9,"sl":618},{"el":627,"sc":9,"sl":623},{"el":632,"sc":9,"sl":629},{"el":637,"sc":9,"sl":634},{"el":646,"sc":9,"sl":639},{"el":654,"sc":9,"sl":648},{"el":666,"sc":9,"sl":656}],"name":"StdArraySerializers.DoubleArraySerializer","sl":601}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]