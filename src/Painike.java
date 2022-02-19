import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Painike extends Application {
    public void start(Stage ikkuna){
        StackPane paneeli = new StackPane();
        paneeli.getChildren().add(new Button("Paina tästä"));
        Scene kehys = new Scene(paneeli, 500, 500);
        ikkuna.setTitle("Olio-ohjelmointi on kivaa");
        ikkuna.setScene(kehys);
        ikkuna.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
