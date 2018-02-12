import javafx.scene.shape.*;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
public class Tool {

    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLACK);

        Rectangle r = new Rectangle(25, 25, 250, 250);
        r.setFill(Color.BLUE);
        root.getChildren().add(r);

        stage.setTitle("JavaFX Scene Graph Demo");
        stage.setScene(scene);
        stage.show();

     ;
    }
}