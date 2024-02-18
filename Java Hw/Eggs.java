public class Eggs{

    public static void main(String[] args) {
    int eggs; 
    
    
    
     
     
     Scanner inputDevice = new Scanner(System.in);
     
        System.out.println("How many eggs do you want?");
        eggs = inputDevice.nextInt();
         

        System.out.print("You ordered");
        System.out.print(eggs);
        System.out.print("eggs");
        System.out.print("that's");
        System.out.print(eggs/12);
        System.out.print("dozen at 3.25 per dozen and");
        System.out.print(eggs%12 );
        System.out.print("loose eggs at 45 cents each for a total of");
        System.out.print(eggs/3.25 + eggs%12*0.45);

        
        






        
        
    }
    
    
    }
    
    