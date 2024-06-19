/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esfolha;

/**
 *
 * @author Luis
 */
public class Personagem {
    protected int ataque;
    protected int stamina;
    protected int vida;
    protected int defesa;

    public void exibirAtributos() {
        System.out.println("Ataque: " + ataque);
        System.out.println("Stamina: " + stamina);
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
    }
}