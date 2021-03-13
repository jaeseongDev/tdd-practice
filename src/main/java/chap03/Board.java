package chap03;

import java.util.List;

public class Board {
    private final List<Post> posts;

    public Board(List<Post> posts) {
        this.posts = posts;
    }

    public void addComment(int postId, String content) {
        posts.get(postId).getComments().add(new Comment(content));
    }
}