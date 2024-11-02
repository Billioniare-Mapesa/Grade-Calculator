import java.util.Scanner;

public class gradeCalculator {
	
	public static void main(String[] args) {
		
		// creating a Scanner object called scanner
		Scanner scanner = new Scanner( System.in);
		int marks;

		String[] subjects = {
			"Software Engineering",
			"Object-Oriented Programming",
			"Principle of Taxation",
			"Event-Driven Programming",
			"Network Management",
			"Business Statistics 1",
			"Principl of Management",
			"Web Design"
		};

		int numSubjects = subjects.length;
		int total = 0;

		for (int i = 0; i < numSubjects; i++){
			marks = -1;

			while (marks < 0 || marks > 100){
				System.out.print("Enter marks for " + subjects[i] + "; ");

				// reading Int input
				marks = scanner.nextInt();

				if (marks < 0 || marks > 100) {
					System.out.print("Invalid input! Please enter marks between 0-100: ");
				}
				else {
					total += marks;
				}
			}
		}

		double average = (double) total / numSubjects;

		String grade;
		if (average >= 70) {
			grade = ("A = EXCELLENT");
		}
		else if (average >= 60) {
			grade = ("B = VERY GOOD");
		}
		else if (average >= 50) {
			grade = ("C = GOOD");
		}
		else if (average >= 40) {
			grade = ("D = PASS");
		}
		else {
			grade = ("E = FAIL");
		}

		System.out.println("\nResults:");
		System.out.println("Total marks: ");
		System.out.println("Average marks: "+ String.format("%.2f", average));
		System.out.println("Grade: " + grade);

		scanner.close();
	}
}
