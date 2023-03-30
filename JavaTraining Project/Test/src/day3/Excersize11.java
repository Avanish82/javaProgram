package day3;

import java.util.*;

class Emp1{
    static int count;
    Emp1(){
    
    count++;
    }
    
    static void no_emp(){
        System.out.println("No of Emp" + count);
    }
}


public class Excersize11 {

 

    public static void main(String[] args) {
        
        Emp1 e;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(1!=3){
            System.out.println("\nMenu:\n1. AddEmp:\n2. Display Count\n3. Exit\n Enter Choice");
            i = sc.nextInt();
            if(i==1){
                e = new Emp1();
            }else if(i==2){
                Emp1.no_emp();
            }else if(i==3){
                break;
            }else{
                System.out.println("incorrect choice try again:");
            }
        }
        // TODO Auto-generated method stub

    }

   }