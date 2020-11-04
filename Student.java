//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Student
{
	private String myName;
	private Grades myGrades;
	public enum Year {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
	private Year myYear;

	//Constructor for student assigning name, grades, and year
	public Student(String name, double[] gradeList, Year year)
	{
		myName=name;
		myGrades=new Grades(gradeList);		
		myYear = year;
	}
	
	//Method to assign a new grade in the list of grades
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot,grade);
	}

	//Method to return the name of the student
	public String getName()
	{
		return myName;
	}
	
	//Method to return the student's grades
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	//Method to return the sum of the student's grades
	public double getSum()
	{
		return myGrades.getSum();
	}
	
	//Method to return the average of all the student's grades
	public double getAverage()
	{
		return getSum()/getNumGrades();
	}

	//Method to return the average of the student's grades not including the lowest grade
	public double getAverageMinusLow()
	{
		return (myGrades.getSum()-getLowGrade())/(getNumGrades()-1);
	}
	
	//Method to return the student's highest grade
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	//Method to return student's lowest grade
	public double getLowGrade()
	{
		return myGrades.getLowGrade();		
	}

	//Method to change the myYear value of the student
	public void setYear(Year year) {
		myYear = year;
	}

	//Method to return the year of the student
	public Year getYear() {
		return myYear;
	}
	
	//toString method
	public String toString()
	{
		return myName + " (" + getYear() + ")" +  " = " + myGrades.toString();
	}	
}