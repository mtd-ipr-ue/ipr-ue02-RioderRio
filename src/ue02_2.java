import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Jahreszahl");
        int Jahreszahl = In.readInt();

        Out.print("monat 1-12:  ");
        int Monat = In.readInt();

        switch (Monat) {
            case 1: 
            Out.print("Monat hat 31 Tage");
                break;
            case 2:
            if (Jahreszahl % 4 == 0) {
                if (Jahreszahl % 100 == 0) {
                    if (Jahreszahl % 400 == 00) {
                        Out.print("Monat hat 29 Tage");
                    }
                    else {
                        Out.print("Monat hat 28 Tage");
                    }
                }
                else {
                    Out.print("Monat hat 29 Tage");
                }
            }
            else {
                Out.print("Monat hat 28 Tage");
            }
            break;

            case 3:
            Out.print ("Monat hat 31 Tage");
            break;
            
            case 5:
            Out.print ("Monat hat 31 Tage");
            break;
             case 7:
             Out.print ("Monat hat 31 Tage");

             case 8:
             Out.print ("Monat hat 31 Tage");
             break;

             case 10:
             Out.print ("Monat hat 31 Tage");
             break;

             case 12: 
             Out.print ("Monat hat 31 Tage");
                 default:
            Out.print("Monat hat 30 Tage");
                break;
        }
    } }

