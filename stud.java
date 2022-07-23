import java.util.*;
class Student 
 {
    int rolln;
    String name;
    float markjpr;
    float marksen;
    float markdma;
    float markgad;
    float total;
    void accept()
          {
             Scanner sc = new Scanner(System.in);
             System.out.print("\nRoll no : ");
             rolln= sc.nextInt();
             System.out.print("Enter Name : ");
             name= sc.next();
             System.out.print("enter marks of jpr : ");
             markjpr= sc.nextFloat();
             System.out.print("enter marks of sen : ");
             marksen= sc.nextFloat();
             System.out.print("enter marks of dma : ");
             markdma= sc.nextFloat();
             System.out.print("enter marks of gad : ");
             markgad= sc.nextFloat();
		    total = markjpr + marksen + markdma + markgad;
          }
      void disp()
          { 
          System.out.println("\nRoll no : "+rolln);
          System.out.println("Name : "+name);
          System.out.println("marks : "+markjpr);
          System.out.println("marks : "+marksen);
          System.out.println("marks : "+markdma);
          System.out.println("marks : "+markgad);
		 System.out.println("total : "+total);
		 System.out.println("Percentage : "+ (total)/4);
           }
public static void main (String  args[])
         {

		int input;
		
         Student s1 = new Student();
         Student s2 = new Student();
         Student s3 = new Student();
         Student s4 = new Student();

         s1. accept();
         s2. accept();
         s1.disp();
         s2.disp();
         }

}
