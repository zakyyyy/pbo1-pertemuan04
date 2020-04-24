public class dowhile {
    public static void main(String[]args) {
        int isigelas = 0;
        int penuh = 11;

        System.out.println("isi gelas sekarang :" + isigelas + "m1");
        System.out.println("isi gelas ketika penuh :" + penuh + "m1");

        do {
            isigelas++;
            System.out.println("sedang mengisi gelas..");
            System.out.println("isi gelas sekarang : " + isigelas + "m1");
        } while (isigelas <= penuh);

        System.out.println("finale: isi gelas sekarang :" + isigelas + "m1");

    }
}