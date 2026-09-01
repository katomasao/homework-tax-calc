package org.example;


import java.util.Scanner;

public class IO {

    static int enterMenuitem() {
        int menuitem = enterNumber(Strings.MENU);
        while (menuitem < 1 || menuitem > 3) {
            menuitem = enterNumber(Strings.ERR_MSG_MENUITEM);
        }
	return menuitem;
    }

    static int enterNumber(String query) {
        Scanner sc = new Scanner(System.in);
        String rawInput;
        int parsedInput = 0;
        boolean ok;
        System.out.print(query);
        do {
            rawInput = sc.nextLine();
            if (rawInput.toLowerCase().equals("end")) {
		System.out.print(Strings.END);
                System.exit(0);
            }
            ok = true;
            try {
                parsedInput = Integer.parseInt(rawInput, 10);
            } catch(NumberFormatException e) {
                System.err.print(Strings.ERR_MSG_NUMBER);
                ok = false;
            } finally {
                if (parsedInput < 0) {
                    System.err.print(Strings.ERR_MSG_NEGATIVE);
                    ok = false;
                }
            }
        } while(!ok);
        return parsedInput;
    }

}
