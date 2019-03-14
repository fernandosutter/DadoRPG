import java.util.Random;

public class Roll {

    public static int Rolls = 0;
    public static int Lados = 0;

    public static int rollDice(int nRolls, int nSides) {
        int num = 0;
        int roll = 0;
        Random r = new Random();
        if (nSides >= 3) {
            for (int i = 0; i < nRolls; i++) {
                roll = r.nextInt(nSides) + 1;
                MessageBox.Show("Caiu: "+ roll);
                num = num + roll;
            }
        } else {
            MessageBox.Show("Erro, precisa ter mais que 3 lados\n");
            init();
        }
        return num;
    }

    public static void init(){
        Rolls = Escaner.GetInt("Escolha quantas vezes ira jogar: ");
        Lados = Escaner.GetInt("Escolha número de lados: ");

        rollDice(Rolls,Lados);
    }
}