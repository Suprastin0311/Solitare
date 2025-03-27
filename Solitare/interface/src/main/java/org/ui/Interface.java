package org.ui;

/**
 * Класс Interface отвечает за управление пользовательским интерфейсом.
 */
public class Interface {
    private final View view;
    private final Controller controller;

    /**
     * Конструктор для создания интерфейса.
     * @param view Объект View для отображения данных.
     * @param controller Объект Controller для управления логикой.
     */
    public Interface(View view, Controller controller) {
        this.view = view;
        this.controller = controller;
    }

    /**
     * Метод для запуска интерфейса.
     */
    public void start() {
        view.displayWelcomeMessage("Добро пожаловать в приложение!");

        // Пример взаимодействия с контроллером
        String playerName = "Dmitriy";
        int level = 5;
        int experience = 1200;

        controller.updatePlayerData(playerName, level, experience);
        view.displayMessage("Профиль игрока обновлен.");
    }
}
