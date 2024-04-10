package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public void addAnimal(Animal animal){
        animals.add(animal);

    public void removeAnimal(Animal animal){
        animals.remove(animal);
        //lembrar de colocar o boolean

    }

    public void listAnimals(){
        for(Animal animal : animals){
            System.out.println(animal.toString());
        
}
