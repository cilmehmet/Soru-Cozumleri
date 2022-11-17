package ortak_soru;

import java.util.Scanner;

public class S24_K4_Menu {

    S24_K2_Registration registration = new S24_K2_Registration();
    S24_K3_Listing listing = new S24_K3_Listing();

    void giris (){

        System.out.println("Yapmak istediginiz islemi eciniz\n"
                            + "1. İsim Girisi\n"
                            + "2. Sansli isimleri listeleme\n"
                            + "3.Cıkıs"
                            + "Seciniz");

        Scanner scan = new Scanner(System.in);

        while (true){

            if (scan.hasNext()){

                int secim = scan.nextInt();

                switch (secim){

                    case  1:{registration.register();
                            giris();
                    }
                    case  2:{listing.listele(registration.userList);
                            giris();
                    }
                    case  3:{
                        System.out.println("Gulu Gule");
                        System.exit(0);
                    }
                    default:{
                        System.out.println("Gecerli deger giriniz.");
                    }
                }
            }else {
                System.out.println("Gecerli deger giriniz");
                giris();
            }
        }
    }
}