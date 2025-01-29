package CodeGenerator;

public class code {

    public  static String generateSubarrayCode(String complexity) {
        // Implement code generation logic based on the selected complexity
        // Replace this with your actual code generation logic
        String code = "";
    
        switch (complexity) {
            case "N^2":
                code = "static int prefixSum(int arr[]){ \n\n"+
                       "int prefixSumArr[] = new int[]{} \n\n"+
                       "int N= Arr.length() \n\n"+
                       "prefixSumArr[0]=Arr[0] \n\n"+
                       "for (int i = 0; i < N; i++) {\n\n" +
                       "        prefixSumArr[i]=prefixSumArr[i-1] + Arr[i] \n\n"+
                       " } \n\n" +
                       "for (int i = 1; i < N; i++) {\n\n" +
                       "     int sum=0; \n\n"+
                       "     for (int j=i;j<N;j++){ \n\n"+
                       "        if(j==0) \n\n"+
                       "             sum = prefixSumArr[j]; \n\n"+
                       "        else \n\n"+
                       "             sum = prefixSumArr[j]=prefixSumArr[i-1] \n\n"+  
                       "        // Your N^2 code here\n\n" +
                       "    }\n\n" +
                       "}";
                break;
            case "N^3":
                code = "int arr[] =new int[]{} \n\n"+
                       "for (int i = 0; i < N; i++) {\n\n" +
                       "    for (int j = i; j < N; j++) {\n\n" +
                       "        for (int k = j; k < j; k++) {\n\n" +
                       "                 System.out.println(arr[k]);"+
                       "        }\n\n"+
                       "        System.out.println() \n\n" +
                       "    }\n\n" +
                       "}";
                break;
            case "N":
                code = " int arr[] = new int[]{};"+
                        "int sum=0; \n\n"+
                        "int maxSum =Integer.MIN_VALUE; \n\n"+
                        "for (int i = 0; i < N; i++){\n\n "+
                        "   sum = sum + arr[i]; \n\n"+
                        "    if(maxSum<sum) \n\n "+
                        "        maxSum=sum; \n\n"+
                        "    if(sum<0) \n\n"+
                        "        sum=0; \n\n"+
                            // Your N code here\n" +
                       "} \n\n"+
                       "System.out.println(maxSum); \n\n";
                break;
            // Add more cases for other complexities if needed
        }
    
        return code;
    }
    
    
    
}
