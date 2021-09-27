package application.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Text {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String textContent;
    @Getter @Setter
    private long textAnswearId;

    @Getter @Setter
    private List<Text> commentTexts;

    public Text() {
    }

    public Text(long id, String textContent, long textAnswearId) {
        this.id = id;
        this.textContent = textContent;
        this.textAnswearId = textAnswearId;
    }
}
