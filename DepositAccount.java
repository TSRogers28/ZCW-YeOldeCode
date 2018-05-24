class DepositAccount extends Account
{
 private boolean newmonth=true;
 private double interest;

 public DepositAccount(int sum,double interest)
 {
  super(sum);
  this.interest=interest;
 }

 // 
 public void withdraw(int sum) throws AccountException
    {
        if(sum<=super.balance())
            super.withdraw(sum);
        else
            throw new AccountException("overdraw");
    }


 public void update()
 {
  deposit((int)(balance()*interest));
  newmonth=true;
 }

 public void setInterest(double newInterest)
 {
  interest=newInterest;
 }
}