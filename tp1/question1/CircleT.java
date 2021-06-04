package question1;
import question1.Circle;

/**
 * Décrivez votre classe TestCircle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class  CircleT
{

       public static void main(final String[] args) { 
        Circle c;                              
        c = new Circle();
        c.makeVisible();
        c.slowMoveHorizontal(20);
        c.slowMoveVertical(40);
        c.changeColor("yellow");
        
    } 
}
