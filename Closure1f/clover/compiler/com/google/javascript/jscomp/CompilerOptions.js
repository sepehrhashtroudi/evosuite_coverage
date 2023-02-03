var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":2188,"id":47154,"methods":[{"el":141,"sc":3,"sl":139},{"el":157,"sc":3,"sl":155},{"el":167,"sc":3,"sl":165},{"el":174,"sc":3,"sl":172},{"el":181,"sc":3,"sl":179},{"el":188,"sc":3,"sl":186},{"el":198,"sc":3,"sl":196},{"el":205,"sc":3,"sl":203},{"el":219,"sc":3,"sl":217},{"el":229,"sc":3,"sl":227},{"el":241,"sc":3,"sl":239},{"el":305,"sc":3,"sl":303},{"el":312,"sc":3,"sl":310},{"el":344,"sc":3,"sl":342},{"el":354,"sc":3,"sl":352},{"el":468,"sc":3,"sl":466},{"el":519,"sc":3,"sl":517},{"el":544,"sc":3,"sl":532},{"el":564,"sc":3,"sl":562},{"el":636,"sc":3,"sl":634},{"el":716,"sc":3,"sl":714},{"el":728,"sc":3,"sl":726},{"el":735,"sc":3,"sl":733},{"el":741,"sc":3,"sl":739},{"el":745,"sc":3,"sl":743},{"el":775,"sc":3,"sl":773},{"el":782,"sc":3,"sl":780},{"el":823,"sc":3,"sl":821},{"el":980,"sc":3,"sl":841},{"el":987,"sc":3,"sl":985},{"el":995,"sc":3,"sl":993},{"el":1002,"sc":3,"sl":1000},{"el":1009,"sc":3,"sl":1007},{"el":1032,"sc":3,"sl":1014},{"el":1040,"sc":3,"sl":1038},{"el":1048,"sc":3,"sl":1046},{"el":1056,"sc":3,"sl":1054},{"el":1064,"sc":3,"sl":1062},{"el":1072,"sc":3,"sl":1070},{"el":1080,"sc":3,"sl":1078},{"el":1088,"sc":3,"sl":1086},{"el":1096,"sc":3,"sl":1094},{"el":1103,"sc":3,"sl":1101},{"el":1111,"sc":3,"sl":1109},{"el":1119,"sc":3,"sl":1117},{"el":1126,"sc":3,"sl":1124},{"el":1130,"sc":3,"sl":1128},{"el":1137,"sc":3,"sl":1135},{"el":1145,"sc":3,"sl":1143},{"el":1152,"sc":3,"sl":1150},{"el":1163,"sc":3,"sl":1159},{"el":1167,"sc":3,"sl":1165},{"el":1172,"sc":3,"sl":1170},{"el":1181,"sc":3,"sl":1179},{"el":1188,"sc":3,"sl":1186},{"el":1195,"sc":3,"sl":1193},{"el":1202,"sc":3,"sl":1200},{"el":1211,"sc":3,"sl":1209},{"el":1233,"sc":3,"sl":1216},{"el":1255,"sc":3,"sl":1238},{"el":1262,"sc":3,"sl":1260},{"el":1270,"sc":3,"sl":1267},{"el":1292,"sc":3,"sl":1275},{"el":1302,"sc":3,"sl":1297},{"el":1306,"sc":3,"sl":1304},{"el":1310,"sc":3,"sl":1308},{"el":1314,"sc":3,"sl":1312},{"el":1321,"sc":3,"sl":1319},{"el":1325,"sc":3,"sl":1323},{"el":1329,"sc":3,"sl":1327},{"el":1336,"sc":3,"sl":1334},{"el":1343,"sc":3,"sl":1341},{"el":1354,"sc":3,"sl":1351},{"el":1358,"sc":3,"sl":1356},{"el":1362,"sc":3,"sl":1360},{"el":1366,"sc":3,"sl":1364},{"el":1370,"sc":3,"sl":1368},{"el":1379,"sc":3,"sl":1376},{"el":1392,"sc":3,"sl":1385},{"el":1407,"sc":3,"sl":1403},{"el":1418,"sc":3,"sl":1416},{"el":1426,"sc":3,"sl":1423},{"el":1430,"sc":3,"sl":1428},{"el":1434,"sc":3,"sl":1432},{"el":1441,"sc":3,"sl":1439},{"el":1448,"sc":3,"sl":1446},{"el":1455,"sc":3,"sl":1453},{"el":1459,"sc":3,"sl":1457},{"el":1467,"sc":3,"sl":1464},{"el":1471,"sc":3,"sl":1469},{"el":1475,"sc":3,"sl":1473},{"el":1486,"sc":3,"sl":1484},{"el":1493,"sc":3,"sl":1488},{"el":1498,"sc":3,"sl":1495},{"el":1502,"sc":3,"sl":1500},{"el":1518,"sc":3,"sl":1516},{"el":1526,"sc":3,"sl":1524},{"el":1534,"sc":3,"sl":1532},{"el":1541,"sc":3,"sl":1539},{"el":1548,"sc":3,"sl":1546},{"el":1558,"sc":3,"sl":1554},{"el":1562,"sc":3,"sl":1560},{"el":1566,"sc":3,"sl":1564},{"el":1574,"sc":3,"sl":1572},{"el":1578,"sc":3,"sl":1576},{"el":1582,"sc":3,"sl":1580},{"el":1586,"sc":3,"sl":1584},{"el":1590,"sc":3,"sl":1588},{"el":1594,"sc":3,"sl":1592},{"el":1598,"sc":3,"sl":1596},{"el":1602,"sc":3,"sl":1600},{"el":1606,"sc":3,"sl":1604},{"el":1610,"sc":3,"sl":1608},{"el":1614,"sc":3,"sl":1612},{"el":1618,"sc":3,"sl":1616},{"el":1622,"sc":3,"sl":1620},{"el":1626,"sc":3,"sl":1624},{"el":1630,"sc":3,"sl":1628},{"el":1634,"sc":3,"sl":1632},{"el":1638,"sc":3,"sl":1636},{"el":1642,"sc":3,"sl":1640},{"el":1646,"sc":3,"sl":1644},{"el":1650,"sc":3,"sl":1648},{"el":1654,"sc":3,"sl":1652},{"el":1658,"sc":3,"sl":1656},{"el":1662,"sc":3,"sl":1660},{"el":1666,"sc":3,"sl":1664},{"el":1670,"sc":3,"sl":1668},{"el":1675,"sc":3,"sl":1672},{"el":1679,"sc":3,"sl":1677},{"el":1683,"sc":3,"sl":1681},{"el":1687,"sc":3,"sl":1685},{"el":1691,"sc":3,"sl":1689},{"el":1695,"sc":3,"sl":1693},{"el":1699,"sc":3,"sl":1697},{"el":1703,"sc":3,"sl":1701},{"el":1707,"sc":3,"sl":1705},{"el":1711,"sc":3,"sl":1709},{"el":1715,"sc":3,"sl":1713},{"el":1719,"sc":3,"sl":1717},{"el":1723,"sc":3,"sl":1721},{"el":1727,"sc":3,"sl":1725},{"el":1731,"sc":3,"sl":1729},{"el":1735,"sc":3,"sl":1733},{"el":1739,"sc":3,"sl":1737},{"el":1743,"sc":3,"sl":1741},{"el":1747,"sc":3,"sl":1745},{"el":1751,"sc":3,"sl":1749},{"el":1755,"sc":3,"sl":1753},{"el":1759,"sc":3,"sl":1757},{"el":1763,"sc":3,"sl":1761},{"el":1767,"sc":3,"sl":1765},{"el":1771,"sc":3,"sl":1769},{"el":1775,"sc":3,"sl":1773},{"el":1779,"sc":3,"sl":1777},{"el":1783,"sc":3,"sl":1781},{"el":1787,"sc":3,"sl":1785},{"el":1791,"sc":3,"sl":1789},{"el":1795,"sc":3,"sl":1793},{"el":1800,"sc":3,"sl":1797},{"el":1804,"sc":3,"sl":1802},{"el":1810,"sc":3,"sl":1806},{"el":1814,"sc":3,"sl":1812},{"el":1820,"sc":3,"sl":1816},{"el":1824,"sc":3,"sl":1822},{"el":1828,"sc":3,"sl":1826},{"el":1832,"sc":3,"sl":1830},{"el":1836,"sc":3,"sl":1834},{"el":1840,"sc":3,"sl":1838},{"el":1844,"sc":3,"sl":1842},{"el":1848,"sc":3,"sl":1846},{"el":1852,"sc":3,"sl":1850},{"el":1856,"sc":3,"sl":1854},{"el":1860,"sc":3,"sl":1858},{"el":1864,"sc":3,"sl":1862},{"el":1868,"sc":3,"sl":1866},{"el":1872,"sc":3,"sl":1870},{"el":1876,"sc":3,"sl":1874},{"el":1880,"sc":3,"sl":1878},{"el":1884,"sc":3,"sl":1882},{"el":1888,"sc":3,"sl":1886},{"el":1892,"sc":3,"sl":1890},{"el":1896,"sc":3,"sl":1894},{"el":1900,"sc":3,"sl":1898},{"el":1904,"sc":3,"sl":1902},{"el":1908,"sc":3,"sl":1906},{"el":1912,"sc":3,"sl":1910},{"el":1916,"sc":3,"sl":1914},{"el":1920,"sc":3,"sl":1918},{"el":1924,"sc":3,"sl":1922},{"el":1928,"sc":3,"sl":1926},{"el":1932,"sc":3,"sl":1930},{"el":1936,"sc":3,"sl":1934},{"el":1940,"sc":3,"sl":1938},{"el":1944,"sc":3,"sl":1942},{"el":1948,"sc":3,"sl":1946},{"el":1952,"sc":3,"sl":1950},{"el":1956,"sc":3,"sl":1954},{"el":1960,"sc":3,"sl":1958},{"el":1964,"sc":3,"sl":1962},{"el":1968,"sc":3,"sl":1966},{"el":1972,"sc":3,"sl":1970},{"el":1976,"sc":3,"sl":1974},{"el":1980,"sc":3,"sl":1978},{"el":1984,"sc":3,"sl":1982},{"el":1988,"sc":3,"sl":1986},{"el":1992,"sc":3,"sl":1990},{"el":1999,"sc":3,"sl":1997},{"el":2007,"sc":3,"sl":2005},{"el":2014,"sc":3,"sl":2012}],"name":"CompilerOptions","sl":40},{"el":51,"id":47154,"methods":[],"name":"CompilerOptions.Reach","sl":47},{"el":2050,"id":47773,"methods":[{"el":2049,"sc":5,"sl":2037}],"name":"CompilerOptions.LanguageMode","sl":2021},{"el":2073,"id":47787,"methods":[],"name":"CompilerOptions.DevMode","sl":2053},{"el":2084,"id":47787,"methods":[{"el":2083,"sc":5,"sl":2081}],"name":"CompilerOptions.TracerMode","sl":2075},{"el":2098,"id":47789,"methods":[{"el":2093,"sc":5,"sl":2091},{"el":2097,"sc":5,"sl":2095}],"name":"CompilerOptions.TweakProcessing","sl":2086},{"el":2135,"id":47793,"methods":[],"name":"CompilerOptions.AliasTransformationHandler","sl":2113},{"el":2156,"id":47793,"methods":[],"name":"CompilerOptions.AliasTransformation","sl":2144},{"el":2187,"id":47793,"methods":[{"el":2177,"sc":5,"sl":2172}],"name":"CompilerOptions.NullAliasTransformationHandler","sl":2165},{"el":2186,"id":47796,"methods":[{"el":2185,"sc":7,"sl":2183}],"name":"CompilerOptions.NullAliasTransformationHandler.NullAliasTransformation","sl":2179}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]