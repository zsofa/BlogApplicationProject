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
    private String email;
    @Getter @Setter
    private UserState userState;
    @Getter @Setter
    byte[] profilePicture;

    @Getter @Setter
    private List<BlogText> userBlogposts; // kapcsolótábla
    @Getter @Setter
    private List<CommentText> userComments;

    public UserData() {
    }

    public UserData(long id, String userName, String password, String emailAdress, UserState userState) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = emailAdress;
        this.userState = userState;
    }

    @Override
    public String toString() {
        return id + " - " + userName + ", " +
                password + ", " + email + ", "+ userState;
    }



}
