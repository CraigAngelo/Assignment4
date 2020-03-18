import java.util.*;

public class DataStructure {

    private List<Integer> totals;
    private Map location;
    private Set name;
    private TreeSet sort;

public DataStructure{

        totals = new ArrayList();
        totals.add(45);
        totals.add(38);
        totals.add(26);
        System.out.print(totals);
        Collections.sort(totals);

        name = new HashSet();
        name.add("Craig");
        name.add("Angelo");
        name.add("Bailey");
        System.out.print(name);
        sort = new TreeSet(name);

        location = new HashMap();
        location.put("Eastern Cape","PE");
        location.put("Western Cape","Mossel Bay");
        location.put("Northern Cape","Springbok");
        System.out.print(location);



    }

    public static List<Integer> getTotals() {
        return totals;
    }

    public static Map <String, String> getLocation() {
        return location;
    }

    public static Set<String> getName() {
        return name;

    }
}
