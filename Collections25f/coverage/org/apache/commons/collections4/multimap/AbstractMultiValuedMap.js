var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":926,"id":695,"methods":[{"el":90,"sc":5,"sl":82},{"el":114,"sc":5,"sl":102},{"el":123,"sc":5,"sl":121},{"el":130,"sc":5,"sl":128},{"el":145,"sc":5,"sl":135},{"el":156,"sc":5,"sl":150},{"el":163,"sc":5,"sl":161},{"el":176,"sc":5,"sl":174},{"el":190,"sc":5,"sl":188},{"el":219,"sc":5,"sl":205},{"el":226,"sc":5,"sl":224},{"el":233,"sc":5,"sl":231},{"el":244,"sc":5,"sl":238},{"el":256,"sc":5,"sl":253},{"el":263,"sc":5,"sl":261},{"el":290,"sc":5,"sl":275},{"el":308,"sc":5,"sl":302},{"el":327,"sc":5,"sl":320},{"el":342,"sc":5,"sl":340},{"el":349,"sc":5,"sl":347},{"el":387,"sc":5,"sl":359},{"el":397,"sc":5,"sl":392},{"el":427,"sc":5,"sl":399},{"el":450,"sc":5,"sl":429},{"el":455,"sc":5,"sl":452},{"el":461,"sc":5,"sl":459}],"name":"AbstractMultiValuedMap","sl":54},{"el":612,"id":909,"methods":[{"el":474,"sc":9,"sl":472},{"el":478,"sc":9,"sl":476},{"el":487,"sc":9,"sl":480},{"el":496,"sc":9,"sl":489},{"el":504,"sc":9,"sl":498},{"el":513,"sc":9,"sl":506},{"el":521,"sc":9,"sl":515},{"el":529,"sc":9,"sl":523},{"el":537,"sc":9,"sl":531},{"el":545,"sc":9,"sl":539},{"el":558,"sc":9,"sl":547},{"el":571,"sc":9,"sl":560},{"el":584,"sc":9,"sl":573},{"el":592,"sc":9,"sl":586},{"el":601,"sc":9,"sl":594},{"el":610,"sc":9,"sl":603}],"name":"AbstractMultiValuedMap.WrappedCollection","sl":468},{"el":768,"id":1026,"methods":[{"el":621,"sc":9,"sl":619},{"el":625,"sc":9,"sl":623},{"el":629,"sc":9,"sl":627},{"el":633,"sc":9,"sl":631},{"el":646,"sc":9,"sl":635},{"el":673,"sc":9,"sl":648},{"el":682,"sc":9,"sl":675},{"el":686,"sc":9,"sl":684},{"el":690,"sc":9,"sl":688},{"el":694,"sc":9,"sl":692},{"el":698,"sc":9,"sl":696},{"el":702,"sc":9,"sl":700},{"el":706,"sc":9,"sl":704},{"el":713,"sc":9,"sl":708},{"el":724,"sc":9,"sl":715},{"el":728,"sc":9,"sl":726},{"el":732,"sc":9,"sl":730},{"el":750,"sc":25,"sl":748},{"el":757,"sc":25,"sl":752},{"el":761,"sc":25,"sl":759},{"el":764,"sc":17,"sl":739},{"el":766,"sc":9,"sl":734}],"name":"AbstractMultiValuedMap.KeysBag","sl":617},{"el":805,"id":1129,"methods":[{"el":792,"sc":25,"sl":790},{"el":796,"sc":17,"sl":782},{"el":798,"sc":9,"sl":775},{"el":803,"sc":9,"sl":800}],"name":"AbstractMultiValuedMap.EntryValues","sl":773},{"el":821,"id":1143,"methods":[{"el":814,"sc":9,"sl":812},{"el":819,"sc":9,"sl":816}],"name":"AbstractMultiValuedMap.MultiValuedMapEntry","sl":810},{"el":870,"id":1147,"methods":[{"el":834,"sc":9,"sl":832},{"el":838,"sc":9,"sl":836},{"el":843,"sc":9,"sl":840},{"el":850,"sc":9,"sl":845},{"el":857,"sc":9,"sl":852},{"el":861,"sc":9,"sl":859},{"el":868,"sc":9,"sl":863}],"name":"AbstractMultiValuedMap.MultiValuedMapIterator","sl":826},{"el":894,"id":1174,"methods":[{"el":883,"sc":9,"sl":876},{"el":888,"sc":9,"sl":885},{"el":893,"sc":9,"sl":890}],"name":"AbstractMultiValuedMap.Values","sl":875},{"el":924,"id":1183,"methods":[{"el":908,"sc":9,"sl":904},{"el":915,"sc":9,"sl":910},{"el":919,"sc":9,"sl":917},{"el":923,"sc":9,"sl":921}],"name":"AbstractMultiValuedMap.ValuesIterator","sl":899}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]