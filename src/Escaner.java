import java.util.Scanner;

public class Escaner {

    public static Scanner sc = new Scanner(System.in);

    public static int GetInt(String Texto) {
        int tmp = 0;

        MessageBox.Show(Texto);

        tmp = sc.nextInt();

        return tmp;
    }
}