
package personagem2;

import static java.lang.System.exit;
import java.util.Scanner;

public class inventario extends atributos {
    
    Scanner teclado = new Scanner(System.in);

    //mago
    private boolean cajado;
    private boolean pocaodemagia;
    private boolean armadura;
    private boolean ervasmedicinais;
    private boolean pocaodeenergia;

    //arqueiro
     private boolean arco;
      private boolean flecha;
      private boolean armaduradoar;
     //guerreiro
      
      private boolean espada;
      private boolean escudo;
    private boolean armaduradogue;
    
    
    private String resposta;
    private String resposta2;
    private String resposta3;
    private String resposta4;

    public void inicio() {
        System.out.println("ola!!!!!!!!!\n\n"
                + "\nsua missão hoje é deixar seu mago com 10 de magia e de defesa, seu guerreiro com 10 de atague e defesa e seu arqueiro com 10 de ataque apenas.");

        System.out.println("\n\naperte a tecla 'enter' para começar ");
        String resposta = teclado.nextLine();
 classe();
       

    }

    public void classe(){
        
        System.out.println("voce quer seleciona qual classe?"
                + "\nmago(1)"
                + "\narqueiro(2)"
                + "\nguerreiro(3)");
        
        
        String resposta2 = teclado.nextLine();

        if (resposta2.equals("1")) {
            mago();
            
        } else if (resposta2.equals("2")) {
            arqueiro();
            
            
        } else if (resposta2.equals("3")) {
            guerreiro();
            

        } else {
            inicio();
        }
    }
    public void mago() {
        
        System.out.println("\n\nvocê quer fazer o que?\n"
                + "\nskins(1)"
                + "\natributos(2)"
                + "\ntrocar de classe(3)"
                + "\nmochila(4)");
        
        String resposta3 = teclado.nextLine();

        
        if (resposta3.equals("1")) {
            System.out.println("AQUI ESTÃO SUAS SKINS:");

            System.out.println("\n\nmago de fogo"
                    + "\nmago de gelo"
                    + "\nmago de raio");
            mago();
        } else if (resposta3.equals("2")) {
            System.out.println(atributosdomago());
            mago();
            
}else if (resposta3.equals("3")){
    classe();

        } else if (resposta3.equals("4")) {
            System.out.println("MOCHILA:");
            System.out.println("\n\no que deseja usar/equipar\n?"
                    + "\ncajado(1)"
                    + "\npoção de energia(2)"
                    + "\nervas medicinais(3)"
                    + "\npoção magica(4)"
                    + "\narmadura(5)");
            String resposta4 = teclado.nextLine();

            if (resposta4.equals("1")) {
                this.cajado = true;
                System.out.println("\nvoce equipou o cajado\n");
                this.setAtaquedomago(ataquedomago += 4);
                missao();
                classe();
                

            } else if (resposta4.equals("2")) {
                this.pocaodeenergia = true;
                System.out.println("\nvoce tomou a poção de energia\n");
                this.setStanaminadomago(stanaminadomago += 3);
                missao();
                 classe();

            }else if (resposta4.equals("3")){
                     this.ervasmedicinais = true;
                     System.out.println("\nvoce usou as ervas\n");
                      this.setVidadomago(vidadomago+=0);
                      missao();
                       classe();

        }else if(resposta4.equals("4")){
                     this.pocaodemagia = true;
                     System.out.println("\nvoce tomou a poção de magia\n");
                      this.setMagia(magia+=5);
                     missao();
                      classe();
                      
        }else if(resposta4.equals("5")){
                     this.armadura = true;
                     System.out.println("\nvoce equipou a armadura\n");
                      this.setDefesadomago(defesadomago+=5);
                      missao();
                       classe();
                      
                }else {
            mago();
                    
            
        }
        }
    }
    public void guerreiro(){
        System.out.println("\n\nvocê quer abrir o que?\n"
                + "\nskins(1)"
                + "\natributos(2)"
                + "\ntrocar de classe(4)"
                + "\nmochila(4)");
        String resposta3 = teclado.nextLine();

        if (resposta3.equals("1")) {
            System.out.println("AQUI ESTÃO SUAS SKINS:");

            System.out.println("\n\nguerreiro do inferno"
                    + "\ngurreiro do ceu");
                   
            guerreiro();
        } else if (resposta3.equals("2")) {
            System.out.println(atributosdoguerreiro());
            guerreiro();
            
        }else if(resposta3.equals("3")){
            classe();
        }
        else if (resposta3.equals("4")) {
            System.out.println("MOCHILA:");
            System.out.println("\n\no que deseja usar/equipar\n?"
                    + "\nespada(1)"
                    + "\npoção de energia(2)"
                    + "\nervas medicinais(3)"
                    + "\nescudo(4)"
                    + "\narmadura(5)");
            String resposta4 = teclado.nextLine();

            if (resposta4.equals("1")) {
                this.espada = true;
                System.out.println("\nvoce equipou a espada\n");
                this.setAtaquedogue(ataquedogue += 3);
                missao();
                 classe();
                
                

            } else if (resposta4.equals("2")) {
                this.pocaodeenergia = true;
                System.out.println("\nvoce tomou a poção de energia\n");
                this.setStanaminadogue(stanaminadogue += 0);
                missao();
                 classe();
                

            }else if (resposta4.equals("3")){
                     this.ervasmedicinais = true;
                     System.out.println("\nvoce usou as ervas\n");
                      this.setVidadogue(vidadogue+=0);
                      missao();
                       classe();
                      

        }else if(resposta4.equals("4")){
                     this.escudo = true;
                     System.out.println("\nvoce equipou o escudo");   
                     this.setDefesadogue(defesadogue +=2);
                      missao();
                       classe();
                     
                      
        }else if(resposta4.equals("5")){
                     this.armaduradogue = true;
                     System.out.println("\nvoce equipou a armadura\n");
                      this.setDefesadogue(defesadogue+=3);
                      missao();
                       classe();
                      
                }else{
            inicio();
        }
        }
        
    }
    public void arqueiro(){
        System.out.println("\n\nvocê quer abrir o que?\n"
                + "\nskins(1)"
                + "\natributos(2)"
                + "\ntrocar de classe(3)"
                + "\nmochila(4)");
        String resposta3 = teclado.nextLine();

        if (resposta3.equals("1")) {
            System.out.println("AQUI ESTÃO SUAS SKINS:");

            System.out.println("\n\naqueiro de fogo"
                    + "\narqueiro de gelo"
                    + "\narqueiro de raio");
            inicio();
        } else if (resposta3.equals("2")) {
            System.out.println(atributosdoguerreiro());
            inicio();
            
}else if(resposta3.equals("3")){
    classe();

        } else if (resposta3.equals("4")) {
            System.out.println("MOCHILA:");
            System.out.println("\n\no que deseja usar/equipar\n?"
                    + "\narco(1)"
                    + "\npoção de energia(2)"
                    + "\nervas medicinais(3)"
                    + "\nflecha(4)"
                    + "\narmadura(5)");
            String resposta4 = teclado.nextLine();

            if (resposta4.equals("1")) {
                this.arco = true;
                System.out.println("\nvoce equipou o arco");
                this.setAtaquedoar(ataquedoar += 3);
                missao();
                 classe();
                
                

            } else if (resposta4.equals("2")) {
                this.pocaodeenergia = true;
                System.out.println("\nvoce tomou a poção de energia\n");
                this.setStanaminadoar(stanaminadoar += 0);
                missao();
                 classe();
                

            }else if (resposta4.equals("3")){
                     this.ervasmedicinais = true;
                     System.out.println("\nvoce usou as ervas\n");
                      this.setVidadoar(vidadoar+=0);
                      missao();
                       classe();
                      

        }else if(resposta4.equals("4")){
                     this.flecha = true;
                     System.out.println("\nvoce equipo a flecha");
                      this.setAtaquedoar(ataquedoar+=2);
                      missao();
                       classe();
                     
                      
        }else if(resposta4.equals("5")){
                     this.armaduradoar = true;
                     System.out.println("\nvoce equipou a armadura\n");
                      this.setDefesadoar(defesadoar+=2);
                      missao();
                       classe();
                      
                }else{
             inicio();
        }
        }
        
        
       
    }
    
    public void missao(){
        if (pocaodemagia == true && armadura == true && flecha == true && arco == true && escudo == true && espada == true && armaduradogue == true && armaduradoar == true){
            System.out.println("\n\nvoce completou a missao!!!!!!\n");
            exit(0);
            
        }else{
            classe();
        }
            
    }
}

    

