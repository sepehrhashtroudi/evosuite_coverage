var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1335,"id":15440,"methods":[{"el":83,"sc":3,"sl":81},{"el":100,"sc":3,"sl":96},{"el":104,"sc":3,"sl":102},{"el":109,"sc":3,"sl":106},{"el":114,"sc":3,"sl":111},{"el":119,"sc":3,"sl":116},{"el":125,"sc":3,"sl":121},{"el":130,"sc":3,"sl":127},{"el":136,"sc":3,"sl":132},{"el":141,"sc":3,"sl":138},{"el":147,"sc":3,"sl":143},{"el":153,"sc":3,"sl":149},{"el":162,"sc":3,"sl":159},{"el":171,"sc":3,"sl":168},{"el":183,"sc":3,"sl":179},{"el":227,"sc":3,"sl":218},{"el":240,"sc":3,"sl":237},{"el":251,"sc":3,"sl":248},{"el":267,"sc":3,"sl":261},{"el":277,"sc":3,"sl":275}],"name":"GlobalNamespace","sl":51},{"el":213,"id":15481,"methods":[{"el":194,"sc":5,"sl":192},{"el":212,"sc":5,"sl":196}],"name":"GlobalNamespace.NodeFilter","sl":189},{"el":845,"id":15523,"methods":[{"el":290,"sc":5,"sl":288},{"el":298,"sc":5,"sl":296},{"el":301,"sc":5,"sl":300},{"el":308,"sc":5,"sl":304},{"el":438,"sc":5,"sl":310},{"el":508,"sc":5,"sl":456},{"el":538,"sc":5,"sl":516},{"el":573,"sc":5,"sl":552},{"el":593,"sc":5,"sl":585},{"el":620,"sc":5,"sl":604},{"el":681,"sc":5,"sl":631},{"el":738,"sc":5,"sl":695},{"el":756,"sc":5,"sl":750},{"el":807,"sc":5,"sl":769},{"el":820,"sc":5,"sl":817},{"el":844,"sc":5,"sl":829}],"name":"GlobalNamespace.BuildGlobalNamespace","sl":284},{"el":1157,"id":15899,"methods":[{"el":892,"sc":5,"sl":887},{"el":901,"sc":5,"sl":894},{"el":905,"sc":5,"sl":903},{"el":910,"sc":5,"sl":907},{"el":914,"sc":5,"sl":912},{"el":919,"sc":5,"sl":916},{"el":924,"sc":5,"sl":921},{"el":929,"sc":5,"sl":926},{"el":962,"sc":5,"sl":931},{"el":1004,"sc":5,"sl":964},{"el":1008,"sc":5,"sl":1006},{"el":1015,"sc":5,"sl":1010},{"el":1030,"sc":5,"sl":1017},{"el":1042,"sc":5,"sl":1032},{"el":1049,"sc":5,"sl":1044},{"el":1053,"sc":5,"sl":1051},{"el":1085,"sc":5,"sl":1055},{"el":1090,"sc":5,"sl":1088},{"el":1094,"sc":5,"sl":1092},{"el":1102,"sc":5,"sl":1096},{"el":1106,"sc":5,"sl":1104},{"el":1118,"sc":5,"sl":1116},{"el":1126,"sc":5,"sl":1124},{"el":1132,"sc":5,"sl":1128},{"el":1137,"sc":5,"sl":1134},{"el":1156,"sc":5,"sl":1142}],"name":"GlobalNamespace.Name","sl":855},{"el":862,"id":15899,"methods":[],"name":"GlobalNamespace.Name.Type","sl":856},{"el":1276,"id":16094,"methods":[{"el":1204,"sc":5,"sl":1196},{"el":1214,"sc":5,"sl":1206},{"el":1223,"sc":5,"sl":1216},{"el":1228,"sc":5,"sl":1225},{"el":1233,"sc":5,"sl":1230},{"el":1238,"sc":5,"sl":1235},{"el":1242,"sc":5,"sl":1240},{"el":1246,"sc":5,"sl":1244},{"el":1250,"sc":5,"sl":1248},{"el":1254,"sc":5,"sl":1252},{"el":1263,"sc":5,"sl":1256},{"el":1271,"sc":5,"sl":1269},{"el":1275,"sc":5,"sl":1273}],"name":"GlobalNamespace.Ref","sl":1165},{"el":1174,"id":16094,"methods":[],"name":"GlobalNamespace.Ref.Type","sl":1166},{"el":1334,"id":16143,"methods":[{"el":1303,"sc":5,"sl":1298},{"el":1333,"sc":5,"sl":1305}],"name":"GlobalNamespace.Tracker","sl":1286}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]