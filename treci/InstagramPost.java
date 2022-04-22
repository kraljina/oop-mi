package hr.fer.oop.task3;

public class InstagramPost<P extends Post> extends WebEntry<P> {
    public InstagramPost(String author, String date, P post) {
        super(author, date, post);
    }

    public double calculatePostImpact(int totalLikes) {
        return getEntry().getNumberOfLikes() / (double) totalLikes;
    }

}
