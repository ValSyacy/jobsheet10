import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main (String[] args){

        Scanner input02 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        int menu;

        System.out.println("Pilih menu\n1.Input data penonton\n2.Tampilkan data penonton\n3.Exit");
        menu = input02.nextInt();
        input02.nextLine();

        switch (menu) {
            case 1:
                while(true) {
                    System.out.print("Masukkan nama: ");
                    nama = input02.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = input02.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input02.nextInt();
                    input02.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/t): ");
                    next = input02.nextLine();

                        if (next.equalsIgnoreCase("y")) {
                            continue;
                        }else{
                            break;
                        }
                }
            case 2:
                for (int i = 0; i < penonton[2].length; i++) {
                    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
                break;
            default:
            break;

        }
    }
}