public class Main {

   public static void main(String []args) {
      // Use the default/no-arg constructors
      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // Use the parameterized constructors
      // ORDER of arguments must match formal params!!!
      Vehicle v2 = new Vehicle(3, 10.0, "Purple");
      Car c2 = new Car(4, 60.0, "White", 7, "Audi");

      // Test toString methods
      System.out.println(v1);
      System.out.println(v2);
      System.out.println(c1);
      System.out.println(c2);

      // Test behavior methods
      v2.makeNoise();
      c2.makeNoise(); // OVERRIDE parent method
   }
}
