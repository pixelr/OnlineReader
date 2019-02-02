package pixelr;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserManager {
    Map<Integer, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void addUser(int id, User use) {
        users.put(id, use);
    }

    public void removeUser(int id) {
        users.remove(id);
    }

    public Optional<User> findUser(int id) throws Exception {
        if (!users.containsKey(id))
            throw new Exception("User not found");

        return Optional.of(users.get(id));
    }
}
