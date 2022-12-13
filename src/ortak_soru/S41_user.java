package ortak_soru;

import java.time.LocalDateTime;

public class S41_user {

    //  1- Bir user class olusturun fields: name, registerDate (LocalDateTime cinsinden)

    String name;
    LocalDateTime registerDate;

    public S41_user () {}

    public S41_user(String name, LocalDateTime registerDate) {

        this.name = name;
        this.registerDate = registerDate;
    }
}