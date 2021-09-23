package application.models;

public class UserText {

    /**
     CREATE TABLE IF NOT EXISTS user_text (
     id INT UNSIGNED AUTO_INCREMENT,
     user_id INT UNSIGNED,
     text_id INT UNSIGNED,
     PRIMARY KEY(id),
     FOREIGN KEY (user_id) REFERENCES user_data(id),
     FOREIGN KEY (text_id) REFERENCES text(id)
     )*/

    private long id;
    private long userId;
    private long textId;
    // What should I do with the foreign keys?


    public UserText(long id, long userId, long textId) {
        this.id = id;
        this.userId = userId;
        this.textId = textId;
    }
}
