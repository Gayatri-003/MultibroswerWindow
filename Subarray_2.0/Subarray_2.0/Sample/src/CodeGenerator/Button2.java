package CodeGenerator;

import javafx.scene.control.TextArea;

public class Button2 {
    public static void btn2(TextArea arrayInput,TextArea output) {
                    // Get the array from the user input
                    String[] arrayStrings = arrayInput.getText().split(" ");
                    int[] array = new int[arrayStrings.length];
                    for (int i = 0; i < arrayStrings.length; i++) {
                        array[i] = Integer.parseInt(arrayStrings[i]);
                    }
        
                    // Find the maximum subarray sum
                    int maximumSubarraySum = 0;
                    int currentSubarraySum = 0;
                    for (int i = 0; i < array.length; i++) {
                        currentSubarraySum += array[i];
                        if (currentSubarraySum < 0) {
                            currentSubarraySum = 0;
                        }
                        if (maximumSubarraySum < currentSubarraySum) {
                            maximumSubarraySum = currentSubarraySum;
                        }
                    }
        
                    // Set the output text area text
                    output.setText("The maximum subarray sum is: " + maximumSubarraySum);
                    
    }
}
