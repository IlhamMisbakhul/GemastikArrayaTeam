import java.util.Scanner;

public class GemastikSandi {
    public static void main(String[] args) {
        String[][] tableSatu = {
                {"AB", "DC", "CC", "CB"},
                {"CA", "DA", "CD", "DD"},
                {"BC", "AA", "BA", "DB"},
                {"BD", "AD", "BB", "AC"}
        };

        String[][] tableDua = {
                {"CD", "BB", "AC", "CC"},
                {"CB", "DB", "AD", "DD"},
                {"DA", "DC", "BC", "BD"},
                {"AA", "BA", "CA", "AB"}
        };

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] dataPecah = data.split("(?<=\\G.{" + 2 + "})");

        String hasil = "";
        for (int i = 0; i < dataPecah.length; i++) {
            char[] perHuruf = dataPecah[i].toCharArray();
            String dua = getIndex(tableDua, dataPecah[i]);
            String satu = getIndex(tableSatu, dua);
            hasil += satu;
        }
        System.out.println(hasil);
    }

    public static String getIndex (String[][] table, String a) {
        String huruf = "";
        for (int i = 0; i < table.length; i++ ) {
            for(int j = 0; j < table.length; j++) {
                if(table[i][j].equalsIgnoreCase(a)) {
                    String hurufSatu = getHuruf(i);
                    String hurufDua = getHuruf(j);
                    huruf = hurufSatu+hurufDua;
                    break;
                }
            }
        }
        return huruf;
    }

    public static String getHuruf(int a) {
        if(a == 0) {
            return "A";
        } else if(a == 1) {
            return "B";
        } else if(a == 2) {
            return "C";
        } else {
            return "D";
        }
    }
}