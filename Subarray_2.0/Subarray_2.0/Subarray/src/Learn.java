import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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

public class Learn extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

          primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(1000);

        BorderPane root2 = new BorderPane();
        
        Image image = new Image("file:C:/Users/Admin/JavaFx/Subarray_2.0/Subarray/src/abstract-template-design-blue-curved-paper-cut-background-vector.jpg");
        BackgroundImage background = new BackgroundImage(
        image,
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundRepeat.NO_REPEAT,    // or BackgroundRepeat.REPEAT
        BackgroundPosition.CENTER,     // You can adjust this as needed
        new BackgroundSize(1.0, 1.0, true, true, false, true)
        );

        VBox rightSection = new VBox();
         // Set padding for the VBox (top, right, bottom, left)
         Insets padding = new Insets(50, 20, 30, 50); // Adjust the values as needed
        rightSection.setPadding(padding);
        rightSection.setAlignment(Pos.TOP_CENTER);
        root2.setLeft(rightSection);
        rightSection.setSpacing(0);
        rightSection.setPrefHeight(2500);
        rightSection.setPrefWidth(500);

        Label explanationLabel = new Label("\n"+
        "A subarray is a contiguous or non-empty portion of an array," +
        "which means it consists of \n"+
        "elements from the original array"+
        " arranged in sequential order. It is typically defined by specifying"+
         "a starting and ending index within the array. Subarrays are used in various algorithms and data analysis tasks to analyze or perform operations on specific"
         + "segments of an array rather than the entire array.\r\n");
         explanationLabel.setStyle("-fx-text-fill: blue;");
        explanationLabel.setId("projectDescriptionLabel");
        explanationLabel.setWrapText(true); // Enable word wrapping if needed
        explanationLabel.setPrefWidth(400); // Adjust the width as needed
        explanationLabel.setPrefHeight(200); // Adjust the height as needed

 
        rightSection.getChildren().addAll(explanationLabel);


         Scene scene = new Scene(root2, 300, 600);
        root2.setBackground(new Background(background));
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
    
}