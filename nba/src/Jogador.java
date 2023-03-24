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
            this.id = Integer.parseInt(aux.nextToken());
        // }
        // System.prin
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
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.universidade);
        System.out.println(this.anoNascimento);
        System.out.println(this.cidadeNascimento);
        System.out.println(this.estadoNascimento);
    }
}
