import java.util.Random;

public class Dados {

    int roll = 0;
    int total = 0;
    int soma = 0;
    String v[] = {"!","@","#","$","%"};
    Random r = new Random();
    String roll2 = "";

    public void sorteioNum(int numeroLados, int jogadas, int modificadores) {
        if (numeroLados >= 4) {
            for (int i = 0; i < jogadas; i++) {
                roll = r.nextInt(numeroLados) + 1;
                soma = soma + roll;
                total = soma + modificadores;
                System.out.println("Caiu:" + roll);
            }
            System.out.println("Total:" + total);
        } else {
            System.out.println("Número de lados menor do que 4");
        }
    }
    public void sorteioSimbolos(boolean simbolo,int numeroLados, int jogadas2) {
        if (simbolo == true) {
                System.out.println("Dado de simbolo");
            if (numeroLados >= 4) {
                for (int i = 0; i < jogadas2; i++) {
                    roll2 = v[r.nextInt(numeroLados + 1)];
                    System.out.println("Caiu:" + roll2);
                }
            } else {
                System.out.println("Número de lados menor do que 4");
            }

        }
    }
}
