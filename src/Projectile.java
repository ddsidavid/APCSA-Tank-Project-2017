public class Projectile
{   
    final double GRAVITY = -10;
    double xVelocity;
    double yVelocity;
    double xPosition;
    double yPosition;
    int frame = 1;
    double time;
    double initialHeight;
    
    public Projectile(double angle, double power) 
    {
        
        yVelocity = Math.sin(angle)*power;
        xVelocity = Math.cos(angle)*power;
    }
    
    public void advanceFrame()
    {
//         while(yPosition > initialHeight)
//         {
    
            yPosition = initialHeight + yVelocity*time;
            yVelocity -= (.5*GRAVITY*(Math.pow(time, 2)));
            
            xPosition = xVelocity*time; 
            
            frame += yVelocity;
            time += .1;
            
//         }
        
    }
    public double getX()
    {
        return xPosition;
    }
    public double getY()
    {
        return yPosition;
    }
}
