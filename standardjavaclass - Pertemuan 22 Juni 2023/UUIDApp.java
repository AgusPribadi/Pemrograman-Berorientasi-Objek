package standardjavaclass;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        byte[] bytes = {0};
        UUID uuidFromBytes = UUID.nameUUIDFromBytes(bytes);

        UUID randomUUID = UUID.randomUUID();
        System.out.println(randomUUID);

        String string = "93b885ad-fe0d-3089-8df6-34904fd59f71";
        UUID uuidFromString = UUID.fromString(string);
        System.out.println(uuidFromString);
    }
}
