public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        char grade = 'M';

        switch (grade) {

            case 'A':
                System.out.println("Mükemmel gectiniz");
                break;

            case 'B':
                System.out.println("Çok güzel gectiniz");
                break;

            case 'C':
                System.out.println("İyi gectiniz");
                break;

            case 'D':
                System.out.println("Fena değil gectiniz");
                break;

            case 'F':
                System.out.println("Maalesef kaldınız ");

                break;
            default:
                System.out.println("Geçersiz not");


        }
    }
}