// Домашнее задание Урок 7 многопоточное программирование часть 2
//Существуют три корабля. На каждом из них 10 ящиков груза. Они одновременно прибыли в порт, в котором только 2 дока. 
//Скорость разгрузки - 1 ящик в 0.5 сек. Напишите программу, которая, управляя кораблями, позволит им правильно разгрузить груз.

package com.yandex.kbelyako;

public class Main {

	public static void main(String[] args) {
		 Port testport =new Port("TestPort", 2);
		 Ship ship1= new Ship("Ship1", 10, testport);
		 Ship ship2= new Ship("Ship2", 10, testport);
		 Ship ship3= new Ship("Ship3", 10, testport);
		 
	        Thread shipThread1 = new Thread(ship1);
			Thread shipThread2 = new Thread(ship2);
			Thread shipThread3 = new Thread(ship3);
		
			shipThread1.start();
			shipThread2.start();
			shipThread3.start();
		
	}

}
