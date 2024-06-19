/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esfolha;

/**
 *
 * @author Luis
 */
public class Mago extends Personagem {
    int magia;

    public Mago() {
        this.ataque = 6;
        this.stamina = 7;
        this.vida = 10;
        this.defesa = 5;
        this.magia = 5;
    }

    public void aumentarMagia(int valor) {
        this.magia += valor;
    }

    @Override
    public void exibirAtributos() {
        super.exibirAtributos();
        System.out.println("Magia: " + magia);
    }
}
