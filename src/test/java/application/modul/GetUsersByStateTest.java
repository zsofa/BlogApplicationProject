package application.modul;

import application.models.UserData;
import application.models.UserState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetUsersByStateTest {

    @Test
    public void usersByStateTest() {
        String input = "user";
        List<UserData> expected = Arrays.asList(
                new UserData(
                        5,
                        "Babushka",
                        "Meldrop98765",
                        "vodka1956@gmail.com",
                        UserState.USER
                )
        );

        Assertions.assertTrue(compareLists(expected, GetUsersByState.run(input)));

    }


    private <T> boolean compareLists(List<T> expected, List<T> actual) {
        if (!(expected.size() == actual.size())) {
            return false;
        }
        for (int i = 0; i < actual.size(); i++) {
            if (!(expected.get(i).equals(actual.get(i)))) {
                return false;
            }
        }
        return true;
    }
}