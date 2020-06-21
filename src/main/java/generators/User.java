package generators;

import java.time.LocalDateTime;
import java.util.Random;

public class User {
    private String name;
    private String lastname;
    private String email;
    private int year;


    public User() {
        Random r = new Random();
        LocalDateTime now = LocalDateTime.now();
        name = randomString(r.nextInt(7) + 3);
        lastname = randomString(r.nextInt(13) + 3);
        year = r.nextInt((now.getYear() - 1950) + 1) + 1950;
    }

    private String randomString(final int length) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        String alpha = "qwertyuiopasdfghjklzxcvbnm";
        for (int i = 0; i < length; i++) {
            char c = alpha.charAt(r.nextInt(alpha.length()));
            sb.append(c);
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year=" + year +
                '}';
    }
}
