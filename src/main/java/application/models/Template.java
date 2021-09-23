package application.models;

public class Template {

    /**
     CREATE TABLE IF NOT EXISTS template (
     template_name VARCHAR(50) NOT NULL,
     category VARCHAR(50) UNIQUE DEFAULT 'clean',
     main_colour VARCHAR(50) DEFAULT 'black',
     background_colour VARCHAR(50) DEFAULT 'white',
     PRIMARY KEY (template_name)
     );*/

    private String templateName;
    private String category;
    private String mainColour;
    private String backgroundColour;


    public Template(String templateName, String category, String mainColour, String backgroundColour) {
        this.templateName = templateName;
        this.category = category;
        this.mainColour = mainColour;
        this.backgroundColour = backgroundColour;
    }
}
