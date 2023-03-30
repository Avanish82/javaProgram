package day3;


import java.util.Scanner;


class Emp{
    static int count;
    Emp(){
    
    count++;
    }
    
    static void no_emp(){
        System.out.println("No of Employee" + count);
    }
}
 
public class Employee {
    public static void main(String[] args) {
        Emp emp;
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(1!=3){
            System.out.println("\nMenu:\n1. AddEmp:\n2. Count\n3. Exit\n ChoiceNo:");
            i = scan.nextInt();
            if(i==1){
                emp = new Emp();
            }else if(i==2){
                Emp.no_emp();
            }else if(i==3){
                break;
            }else{
                System.out.println("choice is incorrect:");
            }
        }
    }
}