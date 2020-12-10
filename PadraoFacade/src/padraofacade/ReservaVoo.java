/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraofacade;

public class ReservaVoo{

private String cia;

public ReservaVoo(String nomeCia) {

super();

this.cia = nomeCia;

}

public String getNomeCia() {

return cia;

}

public void setNomeCia(String nomeCia) {

this.cia = nomeCia;

}

public void reservaVoo(String nome, String sobreNome) {

System.out.println("Voo reservado em " + cia);

System.out.println( "Para o cliente" +  nome + "" + sobreNome);

}

}