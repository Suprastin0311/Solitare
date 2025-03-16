package org.main;

/**
* Интерфейс View для отображения данных.
*/
public class View {
   /**
    * Отображает приветственное сообщение.
    * @param message Приветственное сообщение.
    */
	protected void displayWelcomeMessage(String message) {
	   System.out.println(message);
   }

   /**
    * Отображает произвольное сообщение.
    * @param message Сообщение для отображения.
    */
   protected void displayMessage(String message) {
	   System.out.println(message);
   }
   
   /**
    * Отображает данные игрока
    * @param playerName Ник-нейм игрока
    * @param level Уровень игрока
    * @param experience Опыт текущего уровня
    */
   protected void desplayPlayerData(String playerName, int level, int expierence) {
	   
   }
}