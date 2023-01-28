import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Pick a number and get a color!");
        
        WarmColor warm = new WarmColor();
        CoolColor cool = new CoolColor();
        
        try {
            switch(kb.nextInt()) {
        
                case 1:
                    warm.red();
                    warm.warmOrCold();
                    break;
                case 2:
                    warm.orange();
                    warm.warmOrCold();
                    break;
                case 3:
                    warm.yellow();
                    warm.warmOrCold();
                    break;
                case 4:
                    cool.green();
                    cool.warmOrCold();
                    break;
                case 5:
                    cool.blue();
                    cool.warmOrCold();
                    break;
                case 6:
                    cool.purple();
                    cool.warmOrCold();
                    break;
                case 7:
                    warm.pink();
                    warm.warmOrCold();
                    break;
                default:
                    System.out.println("Range is from 1-7");
               }
        } catch (InputMismatchException e) {
                System.out.println("Please enter a number from 1-7");
                kb.nextInt();
        }
        kb.close();    
    }    
}
