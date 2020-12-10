
package padraostrategy;

public class TigreToy extends Felino {
    
    public TigreToy(){

        correrStrategy = new CorrerToy();
    }

    @Override
    public void display(){

        System.out.println( "Tigre de borracha na banheira" );
    }

    @Override
    public void rugir(){

        System.out.println( "Uen! Uen!" );
    }
}