package com.theIronYard;

public class TextNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public TextNotification(String subject, String body,
                            String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

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
}
