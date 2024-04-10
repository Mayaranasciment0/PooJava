package br.unicap.poo.atividade03;

import java.util.ArrayList;

public class Animal {
    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String>abilities;
}

Public Animal(long id, String name, int age, double weight, ArrayList<String>abilities){
    this.id = id;
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.abilities = abilities;
    this.abilities = new ArrayList<String>();

}

public long getId(){
    return this.id;
}

// String sound(): Retorna o som que o animal faz.
// String performAbility(String ability): Dado uma habilidade, retorna se o animal pode ou não realizar tal habilidade da seguinte forma: se tem a habilidade -> "Buddy can sniff" (nome + "can" + habilidade) ou se não tem -> "Buddy can't agility" (nome + "can't" + habilidade)
