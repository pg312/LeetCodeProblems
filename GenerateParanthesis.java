import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        generateRecursively("",n,0,0,results);
        return results;
    }

    private void generateRecursively(String s, int n, int leftCount, int rightCount,List<String> results) {
        if(leftCount == n && rightCount == leftCount){
            results.add(s);
            return;
        }
        if(leftCount < n){
            generateRecursively(s+"(",n, leftCount+1, rightCount,results);
        }
        if(rightCount < leftCount){
            generateRecursively(s+")",n, leftCount,rightCount+1,results);
        }

    }
}
