package com.java.class30;

import java.util.Scanner;

class Browser {
    void openWebsite() {
        System.out.println("Website is opened.");
    }

    void doLogin() {
        System.out.println("Logged in");
    }

    void logout() {
        System.out.println("Logged out");
    }
}

class Chrome extends Browser {
    void openWebsite() {
        System.out.println("Open from Chrome");
    }
}

class Firefox extends Browser {
    void openWebsite() {
        System.out.println("Open from Firefox");
    }
}

public class DynamicPolyExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter browser:");
        String browser = input.next();
        Browser br;

        if (browser.equalsIgnoreCase("Chrome")) {
            br = new Chrome();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            br = new Firefox();

        } else {
            throw new RuntimeException("Invalid browser specified");
        }
        br.openWebsite();
        br.doLogin();
        br.logout();
    }
}
