
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

    public String equation() {
        int rise = y2 - y1;
        int run = x2 - x1;
        double yIntcep = yIntercept();
        if (slope() % 1 == 0) {
            if (yIntcep == 0) {
                String equation = ("y = " + slope() + "x  ");
                return equation;
            } else {
                String equation = ("y = " + slope() + "x " + yIntercept());
                return equation;
            }
        } else {
                if (yIntcep == 0) {
                    String equation = ("y = " + rise + "/" + run + "x  ");
                    return equation;
                } else {
                    String equation = ("y = " + rise + "/" + run + "x " + yIntercept());
                    return equation;
                }
            }
        }

        public double roundedToHundredth(double toRound){
            return(Math.round(toRound*100)/100);
        }
        public String lineInfo(){
            return ("\n"+ "The two points are: (" + x1 + ", " + y1+ ") and (" + x2 + ", " + y2 + ")"
                    + "\n" + "The equation between these two points is: " + equation()
                    + "\n" + "The slope of this line is: " + slope()
                    + "\n" + "The y-intercept of the line is: " + yIntercept());
        }

    }


