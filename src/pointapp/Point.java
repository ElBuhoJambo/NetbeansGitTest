
package pointapp;

public class Point 
{
    //Klassenfelder
    public static int pointCounter = 0;
    
    //Objektbezogene Felder
    private int x;
    private int y;
    
    //Konstruktoren
    public Point(){
        this(0,0);
        pointCounter++;
    }
    
    public Point(int x, int y){
        setLocation(x,y);
        pointCounter++;
    }
    
    public static void resetPointCounter(){
        pointCounter = 0;
    }
    
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //verändernde Methoden
    public void translate(int dx, int dy)
    {
        x = x + dx;
        y = y + dy;
    }
    
    //sondierende Methode
    public double distanceFromOrigin()
    {
        return Math.sqrt(x * x + y * y);
    }
    
    public String toString()
    {
        return "(" + x + "|" + y + ")";
    }
}
