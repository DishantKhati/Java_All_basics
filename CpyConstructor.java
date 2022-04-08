public class CpyConstructor
{int w,h,d;
  CpyConstructor(CpyConstructor c)
  {w=c.w;
    h=c.h;
    d=c.d;
  }
  CpyConstructor(int h,int w,int d)
  {this.h=h;
    this.w=w;
    this.d=d;
  }
public static void  main(String args[])
  {CpyConstructor c = new CpyConstructor(10,20,30);
   System.out.println(c);
   CpyConstructor c1 = new CpyConstructor(c);
   System.out.println(c1);
  }
  public String toString()
  {return "Height: "+h+"\nWidth: "+w+"\nDepth: "+d+"\n\nArea: "+h*w*d+"\n";}
  }
