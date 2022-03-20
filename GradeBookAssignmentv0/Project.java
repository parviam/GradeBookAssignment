package GradeBookAssignmentv0;

/**
 * Class representing Projects in GradebookAssignment
 * Child of Assignment class
 * @Parv Mahajan
 * @3/18/2022 13:35
 */
public class Project extends Assignment
{
    private String dueDate;     //instance variable, holds due date of project
    boolean groups;             //instance variable, holds whether or not project is a group project

    /**
     * Constructor for objects of class Project
     */
    public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups)
    {
        super(name, availablePoints, earnedPoints);
        this.dueDate = dueDate;
        this.groups = groups;
    }

    /**
     * @return      Get due date for objects of class Project
     */
    public String getDueDate(){return dueDate;}
    /**
     * @return      Get whether or not the project is a group project for objects of class Project 
     */
    public boolean getGroups(){return groups;}
    
    /**
     * Set due date for objects of class Project
     * @param       dueDate - new due date for Project object
     */
    public void setDueDate(String dueDate){this.dueDate = dueDate;}
    
    /**
     * Set whether or not object is a group project for objects of class Project
     * @param       groups - new value for whether or not project is a group project - true is yes, false is no
     */
    public void setGroups(boolean groups){this.groups = groups;}
}
