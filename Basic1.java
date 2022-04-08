public class Basic1
{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
class demo
{
public static void main(String[] a)
{int i;
 for(i=0;i<a.length;i++)
	System.out.println(a[i])
	for(int j=0;j<=i;j++)
	System.out.print(" ")
}
}
class demo2
{
public static void main(String[] a){
outer: for(int i=0;i<10;++i)
{for(int j=0;j<10;++j)
 {if(j>i)
  {
   System.out.println();
	continue outer;
  }
	System.out.println(" "+i*j);
 }
}
}
}
