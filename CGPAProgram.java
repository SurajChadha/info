package practise;

public class CGPAProgram {
  public static void main (String args[])
  {
	  double English,Hindi,Maths,Science,SocialStudy,CGPA,CGPAPER;
      English=9.1;
      Hindi=8.5;
      Maths=9.5;
      Science=9.6;
      SocialStudy=8.6;
      CGPA=(9.1+8.5+9.5+9.6+8.6)/(5.0);
      CGPAPER=(float)(9.5*(CGPA));
      System.out.println("CGPA Percentage is: "+CGPAPER);
  }
}
