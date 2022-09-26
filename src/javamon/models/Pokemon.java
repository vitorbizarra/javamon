package javamon.models;

public class Pokemon {

    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    private String sprite;

    public Pokemon(String nome, int level, boolean meuPoke) {
        this.nome = nome;
        this.level = level;
        switch (nome) {
            case "Bulbassauro":
                this.tipo = "Planta";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/bulbasaur_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/bulbasaur_front.png";
                }
                break;
            case "Charmander":
                this.tipo = "Fogo";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/charmander_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/charmander_front.png";
                }
                break;
            case "Squirtle":
                this.tipo = "Água";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/squirtle_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/squirtle_front.png";
                }
                break;
            case "Magikarp":
                this.tipo = "Água";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/magikarp_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/magikarp_front.png";
                }
                break;
            case "Omanyte":
                this.tipo = "Pedra";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/omanyte_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/omanyte_front.png";
                }
                break;
            default:
                this.tipo = "Normal";
                if (meuPoke == true) {
                    this.sprite = "/javamon/assets/sprites/farfetch_back.png";
                } else {
                    this.sprite = "/javamon/assets/sprites/farfetch_front.png";
                }
                break;
        }
        this.calculaAtributos();
    }

    public void calculaAtributos() {
        this.vida = 200;

        //Fogo, o atributo vida deverá ser reduzido em 20 níveis/pontos, o ataque deverá ter o valor 60 e a defesa terá o valor 20.
        //Água, o atributo vida deverá ser reduzido em 5 níveis/pontos, o ataque deverá ter o valor 40 e a defesa terá o valor 35.
        //Planta, o atributo vida deverá ser aumentado em 20 níveis/pontos, o ataque deverá ter o valor 15 e a defesa terá o valor 60.
        //Pedra, o atributo vida deverá ser aumentado em 25 níveis/pontos, o ataque deverá ter o valor 30 e a defesa terá o valor 60.
        switch (this.tipo) {
            case "Fogo":
                this.vida = this.vida - 20;
                this.ataque = 60;
                this.defesa = 20;
                break;
            case "Água":
                this.vida = this.vida - 5;
                this.ataque = 40;
                this.defesa = 35;
                break;
            case "Planta":
                this.vida = this.vida + 20;
                this.ataque = 15;
                this.defesa = 60;
                break;
            case "Pedra":
                this.vida = this.vida + 25;
                this.ataque = 30;
                this.defesa = 60;
                break;
            case "Normal":
            default:
                this.ataque = 50;
                this.defesa = 20;
                break;
        }

    }

    public Pokemon(int vida, int ataque, int defesa) {
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void calculaBonus() {
        this.vida = this.vida + (this.level / 2);
        this.ataque = this.ataque + (this.level / 3);
        this.defesa = this.defesa + (this.level / 4);
    }

    public void imprimePokemon() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Level: " + this.level);
        System.out.println("Vida: " + this.vida);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defesa: " + this.defesa);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
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
