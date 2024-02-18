import java.util.Scanner;
public class InchesToFeetInteractive{

    public static void main(String[] args) {
    
        int inches;
        
        Scanner inputDevice = new Scanner(System.in);
         
        System.out.print("Enter Inches");
        inches = inputDevice.nextInt();
        System.out.print(inches);
        System.out.print("inches is");
        System.out.print(inches/12);
        System.out.print("feet and");
        System.out.print(inches %12);
        System.out.print("inches");
    }
    
    
    }
    
    
