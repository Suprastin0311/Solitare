package org.settings;

/**
 * Класс для управления настройками веб-игры.
 * Содержит параметры и методы для изменения и получения настроек.
 */
public class GameSettings {

    // Поля настроек
	/**
	 * Название игры.
	 */
	private String gameTitle;

	/**
	 * Указывает, включен ли звук.
	 * True, если звук включен, false, если выключен.
	 */
	private boolean soundEnabled;

	/**
	 * Ширина экрана в пикселях.
	 */
	private int screenWidth;

	/**
	 * Высота экрана в пикселях.
	 */
	private int screenHeight;

	/**
	 * Язык игры (например, "ru", "en").
	 */
	private String language;

	/**
	 * Уровень сложности игры.
	 * Например, 1 - легкий, 2 - средний, 3 - сложный.
	 */
	private int difficultyLevel;

	/**
	 * Указывает, включен ли полноэкранный режим.
	 * True, если режим включен.
	 */
	private boolean fullscreenMode;

	/**
	 * Громкость музыки (от 0 до 100).
	 */
	private int musicVolume;

	/**
	 * Громкость звуковых эффектов (от 0 до 100).
	 */
	private int effectsVolume;

	/**
	 * Указывает, включены ли подсказки.
	 * True, если подсказки включены.
	 */
	private boolean hintsEnabled;

	/**
	 * Интервал автоматического сохранения в минутах.
	 */
	private int autoSaveInterval;

	/**
	 * Тема оформления игры (например, "Light" или "Dark").
	 */
	private String theme;

	/**
	 * Тайм-аут сети в секундах.
	 */
	private int networkTimeout;

	/**
	 * Указывает, включено ли сохранение в облаке.
	 * True, если включено.
	 */
	private boolean cloudSaveEnabled;

	/**
	 * Регион сервера (например, "Europe", "Asia").
	 */
	private String serverRegion;

	/**
	 * Указывает, включены ли обучающие материалы.
	 * True, если включены.
	 */
	private boolean tutorialsEnabled;


    /**
     *  Конструктор
     */
    public GameSettings() {
        // Установка настроек по умолчанию
        this.gameTitle = "Моя Игра";       
        this.soundEnabled = true;
        this.screenWidth = 1920;
        this.screenHeight = 1080;
        this.language = "ru";
        this.difficultyLevel = 2;
        this.fullscreenMode = true;
        this.musicVolume = 50;
        this.effectsVolume = 50;
        this.hintsEnabled = true;
        this.autoSaveInterval = 10;
        this.theme = "Light";      
        this.networkTimeout = 30;
        this.cloudSaveEnabled = true;
        this.serverRegion = "Europe";        
        this.tutorialsEnabled = true;
    }

    /**
     * Устанавливает название игры.
     * @param gameTitle Название игры.
     */
    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    /**
     * Возвращает название игры.
     * @return Название игры.
     */
    public String getGameTitle() {
        return gameTitle;
    }

    // Пропустим аналогичные геттеры и сеттеры для остальных полей для краткости

    /**
     * Включает или выключает звук.
     * @param soundEnabled True для включения звука, false для выключения.
     */
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    /**
     * Возвращает, включен ли звук.
     * @return True, если звук включен.
     */
    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    // Добавим оставшиеся методы аналогично
    /**
     * Сбрасывает все настройки к значениям по умолчанию.
     */
    public void resetToDefault() {
        new GameSettings(); // Сбросить на значения по умолчанию через вызов конструктора
    }

    /**
     * Устанавливает ширину экрана.
     * @param screenWidth Ширина экрана в пикселях.
     */
    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    /**
     * Возвращает ширину экрана.
     * @return Ширина экрана в пикселях.
     */
    public int getScreenWidth() {
        return screenWidth;
    }

    /**
     * Устанавливает высоту экрана.
     * @param screenHeight Высота экрана в пикселях.
     */
    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    /**
     * Возвращает высоту экрана.
     * @return Высота экрана в пикселях.
     */
    public int getScreenHeight() {
        return screenHeight;
    }

