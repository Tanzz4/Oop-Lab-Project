import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Management obj = new Management();
        System.out.println("\n\n\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*                         ------- ----------                    *");
        System.out.println("\t\t\t\t\t\t\t\t*                         STUDENT MANAGEMENT                    *");
        System.out.println("\t\t\t\t\t\t\t\t*                         ------- ----------                    *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t*        Name                   ----               ID           *");
        System.out.println("\t\t\t\t\t\t\t\t*    Tanzim Ahmed               ----           213-15-4562      *");
        System.out.println("\t\t\t\t\t\t\t\t*****************************************************************\n\n");

        int n=1,arrayindex=0, endloop = 1;

        while (n!=0)
        {
            System.out.println("* Press '1' to Add a new student info    *");
            System.out.println("* Press '2' to Search a student info     *");
            System.out.println("* Press '3' to Edit a student info       *");
            System.out.println("* Press '4' to Delete a student info     *");
            System.out.println("* Press '5' to Display all student info  *");
            System.out.println("* Press '6' to Delete all student info   *");
            System.out.println("* Press '0' to Exit                      *\n");

            System.out.print("Press Any Key: ");
            n=input.nextInt();

            if(n==1)
            {
                obj.AddData(arrayindex,endloop);
                arrayindex++;
                endloop++;
            }
            else if(n==2)
            {
                obj.SearchData(arrayindex);
            }
            else if(n==3)
            {
                obj.EditData(arrayindex);
            }
            else if(n==4){
               int  k=obj.DeleteData(arrayindex);
                if(k==1){
                    arrayindex--;
                    endloop--;
                }
            }
        }
    }
}
