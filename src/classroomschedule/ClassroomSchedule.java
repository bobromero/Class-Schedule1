/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroomschedule;

/**
 *
 * @author 21332
 */
public class ClassroomSchedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Robert";
        String lastName = " Romero";
        int gradYear = 2021;
        String classOne = "Hon American History";
        String teacherOne = "Sharifah Lee";
        
        String classTwo = "AP Computer Science A";
        String teacherTwo = "Matthew Larrubia";
        
        String classThree = "Physics Accelerated";
        String teacherThree = "Bruce Ferguson";
        
        String classFour = "English 11 Accelerated";
        String teacherFour = "Andrew Chacon";
        
        String classFive = "Hon Printmaking";
        String teacherFive = "Peter Santa-Maria";
        
        String classSix = "Hon Global Studies";
        String teacherSix = "James Dugard";
  
        
        String classSeven = "Algebra 2 Accelerated";
        String teacherSeven = "Lissette Leonard";
        
        System.out.println("Hello my name is " + firstName + lastName + " and I will graduate in " + gradYear + "!");
        System.out.println("And this is my schedule");
        System.out.println("+--------------------------------------------+");
        System.out.println("| 1 | " + classOne + " |     " + teacherOne +  "|");
        System.out.println("| 2 |" + classTwo + " | " + teacherTwo + "| ");
        System.out.println("| 3 |" + classThree + "   |   " + teacherThree + "| ");
        System.out.println("| 4 |" + classFour + "|    " + teacherFour  +"| ");
        System.out.println("| 5 |" + classFive + "       |" + teacherFive + "| ");
        System.out.println("| 6 |" + classSix + "    |     " + teacherSix + "| ");
        System.out.println("| 7 |" + classSeven + " | " + teacherSeven + "| ");
        System.out.println("+--------------------------------------------+");
    }
    
}
