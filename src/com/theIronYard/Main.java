package com.theIronYard;

public class Main {

    public static void main(String[] args) {
	EmailNotification email = new EmailNotification("Bigfoot", "Feet",
            "Haha", "Blammo");
	TextNotification text = new TextNotification("Bigfoot", "Feet",
            "Haha", "Blammo");

        text.stringStatus();
        email.stringStatus();
        email.thisIsMyMethod();
    }
}
