public class LongestSubArrayWithGivenSum {

    public int longestSubArray(int [] arr,int sum){
        int maxLength = 0, totalSum =0;
        for(int leftIndex = 0, rightIndex = 0; rightIndex < arr.length; rightIndex++){
            totalSum += arr[rightIndex];
            if(totalSum == sum && maxLength <= rightIndex - leftIndex){
                maxLength = rightIndex - leftIndex+1;
                totalSum -= arr[leftIndex++];
            }
            else if(totalSum > sum){
                totalSum -= arr[leftIndex++];
            }
        }
        return maxLength;
    }

    public int anotherApproach(int [] arr,int sum){
       int [] temporaryArray = new int[arr.length];
       temporaryArray[0] = arr[0];
       for(int index =1;index < arr.length; index++){
           temporaryArray[index] = temporaryArray[index-1]+arr[index];
           if( temporaryArray[index] == sum)
               return index+1;
       }
       return 0;
    }

    public int bruteForce(int[] arr, int sum){
        int maxLength = 0;
        for(int index = 0; index < arr.length; index++){
            int temp = arr[index];
            for(int index2 = index+1; index2 < arr.length; index2++){
                temp += arr[index2];
                if(temp == sum && maxLength <= index2 - index)
                    maxLength = index2-index;
            }
        }
        return maxLength+1;
    }
}
