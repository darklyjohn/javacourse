package exemples.partfour;

public class Increment {
    public static void main(String[] args) {
//        int x = 0;
//        System.out.println(x++);
// est équivalent à
//        System.out.println(x); x = x + 1;
//
//        System.out.println(++x);
// est équivalent à
//        x = x + 1; System.out.println(x);

        //----------------------

        int n1=0;
        int n2=0;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1=n2++;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1=++n2;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1=n1++;        //attention
        System.out.println("n1 = " + n1 + " n2 = " + n2);
    }
}
