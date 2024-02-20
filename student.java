public class student extends course  {
    public String course[] = { "C#", "Applied statistics", "JAVA" };
         public int marks[] = { 70, 100, 30 };
    
    
       
        String name = "kiran";
        String program = "BCA";
        String department = "BCA";
        public String Registeredcourses[]={"C#","Applied Statistics","java"};
    
        public void Display() {
            
            System.out.println("Name of the student" + name);
            System.out.println("Program" + program);
            System.out.println("Department" + department);
             
              for (int i=0;i<3;i++){
               System.out.println("Courses:"+Registeredcourses[i]);
              }
        }
        public static void main(String[] args) {
            student s = new student();
            s.Display();
            s.displaymarks();
            s.displaylessthanFourty();
        }
    }
    