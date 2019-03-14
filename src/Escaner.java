import java.util.Scanner;

public class Escaner {

    public static Scanner sc = new Scanner(System.in);

    public static int GetInt(String Texto) {
        int tmp = 0;

        MessageBox.Show(Texto);
        while (true) {
            try {
                String s = sc.next();
                tmp = Integer.parseInt(s);
                break;
            }catch (Exception e){MessageBox.Show("Favor digitar número correto: ");}
        }
        return tmp;
    }
}