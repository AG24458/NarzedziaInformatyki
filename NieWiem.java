public class NieWiem {
    public static void main(String[] args) {

        int[] a = new int[2];
        System.out.println("długość tablicy a = " + a.length);
        a[0] = 112;
        a[1] = 333;
        System.out.println(a[0] + a[1]);

        try {
            a[2] = 555;

        } catch (Exception e){
            System.out.println(e);
        }


    }
}
