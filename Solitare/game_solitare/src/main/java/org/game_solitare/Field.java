package org.game_solitare;
/**
 * Используется для реализации игрового поля, хранит информацию о том, сколько на поле колонок для карт, количество дополнительных раскладок и количество колод.
 *
 */
public class Field {
    private int columns = 10;
    private int addedCardsCount = 36;
    private int decksCount = 1;
    private int cardsResetFieldsCount = 4;

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getAddedCardsCount() {
        return addedCardsCount;
    }

    public void setAddedCardsCount(int addedCardsCount) {
        this.addedCardsCount = addedCardsCount;
    }

    public int getDecksCount() {
        return decksCount;
    }

    public void setDecksCount(int decksCount) {
        this.decksCount = decksCount;
    }
}