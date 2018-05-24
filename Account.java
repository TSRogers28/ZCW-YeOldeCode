
class Account
{
    private int amount;

    public Account()
    {
        amount = 0;
    }

    public Account(int sum)
    {
        amount=sum;
    }

    public void deposit(int sum)
    {
        amount+=sum;
    }

    public boolean transfer(Account acc, int sum) {
        if(sum<=amount) {
            amount-=sum;
            acc.amount+=sum;
            return true;
        }
        else return false;
    }

    public Account open(int sum) {
        if(sum<=amount) {
            amount-=sum;
            return new Account(sum);
        }
        else return null;
    }

    public int balance() {
        return amount;
    }

    public void withdraw(int sum) throws AccountException
    {
        if(sum<=amount)
            amount-=sum;
        else
            throw new AccountException("overdraw");
    }

}
