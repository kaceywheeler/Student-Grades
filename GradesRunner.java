//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//Runner for Grades
public class GradesRunner
{
   public static void main( String args[] )
   {
	//Create a new array of grade values
   	double[] vals = {90, 85, 95.5, 77.5, 88};
		Grades test = new Grades( vals );
		System.out.println(test);
		System.out.println("sum = " + test.getSum());	
		System.out.println("num grades = "+test.getNumGrades());											
		System.out.println("low grade = "+test.getLowGrade());		
		System.out.println("high grade = "+test.getHighGrade());
	}		
}