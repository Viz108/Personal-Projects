package battleship;


public class Battleship 
{
    public static void main(String[] args) 
    {
        Board test = new Board();
        System.out.println(test.addShip(9,9,1,false));
        System.out.println(test.foundShip(10));
        System.out.println(test.shoot(0,0));
        System.out.println(test.shoot(0,1));
        System.out.println(test.shoot(0,1));
        System.out.println(test.gameOver());
        System.out.println(test);
    }
    
}
