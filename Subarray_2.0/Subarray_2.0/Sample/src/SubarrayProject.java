import CodeGenerator.code;
//import application.SpaceInvaders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class SubarrayProject extends Application {

    private TextArea arrayInput;
    private TextArea output;
    private TextArea codeOutput;
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        primaryStage.setTitle("Subarray");
        primaryStage.setMaxWidth(1500);
        primaryStage.setMaxHeight(1000);
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(1000);
        BorderPane root = new BorderPane();
        root.setPrefHeight(20);
        Image image = new Image("file:C:/Users/Admin/JavaFx/Subarray_2.0/Sample/src/back4.jpg");
         BackgroundImage background = new BackgroundImage(
        image,
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundPosition.CENTER,     // You can adjust this as needed
        new BackgroundSize(1.0, 1.0, true, true, false, true)
        );
        root.setBackground(new Background(background));
         // Scale the original image to a larger size
         Image largerIcon = new Image("file:C:/Users/Admin/JavaFx/Subarray_2.0/Sample/src/logo.png", 500, 200, true, true); // You can adjust the size as needed
         primaryStage.getIcons().add(largerIcon);

        // Create the array input text area
        arrayInput = new TextArea();
       BorderPane.setMargin(arrayInput, new Insets(10, 0, 0, 450));
       arrayInput.setOpacity(0.7);
        // Create a DropShadow effect
        DropShadow shadow = new DropShadow();
        Button button = new Button(" print all subarrays");
        button.setEffect(shadow);
        button.setCenterShape(true);
        button.setPrefWidth(200);
        button.setStyle(
            "-fx-background-color: #F9A602; " +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 30px; " +
            "-fx-background-radius: 30px;"
        );
        
        Button button2 = new Button("max sum subarray");
        button2.setPrefWidth(200);
                button2.setStyle(
            "-fx-background-color: #F9A602;" +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 30px; " +
            "-fx-background-radius: 30px;"
        );
        Button button3 = new Button("print maximum sum subarray");
        button3.setPrefWidth(200);
                button3.setStyle(
             "-fx-background-color: #F9A602;" +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 30px; " +
            "-fx-background-radius: 30px;"
        );
        Button button4 = new Button("print subarray");
        button4.setPrefWidth(200);
                button4.setStyle(
            "-fx-background-color:  #F9A602;" +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 30px; " +
            "-fx-background-radius: 30px;"
        );
         Button button5 = new Button("Sliding window");
        button5.setPrefWidth(200);
                button5.setStyle(
            "-fx-background-color:  #F9A602;" +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 30px; " +
            "-fx-background-radius: 30px;"
        );
        HBox TopBox = new HBox();
        TopBox.setSpacing(20);
        TopBox.getChildren().addAll(arrayInput);
        root.getChildren().add(TopBox);
        arrayInput.setStyle(
            "-fx-border-color: #F9A602;"
            
        );
        arrayInput.setPrefWidth(40);
        arrayInput.setPrefHeight(50);
        arrayInput.setStyle("-fx-control-inner-background: #ADD8E6;");
        arrayInput.setPromptText("Enter an array of integers, separated by spaces:");
        root.setTop(arrayInput);

        // Create the output text area
        output = new TextArea();
       // output.setStyle("-fx-background-radius: 10px;");
        output.setOpacity(0.4);
        output.setStyle( "-fx-background-color: #0f0");
        output.setStyle("-fx-control-inner-background: #FFFFE0;");
        output.setEditable(false);
        root.setCenter(output);

        // Create the code output text area
        codeOutput = new TextArea();
        codeOutput.setEditable(false);
        codeOutput.setPrefHeight(0);
        root.setBottom(codeOutput);

        // Create the print all subarrays button
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setStyle("-fx-background-color:  #0000;");
        vbox.setOpacity(0.9);
        root.setLeft(vbox);
        vbox.setSpacing(40);
        vbox.setPrefSize(450, 2500);
        // Set margin for Button 3 to move it to the right by 20 pixels
        Insets margin = new Insets(0, 200, 0, 0); // Adjust the right margin as needed
        Insets margin1 = new Insets(0, 140, 0, 0); // Adjust the right margin as needed
        Insets margin2 = new Insets(0, 70, 0, 0); // Adjust the right margin as needed
        Insets margin3 = new Insets(0, 0, 0, 50); // Adjust the right margin as needed
        //Insets margin = new Insets(0, 200, 0, 0); // Adjust the right margin as needed
        
        VBox.setMargin(button, margin);
        VBox.setMargin(button2, margin1);
        VBox.setMargin(button3, margin2);
        VBox.setMargin(button4, margin3);


        vbox.getChildren().addAll(button,button2,button3,button5,button4);

        Button takeABreak = new Button("Take a Break");

        HBox hbox = new HBox(10);
        // Set the HBox in the bottom region of the BorderPane
        root.setBottom(hbox);
        hbox.getChildren().addAll(takeABreak);

        takeABreak.setOnAction(e -> {
            // Create an instance of the OtherProject's Application class
            SpaceInvaders Project1 = new SpaceInvaders();
            
            // Call the start method to launch the other project
            Stage Stage = new Stage();
            try {
                Project1.start(Stage);
            } catch (Exception e1) {   
            }
        });
        // Set the HBox at the bottom left corner
        
        
             button.setOnAction(e -> {
            // Get the array from the user input
            String[] arrayStrings = arrayInput.getText().split(" ");
            
            int[] array = new int[arrayStrings.length];
            for (int i = 0; i < arrayStrings.length; i++) {
                array[i] = Integer.parseInt(arrayStrings[i]);
            }
            

            // Print all subarrays of the array
            StringBuilder outputStringBuilder = new StringBuilder();
            
            outputStringBuilder.append("All subarrays of the array:\n");
            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array.length; j++) {
                    outputStringBuilder.append("[");
                    for (int k = i; k <= j; k++) {
                        if(k<j)
                        outputStringBuilder.append(array[k] + ", ");
                        else
                            outputStringBuilder.append(array[k]);
                    
                    }
                    outputStringBuilder.append("]\n");
                }
            }

            // Set the output text area text
            output.setText(outputStringBuilder.toString());
        });
        button5.setOnAction(e -> {
         // sliding_Window.fun(arrayInput,output);
         TextInputDialog dialog = new TextInputDialog();
        // StringBuilder outputStringBuilder = new StringBuilder();
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
        output.setText("The Total count of subarrays of length k is : " +  (array.length-x+1));

         /*int start = 0;
         int end = x;

         while(start<array.length){
             for(int i=start;i<=end;i++){
                 if(i<end)
                 output.setText(array[i]+" ");
                 else
                 output.setText(array[i]);
             }
             output.setText("\n");
         }*/
         //output.setText(outputStringBuilder.toString());
        });

        button2.setOnAction(e -> {
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
            
        });
                button3.setOnAction(e -> {
            // Get the array from the user input
            String[] arrayStrings = arrayInput.getText().split(" ");
            int[] array = new int[arrayStrings.length];
            StringBuilder outputStringBuilder = new StringBuilder();
            for (int i = 0; i < arrayStrings.length; i++) {
                array[i] = Integer.parseInt(arrayStrings[i]);
            }

            // Find the maximum sum subarray
            int start = 0;
            int end = 0;
            int sum = 0;
            int max_Sum = Integer.MIN_VALUE;
            int x = 0;
            for(int i=0;i<array.length;i++){
                if(sum==0)
                    x = i;

                    sum = sum+array[i];
                    if(sum>max_Sum){
                        start = x;
                        end = i;
                        max_Sum = sum;
                    }
                    if(sum<0)
                        sum = 0;
            }
            for(int i=start;i<=end;i++){
                outputStringBuilder.append(array[i] + ", ");
            }
            output.setStyle("-fx-control-inner-background: #FFFFE0;");
            output.setText(outputStringBuilder.toString());
            
        });
        button4.setOnAction(e -> showComplexityDialog());

        primaryStage.setScene(new Scene(root,1000,500));
        root.setPadding(new Insets(10));
         primaryStage.show();
       
    }
    private void showError(String string) {
    }
    private void displayArrayAndK(String array, int k) {
    }
    private void showComplexityDialog() {
        List<String> choices = new ArrayList<>();
        choices.add("N^2");
        choices.add("N^3");
        choices.add("N");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("N", choices);
        DialogPane dialogPane = dialog.getDialogPane();
         dialogPane.setStyle("-fx-background-color: lightblue; -fx-padding: 10;");
        dialog.setTitle("Complexity Selection");

        dialog.setHeaderText("Select the complexity for printing subarrays:");
        dialog.setContentText("Complexity:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent(complexity -> {
            String subarrayCode = code.generateSubarrayCode(complexity);

            Stage subarrayStage = new Stage();

             Image largerIcon = new Image("file:C:/Users/Admin/JavaFx/Window/Sample/src/subarray.png", 200, 100, true, true); // You can adjust the size as needed
            subarrayStage.getIcons().add(largerIcon);
            subarrayStage.setTitle("Subarray Printing");
        

            TextArea subarrayTextArea = new TextArea(subarrayCode);
            subarrayTextArea.setStyle("-fx-control-inner-background: #ADD8E6;");
            subarrayTextArea.setEditable(false);
            subarrayTextArea.setPrefHeight(500);

            VBox subarrayLayout = new VBox(subarrayTextArea);
            Scene subarrayScene = new Scene(subarrayLayout, 700, 500);
            
           
            subarrayStage.setScene(subarrayScene);
            subarrayStage.show();
        });
        
    }


    public static void main(String[] args) throws Exception {
        
        launch(args);
    }
}
