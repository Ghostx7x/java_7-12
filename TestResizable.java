public class TestResizable
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10, 5);
        
        System.out.println("Initial Dimensions");
        rectangle.displayDimensions();
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);
        System.out.println("Dimensions after Resizable");
        rectangle.displayDimensions();
    }
}