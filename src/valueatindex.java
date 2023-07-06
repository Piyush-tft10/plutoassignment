public class valueatindex {

    public static void main(String[] args) {
        int arr[] = {50, 6, 1, 9, 3, 22, 590, 44, 90, 93, 9, 28, 3, 25, 80};

        int a = 0, b = 1, c, i, count = arr.length;
        System.out.println(arr[a]);
        System.out.println(arr[b]);
        try {
            for (i = 1; i < count; ++i) {
                c = a + b;
                System.out.println(arr[c]);
                a = b;
                b = c;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e);
        }
    }
}