
public class Charoccur {


    public static void main(String[] args) {
        String ss= "this is the test assignment";
        String str= ss.replace(" ", "");
        int [] ar= new int[256];
        for(int i=0; i<str.length(); i++){
            ar[str.charAt(i)]= ar[str.charAt(i)] + 1;
        }

        for(int i=0; i<str.length(); i++){
            int count= ar[str.charAt(i)];
            char ch= str.charAt(i);
            System.out.println(ch+" "+ count);


        }
    }
}


