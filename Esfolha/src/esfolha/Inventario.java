package esfolha;

import esfolha.Atributos;
import static java.lang.System.exit;
import java.util.Scanner;
import java.sql.SQLException;

public class Inventario {
    private Mago mago = new Mago();
    private Guerreiro guerreiro = new Guerreiro();
    private Arqueiro arqueiro = new Arqueiro();
    private Scanner teclado = new Scanner(System.in);

    public void inicio() {
        System.out.println("Olá! Sua missão é ajustar os atributos dos personagens.");
    System.out.println("1. Carregar atributos");
    System.out.println("2. Ajustar atributos");
    String escolha = teclado.nextLine();

    if (escolha.equals("1")) {
        try {
            Database.carregarAtributos(mago, "Mago");
            Database.carregarAtributos(guerreiro, "Guerreiro");
            Database.carregarAtributos(arqueiro, "Arqueiro");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    escolherClasse();
}

    private void escolherClasse() {
        System.out.println("Selecione a classe:");
        System.out.println("1. Mago");
        System.out.println("2. Arqueiro");
        System.out.println("3. Guerreiro");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                menuMago();
                break;
            case "2":
                menuArqueiro();
                break;
            case "3":
                menuGuerreiro();
                break;
            default:
                inicio();
                break;
        }
    }

    private void menuMago() {
        System.out.println("Mago:");
        System.out.println("1. Ver atributos");
        System.out.println("2. Equipar item");
        System.out.println("3. Voltar");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                mago.exibirAtributos();
                menuMago();
                break;
            case "2":
                equiparMago();
                break;
            case "3":
                escolherClasse();
                break;
            default:
                menuMago();
                break;
        }
    }

    private void equiparMago() {
        System.out.println("Escolha o item para equipar:");
        System.out.println("1. Cajado (+4 Ataque)");
        System.out.println("2. Poção de Energia (+3 Stamina)");
        System.out.println("3. Ervas Medicinais (+0 Vida)");
        System.out.println("4. Poção Mágica (+5 Magia)");
        System.out.println("5. Armadura (+5 Defesa)");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                mago.ataque += 4;
                break;
            case "2":
                mago.stamina += 3;
                break;
            case "3":
                // Vida não aumenta
                break;
            case "4":
                mago.aumentarMagia(5);
                break;
            case "5":
                mago.defesa += 5;
                break;
            default:
                equiparMago();
                return;
        }
          try {
        Database.salvarAtributos(mago, "Mago");
    } catch (SQLException e) {
        e.printStackTrace();
    }
        mago.exibirAtributos();
        verificarMissao();
        menuMago();
    }

    private void menuGuerreiro() {
        System.out.println("Guerreiro:");
        System.out.println("1. Ver atributos");
        System.out.println("2. Equipar item");
        System.out.println("3. Voltar");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                guerreiro.exibirAtributos();
                menuGuerreiro();
                break;
            case "2":
                equiparGuerreiro();
                break;
            case "3":
                escolherClasse();
                break;
            default:
                menuGuerreiro();
                break;
        }
    }

    private void equiparGuerreiro() {
        System.out.println("Escolha o item para equipar:");
        System.out.println("1. Espada (+3 Ataque)");
        System.out.println("2. Poção de Energia (+0 Stamina)");
        System.out.println("3. Ervas Medicinais (+0 Vida)");
        System.out.println("4. Escudo (+2 Defesa)");
        System.out.println("5. Armadura (+3 Defesa)");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                guerreiro.ataque += 3;
                break;
            case "2":
                guerreiro.stamina += 0;
                break;
            case "3":
                // Vida não aumenta
                break;
            case "4":
                guerreiro.defesa += 2;
                break;
            case "5":
                guerreiro.defesa += 3;
                break;
            default:
                equiparGuerreiro();
                return;
        }
          try {
        Database.salvarAtributos(guerreiro, "Guerreiro");
    } catch (SQLException e) {
        e.printStackTrace();
    }
        guerreiro.exibirAtributos();
        verificarMissao();
        menuGuerreiro();
    }

    private void menuArqueiro() {
        System.out.println("Arqueiro:");
        System.out.println("1. Ver atributos");
        System.out.println("2. Equipar item");
        System.out.println("3. Voltar");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                arqueiro.exibirAtributos();
                menuArqueiro();
                break;
            case "2":
                equiparArqueiro();
                break;
            case "3":
                escolherClasse();
                break;
            default:
                menuArqueiro();
                break;
        }
    }

    private void equiparArqueiro() {
        System.out.println("Escolha o item para equipar:");
        System.out.println("1. Arco (+3 Ataque)");
        System.out.println("2. Poção de Energia (+0 Stamina)");
        System.out.println("3. Ervas Medicinais (+0 Vida)");
        System.out.println("4. Flecha (+2 Ataque)");
        System.out.println("5. Armadura (+2 Defesa)");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "1":
                arqueiro.ataque += 3;
                break;
            case "2":
                arqueiro.stamina += 0;
                break;
            case "3":
                // Vida não aumenta
                break;
            case "4":
                arqueiro.ataque += 2;
                break;
            case "5":
                arqueiro.defesa += 2;
                break;
            default:
                equiparArqueiro();
                return;
        }
          try {
        Database.salvarAtributos(arqueiro, "Arqueiro");
    } catch (SQLException e) {
        e.printStackTrace();
    }
        arqueiro.exibirAtributos();
        verificarMissao();
        menuArqueiro();
    }

    private void verificarMissao() {
        if (mago.magia >= 10 && mago.defesa >= 10 && guerreiro.ataque >= 10 && guerreiro.defesa >= 10 && arqueiro.ataque >= 10) {
            System.out.println("Missão completa!");
            System.exit(0);
        }
    }
}