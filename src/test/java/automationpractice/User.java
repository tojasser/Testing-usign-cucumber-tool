package automationpractice;

import java.util.UUID;

public class User {
    public static final String EMAIL_START = "tester";
    public static final String EMAIL_END = "testing.com";
    private UUID uuid;

    public String generateEmail() {
        uuid = UUID.randomUUID();
        return EMAIL_START + uuid.hashCode() + "@" + EMAIL_END;
    }

    public String getId() {
        return uuid.hashCode() + "";
    }
}
