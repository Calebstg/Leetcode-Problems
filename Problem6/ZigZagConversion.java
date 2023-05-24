/*
 * Author: Caleb St.Germain
 * Date: 5/23/2023
 */
public class ZigZagConversion{
    public static String convert(String input, int numRows){
        if(numRows == 1 || numRows >= input.length()){
            return input;
        }

        StringBuilder[] zigzagRows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            zigzagRows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for(char c : input.toCharArray()){
            zigzagRows[currentRow].append(c);

            if(currentRow == 0 || currentRow == numRows - 1){
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder row : zigzagRows){
            result.append(row);
        }
        return result.toString();
    }
}