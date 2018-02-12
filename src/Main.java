
        import javafx.scene.text.*;
        import javafx.application.*;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Pos;
        import javafx.stage.*;
        import javafx.scene.*;
        import javafx.scene.layout.*;
        import javafx.scene.control.*; //all the packages needed to implement Java FX app

public class Main extends Application implements EventHandler<ActionEvent> {

    Stage window;
    Scene intro, tool, info, options;


    Button startButton;
    Button exitButton;
    Button infoButton;
    Button optionsButton;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        window.setOnCloseRequest(e -> {

            e.consume(); //handle events manually
            closeProgram();

               });


        Label titleLabel = new Label("Educational Tool for robotics");

        Text titleText = new Text(10, 50," Educational Tool");

        startButton = new Button("Start");
        startButton.setOnAction(this);

        exitButton = new Button("Exit");
        exitButton.setOnAction(this);

        infoButton = new Button("Info");
        infoButton.setOnAction(this);

        optionsButton = new Button("Options");
        optionsButton.setOnAction(this);

// Intro layout
        VBox introLayout = new VBox(20);
        introLayout.getChildren().addAll(titleText, startButton, exitButton, infoButton, optionsButton);
        introLayout.setAlignment(Pos.CENTER);
        intro = new Scene(introLayout, 200, 200);


        window.setScene(intro);
        window.setTitle("Tool for robotics");
        window.show();


    }

    @Override
    //event handler to handle button clicks
    public void handle(ActionEvent event) {
        if (event.getSource() == startButton) {
            window.close();

        }
        if (event.getSource() == infoButton) {
            AlertBox.infoDisplay("Information", "Text and Info will go in here"); //open alert box

        }
        if (event.getSource() == exitButton) {
           closeProgram();

                 //closes window on exit button
            }

        if (event.getSource() == optionsButton) {

            window.close();
            window.setScene(options);
            window.setTitle("Options");
            window.show();


        }

    }
    public void closeProgram(){
    Boolean answer = ConfirmBox.infoDisplay("Exit", "Are you sure you want to exit?");
    window.close(); //close the program safely
    }
}
