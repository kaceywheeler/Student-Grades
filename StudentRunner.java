//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//Runner for Student
public class StudentRunner
{
   public static void main( String args[] )
   {
	//Create an array of numerical grade values 
	   double[] vals1 = {90,85,95.5,77.5,88};
	   
	   //Create a new Student object with the array above as the student's grades
		Student stu = new Student("Billy Bob",vals1, Student.Year.SOPHOMORE);
		System.out.println(stu);
		System.out.println("sum = " + stu.getSum());		
		System.out.println("average = " + stu.getAverage());	
		System.out.println("average - low = " + stu.getAverageMinusLow());			
		System.out.println("low grade = "+stu.getLowGrade());		
		System.out.println("high grade = " + stu.getHighGrade()+"\n\n");			
		
		double[] vals2 = {100,100,99};
		Student other = new Student("Sally Sue",vals2,Student.Year.JUNIOR);
		System.out.println(other);
		System.out.println("sum = " + other.getSum());		
		System.out.println("average = " + other.getAverage());	
		System.out.println("average - low = " + other.getAverageMinusLow());			
		System.out.println("low grade = "+other.getLowGrade());		
		System.out.println("high grade = " + other.getHighGrade()+"\n\n");									
	}		
}