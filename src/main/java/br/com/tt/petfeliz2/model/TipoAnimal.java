package br.com.tt.petfeliz2.model;

public enum TipoAnimal {

    GATO,
    CAO,
    PASSARO
}

class Teste{

    public static void main(String[] args){
        System.out.println(TipoAnimal.CAO.ordinal());
    }
}
