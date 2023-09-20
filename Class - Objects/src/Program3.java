/*3. Create class named Student. Write methods to read marks as input and
return total as output. Another method to take total and number of subject
as input and return average.*/

import java.util.Scanner;

class Program3 {
     public static void main(String[] args) {
          Student s = new Student();
          s.readMarks();

          int totalMarks = s.calculateTotal();
          System.out.println("Total marks: " + totalMarks);

          double averageMark = s.calculateAvg();
          System.out.println("Average Marks: " + averageMark);
     }
}
class Student{
     private int[] marks;

     public void readMarks(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number of subjects: ");
          int numSubjects = sc.nextInt();

          marks = new int[numSubjects];

          for (int i = 0;i<numSubjects;i++){
               System.out.print("Enter marks for Subject " + ( i+1));
               marks[i] = sc.nextInt();
          }
     }

     public int calculateTotal(){
          int total = 0;
          for (int mark : marks){
               total = total + mark;
          }
          return total;
     }

     public double calculateAvg(){
          int total = calculateTotal();
          int numSubjects = marks.length;

          if(numSubjects == 0){
               System.out.println("No Subjects found");
               return 0.0;
          }
          return (double) total / numSubjects;
     }
}
