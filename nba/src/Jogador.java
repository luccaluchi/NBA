import java.util.StringTokenizer;

public class Jogador {
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    // Construtores da classe
    public Jogador() {
    }

    public Jogador(int id, String nm, int altura, int peso, String unv, int aNas,
            String cNas, String eNas) {
        this.id = id;
        this.nome = nm;
        this.altura = altura;
        this.peso = peso;
        this.universidade = unv;
        this.anoNascimento = aNas;
        this.cidadeNascimento = cNas;
        this.estadoNascimento = eNas;
    }

    public Jogador(String packet) {
        StringTokenizer aux = new StringTokenizer(packet, ",");

        // while (aux.hasMoreTokens()) {
        // System.out.println(aux.nextToken());
        // System.out.println();
        // }

        // System.out.println();
        // System.out.println();

        /*
         * - id do jogador;
         * - nome do jogador;
         * - sua altura;
         * - seu peso;
         * - universidade que o jogador representa;
         * - ano de nascimento do jogador;
         * - nome da cidade em que o jogador nasceu;
         * - estado em que o jogador nasceu.
         */

        try {
            this.id = Integer.parseInt(aux.nextToken());
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.nome = aux.nextToken();
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.altura = Integer.parseInt(aux.nextToken());
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.peso = Integer.parseInt(aux.nextToken());
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.universidade = aux.nextToken();
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.anoNascimento = Integer.parseInt(aux.nextToken());
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.cidadeNascimento = aux.nextToken();
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
        try {
            this.estadoNascimento = aux.nextToken();
        } catch (Exception e) {
            if (aux.hasMoreTokens()) {
                aux.nextToken();
            }
        }
    }

    // getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getUniversidade() {
        return universidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    // Outros métodos
    public void imprimir() {
        System.out.print("[" + this.id);

        if (this.nome != null && !this.nome.isEmpty()) {
            System.out.print(" ## " + this.nome);
        } else {
            System.out.print(" ## nao informado");
        }

        if (this.altura != 0.0) {
            System.out.print(" ## " + this.altura);
        } else {
            System.out.print("## nao informado");
        }

        if (this.peso != 0.0) {
            System.out.print(" ## " + this.peso);
        } else {
            System.out.print("## nao informado");
        }

        if (this.anoNascimento != 0) {
            System.out.print(" ## " + this.anoNascimento);
        } else {
            System.out.print(" ## nao informado");
        }

        if (this.universidade != null && !this.universidade.isEmpty()) {
            System.out.print(" ## " + this.universidade);
        } else {
            System.out.print(" ## nao informado");
        }

        if (this.cidadeNascimento != null && !this.cidadeNascimento.isEmpty()) {
            System.out.print(" ## " + this.cidadeNascimento);
        } else {
            System.out.print(" ## nao informado");
        }

        if (this.estadoNascimento != null && !this.estadoNascimento.isEmpty()) {
            System.out.print(" ## " + this.estadoNascimento);
        } else {
            System.out.print(" ## nao informado");
        }

        System.out.println("]");

    }
}
