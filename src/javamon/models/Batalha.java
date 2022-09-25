package javamon.models;

public class Batalha {

    private int seuPokemonHp;
    private int outroPokemonHp;
    private String seuPokemonNome;
    private String outroPokemonNome;

    public void setSeuPokemon(String nome, int seuPokemonHp) {
        this.seuPokemonHp = seuPokemonHp;
    }

    public void setOutroPokemon(String nome, int outroPokemonHp) {
        this.outroPokemonHp = outroPokemonHp;
    }
}
