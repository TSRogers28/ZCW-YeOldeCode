class TriangleTwo {

    //   Print a horizontal row of XTRIANGLES bottom-left right-angled triangles
    //   of stars, each of size SIZE

    static final int SIZE=6;
    static final int XTRIANGLES=9;

    public void display() 
    {
        this.display(XTRIANGLES, SIZE);
    }

    public void display(int num, int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int k=0;k<num;k++)
            {
                int j;
                for(j=0;j<=i;j++)
                    System.out.print("*");
                for(;j<size;j++)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}