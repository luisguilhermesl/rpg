
package esfolha;

/**
 *
 * @author Luis
 */
public class Atributos {
    
   //mago
protected int ataquedomago = 6;
protected int stanaminadomago = 7;
protected int vidadomago = 10;
protected int magia = 5;
protected int defesadomago = 5;

public int getAtaquedomago() {
    return ataquedomago;
}

public void setAtaquedomago(int ataquedomago) {
    this.ataquedomago = ataquedomago;
}

public int getStanaminadomago() {
    return stanaminadomago;
}

public void setStanaminadomago(int stanaminadomago) {
    this.stanaminadomago = stanaminadomago;
}

public int getVidadomago() {
    return vidadomago;
}

public void setVidadomago(int vidadomago) {
    this.vidadomago = vidadomago;
}

public int getMagia() {
    return magia;
}

public void setMagia(int magia) {
    this.magia = magia;
}

public int getDefesadomago() {
    return defesadomago;
}

public void setDefesadomago(int defesadomago) {
    this.defesadomago = defesadomago;
}


public String atributosdomago() {
    return "atributos do mago: " + "\n\nataquedomago=" + ataquedomago + "\nstanaminadomago=" + stanaminadomago + "\nvidadomago=" + vidadomago + "\nmagia=" + magia + "\ndefesadomago=" + defesadomago;
}




    
    
///guerreiro
protected int ataquedogue = 7;
protected int stanaminadogue = 10;
protected int vidadogue = 10;
protected int defesadogue = 5;

    public int getAtaquedogue() {
    return ataquedogue;
}

public void setAtaquedogue(int ataquedogue) {
    this.ataquedogue = ataquedogue;
}

public int getStanaminadogue() {
    return stanaminadogue;
}

public void setStanaminadogue(int stanaminadogue) {
    this.stanaminadogue = stanaminadogue;
}

public int getVidadogue() {
    return vidadogue;
}

public void setVidadogue(int vidadogue) {
    this.vidadogue = vidadogue;
}

public int getDefesadogue() {
    return defesadogue;
}

public void setDefesadogue(int defesadogue) {
    this.defesadogue = defesadogue;
}


public String atributosdoguerreiro() {
    return "atributos do guerreiro "+ "\nataquedogue=" + ataquedogue + "\nstanaminadogue=" + stanaminadogue + "\nvidadogue=" + vidadogue + "\ndefesadogue=" + defesadogue ;
}


//ARQUEIRO

 protected int ataquedoar = 5;
protected int stanaminadoar = 10;
protected int vidadoar= 10;
protected int defesadoar = 8;

public int getAtaquedoar() {
    return ataquedoar;
}

public void setAtaquedoar(int ataquedoar) {
    this.ataquedoar = ataquedoar;
}

public int getStanaminadoar() {
    return stanaminadoar;
}

public void setStanaminadoar(int stanaminadoar) {
    this.stanaminadoar = stanaminadoar;
}

public int getVidadoar() {
    return vidadoar;
}

public void setVidadoar(int vidadoar) {
    this.vidadoar = vidadoar;
}

public int getDefesadoar() {
    return defesadoar;
}

public void setDefesadoar(int defesadoar) {
    this.defesadoar = defesadoar;
}


public String atributosdoarqueiro() {
    return "atributos do arqueiro"+ "vidadogue=" + vidadogue + ", ataquedoar=" + ataquedoar + ", stanaminadoar=" + stanaminadoar + ", vidadoar=" + vidadoar + ", defesadoar=" + defesadoar;
}

}