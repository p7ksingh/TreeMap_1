package TreeMap;
import java.util.TreeMap;

public class TreeMapEx2 {
  public static void main(String[] args) {
    TreeMap<String, String> tm = new TreeMap<String, String>();
    tm.put("F","FFF");
    tm.put("A", "AAA");
    tm.put("E", "BBB");
    tm.put("C", "CCC");
    System.out.println(tm);
    tm.put("C", "CCC");
    System.out.println(tm);
    //tm.put(null, "CCC");
    tm.put("F", null);
    System.out.println(tm);
  }
}
