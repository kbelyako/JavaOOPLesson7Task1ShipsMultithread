// �������� ������� ���� 7 ������������� ���������������� ����� 2
//���������� ��� �������. �� ������ �� ��� 10 ������ �����. ��� ������������ ������� � ����, � ������� ������ 2 ����. 
//�������� ��������� - 1 ���� � 0.5 ���. �������� ���������, �������, �������� ���������, �������� �� ��������� ���������� ����.

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
