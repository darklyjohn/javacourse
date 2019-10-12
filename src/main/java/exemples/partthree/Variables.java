package exemples.partthree;

import entity.Velo;

public class Variables {
    public static void main(String[] args) {
        //Exemple de variables
        int number = 100;
        String test = "test";
        System.out.println(number);
        System.out.println(test);
        //Variable class
        Velo velo1;
        velo1 = new Velo("Giatn", "Propel");
        Velo velo2 = new Velo();
    }
}
