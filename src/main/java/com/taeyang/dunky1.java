package com.taeyang;

import java.util.Arrays;
import java.util.Scanner;

public class dunky1 {

    public static void main(String[] args) {

        int totalCoin = 0;

        int aa = 100;
        aa = 0;
        for (int i = 0; i < 999999; i++) {

            System.out.println("원하시는 메뉴를 선택해 주세요");
            System.out.println("1 : 돈 입금");
            System.out.println("2 : 돈 입금 + 메세지 입력");
            System.out.println("종료를 원하시면 crash를 입력하세요");

            Scanner sc = new Scanner(System.in);
            String userInputString = sc.nextLine();

            String msg = "입력하신 메세지는 ";

            System.out.println(userInputString);

            if (userInputString.equals("crash")) {
                totalCoin = withdraw(totalCoin);
                totalCoin = 0;
                break;
            }
            else if (userInputString.equals("1")) {
                System.out.println("입금하실 액수를 입력해주세요");
                totalCoin = totalCoin + deposit(sc.nextInt(),totalCoin);
            }
            else if (userInputString.equals("2")) {
                // plan 1
//                System.out.println("입금하실 액수를 입력해주세요");
//                int a = sc.nextInt();
//                System.out.println("메세지를 입력해 주세요");
//                String b = sc.next();
//                coins = coins + deposit(a,coins);
//                System.out.println(msg + "\""+b+"\"");
                // plan 2
                System.out.println("입금하실 액수와 메세지를 입력해주세요 (금액/메세지)");
                String c = sc.next();
                //100/하태양
                int money = Integer.parseInt(c.split("/")[0]);
                String message = c.split("/")[1];
                System.out.println("c :: " + c);
                System.out.println("money :: " + money);
                System.out.println("message :: " + message);


            }
        }
    }

    public static int deposit(int coin,int sun) {

        sun = sun + coin;
        System.out.println("" + coin + " 입금");
        System.out.println("계좌의 잔고는 " + sun + "입니다.");
        return sun;
    }

    public static int withdraw(int coins) {
        System.out.println("현재 합계 : " + coins);
        System.out.println("계좌가 0원이 되었습니다.");
        return 0;
    }

}


