package org.game_spider;

/**
 * Класс {@code Field} описывает игровое поле для игры "Паук".
 * Хранит информацию о колонках, количестве карт в колоде и стопках для игры.
 * @author ddnik
 * @version 1.0
 * @since 15.03.2025
 */
public class Field {

    /**
     * Количество колонок на игровом поле.
     * Значение по умолчанию: 10.
     */
    private int columns = 10;

    /**
     * Количество карт в одной колоде.
     * Значение по умолчанию: 52.
     */
    private int cardsInDeck = 52;

    /**
     * Количество стопок для сброса.
     * Значение по умолчанию: 8.
     */
    private int foundationPiles = 8;

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
     * Возвращает количество карт в одной колоде.
     *
     * @return количество карт в колоде
     */
    public int getCardsInDeck() {
        return cardsInDeck;
    }

    /**
     * Устанавливает количество карт в одной колоде.
     *
     * @param cardsInDeck новое количество карт
     */
    public void setCardsInDeck(int cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }

    /**
     * Возвращает количество целевых стопок для сброса.
     *
     * @return количество стопок
     */
    public int getFoundationPiles() {
        return foundationPiles;
    }

    /**
     * Устанавливает количество целевых стопок для сброса.
     *
     * @param foundationPiles новое количество стопок
     */
    public void setFoundationPiles(int foundationPiles) {
        this.foundationPiles = foundationPiles;
    }
}
