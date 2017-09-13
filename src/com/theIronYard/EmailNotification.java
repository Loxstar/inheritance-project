package com.theIronYard;


public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

        this.status = "Jibberjabber";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        super.transport();
    }

    @Override
    public void thisIsMyMethod() {
        super.thisIsMyMethod();
        System.out.println("Pants party");
    }
}

