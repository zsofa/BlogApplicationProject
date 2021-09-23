package application.models;

public class TextTemplate {

    /**
     CREATE TABLE IF NOT EXISTS text_template (
     id INT UNSIGNED AUTO_INCREMENT,
     text_id_t INT UNSIGNED,
     template_name_t VARCHAR(50) NOT NULL,
     PRIMARY KEY (id),
     FOREIGN KEY (text_id_t) REFERENCES text(id),
     FOREIGN KEY (template_name_t) REFERENCES template(template_name)
     );*/

    private long id;
    private long textIdT;
    private long templateNameT;

    public TextTemplate(long id, long textIdT, long templateNameT) {
        this.id = id;
        this.textIdT = textIdT;
        this.templateNameT = templateNameT;
    }
}
