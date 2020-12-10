
package padraofacade;

public class TesteFacade {

public static void main(String[] args) {

Cliente cliente = new Cliente("Lisiane", "Goncalvs", 25);

ReservaHotel hotel = new ReservaHotel("Flores", 250.00);

ReservaVoo voo = new ReservaVoo("Partindo");



Facade agencia = new Facade(hotel, voo);



agencia.registraViagem(cliente);

}

}