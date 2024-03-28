import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int user_input = input.nextInt();

        String output = towerOfHanoi(user_input, 'A', 'B', 'C');
        System.out.println(output);

    }
    
    public static String towerOfHanoi(int numOfDisks, char startPeg, char midPeg, char lastPeg) {
        if (numOfDisks == 1) {
            return "Move disk 1 from peg " + startPeg + " to peg " + lastPeg;
        } else {
            String firstMove = towerOfHanoi(numOfDisks - 1, startPeg, midPeg, lastPeg);
            String secondMove = "Move disk " + numOfDisks + " from peg " + startPeg + " to peg " + lastPeg;
            String thirdMove = towerOfHanoi(numOfDisks - 1,  midPeg, lastPeg,startPeg);
            return firstMove + "\n" + secondMove + "\n" + thirdMove; 
        }
    }
}