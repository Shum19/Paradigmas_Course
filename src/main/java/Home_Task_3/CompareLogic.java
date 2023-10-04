package Home_Task_3;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

public class CompareLogic {
    private String [][] gameLines = new String[3][3];
    public static boolean compareLogic(String[][] gameLines, boolean isGame){
// Сравннениие по столбцам
        if (gameLines[0][0] == gameLines[0][1] && gameLines[0][0] == gameLines[0][2] &&
                (gameLines[0][0] == "X" || gameLines[0][0]== "0")){
            isGame = false;
            String str = gameLines[0][0] == "X" ? "Крестиков" : "Ноликов";
            String text ="Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;
        } else if (gameLines[1][0] == gameLines[1][1] && gameLines[1][0] == gameLines[1][2] &&
                (gameLines[1][0] == "X" ||gameLines[1][0] == "0")) {
            isGame = false;
            String str = gameLines[1][0] == "X" ? "Крестиков" : "Ноликов";
            String text ="Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

        } else if (gameLines[2][0] == gameLines[2][1] && gameLines[2][0] == gameLines[2][2] &&
                (gameLines[2][0] == "X" || gameLines[2][0] == "0")) {
            isGame = false;
            String str = gameLines[2][0] == "X" ? "Крестиков" : "Ноликов";
            String text = "Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

// Сравнение по строкам
        }else if (gameLines[0][0] == gameLines[1][0] && gameLines[0][0] == gameLines[2][0] &&
                (gameLines[0][0] == "X" || gameLines[0][0] == "0")) {
            isGame = false;
            String str = gameLines[0][0] == "X" ? "Крестиков" : "Ноликов";
            String text = "Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

        }else if (gameLines[0][1] == gameLines[1][1] && gameLines[0][1] == gameLines[2][1] &&
                (gameLines[0][1] == "X" || gameLines[0][1] == "0")) {
            isGame = false;
            String str = gameLines[0][1] == "X" ? "Крестиков" : "Ноликов";
            String text = "Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

        }else if (gameLines[0][2] == gameLines[1][2] && gameLines[0][2] == gameLines[2][2] &&
                (gameLines[0][2] == "X" || gameLines[0][2] == "0")) {
            isGame = false;
            String str = gameLines[0][2] == "X" ? "Крестиков" : "Ноликов";
            String text = "Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

// Сравнеие по диагонали
        }else if (gameLines[0][0] == gameLines[1][1] && gameLines[0][0] == gameLines[2][2] &&
                (gameLines[0][0] == "X" ||gameLines[0][0] == "0")) {
            isGame = false;
            String str = gameLines[0][0] == "X" ? "Крестиков" : "Ноликов";
            String text ="Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

        }else if (gameLines[2][0] == gameLines[1][1] && gameLines[2][0] == gameLines[0][2] &&
                (gameLines[2][0] == "X" ||gameLines[2][0] == "0")) {
            isGame = false;
            String str = gameLines[2][0] == "X" ? "Крестиков" : "Ноликов";
            String text ="Поздравляем с победой игрока " + str;
            Alert alert = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
            alert.showAndWait();
            return isGame;

        }else return isGame;

    }

}
