public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        String ogrenci1="Meryem";
        String ogrenci2="Meltem";
        String ogrenci3="Mehmet";
        String ogrenci4="Rıdvan";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler=new String[4];

        ogrenciler[0]="Rıdvan";
        ogrenciler[1]="Meltem";
        ogrenciler[2]="Memet";
        ogrenciler[3]="Memet";

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);


        }


    }
}