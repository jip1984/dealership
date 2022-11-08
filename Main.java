public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "red");

        Car dodge = new Car("Dodge", 8500, 2019, "blue");

        System.out.println(nissan.getColor());
      
        // System.out.println("This " + nissan.make + " is worth $" + nissan.price + ", it was built in " + nissan.year + " and it is the color is " + nissan.color + ".");

        // System.out.println("This " + dodge.make + " is worth $" + dodge.price + ", it was built in " + dodge.year + " and it is the color is " + dodge.color + ".");
 
    }
}
