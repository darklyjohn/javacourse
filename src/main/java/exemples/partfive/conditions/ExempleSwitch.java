package exemples.partfive.conditions;

public class ExempleSwitch {
    public static void main(String[] args) {
        String brand = "Canyon";
        switch (brand){
            case "giant":
                System.out.println("Good");
                break;
            case "Canyon":
                System.out.println("Very Good");
                break;
            default:
                System.out.println("Bad");
        }
    }
}
