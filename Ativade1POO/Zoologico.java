import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : animais) {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                System.out.println("Idade: " + animal.getIdade());

            }
        }
    }

    public void buscarPorEspecie(String especie) {
        boolean encontrado = false;
        for (Animal animal : animais) {
            if (animal.getEspecie().equalsIgnoreCase(especie)) {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Espécie: " + animal.getEspecie());
                System.out.println("Idade: " + animal.getIdade());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum animal da espécie '" + especie + "' encontrado.");
        }
    }

    public void removerAnimal(String nome) {
        boolean removido = false;
        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            if (animal.getNome().equalsIgnoreCase(nome)) {
                animais.remove(i);
                System.out.println("Animal removido com sucesso!");
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Nenhum animal com o nome '" + nome + "' encontrado.");
        }
    }
}
