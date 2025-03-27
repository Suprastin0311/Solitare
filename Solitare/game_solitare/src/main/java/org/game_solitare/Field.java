package org.game_solitare;

/**
 * Класс {@code Field} описывает игровое поле для игры "Солитёр".
 * Хранит информацию о колонках, целевых стопках и основной колоде для игры.
 * @author ddnik
 * @version 1.0
 * @since 15.03.2025
 */
public class Field {

    /**
     * Количество колонок на игровом поле.
     * Значение по умолчанию: 7.
     */
    private int columns = 7;

    /**
     * Количество целевых стопок (домов).
     * Значение по умолчанию: 4.
     */
    private int foundationPiles = 4;

    /**
     * Количество карт в колоде.
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
     * Возвращает количество целевых стопок (домов).
     *
     * @return количество домов
     */
    public int getFoundationPiles() {
        return foundationPiles;
    }

    /**
     * Устанавливает количество целевых стопок (домов).
     *
     * @param foundationPiles новое количество домов
     */
    public void setFoundationPiles(int foundationPiles) {
        this.foundationPiles = foundationPiles;
    }

    /**
     * Возвращает количество карт в колоде.
     *
     * @return количество карт в колоде
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
}
