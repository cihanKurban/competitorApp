package util;

import java.util.Scanner;

public class MenuUtil {

    public static int showMenu() {
        System.out.println("Please select menu:");
        String menuStr = "1-Yarışmacıları ekle\n"
                + "2-Yarışmaya başla\n"
                + "3-Durumu öğren\n"
                + "4-Yarışmacıların sayısını arttır\n"
                + "5-Yarışmacılara bak\n"
                + "6-Logout";
        System.out.println(menuStr);
        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();
        if (selectedMenu > 0 && selectedMenu < 7) {
            return selectedMenu;
        } else {
            System.out.println("Invalid menu selected");
            return -1;
        }
    }

    public static int showMenuInfinite() {
        while (true) {
            int selectedMenu = showMenu();
            if (selectedMenu == 1) {
                CompetitionUtil.registerCompetitorsAndShowInfo();
            } else if (selectedMenu == 2) {
                CompetitionUtil.startCompetition();
            } else if (selectedMenu == 3) {
                CompetitionUtil.showPoint();
            } else if (selectedMenu == 4) {
                CompetitionUtil.increaseCompetitors();
            } else if (selectedMenu == 5) {
                CompetitionUtil.printCompetitors();
            } else if (selectedMenu == 6) {
                CompetitionUtil.logout();
            }
        }
    }
}
