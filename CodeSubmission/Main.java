import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter User ID: ");
Integer id = sc.nextInt();   
sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();
NormalUser user = new NormalUser(id, name);
System.out.print("Enter Code: ");
String code = sc.nextLine();
Problem problem = new EasyProblem("Sum Problem");
Submission submission = new Submission(1, code);
submission.evaluate(problem);
submission.display();
    }
}