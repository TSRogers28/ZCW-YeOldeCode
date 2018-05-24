class Squares
{
// Print all square numbers up to a fixed limit

 static final int LIMIT=150;

 public void display(int limit)
 {
  int i;
  for(i=1;i*i<limit;i++)
     {
      System.out.print("The square of "+i);
      System.out.println(" is "+i*i);
     }
 }
}