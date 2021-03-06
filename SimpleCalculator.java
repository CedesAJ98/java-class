public class SimpleCalculator {
    private double x, y;

    public SimpleCalculator()
    {
        this.x = 0;
        this.y = 0;
    }

    public SimpleCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double add()
    {
        return (getX() + getY());
    }

    public double subtract()
    {
        return (getX() - getY());
    }

    public double multiply()
    {
        return (getX() * getY());
    }

    public double divide()
    {
        return (getX() / getY());
    }
}