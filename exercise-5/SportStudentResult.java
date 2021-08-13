/*3. Create interfaces Student and Sports. Create a class Result
implements Student and Sports. Display the academic and sports score
of a student.*/

interface Student {
	int score=10;
	void displayScore();
}
interface Sports {
	int score=20;
	void displaySportScore();
}
class Result implements Student,Sports{
	public void displayScore() {
		System.out.println("academic score = " + Student . score);
}
	public void displaySportScore() {
		System.out.println("sports score = " + Sports . score);

}
}

public class SportStudentResult{
	public static void main (String []  args){
		Result r = new Result();
		r.displayScore();
		r.displaySportScore();


}
}


/* output

academic score = 10
sports score = 20

*/
//Verified














                                                                     
