import java.util.Random;

public class Roll {

    public static int Rolls = 0;
    public static int Lados = 0;
    public static int Modificador = 0;

    public static int rollDice(int nRolls, int nSides, int nModifier) {
        int num = 0;
        int roll = 0;
        int total = 0;
        Random r = new Random();
        if (nSides >= 4) {
            for (int i = 0; i < nRolls; i++) {
                roll = r.nextInt(nSides) + 1;
                total = 0;
                total = roll + nModifier;
                MessageBox.Show("Caiu:" + roll);
                MessageBox.Show("Total:" + total);
                num = num + roll;
            }
        }else{
            MessageBox.Show("Número de lados menor do que 4");
            init();
        }
        return num;
    }

    public static void init(){
        Rolls = Escaner.GetInt("Escolha quantas vezes ira jogar: ");
        Lados = Escaner.GetInt("Escolha número de lados: ");
        Modificador = Escaner.GetInt("Digite o modificador: ");
        rollDice(Rolls,Lados,Modificador);
    }
}