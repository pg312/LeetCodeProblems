public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder finalString = new StringBuilder();
        String[][] finalStringMatrix = new String[numRows][s.length()];
        boolean strightInsert = true;
        for(int index = 0,rowIndex = 0, colIndex = 0; index < s.length();){

            if(strightInsert){
                for(; rowIndex <= numRows-1 && index < s.length(); rowIndex++,index++){
                    finalStringMatrix[rowIndex][colIndex] = String.valueOf(s.charAt(index));
                }
                rowIndex -= 2;
                colIndex++;
                strightInsert = false;
            }
            else{
                for(;rowIndex>0 && index < s.length();){
                    finalStringMatrix[rowIndex--][colIndex++] = String.valueOf(s.charAt(index++));
                }
                strightInsert = true;
            }
        }
        for(int rowIndex = 0; rowIndex < numRows; rowIndex++){
            for(int colIndex = 0; colIndex < s.length(); colIndex++){
                if(finalStringMatrix[rowIndex][colIndex] != null)
                 finalString.append(finalStringMatrix[rowIndex][colIndex]);
            }
        }
        return finalString.toString();
    }
}
