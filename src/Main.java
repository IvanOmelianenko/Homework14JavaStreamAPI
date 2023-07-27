import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
            List<User> userData = List.of(new User("joeysitriani@test.com", "Joey", "Sitriani", 52, 1971),
                                          new User("michaeljameson@hotmail.com", "Michael", "Jameson", 24, 1999),
                                          new User("kellymcbride82@yahoo.com", "Kelly", "McBride", 35, 1988),
                                          new User("chonlee@gmail.com", "Chon", "Lee", 21, 2002),
                                          new User("monicagreywig@hotspot.com", "Monica", "Greywig", 28, 1995),
                                          new User("jessicawelsh@tl.com", "Jessica", "Welsh", 20, 2003));
// 1st task
            userData.stream()
                    .sorted()
                    .map(User::getSurname)
                    .forEach(System.out::println);
// 2n task
        Optional<String> op = userData.stream()
                .filter(surname -> surname.getSurname().length() < 8)
                .map(User::getName)
                .findFirst();

        try {
            System.out.println(op.orElseThrow(() -> new NotFoundShortNameException("Not found name less than 8 characters")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
// 3rd task
        userData.stream()
                .filter(email -> email.getEmail().length() > 10)
                .map(User::getDateOfBirth)
                .skip(3)
                .forEach(System.out::println);
    }
}


// 4th task
/*
* Recursion in programming refers to the process of a function calling itself.
* Each sub-problem is solved by calling the same function, creating a tree of function calls until exit condition is reached
*
*
* Class Optional use for exception handling to avoid missing errors. And works with possibly missing values
*
*
*
 */