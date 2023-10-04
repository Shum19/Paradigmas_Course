package Home_Task_2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        MultiplicationTable.printMultiplyByOne(10);
        System.out.println();
        MultiplicationTable.printMultiplyTable(7, 10);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String name = input.nextLine();
        name = name.replace(".", "");
        name = name.replace(" ", "_");
        System.out.println(name);
    }
}
