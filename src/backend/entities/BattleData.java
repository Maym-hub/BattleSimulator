package backend.entities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BattleData {
    private static final String COMMA_DELIMITER = ",";
    private List<List<String>> data;
    public ArrayList<Unit> units;
    public float winPercentage;
    public boolean general;

    public BattleData() {
        this.units = new ArrayList<>();
        createUnits();
        System.out.print(data);
    }

    private void createUnits() {
        this.data = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/backend/data/units.csv"));) {
            while (scanner.hasNextLine()) {
                this.data.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Unitdata file not found");
        }

        for (List<String> unitData: this.data){
            Unit unit = new Unit();
            unit.setFaction(unitData.get(0));
            unit.setName(unitData.get(1));
            unit.setHealth(Integer.valueOf(unitData.get(2)));
            unit.setAttack(Integer.valueOf(unitData.get(3)));
            unit.setDoubleDamageChance(Float.parseFloat(unitData.get(4)));
            unit.setDamageOrder(Float.parseFloat(unitData.get(5)));
            if (unitData.size()>6){
                unit.setSpecial(unitData.get(6));
            }
        }
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
}
