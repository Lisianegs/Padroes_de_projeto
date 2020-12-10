
package padraostrategy;

public class Leopardo extends Felino {
    
    public Leopardo(){

        correrStrategy = new CorrerLongaDist();
    }

    @Override
    public void display(){

        System.out.println( "Leopardo a vista" );
    }

    @Override
    public void rugir(){

        System.out.println( "Arghh!" );
    }
}