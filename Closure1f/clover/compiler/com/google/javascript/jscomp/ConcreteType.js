var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":718,"id":24333,"methods":[{"el":74,"sc":3,"sl":66},{"el":77,"sc":3,"sl":77},{"el":80,"sc":3,"sl":80},{"el":86,"sc":3,"sl":86},{"el":89,"sc":3,"sl":89},{"el":92,"sc":3,"sl":92},{"el":95,"sc":3,"sl":95},{"el":98,"sc":3,"sl":98},{"el":101,"sc":3,"sl":101},{"el":104,"sc":3,"sl":104},{"el":107,"sc":3,"sl":107},{"el":119,"sc":3,"sl":110},{"el":130,"sc":3,"sl":122},{"el":153,"sc":3,"sl":136},{"el":176,"sc":7,"sl":174},{"el":178,"sc":3,"sl":172},{"el":185,"sc":7,"sl":183},{"el":187,"sc":3,"sl":181},{"el":197,"sc":7,"sl":192},{"el":199,"sc":3,"sl":190},{"el":210,"sc":7,"sl":204},{"el":212,"sc":3,"sl":202},{"el":221,"sc":7,"sl":217},{"el":223,"sc":3,"sl":215},{"el":232,"sc":7,"sl":228},{"el":234,"sc":3,"sl":226},{"el":248,"sc":7,"sl":242},{"el":250,"sc":3,"sl":240},{"el":263,"sc":3,"sl":257}],"name":"ConcreteType","sl":47},{"el":169,"id":24403,"methods":[{"el":166,"sc":5,"sl":164}],"name":"ConcreteType.TypeFilter","sl":160},{"el":274,"id":24459,"methods":[{"el":267,"sc":5,"sl":267},{"el":269,"sc":5,"sl":269},{"el":271,"sc":5,"sl":271},{"el":273,"sc":5,"sl":273}],"name":"ConcreteType.ConcreteNoneType","sl":266},{"el":438,"id":24467,"methods":[{"el":312,"sc":5,"sl":302},{"el":314,"sc":5,"sl":314},{"el":316,"sc":5,"sl":316},{"el":326,"sc":5,"sl":324},{"el":331,"sc":5,"sl":329},{"el":336,"sc":5,"sl":334},{"el":341,"sc":5,"sl":339},{"el":352,"sc":5,"sl":344},{"el":357,"sc":5,"sl":355},{"el":362,"sc":5,"sl":360},{"el":376,"sc":5,"sl":368},{"el":385,"sc":5,"sl":379},{"el":392,"sc":5,"sl":388},{"el":400,"sc":5,"sl":395},{"el":437,"sc":5,"sl":408}],"name":"ConcreteType.ConcreteFunctionType","sl":285},{"el":545,"id":24558,"methods":[{"el":470,"sc":5,"sl":465},{"el":472,"sc":5,"sl":472},{"el":474,"sc":5,"sl":474},{"el":479,"sc":5,"sl":477},{"el":484,"sc":5,"sl":482},{"el":511,"sc":5,"sl":490},{"el":523,"sc":5,"sl":514},{"el":534,"sc":5,"sl":526},{"el":542,"sc":5,"sl":537},{"el":544,"sc":5,"sl":544}],"name":"ConcreteType.ConcreteInstanceType","sl":449},{"el":632,"id":24611,"methods":[{"el":557,"sc":5,"sl":555},{"el":562,"sc":5,"sl":559},{"el":564,"sc":5,"sl":564},{"el":566,"sc":5,"sl":566},{"el":592,"sc":5,"sl":568},{"el":609,"sc":5,"sl":594},{"el":612,"sc":5,"sl":612},{"el":617,"sc":5,"sl":614},{"el":621,"sc":5,"sl":619},{"el":631,"sc":5,"sl":623}],"name":"ConcreteType.ConcreteUnionType","sl":552},{"el":643,"id":24677,"methods":[{"el":636,"sc":5,"sl":636},{"el":638,"sc":5,"sl":638},{"el":640,"sc":5,"sl":640},{"el":642,"sc":5,"sl":642}],"name":"ConcreteType.ConcreteAll","sl":635},{"el":672,"id":24685,"methods":[{"el":660,"sc":5,"sl":656},{"el":665,"sc":5,"sl":662},{"el":669,"sc":5,"sl":667},{"el":671,"sc":5,"sl":671}],"name":"ConcreteType.ConcreteUniqueType","sl":653},{"el":717,"id":24694,"methods":[],"name":"ConcreteType.Factory","sl":680}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]