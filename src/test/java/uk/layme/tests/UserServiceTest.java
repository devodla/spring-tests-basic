package uk.layme.tests;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    public void create() {
        User user = new User("devodla", "123456");

        List<User> users = userService.create(user);

        assertEquals(1, users.size());
        assertEquals(user, users.getFirst());
    }

    @Test
    public void createUser_ThrowsException() {
        User user = new User("devodla", "123456");

        userService.create(user);

        assertThrows(RuntimeException.class, () -> userService.create(user));
    }
}
