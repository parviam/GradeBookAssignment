package GradeBookAssignmentv0;

/**
 * Root class of GradeBookAssignment
 * Parent of Test and Project classes
 * @Parv Mahajan
 * @3/18/2022 13:27
 */
public class Assignment
{
    private String name;    //instance variable, holds name of assignment
    double availablePoints; //instance variable, holds total points
    double earnedPoints;    //instance variable, holds score

    /**
     * Constructor for objects of class Assignment
     */
    public Assignment(String name, double availablePoints, double earnedPoints)
    {
        // initialise instance variables
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    /**
     * @return      Get name for objects of class Assignment
     */
    public String getName(){return name;}
    /**
     * @return      Get number of available points for objects of class Assignment
     */
    public double getAvailablePoints(){return availablePoints;}
    /**
     * @return      Get number of earned points for objects of class Assignment
     */
    public double getEarnedPoints(){return earnedPoints;}
    
    /**
     * Set name for objects of class Assignment
     * @param       name - new name for Assignment object
     */
    public void setName(String name){this.name = name;}
    /**
     * Set available points for objects of class Assignment
     * @param       availablePoints - new # of available points for Assignment object
     */
    public void setAvailablePoints(double availablePoints){this.availablePoints = availablePoints;}
    /**
     * Set earned points for objects of class Assignment
     * @param       earnedPoints - new # of earned points for Assignment object
     */
    public void setEarnedPoints(double earnedPoints){this.earnedPoints = earnedPoints;}
}
