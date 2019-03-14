public class Main {

    public static void main(String[] args){
        int Retry = 0;

        Roll inicia = new Roll();
        inicia.init();

        Retry = Escaner.GetInt("Gostaria de jogar novamente? Digite 1 pra sim ou 2 para não");
        if (Retry == 1){
            inicia.init();
        }
    }
}
