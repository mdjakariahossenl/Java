import java.util.Scanner;
public class VariablesOne {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        float salary = myObj.nextFloat();
        char rank = myObj.next().charAt(0);
        Boolean availablity = myObj.nextBoolean();
        
        System.out.println("Name" + ":" + name);
        System.out.println("Age" + ":" + age);
        System.out.println("Salary" + ":" + salary);
        System.out.println("Rank" + ":" + rank);
        System.out.println("Availablity" + ":" + availablity);
        
        myObj.close();
    }

    
}
