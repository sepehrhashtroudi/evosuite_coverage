var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":397,"id":29051,"methods":[{"el":38,"sc":5,"sl":36},{"el":42,"sc":5,"sl":40},{"el":46,"sc":5,"sl":44},{"el":49,"sc":5,"sl":48},{"el":52,"sc":5,"sl":51},{"el":67,"sc":5,"sl":55},{"el":84,"sc":5,"sl":70},{"el":97,"sc":5,"sl":87},{"el":110,"sc":5,"sl":99},{"el":122,"sc":5,"sl":112},{"el":140,"sc":5,"sl":124},{"el":161,"sc":5,"sl":142},{"el":167,"sc":5,"sl":164},{"el":172,"sc":5,"sl":169},{"el":177,"sc":5,"sl":174},{"el":186,"sc":5,"sl":180},{"el":194,"sc":5,"sl":188},{"el":203,"sc":5,"sl":197},{"el":221,"sc":5,"sl":206},{"el":228,"sc":5,"sl":224},{"el":234,"sc":5,"sl":230},{"el":247,"sc":5,"sl":236},{"el":260,"sc":5,"sl":249},{"el":269,"sc":5,"sl":262},{"el":286,"sc":5,"sl":272},{"el":305,"sc":5,"sl":288},{"el":321,"sc":5,"sl":307},{"el":340,"sc":5,"sl":323},{"el":356,"sc":5,"sl":342},{"el":374,"sc":5,"sl":358},{"el":387,"sc":5,"sl":376},{"el":395,"sc":5,"sl":390}],"name":"TestHours","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1086":{"methods":[{"sl":230}],"name":"testToStandardDays","pass":true,"statements":[{"sl":231},{"sl":232},{"sl":233}]},"test_112":{"methods":[{"sl":390}],"name":"testAddToLocalDate","pass":true,"statements":[{"sl":391},{"sl":392},{"sl":393},{"sl":394}]},"test_116":{"methods":[{"sl":188}],"name":"testIsLessThan","pass":true,"statements":[{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193}]},"test_117":{"methods":[{"sl":112}],"name":"testFactory_hoursIn_RInterval","pass":true,"statements":[{"sl":113},{"sl":114},{"sl":115},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121}]},"test_1204":{"methods":[{"sl":55}],"name":"testConstants","pass":true,"statements":[{"sl":56},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":64},{"sl":65},{"sl":66}]},"test_1425":{"methods":[{"sl":288}],"name":"testPlus_Hours","pass":true,"statements":[{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":296},{"sl":297},{"sl":299},{"sl":300}]},"test_1445":{"methods":[{"sl":174}],"name":"testGetPeriodType","pass":true,"statements":[{"sl":175},{"sl":176}]},"test_1724":{"methods":[{"sl":358}],"name":"testDividedBy_int","pass":true,"statements":[{"sl":359},{"sl":360},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":365},{"sl":366},{"sl":368},{"sl":369}]},"test_1730":{"methods":[{"sl":236}],"name":"testToStandardMinutes","pass":true,"statements":[{"sl":237},{"sl":238},{"sl":239},{"sl":241},{"sl":242}]},"test_2168":{"methods":[{"sl":206}],"name":"testSerialization","pass":true,"statements":[{"sl":207},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":215},{"sl":216},{"sl":217},{"sl":218},{"sl":220}]},"test_2210":{"methods":[{"sl":169}],"name":"testGetFieldType","pass":true,"statements":[{"sl":170},{"sl":171}]},"test_2257":{"methods":[{"sl":87}],"name":"testFactory_hoursBetween_RInstant","pass":true,"statements":[{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":94},{"sl":95},{"sl":96}]},"test_2305":{"methods":[{"sl":70}],"name":"testFactory_hours_int","pass":true,"statements":[{"sl":71},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83}]},"test_2430":{"methods":[{"sl":164}],"name":"testGetMethods","pass":true,"statements":[{"sl":165},{"sl":166}]},"test_2731":{"methods":[{"sl":272}],"name":"testPlus_int","pass":true,"statements":[{"sl":273},{"sl":274},{"sl":275},{"sl":276},{"sl":278},{"sl":280},{"sl":281}]},"test_2943":{"methods":[{"sl":262}],"name":"testToStandardDuration","pass":true,"statements":[{"sl":263},{"sl":264},{"sl":265},{"sl":267},{"sl":268}]},"test_3132":{"methods":[{"sl":307}],"name":"testMinus_int","pass":true,"statements":[{"sl":308},{"sl":309},{"sl":310},{"sl":311},{"sl":313},{"sl":315},{"sl":316}]},"test_3219":{"methods":[{"sl":142}],"name":"testFactory_parseHours_String","pass":true,"statements":[{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":148},{"sl":149},{"sl":150},{"sl":155},{"sl":156}]},"test_3336":{"methods":[{"sl":249}],"name":"testToStandardSeconds","pass":true,"statements":[{"sl":250},{"sl":251},{"sl":252},{"sl":254},{"sl":255}]},"test_3595":{"methods":[{"sl":180}],"name":"testIsGreaterThan","pass":true,"statements":[{"sl":181},{"sl":182},{"sl":183},{"sl":184},{"sl":185}]},"test_3658":{"methods":[{"sl":197}],"name":"testToString","pass":true,"statements":[{"sl":198},{"sl":199},{"sl":201},{"sl":202}]},"test_3666":{"methods":[{"sl":224}],"name":"testToStandardWeeks","pass":true,"statements":[{"sl":225},{"sl":226},{"sl":227}]},"test_3996":{"methods":[{"sl":376}],"name":"testNegated","pass":true,"statements":[{"sl":377},{"sl":378},{"sl":379},{"sl":381},{"sl":382}]},"test_858":{"methods":[{"sl":342}],"name":"testMultipliedBy_int","pass":true,"statements":[{"sl":343},{"sl":344},{"sl":345},{"sl":346},{"sl":347},{"sl":349},{"sl":350},{"sl":351}]},"test_862":{"methods":[{"sl":323}],"name":"testMinus_Hours","pass":true,"statements":[{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":331},{"sl":332},{"sl":334},{"sl":335}]},"test_87":{"methods":[{"sl":99}],"name":"testFactory_hoursBetween_RPartial","pass":true,"statements":[{"sl":100},{"sl":101},{"sl":102},{"sl":105},{"sl":106},{"sl":107},{"sl":108},{"sl":109}]},"test_904":{"methods":[{"sl":124}],"name":"testFactory_standardHoursIn_RPeriod","pass":true,"statements":[{"sl":125},{"sl":126},{"sl":127},{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [1204], [], [], [], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [2305], [], [], [], [2257], [2257], [2257], [2257], [], [2257], [2257], [2257], [2257], [2257], [], [], [87], [87], [87], [87], [], [], [87], [87], [87], [87], [87], [], [], [117], [117], [117], [117], [], [117], [117], [117], [117], [117], [], [], [904], [904], [904], [904], [904], [904], [904], [904], [904], [904], [904], [904], [], [], [], [], [], [], [3219], [3219], [3219], [3219], [3219], [3219], [3219], [3219], [3219], [], [], [], [], [3219], [3219], [], [], [], [], [], [], [], [2430], [2430], [2430], [], [], [2210], [2210], [2210], [], [], [1445], [1445], [1445], [], [], [], [3595], [3595], [3595], [3595], [3595], [3595], [], [], [116], [116], [116], [116], [116], [116], [], [], [], [3658], [3658], [3658], [], [3658], [3658], [], [], [], [2168], [2168], [], [2168], [2168], [2168], [2168], [2168], [], [2168], [2168], [2168], [2168], [], [2168], [], [], [], [3666], [3666], [3666], [3666], [], [], [1086], [1086], [1086], [1086], [], [], [1730], [1730], [1730], [1730], [], [1730], [1730], [], [], [], [], [], [], [3336], [3336], [3336], [3336], [], [3336], [3336], [], [], [], [], [], [], [2943], [2943], [2943], [2943], [], [2943], [2943], [], [], [], [2731], [2731], [2731], [2731], [2731], [], [2731], [], [2731], [2731], [], [], [], [], [], [], [1425], [1425], [1425], [1425], [1425], [1425], [1425], [], [1425], [1425], [], [1425], [1425], [], [], [], [], [], [], [3132], [3132], [3132], [3132], [3132], [], [3132], [], [3132], [3132], [], [], [], [], [], [], [862], [862], [862], [862], [862], [862], [862], [], [862], [862], [], [862], [862], [], [], [], [], [], [], [858], [858], [858], [858], [858], [858], [], [858], [858], [858], [], [], [], [], [], [], [1724], [1724], [1724], [1724], [1724], [1724], [1724], [1724], [1724], [], [1724], [1724], [], [], [], [], [], [], [3996], [3996], [3996], [3996], [], [3996], [3996], [], [], [], [], [], [], [], [112], [112], [112], [112], [112], [], [], []]
