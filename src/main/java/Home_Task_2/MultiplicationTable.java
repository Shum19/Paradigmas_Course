package Home_Task_2;

public class MultiplicationTable {

    /**
     * Была Выбрана процедурная парадигма по причене того, что стандартная таблица умножения это не только применение
     * 1 умоноженное до заданного числа, но ии другие. Поэтому был создан статические класс MultiplicationTable -
     * что переводиться Таблица умножения. В этом классе создан пока один метод printMultiplyByOne -
     * вывод числа умноженного на один!
     * Таким образом я могу добовлять еще методы чтобы дополнить свой класс до стандартной Таблицы умножения.
     * И методы в классе будут называться printMultiplyByTwo/Three/Four и так далее.
     * Так же можно подругому назвать метод и добавить еще один аргумент и вместо Единицы как указано в задании и
     * и тогда можно использовать просто один метод. На всякий сллучай я добавлю метод printMultiplyTable
     */
    public static void printMultiplyByOne(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("1 * " + i + " = " + 1 * i);
        }
    }
    public static void printMultiplyTable(int noChangeNum, int changeableNum){
            for (int i = 1; i <= changeableNum; i++) {
                System.out.println(noChangeNum + " * " + i + " = " + noChangeNum * i);
            }
    }
}

