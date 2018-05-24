class Calendar extends Date
{
 
 public Calendar(int d,int m,int y) throws DateException
 {
  super(d,m,y);
 } 

 public void addDay()
 {
  day++;
  if(day==32)
    {
     day=1;
     month++;
    }
  else if(day==31&&(month==4||month==6||month==9||month==11))
    {
     day=1;
     month++;
    }
  else if(day==30&&month==2)
    {
     day=1;
     month=3;
    }
  else if(day==29&&month==2&&year%4!=0)
    {
     day=1;
     month=3;
    }
  if(month==13)
    {
     month=1;
     year++;
    }
 }

 public void subDay()
  {
  day--;
  if(day==0)
    {
     month--;
     if(month==0)
       {
        month=12;
        day=31;
        year--;
       }
     else if(month==4||month==6||month==9||month==11)
       day=30;
     else if(month==2)
        if(year%4==0)
           day=29;
        else
           day=28;
     else
        day=31;
    }
 }

 public void addMonth()
 {
  month++;
  if(month==13)
     {
      month=1;
      year++;
     }
  else if(day==31&&(month==4||month==6||month==9||month==11))
     day=30;
  else if(month==2)
     if(year%4==0)
       {
        if(day>29)
           day=29;
       }
     else if(day>28)
        day=28;
 }

 public void subMonth()
 {
  month--;
  if(month==0)
     {
      month=12;
      year--;
     }
  else if(day==31&&(month==4||month==6||month==9||month==11))
     day=30;
  else if(month==2)
     if(year%4==0)
       {
        if(day>29)
           day=29;
       }
     else if(day>28)
        day=28;
 }

 public void addYear()
 {
  year++;
  if(month==2&&day==29)
     day=28;
 }

 public void subYear()
 {
  year--;
  if(month==2&&day==29)
     day=28;
 }

}

