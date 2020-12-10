/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraofacade;

public class Facade {



private ReservaHotel hotel;

private  ReservaVoo cia;

public Facade(ReservaHotel hotel, ReservaVoo cia) {

super();

this.hotel = hotel;

this.cia = cia;

}

//aqui que acontece as notificações para  as dependências

public void registraViagem(Cliente cliente){

this.hotel.registroDeReserva(cliente.getNome(),cliente.getSobreNome());

this.cia.reservaVoo(cliente.getNome(),cliente.getSobreNome());

}

public ReservaHotel geReservatHotel() {

return hotel;

}

public void setReservaHotel(ReservaHotel hotel) {

this.hotel = hotel;

}

public ReservaVoo getReservaVoo() {

return cia;

}

 public void setReservaVoo(ReservaVoo ciaAerea) {

this.cia = ciaAerea;

}
}