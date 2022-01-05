import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterGradeTest {
    // 5(a) Equivalence partitioning
    // 90 <= score <= 100
    @Test
    public void betweenNinetyAndAHundredTest() {
        assertEquals('A', LetterGrade.convertToGrade(95));
    }
    // 80 <= score < 90
    @Test
    public void betweenEightyAndNinetyTest() {
        assertEquals('B', LetterGrade.convertToGrade(85));
    }
    // 70 <= score < 80
    @Test
    public void betweenSeventyAndEightyTest() {
        assertEquals('C', LetterGrade.convertToGrade(75));
    }
    // 60 <= score < 70
    @Test
    public void betweenSixtyAndSeventyTest() {
        assertEquals('D', LetterGrade.convertToGrade(65));
    }
    // 0 <= score < 60
    @Test
    public void betweenZeroAndSixtyTest() {
        assertEquals('F', LetterGrade.convertToGrade(30));
    }
    // score > 100
    @Test
    public void greaterThanAHundredTest() {
        assertEquals('X', LetterGrade.convertToGrade(110));
    }
    // score < 0
    @Test
    public void lowerThanZeroTest() {
        assertEquals('X', LetterGrade.convertToGrade(-10));
    }

    // 5(b) boundary value analysis
    // score = 101
    @Test
    public void lowerBoundOfGreaterThanAHundred() {
        assertEquals('X', LetterGrade.convertToGrade(101));
    }
    // score = 100
    @Test
    public void upperBoundOfGradeA() {
        assertEquals('A', LetterGrade.convertToGrade(100));
    }
    // score = 90
    @Test
    public void lowerBoundOfGradeA() {
        assertEquals('A', LetterGrade.convertToGrade(90));
    }
    // score = 89
    @Test
    public void upperBoundOfGradeB() {
        assertEquals('B', LetterGrade.convertToGrade(89));
    }
    // score = 80
    @Test
    public void lowerBoundOfGradeB() {
        assertEquals('B', LetterGrade.convertToGrade(80));
    }
    // score = 79
    @Test
    public void upperBoundOfGradeC() {
        assertEquals('C', LetterGrade.convertToGrade(79));
    }
    // score = 70
    @Test
    public void lowerBoundOfGradeC() {
        assertEquals('C', LetterGrade.convertToGrade(70));
    }
    // score = 69
    @Test
    public void upperBoundOfGradeD() {
        assertEquals('D', LetterGrade.convertToGrade(69));
    }
    // score = 60
    @Test
    public void lowerBoundOfGradeD() {
        assertEquals('D', LetterGrade.convertToGrade(60));
    }
    // score = 59
    @Test
    public void upperBoundOfGradeF() {
        assertEquals('F', LetterGrade.convertToGrade(59));
    }
    // score = 0
    @Test
    public void lowerBoundOfGradeF() {
        assertEquals('F', LetterGrade.convertToGrade(0));
    }
    // score = -1
    @Test
    public void upperBoundOfLowerThanZero() {
        assertEquals('X', LetterGrade.convertToGrade(-1));
    }

    // test manually
    public static void main(String[] args) {
        System.out.print("Enter the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = LetterGrade.convertToGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
