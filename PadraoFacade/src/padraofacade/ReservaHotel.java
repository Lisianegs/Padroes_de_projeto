
package padraofacade;


public class ReservaHotel {

private String nome;

private double valorDiaria;

public ReservaHotel (String nome, double valorDiaria) {

super();

this.nome = nome;

this.valorDiaria = valorDiaria;

}

public String getNome() {

return nome;

}

public void setNome(String nome) {

this.nome = nome;

}

public double getValorDiaria() {

return valorDiaria;

}

public void setValorDiaria(double valorDiaria) {

this.valorDiaria = valorDiaria;

}

public void registroDeReserva(String nomeCliente, String sobreNomeCliente) {

System.out.println("O hotel" + this.nome + "informa que a reserva solicitada por " );

System.out.println(nomeCliente + "" + sobreNomeCliente +  "foi eferuada com sucesso");

}

}