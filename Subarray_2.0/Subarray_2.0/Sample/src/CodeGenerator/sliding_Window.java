package CodeGenerator;

import java.util.Optional;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;

public class sliding_Window {
    public static void fun( TextArea arrayInput, TextArea output){
      // Create a dialog to get user input for k
            TextInputDialog dialog = new TextInputDialog();
            StringBuilder outputStringBuilder = new StringBuilder();
            dialog.setTitle("Enter K Length");
            dialog.setHeaderText(null);
            dialog.setContentText("Enter a value for K:");
            int x = 1;
            Optional<String> result = dialog.showAndWait();
            if (result.isPresent()) {
                // Parse the user input for k
                try {
                    int k = Integer.parseInt(result.get());
                    x = k;

                    // Perform operations on the array and k (for example, display them)
                    String array = arrayInput.getText();
                    displayArrayAndK(array, k);
                } catch (NumberFormatException ex) {
                    showError("Invalid input for K. Please enter a valid integer.");
                }
            }
              // Get the array from the user input
            String[] arrayStrings = arrayInput.getText().split(" ");
            int[] array = new int[arrayStrings.length];
            for (int i = 0; i < arrayStrings.length; i++) {
                array[i] = Integer.parseInt(arrayStrings[i]);
            }

            // Set the output text area text
           // output.setText("The Total count of subarrays of length k is : " +  (array.length-x+1));

            int start = 0;
            int end = x;

            while(start<array.length){
                for(int i=start;i<=end;i++){
                    if(i<end)
                    outputStringBuilder.append(array[i] + ", ");
                    else
                    outputStringBuilder.append(array[i]);
                }
                outputStringBuilder.append("\n");
            }
            output.setText(outputStringBuilder.toString());
        }

    private static void showError(String string) {
    }

    private static void displayArrayAndK(String array, int k) {
    }
    
}
