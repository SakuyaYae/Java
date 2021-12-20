package nu.te4.first_project;
import java.util.Scanner;

public class Start {
     public static void main(String[] args){
        Person sakuya = new Person("Sakura",21);
         System.out.println(sakuya.getName());
         System.out.println("  ");
         Scanner input = new Scanner(System.in);
         Player one = new Player("Sakura",100000);
       Player two = new Player("Ganondorf",100000);
       Large_sum sakura = new Large_sum();
       Largest_product yui = new Largest_product();
       
       sakura.calc();
       yui.calc();
       /*  
       while(true){
           System.out.println("  ");
            System.out.println(String.format("%s %d, %d",one.getName(),one.getDmg(),one.getHp() ));
            System.out.println("Atacks");
            System.out.println(String.format("%s %d, %d",two.getName(),two.getDmg(),two.getHp() ));
           System.out.println("  ");
           System.out.println(String.format("%s %d, %d",two.getName(),two.getDmg(),two.getHp() ));
           System.out.println("takes damage");
           System.out.println("  ");
           
            System.out.println(String.format("%s %d, %d",two.getName(),two.getDmg(),two.getHp() ));
           System.out.println("Atacks");
           System.out.println(String.format("%s %d, %d",one.getName(),one.getDmg(),one.getHp() ));
            System.out.println("  ");
            System.out.println(String.format("%s %d, %d",one.getName(),one.getDmg(),one.getHp() ));
           System.out.println("takes damage");
           System.out.println("  ");
           
           System.out.println("type 3 to exit or anyting to continue");
           String exit = input.next();
           if(exit.equals("3")){
            break;
           }
         
       }*/
 }
}