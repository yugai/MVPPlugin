package template.useless;

import java.util.Date;

public class Album {
    private Integer albumId;

    private Integer userId;

    private String title;

    private String intro;

    private String cover;

    private Integer numFollow;

    private Integer numMovie;

    private Boolean isPrivate;

    private Date createTime;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getNumFollow() {
        return numFollow;
    }

    public void setNumFollow(Integer numFollow) {
        this.numFollow = numFollow;
    }

    public Integer getNumMovie() {
        return numMovie;
    }

    public void setNumMovie(Integer numMovie) {
        this.numMovie = numMovie;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", intro='" + intro + '\'' +
                ", cover='" + cover + '\'' +
                ", numFollow=" + numFollow +
                ", numMovie=" + numMovie +
                ", isPrivate=" + isPrivate +
                ", createTime=" + createTime +
                '}';
    }
}