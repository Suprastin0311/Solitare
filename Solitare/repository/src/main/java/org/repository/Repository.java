package org.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.settings.GameSettings;

/**
 * Класс Repository для взаимодействия с базой данных.
 */
public class Repository {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    private Connection connection;

    /**
     * Конструктор для инициализации соединения с базой данных.
     */
    public Repository() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для сохранения настроек игры в базу данных.
     * @param settings Настройки игры.
     */
    public void saveSettings(GameSettings settings) {
        String query = "INSERT INTO settings (gameTitle, maxPlayers, soundEnabled, language) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, settings.getGameTitle());            
            statement.setBoolean(3, settings.isSoundEnabled());
            statement.setString(4, settings.getLanguage());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для получения настроек игры из базы данных.
     * @return Настройки игры.
     */
    public GameSettings getSettings() {
        String query = "SELECT * FROM settings LIMIT 1";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                GameSettings settings = new GameSettings();
                settings.setGameTitle(resultSet.getString("gameTitle"));                
                settings.setSoundEnabled(resultSet.getBoolean("soundEnabled"));
                settings.setLanguage(resultSet.getString("language"));
                return settings;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Метод для сохранения статистики пользователя.
     * @param userId ID пользователя.
     * @param stats Статистика пользователя.
     */
    public void saveStatistics(int userId, String stats) {
        String query = "INSERT INTO statistics (userId, stats) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            statement.setString(2, stats);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для получения статистики пользователя.
     * @param userId ID пользователя.
     * @return Статистика пользователя.
     */
    public String getStatistics(int userId) {
        String query = "SELECT stats FROM statistics WHERE userId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("stats");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Метод для сохранения профиля пользователя.
     * @param userId ID пользователя.
     * @param profile Профиль пользователя.
     */
    public void saveUserProfile(int userId, String profile) {
        String query = "INSERT INTO user_profiles (userId, profile) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            statement.setString(2, profile);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для получения профиля пользователя.
     * @param userId ID пользователя.
     * @return Профиль пользователя.
     */
    public String getUserProfile(int userId) {
        String query = "SELECT profile FROM user_profiles WHERE userId = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getString("profile");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Закрывает соединение с базой данных.
     */
    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
