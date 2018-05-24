class Calendar1 extends Calendar
{
CalendarGraphic picture;
 
 public Calendar1(int d,int m,int y) throws DateException
 {
  super(d,m,y);
  picture = new CalendarGraphic(d,m,y);
 } 

 public void display()
 {
  picture.display(day,month,year);
 }

}