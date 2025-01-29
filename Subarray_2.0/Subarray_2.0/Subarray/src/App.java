import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(1000);

        BorderPane root1 = new BorderPane();
        
        Image image = new Image("file:C:/Users/Admin/JavaFx/Subarray_2.0/Subarray/src/abstract-template-design-blue-curved-paper-cut-background-vector.jpg");
        BackgroundImage background = new BackgroundImage(
        image,
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundPosition.CENTER,     // You can adjust this as needed
        new BackgroundSize(1.0, 1.0, true, true, false, true)
        );

        // Create the right section
        VBox rightSection = new VBox();
         // Set padding for the VBox (top, right, bottom, left)
         Insets padding = new Insets(45, 20, 30, 50); // Adjust the values as needed
        rightSection.setPadding(padding);
        rightSection.setAlignment(Pos.TOP_CENTER);
        root1.setLeft(rightSection);
        rightSection.setSpacing(3);
        rightSection.setPrefHeight(2000);

        // About Us section
        Label aboutUsLabel = new Label("About Us");

        // Add the name of the project
        Label projectInfoLabel = new Label("Project Name: Subarray Application");
        Label projectDescriptionLabel = new Label("         This project explores the applications of subarrays,"+
        "   \ta fundamental data structure in computer science"+
        "It empowers users to efficiently analyze contiguous subsets within arrays, enabling crucial operations"+
        "like finding maximum sums, distinct elements, and more. Through intuitive algorithms, our project provides"+
        "a seamless interface, enhancing understanding and problem-solving skills"
        );
        projectDescriptionLabel.setId("projectDescriptionLabel");
        projectDescriptionLabel.setWrapText(true); // Enable word wrapping if needed
        projectDescriptionLabel.setPrefWidth(400); // Adjust the width as needed
        projectDescriptionLabel.setPrefHeight(200); // Adjust the height as needed

        Label aboutUsLabel1 = new Label("Team Members : ");

        Label teamMemberNames = new Label("\t\t\t\t\tAditya\n\n\t\t\t\t\tGaytri\n\n\t\t\t\t\tMrudula");
         // Customize label text size and color
         aboutUsLabel.setStyle("-fx-font-size: 30px; -fx-text-fill: blue;"); // Increase text size and set the text color
         aboutUsLabel1.setStyle("-fx-font-size: 25px; -fx-text-fill: black;"); // Increase text size and set the text color
         projectInfoLabel.setStyle("-fx-font-size: 25px; -fx-text-fill: black;"); // Increase text size and set the text color
 
        rightSection.getChildren().addAll(aboutUsLabel,projectInfoLabel,projectDescriptionLabel,aboutUsLabel1,teamMemberNames);


        Button btn = new Button();
        btn.setText("Start");
       // root1.setCenter(btn);
        btn.setCenterShape(true);
        btn.setPrefWidth(200);
        btn.setPrefHeight(50);
        btn.setOpacity(0.8);
        btn.setStyle(
            "-fx-background-color: #D3D3D3; " +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 10px; " +
            "-fx-background-radius: 10px;"
        );
        
        btn.setOnAction(e -> {
            // Create an instance of the OtherProject's Application class
            SubarrayProject Project = new SubarrayProject();
            
            // Call the start method to launch the other project
            Stage Stage = new Stage();
            try {
                Project.start(Stage);
            } catch (Exception e1) {   
            }
        });
        Button btn2 = new Button();
        // Set the alignment of the button to center it on the left side of the BorderPane.
        btn2.setText("Lets Learn");
        root1.setRight(btn2);
        btn2.setCenterShape(true);
        btn2.setPrefWidth(200);
        btn2.setPrefHeight(50);
        btn2.setOpacity(0.8);
        btn2.setStyle(
            "-fx-background-color: #D3D3D3; " +
            "-fx-border-color: #0f0; " +
            "-fx-border-radius: 10px; " +
            "-fx-background-radius: 10px;"
        );
        btn2.setOnAction(e -> {
            // Create an instance of the OtherProject's Application class
            Learn Project = new Learn();
            
            // Call the start method to launch the other project
            Stage Stage = new Stage();
            try {
                Project.start(Stage);
            } catch (Exception e1) {   
            }
        });
         // Create an HBox to hold the buttons with spacing
        VBox buttonBox = new VBox(20); // 20px spacing between buttons
        buttonBox.getChildren().addAll(btn, btn2);
        buttonBox.setAlignment(Pos.CENTER);
        // Set the HBox in the center of the BorderPane
        root1.setCenter(buttonBox);

        Scene scene = new Scene(root1, 300, 600);
        root1.setBackground(new Background(background));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        public static void main(String[] args) throws Exception {
        launch(args);
    }
}
