package application.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserData {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String userName;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private String emailAdress;
    @Getter @Setter
    private State userState;
    @Getter @Setter
    byte[] profilePicture;

    @Getter @Setter
    private List<Text> textsFromUsers; // kapcsolótábla

    public UserData() {
    }

    public UserData(long id, String userName, String password, String emailAdress, State userState) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.emailAdress = emailAdress;
        this.userState = userState;
    }



}
