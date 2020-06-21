package generators;

import api.Generator;

import java.util.Random;

public class EmailGenerator implements Generator {
    public String generate() {
        Random r = new Random();
        int type = r.nextInt(4);
        String[] domainArray = {"mail.ru", "ukr.net", "i.ua", "gmail.com"};
        String domain = domainArray[r.nextInt(domainArray.length)];
        User user = new User();

        switch (type) {
            case 0:
                return user.getName() + "." + user.getLastname() + "@" + domain;
            case 1:
                return user.getLastname() + "." + user.getName() + "@" + domain;
            case 2:
                return user.getName() + (r.nextInt(99) + 1) + "@" + domain;
            case 3:
                return user.getLastname() + user.getYear() + "@" + domain;
            default:
                return "Error";

        }
    }
}
