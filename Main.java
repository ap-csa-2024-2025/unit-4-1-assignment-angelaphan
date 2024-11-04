import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //problem1();
  }

  public static void problem1()
  {
    Scanner scan = new Scanner(System.in);
    int sum= 0;
    System.out.println("give int");
    int num = scan.nextInt();
    while (num>0&&num!=-1)
    {
      sum=sum+num;
      num = scan.nextInt();
      

    }
    if (num == -1)
    {
      System.out.println("Sum is "+sum);
    }
    
  }
  public static void problem2()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("how many numbers do you want to give");
    int num=
  }
}
