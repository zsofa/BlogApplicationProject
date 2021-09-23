package application.models;

public class Text {


    /**
     CREATE TABLE IF NOT EXISTS text (
     id INT UNSIGNED AUTO_INCREMENT,
     text_content LONGTEXT,
     text_answear_id INT UNSIGNED,
     text_type ENUM ('blog post','comment'),
     PRIMARY KEY (id),
     FOREIGN KEY (text_answear_id) REFERENCES text(id)
     );*/

    private long id;
    private String textContent;
    private long textAnswearId;


    public Text(long id, String textContent, long textAnswearId) {
        this.id = id;
        this.textContent = textContent;
        this.textAnswearId = textAnswearId;
    }
}
