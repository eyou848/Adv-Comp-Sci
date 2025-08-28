public class HotCheetos {

    private String color; // = "Black and Red"
    private String spicy;
    private int sizeInCubicFeed; //1
    private double weight; //0.2 lbs
    private int cost; //2
    private String type; //"Hot Cheetos"
    

    public HotCheetos(){
        color = "Red";
        spicy = "Very Spicy";
        sizeInCubicFeed = 1;
        weight = 0.2;
        cost = 2;
        type = "Hot Cheetos";   
    }

    //eat
    //crush
    //open

    public void eat() {
        weight = 0;
    }

    public void open() {
        color = "Red";
        System.out.println("The bag is now open");
        System.out.println(color);
        

    }
    public void crush() {
        sizeInCubicFeed = 0;
        System.out.println("The bag is now crushed");
    }
    public void buy() {
        cost = cost + 2;
        System.out.println("You bought the Hot Cheetos " + cost);
    }
}
