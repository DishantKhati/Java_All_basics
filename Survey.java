import static java.lang.System.*;
import java.util.Scanner;
class Survey
{
 public static void main(String []args)
{Scanner sc=new Scanner(System.in);
 int a[][]=new int[4][4];
 for(int i=0;i<4;++i)for(int j=0;j<4;++j)a[i][j]=0;
 while(true)
 {
  int n,o;
  char c;
  out.print("City Menu: \nDelhi(0)\nMumbai(1)\nKolkata(2)\nChennai(3)\nEnter your choice: ");
  n=sc.nextInt();
  out.print("Car Menu: \nAlto(0)\nSX4(1)\nSwift(2)\nBaleno(3)\nEnter your choice: ");
  o=sc.nextInt();
  a[n][o]+=1;
  out.print("Want to exit (y/n): ");
  c=sc.next().charAt(0);
  if(c=='y'||c=='Y')
  break;
 }
 out.print("\n\n\tMaruti-K10 Zen-Astelo Wagnor Maruti SX4\n");
 for(int i=0;i<4;i++)
 {
  if(i==0)
  out.print("Delhi\t");
  else if(i==1)
  out.print("Mumbai\t");
  else if(i==2)
  out.print("Chennai\t");
  else if(i==3)
  out.print("Kolkata\t");
 for(int j=0;j<4;j++)
 {
  out.print(a[i][j]);
  if(j==0)
  out.print("\t\t");
  else
  out.print("\t");
 }
  out.println();
 }
}
}
