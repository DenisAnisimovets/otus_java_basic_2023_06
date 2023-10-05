package homework04;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        int nowYear = LocalDate.now().getYear();

        User[] arrayUsers = new User[]{
                new User("Valera", "Kanavalov", "Petrovich", LocalDate.of(1988, 11, 4), "justValera@mail.ru"),
                new User("Pety", "Akakiy", "Nikolaevich", LocalDate.of(1981, 2, 12), "justValera@mail.ru"),
                new User("Koly", "Litvinov", "Zadrotovich", LocalDate.of(1969, 1, 9), "justValera@mail.ru"),
                new User("Maksim", "Perdejov", "Vladislalvodich", LocalDate.of(1977, 12, 2), "justValera@mail.ru"),
                new User("Toly", "Zashkvarov", "Olegovich", LocalDate.of(1975, 10, 1), "justValera@mail.ru"),
                new User("Nikita", "Kekovich", "Borisovich", LocalDate.of(1995, 11, 3), "justValera@mail.ru"),
                new User("Pasha", "Lebrod", "Vasilievich", LocalDate.of(1998, 4, 3), "justValera@mail.ru"),
                new User("Vany", "Irving", "Maksimovich", LocalDate.of(1996, 5, 11), "justValera@mail.ru"),
                new User("Jeny", "Velikiy", "Pavlovich", LocalDate.of(2002, 7, 12), "justValera@mail.ru"),
                new User("Alex", "Tompson", "Petrovich", LocalDate.of(1966, 5, 2), "justValera@mail.ru"),
        };

        for (User arrayUser : arrayUsers) {
            if(nowYear - arrayUser.getBirthdate().getYear() > 40) {
                System.out.println(arrayUser.toString());
            }
        }
    }
}
