package backend;

import backend.entities.BattleData;
import backend.entities.Unit;

import java.util.ArrayList;

public class Calculator {
    public BattleData calculate(BattleData battleData){

        battleData.getUnitById(1).setCount(100);
        battleData.getUnitById(12).setCount(100);

        ArrayList<Unit> units = battleData.getUnits();

        System.out.println(battleData.getUnitById(1).getCount());
        System.out.println(battleData.generateTotalHpParagon());
        System.out.println(battleData.generateTotalHpOrc());

        return battleData;
    }
}
