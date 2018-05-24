class TriangleOne
{
    //   Print a bottom-left right-angled triangle of stars, of size SIZE

    static final int SIZE=5;

    public void display() 
    {
        this.display(SIZE);
    }

    public void display(int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }

}