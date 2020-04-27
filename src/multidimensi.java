public class multidimensi {
    public static void main(String[]args) {
        double[][] nilaimahasiswa = new double[5][30];
        double bobot[]= {0.1,0.2,0.3,0.4};


        nilaimahasiswa[0][0] = 80;
        nilaimahasiswa[1][0] = 90;
        nilaimahasiswa[2][0] = 75;
        nilaimahasiswa[3][0] = 70;

        nilaimahasiswa[4][0] = nilaimahasiswa[0][0] * bobot [0] +
                nilaimahasiswa[1][0] * bobot [1] +
                nilaimahasiswa[2][0] * bobot [2] +
                nilaimahasiswa[3][0] * bobot [3] ;

        System.out.println("nilai si mahasiswa 1 : " + nilaimahasiswa[4][0]);

        nilaimahasiswa[0][1] = 80;
        nilaimahasiswa[1][1] = 90;
        nilaimahasiswa[2][2] = 75;
        nilaimahasiswa[3][3] = 70;

        nilaimahasiswa[4][1]= 0;
        for (int i=0 ; i<3 ; i++) {
            nilaimahasiswa[4][1] +=nilaimahasiswa[i][1] * bobot[i];
        }

        System.out.println("nilai si mahasiswa 2 : " + nilaimahasiswa[4][1]);

        double jumlahnilaiakhir = 0;
        for (int i=0 ; i<3 ; i++) {
            jumlahnilaiakhir +=nilaimahasiswa[4][i];
        }

        System.out.println(jumlahnilaiakhir);

    }
}
