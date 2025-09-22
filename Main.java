import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14);
    Circle circ3 = new Circle(20.5);
    System.out.println(circ1.toString());
    System.out.println(circ2.toString());
    System.out.println(circ3.toString());

    double lw, l, w;
    System.out.println("Length and Width for Rectange 1: ");
    lw = in.nextDouble();
    System.out.println("Length for Rectange 2: ");
    l = in.nextDouble();
    System.out.println("Width for Rectange 2: ");
    w = in.nextDouble();
    Rectangle rect1 = new Rectangle(lw);
    Rectangle rect2 = new Rectangle(l,w);
    System.out.println(rect1.toString());
    System.out.println(rect2.toString());

    double sl;
    System.out.println("Side Length:");
    sl = in.nextDouble();
    RegularPolygon tri = new RegularPolygon(3, sl);
    RegularPolygon squ = new RegularPolygon(4, sl);
    System.out.println(tri.toString());
    System.out.println(squ.toString());
  }
}
