package org.profile;

/**
 * Класс для управления профилем игрока на стороне клиента.
 */
public class Profile {
    private int userId;
    private String playerName;
    private int level;
    private int experience;
    private String avatar;

    /**
     * Конструктор для создания профиля игрока.
     * @param userId ID игрока.
     * @param playerName Имя игрока.
     * @param level Уровень игрока.
     * @param experience Опыт игрока.
     * @param avatar Аватар игрока (URL или путь к файлу).
     */
    public Profile(int userId, String playerName, int level, int experience, String avatar) {
        this.userId = userId;
        this.playerName = playerName;
        this.level = level;
        this.experience = experience;
        this.avatar = avatar;
    }

    /**
     * Возвращает ID игрока.
     * @return ID игрока.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Устанавливает ID игрока.
     * @param userId Новый ID игрока.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Возвращает имя игрока.
     * @return Имя игрока.
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Устанавливает имя игрока.
     * @param playerName Новое имя игрока.
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Возвращает уровень игрока.
     * @return Уровень игрока.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Устанавливает уровень игрока.
     * @param level Новый уровень игрока.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Возвращает текущий опыт игрока.
     * @return Опыт игрока.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Устанавливает опыт игрока.
     * @param experience Новый опыт игрока.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Возвращает аватар игрока.
     * @return Аватар игрока.
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Устанавливает аватар игрока.
     * @param avatar Новый аватар игрока.
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Обновляет профиль игрока (например, при достижении нового уровня).
     * @param newLevel Новый уровень.
     * @param additionalExperience Дополнительный опыт.
     */
    public void updateProfile(int newLevel, int additionalExperience) {
        this.level = newLevel;
        this.experience += additionalExperience;
    }

    /**
     * Возвращает строковое представление профиля игрока.
     * @return Профиль игрока в виде строки.
     */
    @Override
    public String toString() {
        return "PlayerProfile{" +
               "userId=" + userId +
               ", playerName='" + playerName + '\'' +
               ", level=" + level +
               ", experience=" + experience +
               ", avatar='" + avatar + '\'' +
               '}';
    }
}
