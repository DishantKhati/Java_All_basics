public class Constructor
{int rollno;
  String stname;
  Constructor()
  {rollno=1;
    stname="knight";
  }
  static int c=1;
  Constructor(int rollno,String stname)
  {this.rollno=rollno;
    this.stname=stname;
  }
public static void  main(String args[])
  {Constructor c = new Constructor(10,"Dishant");
   System.out.println(c);
   c.c+=1;
   Constructor c1 = new Constructor();
   System.out.println(c1);
  }
  public String toString()
  {return "\nStudent "+c+" :\n "+"Roll no. : "+rollno+"\nStudent Name: "+stname;}
}
