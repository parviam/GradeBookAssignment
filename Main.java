import java.util.*;
/**
 * Driver class that works as a crude text interface for GradeBookAssignment
 *
 * @Parv Mahajan
 * @3/18/2022 13:50
 */
public class Main
{
    private static ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    /**
     * Constructor for objects of class Main
     * Follows directions detailed in assignment sheet
     */
    public Main()
    {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;
        while(!stop)
        {
            System.out.print("Please enter an assignment name (exit to quit): ");
            String name = sc.nextLine();       //input name
            if(name.toUpperCase().equals("EXIT")){     //case-insensitive stop button
                stop = true;
                break;
            }
            System.out.print("Please enter the available points: ");
            double availablePoints = Double.parseDouble(sc.nextLine());       //input avaliable points
            System.out.print("Please enter the earned points: ");
            double earnedPoints = Double.parseDouble(sc.nextLine());      //input earned points
            
            System.out.print("Is this a (t)est or a (p)roject: ");
            String testOrProject = sc.nextLine().toUpperCase();       //case-insensitive input whether it is a test or a project
            if(testOrProject.equals("P")){
                System.out.print("Please enter the due date: ");
                testOrProject = sc.nextLine();     //reusing variable to input due date
                System.out.print("Group Project? true or false: ");
                boolean groups = Boolean.parseBoolean(sc.nextLine());  //input whether or not it is a group project
                Project a = new Project(name, availablePoints, earnedPoints, testOrProject, groups);
                Main.assignments.add(a);         //adding Project object to ArrayList instance variable
            }
            else if(testOrProject.equals("T")){
                System.out.print("Please enter the test date: ");
                testOrProject = sc.nextLine();      //reusing variable to input test date
                Test a = new Test(name, availablePoints, earnedPoints, testOrProject);
                assignments.add(a);         //adding Test object to arrayList instance variable
            }
            else
            {
                Assignment a = new Assignment(name, availablePoints, earnedPoints);
                assignments.add(a);     //adding generic assignment to arrayList instance variable
            }
            
        }
        System.out.print("\nYour average: " + average(assignments));        //formatting and printing average
    }
    /**
     * @return double average of all percentage scores in the arrayList given
     * @param assignments is an arrayList of all assignments in one Main object
     * Really, this doesn't need to be public or static, but I copied the directions given :)
     */
    public static double average(ArrayList<Assignment> assignments)
    {
        double totalEarned = 0; double totalPoints = 0;     //initializing variables needed for calculating average percentage
        for(Assignment a : assignments){        //for every assignment in the given arrayList
            totalEarned += a.getEarnedPoints();     //add its earned points to the total earned points
            totalPoints += a.getAvailablePoints();  //add its available points to the total available points
        }
        return totalEarned/totalPoints * 100;       //return average percentage
    }

}
