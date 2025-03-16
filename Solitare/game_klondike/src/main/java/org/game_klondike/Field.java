package org.game_klondike;

/**
 * Используется для конфигурации игрового поля,
 * хранит информацию о колонках для карт, стопке сброса и основной колоде.
 * @author ddnik
 * @version 1.0
 * @since 15.03.2025
 */
public class Field {

    /**
     * Количество колонок на игровом поле.
     * Значение по умолчанию: 7 (типично для Косынки).
     */
    private int columns = 7;

    /**
     * Количество карт в основной колоде.
     * Значение по умолчанию: 52.
     */
    private int cardsInDeck = 52;

    /**
     * Количество стопок для сброса.
     * Значение по умолчанию: 1.
     */
    private int wastePiles = 1;

    /**
     * Количество целевых стопок (домов).
     * Значение по умолчанию: 4.
     */
    private int foundationPiles = 4;

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
     * Возвращает количество карт в основной колоде.
     *
     * @return количество карт в колоде
     */
    public int getCardsInDeck() {
        return cardsInDeck;
    }

    /**
	 * Устанавливает количество карт в колоде.
	 * 
	 * @param deckType тип колоды<br>
	 * 					1 - 36 карт<br>
	 * 					2 - 52 карты
	 */
	public void setCardsInDeck(int deckType) {
		if (deckType < 1 || deckType > 2) return;
		if (deckType == 1) cardsInDeck = 36;
		if (deckType == 2) cardsInDeck = 52; 
	}

    /**
     * Возвращает количество стопок для сброса.
     *
     * @return количество стопок сброса
     */
    public int getWastePiles() {
        return wastePiles;
    }

    /**
     * Устанавливает количество стопок для сброса.
     *
     * @param wastePiles новое количество стопок сброса
     */
    public void setWastePiles(int wastePiles) {
        this.wastePiles = wastePiles;
    }

    /**
     * Возвращает количество целевых стопок.
     *
     * @return количество домов
     */
    public int getFoundationPiles() {
        return foundationPiles;
    }

    /**
     * Устанавливает количество целевых стопок.
     *
     * @param foundationPiles новое количество домов
     */
    public void setFoundationPiles(int foundationPiles) {
        this.foundationPiles = foundationPiles;
    }
}
