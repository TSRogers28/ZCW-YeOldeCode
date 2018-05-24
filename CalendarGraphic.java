import java.awt.*;

class CalendarGraphic extends Frame
{
TextField daytext,monthtext,yeartext;

   public CalendarGraphic(int d,int m,int y)
   {
    setTitle("Date display");
    setSize(300,100);
    setLayout(new FlowLayout());
    daytext = new TextField(2);
    monthtext = new TextField(3);
    yeartext = new TextField(4);
    add(daytext);
    add(monthtext);
    add(yeartext);
    setVisible(true);
    display(d,m,y);
   }

   public void display(int day,int month,int year)
   {
    String monthname="";
    switch(month)
       {
        case 1: monthname="JAN"; break;
        case 2: monthname="FEB"; break;
        case 3: monthname="MAR"; break;
        case 4: monthname="APR"; break;
        case 5: monthname="MAY"; break;
        case 6: monthname="JUN"; break;
        case 7: monthname="JUL"; break;
        case 8: monthname="AUG"; break;
        case 9: monthname="SEP"; break;
        case 10: monthname="OCT"; break;
        case 11: monthname="NOV"; break;
        case 12: monthname="DEC"; break;
       }
    daytext.setText(Integer.toString(day));
    monthtext.setText(monthname);
    yeartext.setText(Integer.toString(year));
   }
 
}
