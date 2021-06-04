package question1;
import question1.Square;

/**
 * Décrivez votre classe TestSquare ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class  SquareT
{
       public static void main(final String[] args) { 
        Square s;                              
        s = new Square();
        s.changeColor("red");
        s.makeVisible();
        s.moveHorizontal(50);
        s.moveVertical(100);
       
        
    } 
}
