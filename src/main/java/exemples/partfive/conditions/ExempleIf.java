package exemples.partfive.conditions;

public class ExempleIf {
    public static void main(String[] args) {
        int total = 100;
        if(total > 1000)
        {
            System.out.println("value > 1000");
        } else if (total > 100) {
            System.out.println("value > 100");
        } else {
            System.out.println("value <= 100");
        }

        int niveau = 5;
        if (niveau == 5)
            total = 10;
        else total = 5 ;

        // equivalent à
        total = (niveau ==5) ? 10 : 5;
    }
}
