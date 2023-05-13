import java.util.Scanner;
import java.time.LocalDate;

// https://github.com/SanjayAlagiri/oops-assignment

class recruiter {
    Scanner scnr = new Scanner(System.in);
    String  name;
    boolean result = false ;
    public String getdetails(){
        name = scnr.next();
        System.out.print(name);
        return name;
    }
    public void dob() {
        String date2 = scnr.next();
        String date1 = "31-07-1999";

        if (date1.compareTo(date2)<0) {
            result = true;
        } else{
            result = false;
        }
    }
    public void HSCpcmaggregate(){

        double marks = scnr.nextInt();
        if (marks>60) {
            result = true;
        }
    }
    public boolean selecteds(){
        return result;
    }
    public void showresult(){
        boolean res = selecteds();
        if (res != false){
            System.out.println("Pass");
        }else{
            System.out.println("Rejected");
        }
    }
}

class candidate extends recruiter{
    public static void main(String[] args) {
        candidate candidate1 = new candidate();
        candidate1.getdetails();
        candidate1.dob();
        candidate1.HSCpcmaggregate();
        candidate1.showresult();
    }
}
