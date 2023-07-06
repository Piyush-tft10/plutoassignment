    import java.util.*;
    public class occurhashmap {
        public static void main(String[] args) {
            String ss= "print occurrence using hashmap";
            String name= ss.replace(" ", "");
            Map<Character, Integer> cMap = new HashMap<Character, Integer>();
            char[] strarr = name.toCharArray();
            for(char c: strarr)
            {
                if(cMap.containsKey(c))
                {
                    cMap.put(c, cMap.get(c)+1);
                }
                else {
                    cMap.put(c, 1);
                }
            }
            System.out.println(name+ " : " +cMap);
        }


        }

