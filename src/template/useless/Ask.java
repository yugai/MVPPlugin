package template.useless;

import java.util.Date;

public class Ask {
    private Integer askId;

    private Integer userId;

    private Integer movieId;

    private String title;

    private String content;

    private Integer numLike;

    private Integer numAnswer;

    private Date createTime;

    private String movies;

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNumLike() {
        return numLike;
    }

    public void setNumLike(Integer numLike) {
        this.numLike = numLike;
    }

    public Integer getNumAnswer() {
        return numAnswer;
    }

    public void setNumAnswer(Integer numAnswer) {
        this.numAnswer = numAnswer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies == null ? null : movies.trim();
    }
}