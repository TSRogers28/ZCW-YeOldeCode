class Date
{
 protected int day,month,year;

 public Date(int d,int m,int y) throws DateException
 {
  day=d;
  month=m;
  year=y;
  if(month<1||month>12||day<1)
     throw new DateException(toString());
  else if((month==4||month==6||month==9||month==11)&&day>30)
     throw new DateException(toString());
  else if(month==2)
     {
      if(year%4==0)
         {
          if(day>29)
             throw new DateException(toString());
         }
      else if(day>28)
         throw new DateException(toString());
     }
  else if(day>31)
      throw new DateException(toString());
 }

 public String toString()
 {
  return day+"/"+month+"/"+year;
 }

 public boolean lessThan(Date d)
 {
  if(year<d.year)
     return true;
  else if(year==d.year)
     if(month<d.month)
        return true;
     else if(month==d.month)
        if(day<d.day)
           return true;
  return false;
 }

}