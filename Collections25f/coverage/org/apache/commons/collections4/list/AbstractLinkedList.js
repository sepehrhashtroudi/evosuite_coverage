var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":1067,"id":14620,"methods":[{"el":78,"sc":5,"sl":76},{"el":89,"sc":5,"sl":85},{"el":99,"sc":5,"sl":97},{"el":105,"sc":5,"sl":103},{"el":109,"sc":5,"sl":107},{"el":114,"sc":5,"sl":111},{"el":120,"sc":5,"sl":118},{"el":124,"sc":5,"sl":122},{"el":128,"sc":5,"sl":126},{"el":141,"sc":5,"sl":132},{"el":152,"sc":5,"sl":143},{"el":156,"sc":5,"sl":154},{"el":165,"sc":5,"sl":158},{"el":171,"sc":5,"sl":169},{"el":190,"sc":5,"sl":173},{"el":201,"sc":5,"sl":199},{"el":208,"sc":5,"sl":205},{"el":213,"sc":5,"sl":210},{"el":217,"sc":5,"sl":215},{"el":225,"sc":5,"sl":219},{"el":234,"sc":5,"sl":229},{"el":244,"sc":5,"sl":236},{"el":265,"sc":5,"sl":255},{"el":288,"sc":5,"sl":278},{"el":295,"sc":5,"sl":290},{"el":299,"sc":5,"sl":297},{"el":309,"sc":5,"sl":303},{"el":317,"sc":5,"sl":311},{"el":322,"sc":5,"sl":319},{"el":327,"sc":5,"sl":324},{"el":337,"sc":5,"sl":329},{"el":347,"sc":5,"sl":339},{"el":372,"sc":5,"sl":350},{"el":381,"sc":5,"sl":374},{"el":403,"sc":5,"sl":383},{"el":417,"sc":5,"sl":415},{"el":429,"sc":5,"sl":427},{"el":440,"sc":5,"sl":438},{"el":452,"sc":5,"sl":450},{"el":468,"sc":5,"sl":465},{"el":484,"sc":5,"sl":481},{"el":500,"sc":5,"sl":493},{"el":513,"sc":5,"sl":508},{"el":523,"sc":5,"sl":518},{"el":567,"sc":5,"sl":536},{"el":578,"sc":5,"sl":576},{"el":589,"sc":5,"sl":587},{"el":607,"sc":5,"sl":601},{"el":626,"sc":5,"sl":619}],"name":"AbstractLinkedList","sl":44},{"el":736,"id":14923,"methods":[{"el":651,"sc":9,"sl":647},{"el":661,"sc":9,"sl":658},{"el":675,"sc":9,"sl":670},{"el":685,"sc":9,"sl":683},{"el":695,"sc":9,"sl":693},{"el":705,"sc":9,"sl":703},{"el":715,"sc":9,"sl":713},{"el":725,"sc":9,"sl":723},{"el":735,"sc":9,"sl":733}],"name":"AbstractLinkedList.Node","sl":635},{"el":888,"id":14947,"methods":[{"el":790,"sc":9,"sl":783},{"el":803,"sc":9,"sl":799},{"el":817,"sc":9,"sl":812},{"el":821,"sc":9,"sl":819},{"el":833,"sc":9,"sl":823},{"el":837,"sc":9,"sl":835},{"el":849,"sc":9,"sl":839},{"el":853,"sc":9,"sl":851},{"el":858,"sc":9,"sl":855},{"el":873,"sc":9,"sl":860},{"el":878,"sc":9,"sl":875},{"el":886,"sc":9,"sl":880}],"name":"AbstractLinkedList.LinkedListIterator","sl":742},{"el":932,"id":15014,"methods":[{"el":902,"sc":9,"sl":899},{"el":907,"sc":9,"sl":904},{"el":912,"sc":9,"sl":909},{"el":917,"sc":9,"sl":914},{"el":924,"sc":9,"sl":919},{"el":931,"sc":9,"sl":926}],"name":"AbstractLinkedList.LinkedSubListIterator","sl":894},{"el":1065,"id":15031,"methods":[{"el":962,"sc":9,"sl":948},{"el":968,"sc":9,"sl":964},{"el":975,"sc":9,"sl":970},{"el":985,"sc":9,"sl":977},{"el":996,"sc":9,"sl":987},{"el":1001,"sc":9,"sl":998},{"el":1017,"sc":9,"sl":1003},{"el":1024,"sc":9,"sl":1019},{"el":1034,"sc":9,"sl":1026},{"el":1040,"sc":9,"sl":1036},{"el":1047,"sc":9,"sl":1042},{"el":1052,"sc":9,"sl":1049},{"el":1058,"sc":9,"sl":1054},{"el":1064,"sc":9,"sl":1060}],"name":"AbstractLinkedList.LinkedSubList","sl":938}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
