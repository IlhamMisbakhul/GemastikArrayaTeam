import java.util.Scanner;
import java.util.ArrayList;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int n = input.nextInt();
        int m = input.nextInt();

        System.out.print("Masukkan poin lawan : ");
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }

        System.out.print("Masukkan poin yang akan didapat bila mengalahkan musuh : ");
        for (int i = 0; i < n; i++) {
            b.add(input.nextInt());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;j++) {
                if (m >= a.get(j)) {
                    m += b.get(j);
                    b.set(j, 0);
                }
            }
        }

        System.out.println(m);
    }
}