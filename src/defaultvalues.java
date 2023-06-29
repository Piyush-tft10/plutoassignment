import java.util.Arrays;

public class defaultvalues {
    int a;
    String st;
    double dd;
    int[] ar= new int[3];

    int[] tr;
    void Dtype(){

        System.out.println(a);
        System.out.println(st);
        System.out.println(dd);
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(tr));
    }
    public static void main(String[] args) {

        defaultvalues dt = new defaultvalues();
        dt.Dtype();

    }
}
