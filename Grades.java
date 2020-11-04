//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grades
{
	private Grade[] grades;
	
	//Method to populate grades list with Grade objects for each grade
	public Grades( double[] list )
	{
		grades = new Grade[ list.length ];
		for(int i=0; i<grades.length; i++)
		{
			grades[i] = new Grade( list[i] );
		}		
	}
	
	//Method to add a Grade to the list of grades
	public void setGrade(int pos, double grade)
	{
		grades[pos]= new Grade( grade );
	}
	
	//Method to take the sum of all the grades
	public double getSum()
	{
		double sum=0.0;
		for(Grade grade : grades)
		{
			sum=sum+grade.getNumericGrade();
		}
		return sum;
	}
	
	//Method to find the lowest grade
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(Grade grade : grades)
		{
			if(low>grade.getNumericGrade())
			  low=grade.getNumericGrade();			   
		}
		return low;
	}
	
	//Method to find the highest grade
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(Grade grade : grades)
		{
			if(high<grade.getNumericGrade())
			  high=grade.getNumericGrade();			   
		}
		return high;
	}
	
	//Method to find the number of grades 
	public int getNumGrades()
	{
		return grades.length;
	}
	
	//toString method 
	public String toString()
	{
		String output="";
		for(Grade grade : grades)
		{
			output+=grade + " ";
		}
		return output;
	}	
}