interface Resizable
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable
{
    private int width;
    private int height;
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width)
    {
        this.width = width;
        System.out.println("Width resized to : " + width);
    }

    @Override
    public void resizeHeight(int height)
    {
        this.height = height;
        System.out.println("Height resized to : " + height);
    }

    void displayDimensions()
    {
        System.out.println("Rectangle Dimensions - Width: "+width+" Height: "+height);
    }
}