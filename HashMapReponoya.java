package hashmapreponoya;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapReponoya {
    
    public static HashMap<String, Integer> students = new HashMap<>();
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        students.put("mewtwo", 15);
        students.put("kakashi", 66);
        students.put("itachi", 78);
        
        try {
            action();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public static void action() throws Exception {
        
        while(true) {
            
            System.out.println("""
                           1. Find Points
                           2. Update Student Points
                           3. Print Studnet Points
                           4. Exit
                           """);
            
            System.out.print("Enter Number : ");
            
            byte input = s.nextByte(); s.nextLine();
            
            if(input == 4) break;
            
            switch(input) {
                case 1 -> findPoints();
                case 2 -> updateStudentPoints();
                case 3 -> printStudentPoints();
            }
        }
    }
    
    public static void findPoints () {
        
        System.out.print("Enter Student's Name to Find their Score : ");
        String name = s.nextLine();
        
        if(!students.containsKey(name)) {
            System.out.print("Student Does Not Exist"); return;
        }
        
        System.out.printf("%n%s's score is %d%n%n",name,students.get(name));
    }
    
    public static void updateStudentPoints () throws Exception {
        
        System.out.print("Enter Student's Name to Update their Score : ");
        String name = s.nextLine();
        
        if(!students.containsKey(name)) {
            System.out.println("Student Does Not Exist"); return;
        }
        
        System.out.print("Enter New Score : ");
        Integer newPoint = s.nextInt(); s.nextLine();
        
        students.put(name, newPoint);
        System.out.printf("%n%s's score was updated successfully!%n%n",name);
    }
    
    public static void printStudentPoints () {
        
        System.out.println("List of students and scores: ");
        for(var student : students.keySet()) {
            System.out.printf("%s - %d%n", student, students.get(student));
        }
        
    }
}
