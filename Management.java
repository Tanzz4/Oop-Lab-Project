import java.util.Scanner;

public class Management implements Interface{
    private String StudentName;
    private String StudentId;
    private String StudentSection;
    private String StudentSemester;
    private String StudentCgpa;

    Management[] info = new Management[100]; // Constractor Array / Structure Array.

    public void AddData(int arrayindex, int endloop){ //arrayindex = 0 ; endloop = 1.
     Scanner input = new Scanner(System.in);

     for (int i = arrayindex;i<endloop;i++)
     {
         info[i] = new Management();

         System.out.print("Enter Student Name   :\t");
         info[i].StudentName = input.nextLine();

         System.out.print("Enter Full Student ID:\t");
         info[i].StudentId = input.nextLine();

         System.out.print("Enter your Section   :\t");
         info[i].StudentSection = input.nextLine();

         System.out.print("Enter your Semester  :\t");
         info[i].StudentSemester = input.nextLine();

         System.out.print("Enter Your CGPA      :\t");
         info[i].StudentCgpa = input.nextLine();
     }
        System.out.println("Informaton are Added..\n\n");

    }

    public void SearchData(int arrayindex)
    {
        int fail=0,i;
        System.out.println("Enter your full Student ID");
        Scanner input = new Scanner(System.in);
        String SearchId = input.nextLine(); // Take input (ID) for Search.

        for (i=0;i<arrayindex;i++) //arrayindex =  (0 To Total Student data)
        {
            String FindId = info[i].StudentId; // Loop continue 0 index to total Student count.
            if(SearchId.equals(FindId))
            {
                Display(info[i].StudentName, info[i].StudentId, info[i].StudentSection, info[i].StudentSemester, info[i].StudentCgpa);
                fail=1; // fail = 1, fixed Value of one for again search.
            }
            if(fail == 0) //
            {
                System.out.println("Not found!!!\n");
            }

        }
    }
    public  void EditData(int arrayindex)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String ExpectedId = input.nextLine();
        int temp = 0,i;
        String SearchId;
        for (i=0; i<arrayindex;i++)
        {
            SearchId = info[i].StudentId;
            if(ExpectedId.equals(SearchId))
            {
                Display(info[i].StudentName, info[i].StudentId, info[i].StudentSemester, info[i].StudentSection, info[i].StudentCgpa);
                System.out.print("Enter a new name: ");
                info[i].StudentName = input.nextLine();
                System.out.print("Enter a new ID: ");
                info[i].StudentId = input.nextLine();
                System.out.print("Enter a new semester: ");
                info[i].StudentSemester = input.nextLine();
                System.out.print("Enter a new section: ");
                info[i].StudentSection = input.nextLine();
                System.out.print("Enter a New CGPA: ");
                info[i].StudentCgpa = input.nextLine();
                System.out.println("Information Updated..\n");
                temp = 1;
            }
        }
        if (temp == 0) {
            System.out.println("Data is wrong!!! Try again....");
        }


    }
    public void Display(String StudentName, String StudentId, String StudentSection, String StudentSemester, String StudentCgpa)
    {
        System.out.println("*********************************");
        System.out.println("Student Name : "+StudentName);
        System.out.println("Student ID   : "+StudentId);
        System.out.println("Semester     : "+StudentSection);
        System.out.println("Section      : "+StudentSemester);
        System.out.println("CGPA         : "+StudentCgpa);
        System.out.println("*********************************");
    }

    public int DeleteData(int arrayindex)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID to Delete: ");

        String InputIdForDelete = input.nextLine();
        int temp = 0, i,j;
        for( i = 0; i<arrayindex;i++)
        {
            StudentId = info[i].StudentId;
            if(InputIdForDelete.equals(StudentId))
            {
                for(j=1;j<arrayindex;j++)
                {
                    info[j]=info[j+1];
                    temp = 1;
                }
                if (temp == 1) {
                    System.out.println("Information Deleted..\n");
                    return 1;

                }
            }
        }
        if (temp == 0) {
            System.out.println("Data is wrong!!! Try again later....");
            return 0;
        }
        return 0;

    }
    public void Display_info(int temp1) {
        System.out.println("** Student Information **\n");
        int k = 1, i;
        if (temp1 == 0) {
            System.out.println("List not found ! ");
        } else {


            for (i = 0; i < temp1; i++) {
                System.out.println("************************************");
                System.out.printf("Student %d:\n", k);
                System.out.println("Name    : " + info[i].StudentName);
                System.out.println("ID      : " + info[i].StudentId);
                System.out.println("Semester: " + info[i].StudentSemester);
                System.out.println("Section : " + info[i].StudentSection);
                System.out.println("CGPA    : " + info[i].StudentCgpa);

                k++;
            }
            System.out.println("**************************************");
        }
    }

    public String getStudent_name() {
        return StudentName;
    }

    public void setStudent_name(String student_name) {
        this.StudentName = student_name;
    }

    public String getStudent_semester() {
        return StudentSemester;
    }

    public void setStudent_semester(String student_semester) {
        this.StudentSemester = student_semester;
    }

    public String getStudent_id() {
        return StudentId;
    }

    public void setStudent_id(String student_id) {
        this.StudentId = student_id;
    }

    public String getStudent_section() {
        return StudentSection;
    }

    public void setStudent_section(String student_section) {
        this.StudentSection = student_section;
    }

    public String getStudent_cgpa() {
        return StudentCgpa;
    }

    public void setStudent_cgpa(String student_cgpa) {
        this.StudentCgpa = student_cgpa;
    }

    public Management[] getInfo() {
        return info;
    }

    public void setInfo(Management[] info) {
        this.info = info;
    }
    @Override
    public void finish()
    {
        System.out.println("Thank You");
    }
}
