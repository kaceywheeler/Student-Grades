//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grade
{
  private double value;

  //Grade constructor 
  public Grade( double v )
  {
  	 value = v;
  }
  
  //Method to return the numeric value of the grade
  public double getNumericGrade()
  {
  	return value;
  }
  
  //Method to return the corresponding letter associated with the numeric grade
  public String getLetterGrade()
  {
  	if( value > 89 )
  		return "A";
  	if( value > 79 )
  		return "B";
  	if ( value > 69 )
  		return "C";
  	if ( value > 59 )
  		return "D";  	
  	return "F";
  }

  //toString method
  public String toString()
  {
  	return value + " " + getLetterGrade();
  }
}
