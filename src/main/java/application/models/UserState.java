package application.models;

public enum UserState {
    USER,
    ADMIN,
    MODERATOR;

    public static UserState find(String name) {
        for (UserState userState : UserState.values()) {
            if (userState.toString().replace("_"," ").equalsIgnoreCase(name)) {
                return userState;
            }
        }

        return UserState.USER;
    }
}


