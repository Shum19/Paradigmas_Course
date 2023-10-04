package Home_Task_3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
public class Buttons {

    private Button [][] buttons = new Button[3][3];
    private int size = 3;
    String  curSym = "X";
    private String [][] gameLines = new String[3][3];
    private boolean isGame = true;
    public Buttons(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.buttons[i][j] = new Button("Push");
                this.buttons[i][j].setPrefSize(100, 100);
                this.buttons[i][j].setBackground(Background.fill(Color.WHITESMOKE));
                this.buttons[i][j].setBorder(Border.stroke(Color.BLACK));
                btnClick(this.buttons[i][j]);
            }
        }
    }
    public Button getButton(int col, int row){
        return this.buttons[col][row];
    }
    private void btnClick(Button btn){
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if( !isGame || btn.getText() != "Push") {
                    return;
                }
                btn.setText(curSym);
                int colIndex = GridPane.getColumnIndex(btn);
                int  rowIndex = GridPane.getRowIndex(btn);
                gameLines[colIndex][rowIndex] = btn.getText();
                isGame = CompareLogic.compareLogic(gameLines, isGame);
                curSym = curSym == "X"?"0":"X";
            }
        });
    }

}
