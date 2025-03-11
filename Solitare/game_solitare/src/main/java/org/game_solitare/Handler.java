package org.game_solitare;

/**
 * Обрабатывает действия, совершаемые игроком на поле игры
 */
public class Handler {

    public Handler() {
        // Конструктор
    }
    public void startGame() {
        // Начать игру
    }
    public void dealCards() {
        // Раздать карты
    }
    public void moveCard(String source, String destination) {
        // Переместить карту
    }
    public void undoMove() {
        // Отменить ход
    }
    public void redoMove() {
        // Повторить ход
    }
    public boolean checkWin() {
        // Проверить победу
        return false;
    }
    public void shuffleDeck() {
        // Перемешать колоду
    }
    public void saveGame(String filename) {
        // Сохранить игру
    }
    public void loadGame(String filename) {
        // Загрузить игру
    }
    public String getGameState() {
        // Получить состояние игры
        return "";
    }
    public void setGameState(String state) {
        // Установить состояние игры
    }
}