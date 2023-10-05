package homework04;

import java.time.LocalDate;
import java.util.Calendar;

public class User {

    private String name;
    private String surname;
    private String patronymic;
    private LocalDate birthdate;
    private String email;

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public User(String name, String surname, String patronymic, LocalDate birthdate, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO: '" + name + " " + surname + " " + patronymic + '\'' +
                ", birthdate: " + birthdate.toString() +
                ", email: '" + email + '\'' +
                '}';
    }
}
