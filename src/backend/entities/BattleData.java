package backend.entities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BattleData {
    private static final String COMMA_DELIMITER = ",";
    private List<List<String>> rawData;
    public ArrayList<Unit> units;
    public float winPercentage = 0;
    public boolean general = false;
    public Integer roundCount = 0;
    public Integer paragonLosses = 0;
    public Integer orcLosses = 0;
    public Integer totalHpParagon = 0;
    public Integer totalHpOrc = 0;

    public BattleData() {
        this.units = new ArrayList<>();
        importUnits();
        for (Unit unit: getUnits()){
            unit.setExpectedAttack((int) ((1+unit.doubleDamageChance) * unit.attack));

        }
    }

    private void importUnits() {
        this.rawData = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("src/backend/data/units.csv"));) {
            while (scanner.hasNextLine()) {
                this.rawData.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for (List<String> unitData: this.rawData){
            Unit unit = new Unit();
            int i = 0;
            unit.setId(Integer.valueOf(unitData.get(i)));
            i++;
            unit.setFaction(unitData.get(i));
            i++;
            unit.setName(unitData.get(i));
            i++;
            unit.setHealth(Integer.valueOf(unitData.get(i)));
            i++;
            unit.setAttack(Integer.valueOf(unitData.get(i)));
            i++;
            unit.setDoubleDamageChance(Float.parseFloat(unitData.get(i)));
            i++;
            unit.setDamageOrder(Float.parseFloat(unitData.get(i)));
            if (unitData.size()>i){
                unit.setSpecial(unitData.get(i));
            }
            units.add(unit);
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

    public List<List<String>> getRawData() {
        return rawData;
    }

    public void setRawData(List<List<String>> rawData) {
        this.rawData = rawData;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    public float getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(float winPercentage) {
        this.winPercentage = winPercentage;
    }

    public boolean isGeneral() {
        return general;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

    public Integer getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(Integer roundCount) {
        this.roundCount = roundCount;
    }

    public Integer getParagonLosses() {
        return paragonLosses;
    }

    public void setParagonLosses(Integer paragonLosses) {
        this.paragonLosses = paragonLosses;
    }

    public Integer getOrcLosses() {
        return orcLosses;
    }

    public void setOrcLosses(Integer orcLosses) {
        this.orcLosses = orcLosses;
    }

    public Unit getUnitById(Integer id){
        for (Unit unit: units){
            if (Objects.equals(id, unit.getId())){
                return unit;
            }
        }
        return null;
    }

    public Integer getTotalHpParagon() {
        return totalHpParagon;
    }

    public Integer generateTotalHpParagon() {
        for (Unit unit: units) {
            if (Objects.equals(unit.getFaction(), "Paragons")){
                totalHpParagon = totalHpParagon + unit.getHealth() * unit.getCount();
            }
        }
        return totalHpParagon;
    }

    public Integer getTotalHpOrc() {
        return totalHpOrc;
    }

    public Integer generateTotalHpOrc() {
        for (Unit unit: units) {
            if (Objects.equals(unit.getFaction(), "Orcs")){
                totalHpOrc = totalHpOrc + unit.getHealth() * unit.getCount();
            }
        }
        return totalHpOrc;
    }
}
