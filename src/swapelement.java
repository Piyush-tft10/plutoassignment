import java.util.Arrays;

public class swapelement {

    public static void main(String[] args) {
        int[] arr = {2, 9, 0, 44, 58, 289, 3, 90, 22, 234, 897};
        int[] arr2 = new int[4];
        int j=0;
        for(int i=1; i<arr.length; i++) {
            if (i % 3 == 0) {
                arr2[j] = arr[i];
                j++;

            }
        }
        for(int k=0; k<j; k++){
            System.out.println(arr2[k]);
    }
        }


}