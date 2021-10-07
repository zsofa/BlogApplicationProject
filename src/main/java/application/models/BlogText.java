package application.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class BlogText {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String blogName;
    @Getter @Setter
    private String blogContent;

    @Getter @Setter
    private List<CommentText> blogComments;

    public BlogText(long id, String blogName, String blogContent) {
        this.id = id;
        this.blogName = blogName;
        this.blogContent = blogContent;
    }
}
