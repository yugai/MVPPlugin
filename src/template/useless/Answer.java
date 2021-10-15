package template.useless;

import java.util.Date;

public class Answer {
    private Integer answerId;

    private Integer userId;

    private Integer askId;

    private String content;

    private Integer numSupport;

    private Integer numOppose;

    private Date createTime;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getNumSupport() {
        return numSupport;
    }

    public void setNumSupport(Integer numSupport) {
        this.numSupport = numSupport;
    }

    public Integer getNumOppose() {
        return numOppose;
    }

    public void setNumOppose(Integer numOppose) {
        this.numOppose = numOppose;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}