import java.util.Scanner;
public class Basic3
{  
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
    while(true)
    {System.out.print("+--------Menu-------+\n+    Addition(A)    +\n+  Subtraction(S)   +\n+ Multiplication(M) +\n+    Division(D)    +\n+     Modulus(O)    +\n+    Exit(E)        +\n\n+-------------------+\nenter your choice: ");
     char s=sc.next().charAt(0);
     if(s=='A'||s=='a')
     {System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      System.out.println("Enter two numbers: ");
      System.out.println("Sum of two number is "+(sc.nextInt()+sc.nextInt()));
     }
     else if(s=='s'||s=='S')
     {System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      System.out.println("Enter two numbers: ");
      System.out.println("Difference of two number is "+(sc.nextInt()-sc.nextInt()));
     }
     else if(s=='m'||s=='M')
     {System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      System.out.println("Enter two numbers: ");
      System.out.println("Multiplication of two number is "+(sc.nextInt()*sc.nextInt()));
     }
     else if(s=='D'||s=='d')
     {System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      System.out.println("Enter two numbers: ");
      System.out.println("Division of two number is "+(sc.nextInt()/sc.nextInt()));
     }
     else if(s=='O'||s=='o')
     {System.out.print("\033[H\033[2J");  
      System.out.flush(); 
      System.out.println("Enter two numbers: ");
      System.out.println("Modulus of two number is "+(sc.nextInt()%sc.nextInt()));
     }
     else if(s=='e'||s=='E')
     {System.out.print("\033[H\033[2J");  
     System.out.flush(); 
     System.out.println("Exiting Program");
     break;
     }
    }sc.close();
    }
}