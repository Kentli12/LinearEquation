
public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;



    /* Creates a LinearEquation object */
    public LinearEquation (int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance(){
        double xDistance = (x2 - x1);
        double yDistance = (y2 - y1);
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        return distance;
    }
    public double slope(){
        double riseS = (y2 - y1);
        double runS  = (x2 - x1);
        double slope = riseS/runS;
        return slope;
    }

    public double yIntercept(){
        double x =  x2  * slope();
        double yIntercept = y2- x;
        return yIntercept;
    }

    public String equation(){
        String equation = ("y = " + rise + "/" + run + "x " + yIntercept());
        return equation;
    }


}
