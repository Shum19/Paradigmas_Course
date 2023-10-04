package Home_Task_3;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;


public class View {
    private Buttons buttons = new Buttons();
    private GridPane gridPane = new GridPane();
    private Scene scene;



    public Scene getScene(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.gridPane.add(buttons.getButton(i, j), i, j);
            }
        }
        return this.scene = new Scene(this.gridPane);
    }
}
