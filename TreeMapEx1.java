package TreeMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {

        // TreeMap<String, String> tm = new TreeMap<String, String>();
        // System.out.println(tm);
        // SortedMap<String, String> sm = new TreeMap<>();
        // Map<String, String> sm=new HashMap<>();
        StringBuffer sb1 = new StringBuffer("AA");
        StringBuffer sb2 = new StringBuffer("BBBBB");
        StringBuffer sb3 = new StringBuffer("C");
        StringBuffer sb4 = new StringBuffer("DDD");
        StringBuffer sb5 = new StringBuffer("EEEE");
        // sm.put("A", "AAA");
        // sm.put("B", "BBB");
        // sm.put("C", "CCC");
        // sm.put("D", "DDD");
        // System.out.println(sm);
        // TreeMap<String, String> tm = new TreeMap<>();
        // TreeMap<String, String> tm = new TreeMap<>(sm);

        Comparator<StringBuffer> comp = new Comparator<StringBuffer>() {

            @Override
            public int compare(StringBuffer s1, StringBuffer s2) {

                return s1.length() - s2.length();
            }

        };

        TreeMap<StringBuffer, String> tm = new TreeMap<StringBuffer, String>();
        tm.put(sb2, "5-Length");
        tm.put(sb5, "4-Length");
        tm.put(sb3, "1-Length");
        tm.put(sb1, "2-Length");
        tm.put(sb4, "3-Length");
        System.out.println(tm);
    }
}