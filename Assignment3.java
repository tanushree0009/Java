import java.util.Scanner;

class MyException extends Exception{
    MyException() {}
    MyException(String str) {
        super(str);
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter the name: ");
            String name = s.nextLine();
            System.out.println("Enter the age: ");
            int age = s.nextInt();
            System.out.println("Enter the income (in Rupees): ");
            int income = s.nextInt();
            System.out.println("Enter the resedetial city: ");
            String city = s.next();
            System.out.println("Enter the type of vehicle:\n1. No Vehicl\n2. Two Wheeler\n3. Four Wheeler\nYour choice: ");
            int vehicle = s.nextInt();
            if(age < 18 || age > 55 || income < 50000 || income > 100000 || !(city.equals("Pune") || city.equals("Mumbai") || city.equals("Banglore") || city.equals("Chennai")) || vehicle == 1 || vehicle == 2) {
                MyException me = new MyException("Not Aplicable");
                throw me;
            }
            else {
                System.out.println("The name is: " + name);
                System.out.println("The age is: " + age);
                System.out.println("The income (in Rupees) is:" + income);
                System.out.println("The resedential city is: " + city);
                System.out.println("Has a four wheeler vehicle");
            }
        } catch(MyException me) {
            me.printStackTrace();
        }
    }
    

}
