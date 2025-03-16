package org.game_montana;

/**
 * Класс {@code Field} описывает игровое поле для игры "Montana".
 * Хранит информацию о количестве колонок, строк, карт и наличии пустых ячеек.
 * @author ddnik
 * @version 1.0
 * @since 15.03.2025
 */
public class Field {

    /**
     * Количество колонок на игровом поле.
     * Значение по умолчанию: 4.
     */
    private int columns = 4;

    /**
     * Количество строк на игровом поле.
     * Значение по умолчанию: 4.
     */
    private int rows = 4;

    /**
     * Количество карт на игровом поле.
     * По умолчанию: 52 (для стандартной колоды).
     */
    private int cardsInDeck = 52;

    /**
     * Наличие пустых ячеек на поле.
     * Значение по умолчанию: true.
     */
    private boolean hasEmptyCells = true;

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
     * Возвращает количество строк на игровом поле.
     *
     * @return количество строк
     */
    public int getRows() {
        return rows;
    }

    /**
     * Устанавливает количество строк на игровом поле.
     *
     * @param rows новое количество строк
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * Возвращает количество карт в колоде.
     *
     * @return количество карт
     */
    public int getCardsInDeck() {
        return cardsInDeck;
    }

    /**
     * Устанавливает количество карт в колоде.
     *
     * @param cardsInDeck новое количество карт в колоде
     */
    public void setCardsInDeck(int cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }

    /**
     * Проверяет, есть ли пустые ячейки на поле.
     *
     * @return {@code true}, если есть пустые ячейки; иначе {@code false}
     */
    public boolean hasEmptyCells() {
        return hasEmptyCells;
    }

    /**
     * Устанавливает наличие пустых ячеек на поле.
     *
     * @param hasEmptyCells новое состояние пустых ячеек
     */
    public void setHasEmptyCells(boolean hasEmptyCells) {
        this.hasEmptyCells = hasEmptyCells;
    }
}