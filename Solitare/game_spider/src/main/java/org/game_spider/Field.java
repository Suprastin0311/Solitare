package org.game_spider;

/**
 * Используется для реализации игрового поля, хранит информацию о том, сколько на поле колонок для карт, количество дополнительных раскладок и количество колод.
 *
 */
public class Field {
    private int columns = 10;
    private int addedPackCount = 5;
    private int decksCount = 2;

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getAddedPackCount() {
        return addedPackCount;
    }

    public void setAddedPackCount(int addedPackCount) {
        this.addedPackCount = addedPackCount;
    }

    public int getDecksCount() {
        return decksCount;
    }

    public void setDecksCount(int decksCount) {
        this.decksCount = decksCount;
    }
}