    /**
     * Устанавливает язык игры.
     * @param language Язык игры (например, "ru").
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Возвращает язык игры.
     * @return Язык игры.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Устанавливает уровень сложности игры.
     * @param difficultyLevel Уровень сложности (например, 1 - легкий).
     */
    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    /**
     * Возвращает уровень сложности игры.
     * @return Уровень сложности.
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     * Включает или выключает полноэкранный режим.
     * @param fullscreenMode True для включения режима, false для выключения.
     */
    public void setFullscreenMode(boolean fullscreenMode) {
        this.fullscreenMode = fullscreenMode;
    }

    /**
     * Возвращает, включен ли полноэкранный режим.
     * @return True, если режим включен.
     */
    public boolean isFullscreenMode() {
        return fullscreenMode;
    }

    /**
     * Устанавливает громкость музыки.
     * @param musicVolume Громкость музыки (от 0 до 100).
     */
    public void setMusicVolume(int musicVolume) {
        this.musicVolume = musicVolume;
    }

    /**
     * Возвращает громкость музыки.
     * @return Громкость музыки.
     */
    public int getMusicVolume() {
        return musicVolume;
    }

    /**
     * Устанавливает громкость эффектов.
     * @param effectsVolume Громкость эффектов (от 0 до 100).
     */
    public void setEffectsVolume(int effectsVolume) {
        this.effectsVolume = effectsVolume;
    }

    /**
     * Возвращает громкость эффектов.
     * @return Громкость эффектов.
     */
    public int getEffectsVolume() {
        return effectsVolume;
    }

    /**
     * Включает или выключает подсказки.
     * @param hintsEnabled True для включения подсказок, false для выключения.
     */
    public void setHintsEnabled(boolean hintsEnabled) {
        this.hintsEnabled = hintsEnabled;
    }

    /**
     * Возвращает, включены ли подсказки.
     * @return True, если подсказки включены.
     */
    public boolean isHintsEnabled() {
        return hintsEnabled;
    }

    /**
     * Устанавливает интервал автосохранения.
     * @param autoSaveInterval Интервал в минутах.
     */
    public void setAutoSaveInterval(int autoSaveInterval) {
        this.autoSaveInterval = autoSaveInterval;
    }

    /**
     * Возвращает интервал автосохранения.
     * @return Интервал автосохранения в минутах.
     */
    public int getAutoSaveInterval() {
        return autoSaveInterval;
    }

    /**
     * Устанавливает тему игры.
     * @param theme Тема игры (например, "Light").
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Возвращает тему игры.
     * @return Тема игры.
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Устанавливает сетевой тайм-аут.
     * @param networkTimeout Тайм-аут в секундах.
     */
    public void setNetworkTimeout(int networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    /**
     * Возвращает сетевой тайм-аут.
     * @return Тайм-аут в секундах.
     */
    public int getNetworkTimeout() {
        return networkTimeout;
    }

    /**
     * Включает или выключает сохранение в облаке.
     * @param cloudSaveEnabled True для включения, false для выключения.
     */
    public void setCloudSaveEnabled(boolean cloudSaveEnabled) {
        this.cloudSaveEnabled = cloudSaveEnabled;
    }

    /**
     * Возвращает, включено ли сохранение в облаке.
     * @return True, если сохранение включено.
     */
    public boolean isCloudSaveEnabled() {
        return cloudSaveEnabled;
    }

    /**
     * Устанавливает регион сервера.
     * @param serverRegion Регион сервера (например, "Europe").
     */
    public void setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
    }

    /**
     * Возвращает регион сервера.
     * @return Регион сервера.
     */
    public String getServerRegion() {
        return serverRegion;
    }

    /**
     * Включает или выключает обучение.
     * @param tutorialsEnabled True для включения обучения, false для выключения.
     */
    public void setTutorialsEnabled(boolean tutorialsEnabled) {
        this.tutorialsEnabled = tutorialsEnabled;
    }

    /**
     * Возвращает, включено ли обучение.
     * @return True, если обучение включено.
     */
    public boolean isTutorialsEnabled() {
        return tutorialsEnabled;
    }

}
