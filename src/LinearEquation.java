
public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    /* Creates a LinearEquation object */
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    //method that returns the distance, rounded to the nearest hundredth
    public double distance() {
        double xDistance = (double) (x2 - x1);
        double yDistance = (double) (y2 - y1);
        double squared = Math.pow(xDistance, 2) + Math.pow(yDistance, 2);
        double distance = Math.sqrt(squared);
        return roundedToHundredth(distance);
    }


    //method that returns the slope, rounded to the nearest hundredth
    public double slope() {
        double riseS = (double) (y2 - y1);
        double runS = (double) (x2 - x1);
        double slope = riseS / runS;
        return roundedToHundredth(slope);
    }


    //method that returns the yIntercept, rounded to the nearest hundredth
    public double yIntercept() {
        double x = x2 * slope();
        double yIntercept = y2 - x;
        return roundedToHundredth(yIntercept);
    }


    //method that returns the equation of the two points, rounded to the nearest hundredth
    public String equation() {
    //declares and initializes variables used in the code
        int rise = y2 - y1;
        int run = x2 - x1;
        double yIntcep = yIntercept();
    //determines if slope is 0 and returns the correct equation
        if (rise / run == 0) {
            String equation = ("y = " + (int)yIntercept());
            return equation;
        } else {
    //determines whether the slope is a whole number
            if (slope() % 1 == 0) {
                if (yIntcep == 0) {
                    String equation = ("y = " + (int) slope() + "x  ");
                    return equation;
                } else if (yIntcep < 0) {
                    String equation = ("y = " + (int) slope() + "x" + yIntercept());
                    return equation;
                } else {
                    String equation = ("y = " + (int) slope() + "x" + " + " + yIntercept());
                    return equation;
                }
    //this part of the code will run if the slope is a fraction
            } else {
    //this part of the code will run if both the numerator and denominator are negative
                if (rise < 0 && run < 0) {
                    if (yIntcep == 0) {
                        String equation = ("y = " + rise + "/" + run + "x  ");
                        return equation;
                    } else if (yIntcep < 0) {
                        String equation = ("y = " + rise + "/" + run + "x" + yIntercept());
                        return equation;
                    } else {
                        String equation = ("y = " + rise + "/" + run + "x" + " + " + yIntercept());
                        return equation;
                    }
    //this part of the code will run, if either the numerator or denominator contains a negative
                } else if (run < 0) {
                    rise = Math.abs(rise);
                    run = Math.abs(run);
                    if (yIntcep == 0) {
                        String equation = ("y = " + "-" + rise + "/" + run + "x  ");
                        return equation;
                    } else if (yIntcep < 0) {
                        String equation = ("y = " + "-" + rise + "/" + run + "x" + yIntercept());
                        return equation;
                    } else {
                        String equation = ("y = " + "-" + rise + "/" + run + "x" + " + " + yIntercept());
                        return equation;
                    }
    //this part of the code will run, if both the numerator and denominator are positive
                } else {
                    if (yIntcep == 0) {
                        String equation = ("y = " + rise + "/" + run + "x  ");
                        return equation;
                    } else if (yIntcep < 0) {
                        String equation = ("y = " + rise + "/" + run + "x" + yIntercept());
                        return equation;
                    } else {
                        String equation = ("y = " + rise + "/" + run + "x" + " + " + yIntercept());
                        return equation;
                    }

                }
            }
        }
    }


    //helper method that rounds a number to the nearest hundredth
        public double roundedToHundredth(double toRound){
            return Math.round(toRound*100.0)/100.0;
        }


    //returns a string with all the information of the linear equation
        public String lineInfo(){
            return   ("\n"+ "The two points are: (" + x1 + ", " + y1+ ") and (" + x2 + ", " + y2 + ")"
                    + "\n" + "The equation between these two points is: " + equation()
                    + "\n" + "The slope of this line is: " + slope()
                    + "\n" + "The y-intercept of the line is: " + yIntercept()
                    + "\n" + "The distance between the two points is " + distance());
        }


    //returns a specific coordinate based on the x-value
        public String coordinateForX(double xvalue){
            double y = roundedToHundredth(slope() * xvalue + yIntercept());
            return ("These points are a vertical line is " + "(" + xvalue +", " + y + ")");
        }
    }


