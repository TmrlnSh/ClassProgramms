package com.java.homeworks.HW25;

class Page {
    void loadPage() {
        System.out.println("Load Page");
    }

    void isPageLoaded() {
        System.out.println("Page is loaded");
    }

    Page() {
        System.out.println("Message form constructor of \"Page class\"");
    }
}

class LoginPage extends Page {
    void doLogin() {
        System.out.println("LogIn");
    }

    void logOut() {
        System.out.println("LogOut");
    }
}
class HomePage extends Page{
    void openHomePage(){
        System.out.println("Open Home Page");
    }
    void verifyLogo(){
        System.out.println("Verify Logo");
    }
}


public class PageMainClass {
    public static void main(String[] args) {
        LoginPage obj1 = new LoginPage();
        HomePage obj2 = new HomePage();
        obj1.doLogin();
        obj1.logOut();
        obj2.openHomePage();
        obj2.verifyLogo();
    }
}
