import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorCircle extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creates a circle
        Circle circle = new Circle(200, 200, 50);
        circle.setFill(Color.WHITE);

        // Creates a pane and adds the circle to it
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Handles the mouse pressed event
        pane.setOnMousePressed(event -> {
            circle.setFill(Color.BLACK);
        });

        // Handles the mouse released event
        pane.setOnMouseReleased(event -> {
            circle.setFill(Color.WHITE);
        });

        // Creates the scene
        Scene scene = new Scene(pane, 400, 400);

        // Sets the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Change Color Circle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}