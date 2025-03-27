package org.module_localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Класс для управления локализацией клиентской части приложения.
 */
public class Localization {
    private Locale currentLocale;
    private ResourceBundle resourceBundle;

    /**
     * Конструктор по умолчанию, устанавливающий локализацию на языке по умолчанию (en).
     */
    public Localization() {
        setLocale("en"); // Устанавливаем английский язык по умолчанию
    }

    /**
     * Устанавливает текущую локализацию.
     * @param language Код языка (например, "en" для английского, "ru" для русского).
     */
    public void setLocale(String language) {
        this.currentLocale = new Locale(language);
        this.resourceBundle = ResourceBundle.getBundle("localization.messages", currentLocale);
    }

    /**
     * Возвращает строку локализованного текста по ключу.
     * @param key Ключ текста.
     * @return Локализованный текст.
     */
    public String getLocalizedString(String key) {
        try {
            return resourceBundle.getString(key);
        } catch (Exception e) {
            return "Translation not found for key: " + key;
        }
    }

    /**
     * Возвращает текущий язык локализации.
     * @return Код языка (например, "en", "ru").
     */
    public String getCurrentLanguage() {
        return currentLocale.getLanguage();
    }
}
