
package padraostrategy;

public class Leao extends Felino{
    
     public Leao(){

        correrStrategy = new CorrerCurtaDist();
    }

    @Override
    public void display(){

        System.out.println( "Leão a vista" );
    }

    @Override
    public void rugir(){

        System.out.println("Urghhhhh!");
    }
}
       