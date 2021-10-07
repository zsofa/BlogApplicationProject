package application.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Template {

    @Getter @Setter
    private String templateName;
    @Getter @Setter
    private String category;
    @Getter @Setter
    private String mainColour;
    @Getter @Setter
    private String backgroundColour;

    @Getter @Setter
    private List<BlogText> blogTemplates;

    public Template() {
    }

    public Template(String templateName, String category, String mainColour, String backgroundColour) {
        this.templateName = templateName;
        this.category = category;
        this.mainColour = mainColour;
        this.backgroundColour = backgroundColour;
    }
}
