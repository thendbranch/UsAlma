// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan
            programı "For Döngüsü" kullanarak yapınız.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Sayınızı Giriniz : ");
        int t = input.nextInt();
        System.out.println("Üs Sayısını Giriniz : ");
        int u = input.nextInt();

        int a = t;
        for (int i = 1; i< u; i++) {
            a*=t;
        }
        System.out.println(t + "^" + u + " = " + a);
    }
}