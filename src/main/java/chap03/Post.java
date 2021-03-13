package chap03;

import java.util.List;

public class Post {
    private final List<Comment> comments;

    public Post(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }
}