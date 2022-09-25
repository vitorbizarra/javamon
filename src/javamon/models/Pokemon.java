package javamon.models;

public class Pokemon {

    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    private String sprite;

    public Pokemon(String nome, String tipo, int level, boolean meuPoke) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        switch (nome) {
            case "Bulbassauro":
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/bulbasaur_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/bulbasaur_front.png";
                }
                break;
            case "Charmander":
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/charmander_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/charmander_front.png";
                }
                break;
            case "Squirtle":
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/squirtle_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/squirtle_front.png";
                }
            case "Magikarp":
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/magikarp_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/magikarp_front.png";
                }
                break;
            case "Omanyte":
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/omanyte_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/omanyte_front.png";
                }
                break;
            default:
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/farfetch_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/farfetch_front.png";
                }
        }
    }
    
    public void calculaAtributos(){
        this.vida = 200;
        
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    
    public String getSprite() {
        return sprite;
    }

}
