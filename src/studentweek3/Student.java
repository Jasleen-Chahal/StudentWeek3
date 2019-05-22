package studentweek3;
/**
 * @author Jasleen kaur Chahal ()
 */
public class Student
{
   private int ID;
   private String firstName;
   private int MaxCourse;
   private boolean PartTime;

   public boolean isPartTime ()
   {
      return PartTime;
   }

   public void setPartTime (boolean PartTime)
   {
      this.PartTime = PartTime;
   }

   public int getID ()
   {
      return ID;
   }

   public void setID (int ID)
   {
      this.ID = ID;
   }

   public String getFirstName ()
   {
      return firstName;
   }

   public void setFirstName (String firstName)
   {
      this.firstName = firstName;
   }

}
