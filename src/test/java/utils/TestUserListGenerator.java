package utils;

import com.example.demo.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestUserListGenerator {

    private static final Random ID = new Random();
    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
    private static final String[] EMAIL_DOMAINS = {"example.com", "mail.com", "test.org"};
    private static final Random PASSWORD = new Random();

    public static List<User> generateUsers(int count) {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String id = "id_" + ID.nextInt(1000);
            String name = NAMES[PASSWORD.nextInt(NAMES.length)];
            String email = name.toLowerCase() + "@" + EMAIL_DOMAINS[PASSWORD.nextInt(EMAIL_DOMAINS.length)];
            String password = "password" + PASSWORD.nextInt(1000);

            users.add(new User(id, email, name, password));
        }

        return users;
    }
}
