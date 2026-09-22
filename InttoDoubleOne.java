import java.util.Scanner;
public class InttoDoubleOne {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter an intiger value" + ":");
        int myNum = myObj.nextInt();
        double myDouble = myNum;
        System.out.println("Entered intiger value" + ":" + myNum);
        System.out.println("Converted double value" + ":" + myDouble);
        myObj.close();
    }
    
}
