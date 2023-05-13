import java.time.LocalDate;
import java.util.Scanner;

public class hr extends recruiter{
    hr results = new hr();
    public void showresult(){

        boolean res = results.selecteds();
        if (res != false){
            System.out.println("Pass");
        }else{
            System.out.println("Rejected");
        }
    }
}


