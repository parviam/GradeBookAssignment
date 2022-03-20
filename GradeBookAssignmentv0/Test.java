package GradeBookAssignmentv0;

/**
 * Class representing Tests in GradebookAssignment
 * Child of Assignment class
 * @Parv Mahajan
 * @3/18/2022 13:35
 */
public class Test extends Assignment
{
    private String testDate;    //instance variable, holds date of test
    
    /**
     * Constructors for objects of class Test
     */
    public Test(String name, double availablePoints, double earnedPoints, String testDate)
    {
        super(name, availablePoints, earnedPoints);
        this.testDate = testDate;
    }
    
    /**
     * @return      Get test date for objects of class Test
     */
    public String getTestDate(){return testDate;}
    
    /**
     * Set test date for objects of class Test
     * @param       TestDate - new test date for Test object
     */
    public void setTestDate(String testDate){this.testDate = testDate;}
}
