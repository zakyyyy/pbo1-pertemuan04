public class kasus1 {
    public static void main(String[]args) {
        int isigelas = 0;
        int penuh = 3;
        String [] nama = {"jangan dimunum lagi puasa","kada puasa jua kda papa minum","saatnya minum"};

        System.out.println("isi gelas sekarang :" + isigelas + "m1");
        System.out.println("isi gelas ketika penuh :" + penuh + "m1");

        for (isigelas= 0; isigelas <= penuh ; isigelas++){
            System.out.println("sedang mengisi gelas..");
            System.out.println("isi gelas sekarang : " + isigelas + "m1");
        }

        System.out.println("finale: isi gelas sekarang :" + isigelas + "m1");
        System.out.println (nama[1]);
    }
}

