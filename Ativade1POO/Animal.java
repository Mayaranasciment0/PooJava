import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private int idade;
    private ArrayList<String> alimentos = new ArrayList<>();

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public Animal(String nome, String especie, int idade, ArrayList<String> alimentos) {
        this(nome, especie, idade);
        this.alimentos.addAll(alimentos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getAlimentos() {
        return alimentos;
    }

    public void adicionarAlimento(String alimento) {
        this.alimentos.add(alimento);
    }

    public String exibirInfo() {
        return "Nome do animal: " + nome +
                "\n Espécie: " + especie +
                "\n Idade: " + idade +
                "\n Alimentos que o animal consome: " + alimentos;
    }
}