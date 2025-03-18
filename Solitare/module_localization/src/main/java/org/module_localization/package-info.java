/**
 * Пакет org.module_localization предназначен для управления локализацией
 * клиентской части приложения.
 * 
 * Этот пакет предоставляет функциональность для работы с локализацией,
 * включая установку текущего языка, загрузку ресурсных файлов и получение
 * локализованных строк.
 * 
 * Основной класс:
 * {@link Localization} - Класс для управления локализацией, поддерживающий
 * языковые настройки и доступ к локализованным сообщениям.
 * 
 * Пример использования:
 * <pre>
 * {@code
 * Localization localization = new Localization();
 * localization.setLocale("ru");
 * String greeting = localization.getLocalizedString("greeting");
 * System.out.println(greeting);
 * }
 * </pre>
 * 
 * @since 1.0
 * @author ddnik
 */
package org.module_localization;
