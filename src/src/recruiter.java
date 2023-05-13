import java.util.Scanner;

 public class recruiter {
     Scanner scnr = new Scanner(System.in);
     String  name;
    boolean result = false ;
    public String getdetails(){
      //  Scanner sc = new Scanner(System.in);
        name = scnr.next();
        System.out.print(name);
        return name;
    }
     public void dob() {
         //  Scanner scnr = new Scanner(System.in);
         // Store the input as string
         String date2 = scnr.next();
         String date1 = "31-07-1999";
         //
         if (date1.compareTo(date2) < 0) {
             result = true;
         } else  {
             result = false;
         }
     }
         public void HSCpcmaggregate(){

             double marks = scnr.nextInt();
             if (marks > 60) {
                 result = true;
             }

     }
     public boolean selecteds(){
        recruiter details = new recruiter();
        details.dob();
        return result;
     }


}
