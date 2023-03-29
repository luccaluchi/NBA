import java.util.Scanner;

public class App {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        MyIO.setCharset("UTF-8");

        // lê os dados dos jogadores
        Jogador[] jogadores = lerJogadores();

        String numLinhas = s.nextLine();

        s.nextLine();

        // Array com ids
        String[] ids = new String[Integer.parseInt(numLinhas)];

        for (int i = 0; i < ids.length; i++) {
            try {
                ids[i] = s.nextLine();
            } catch (Exception e) {
            }
        }

        s.close();

        for (String i : ids) {
            if (i != null && !i.isEmpty()) {
                for (Jogador jogador : jogadores) {
                    if (jogador.getId() == Integer.parseInt(i)) {
                        jogador.imprimir();
                    }
                }
            }
        }

    }

    private static Jogador[] lerJogadores() {
        // Scanner s = new Scanner(System.in);

        // lê os dados dos jogadores e adiciona ao vetor de jogadores
        Jogador[] jogadores = new Jogador[20000];
        int numJogadores = 0;
        String linha = s.nextLine();

        while (!linha.equals("FIM")) {
            Jogador jogador = new Jogador(linha);

            jogadores[numJogadores] = jogador;
            numJogadores++;

            linha = s.nextLine();
        }

        // s.nextLine();
        // s.close();

        // cria um novo vetor de jogadores com o tamanho exato do número de jogadores
        // lidos
        Jogador[] jogadoresFinais = new Jogador[numJogadores];
        for (int i = 0; i < numJogadores; i++) {
            jogadoresFinais[i] = jogadores[i];
        }

        // for (Jogador jogador : jogadoresFinais) {
        // jogador.imprimir();
        // }

        return jogadoresFinais;
    }
}
