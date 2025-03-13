package org.game_accordion;

/**
 * Используется для конфигурации игрового поля, 
 * хранит информацию о том, сколько на поле колонок для карт, 
 * количество дополнительных раскладок и количество колод.
 * @author ddnik
 * @version 2.0
 * @since 13.03.2025
 */
public class Field {

    /**
     * Количество колонок на игровом поле.
     * Значение по умолчанию: 52.
     */
    private int columns = 52;

    /**
     * Количество дополнительных паков карт, добавленных в игру.
     * Значение по умолчанию: 0.
     */
    private int addedPackCount = 0;

    /**
     * Количество колод, используемых в игре.
     * Значение по умолчанию: 1.
     */
    private int decksCount = 1;

    /**
     * Количество карт в одной колоде.
     * Значение по умолчанию: 52.
     */
    private int cardsInDeck = 52;

    /**
     * Возвращает количество колонок на игровом поле.
     * 
     * @return количество колонок
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Устанавливает количество колонок на игровом поле.
     * 
     * @param columns новое количество колонок
     */
    public void setColumns(int columns) {
        this.columns = columns;
    }

    /**
     * Возвращает количество дополнительных паков карт, добавленных в игру.
     * 
     * @return количество дополнительных паков
     */
    public int getAddedPackCount() {
        return addedPackCount;
    }

    /**
     * Устанавливает количество дополнительных паков карт, добавленных в игру.
     * 
     * @param addedPackCount новое количество дополнительных паков
     */
    public void setAddedPackCount(int addedPackCount) {
        this.addedPackCount = addedPackCount;
    }

    /**
     * Возвращает количество колод, используемых в игре.
     * 
     * @return количество колод
     */
    public int getDecksCount() {
        return decksCount;
    }

    /**
     * Устанавливает количество колод, используемых в игре.
     * 
     * @param decksCount новое количество колод
     */
    public void setDecksCount(int decksCount) {
        this.decksCount = decksCount;
    }
}
