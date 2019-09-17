import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
	String input1, input2, input3;
	double score1, score2, score3, average;
              
	input1 = JOptionPane.showInputDialog(null, "Enter score 1:");
	input2 = JOptionPane.showInputDialog(null, "Enter score 2:");
	input3 =JOptionPane.showInputDialog(null, "Enter score 3:");
		
	score1 = Double.parseDouble(input1);
	score2 = Double.parseDouble(input2);
	score3 = Double.parseDouble(input3);
		
	average = (score1 + score2 + score3) / 3;
	
	if (average <= 100){
            if(average >= 90){
                System.out.println("Your average score is " + average + " or A");
            }
            else if(average >= 80){
		System.out.println("Your average score is " + average + " or B");
            }
            else if(average >= 70){
		System.out.println("Your average score is " + average + " or C");
            }
            else if(average >= 60){
		System.out.println("Your average score is " + average + " or D");
            }
            else if(average < 60) {
		System.out.println("Your average score is " + average + " or F");
            }
            else
            {
		System.out.println("Your average is out of bounds, check test scores.");
            }
	}
}
}
