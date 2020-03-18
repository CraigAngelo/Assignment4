import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
public class DataStructureTest {

DataStructure dataStructure;

    @Test
    public void TestList(){

        dataStructure = new DataStructure();
        List<Integer> actualList  = DataStructure.getTotals();
        List<Integer> expectedList = Arrays.asList(45,38,26);

        Map<String,String> actualMap = DataStructure.getLocation();
        Map expectedMap = new HashMap();
        expectedMap.put("Eastern Cape", "PE");
        expectedMap.put("Western Cape", "Mossel Bay");
        expectedMap.put("Northen Cape", "Springbok");

        Set<String> actualSet = DataStructure.getName();
        Set<String> expectedSet = new HashSet<String>();
        expectedSet.add("Craig");
        expectedSet.add("Angelo");
        expectedSet.add("Bailey");
        TreeSet sort = new TreeSet(expectedSet);


        assertThat(actualList,is(expectedList));
        assertThat(actualList,hasItems(45));
        assertThat(actualList,hasItems(38));
        assertThat(actualList,hasItems(26));


        assertThat(actualSet,is(expectedSet));
        assertThat(actualSet,hasItems("Craig"));




        assertThat(actualMap,is(expectedMap));
        assertThat(actualMap.size(),is (3));
    }


}


