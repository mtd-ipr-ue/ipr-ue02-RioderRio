import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
       
        Out.println("Please enter number");
        int Zahl1 = In.readInt();
        Out.println ("Please enter a number");
        int Zahl2 = In.readInt();
        Out.println ("Please enter a number");
        int Zahl3 = In.readInt();

        if ((Zahl1 > Zahl2) & (Zahl1 > Zahl3)) {
           System.out.println(Zahl1 + " ist die größte"); 
        } else if ((Zahl2 > Zahl1) & (Zahl2 > Zahl3)) {
            System.out.println(Zahl2);
        }
        else if ((Zahl3>Zahl1) & (Zahl3 > Zahl2))
        System.out.println(Zahl3);
    }
}