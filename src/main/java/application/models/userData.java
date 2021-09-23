package application.models;

public class userData {

    /**
     CREATE TABLE IF NOT EXISTS user_data (
     id INT UNSIGNED AUTO_INCREMENT,
     user_name VARCHAR(60) NOT NULL UNIQUE,
     password VARCHAR(50) NOT NULL,
     email VARCHAR(100) NOT NULL UNIQUE,
     user_state ENUM ('user','admin','moderator'),
     profile_picture LONGBLOB,
     PRIMARY KEY (id)
     );*/

    private long id;
    private String userName;
    private String password;
    private String emailAdress;
    private State userState;
    byte[] profilePicture;


    public userData(long id, String userName, String password, String emailAdress, State userState) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.emailAdress = emailAdress;
        this.userState = userState;
    }
}
