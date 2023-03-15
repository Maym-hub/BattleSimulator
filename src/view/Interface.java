package view;

import backend.Calculator;
import backend.entities.BattleData;

import javax.swing.*;

public class Interface {
    public static BattleData battleData;

    public static void main(String[] args) {
        battleData = new BattleData();
        Calculator calculator = new Calculator();

        JFrame frame = new Base("Battle Simulator", battleData);

        battleData = calculator.calculate(battleData);
    }
}
