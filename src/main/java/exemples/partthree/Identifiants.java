package exemples.partthree;


import exemples.partone.Hello;

public class Identifiants{
    public static void main(String[] args) {

        int valeur = 10;
        long nombre;
        int compteur;
        String chaine;


//
        int number = 100;
        String test = "test";
        System.out.println(number);
        System.out.println(test);
//Initialisation multiple variable meme type
        int jour, mois, annee;

        Hello helloClass; //Declaration de l'objet helloClass
        helloClass = new Hello(); //Creation de l'objet helloClass

        Hello helloClass2 = new Hello(); //Déclaration et création en même temps

        float pi = 3.141f;
        double valeurDouble = 3d;
        float flottant1 = +.1f , flottant2 = 1e10f;

        char code = 'D';
        int index = code - 'A';
        System.out.println("code D = " + code);
        System.out.println("code A = " +  'A');
        System.out.println("index = " + index);

        boolean test_init_val_bool;

        System.out.println(helloClass.getTestInitBool());
//        System.out.println(test_init_val_bool); // Erreur variable doit etre init

        int a = 1;
        int i = a++ + 2 / 2;
        System.out.println("value = " + i);


    }



}
