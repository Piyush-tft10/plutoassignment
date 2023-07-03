
public class Charoccur {


    public static void main(String[] args) {
        String ss = "this is the test assignment";
        String str = ss.replace(" ", "");
        int[] ar = new int[256];
        int val;
        for (int i = 0; i < str.length(); i++) {
            ar[str.charAt(i)] = ar[str.charAt(i)] + 1;

        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                val = ar[i];
                char ch = (char) i;
                System.out.println(ch + " " + val);


            }
        }
    }
}


