package Home_Task_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class NoughtsAndCrosses extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        View view = new View();
        stage.setScene(view.getScene());
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
