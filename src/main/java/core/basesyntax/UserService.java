package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        int record;
        for (int i = 0; i < records.length; i++) {
            int index = records[i].indexOf(':');
            record = (int) Integer.parseInt(records[i].substring(index + 1));
            if (records[i].substring(0, index).equals(email)) {
                return record;
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
