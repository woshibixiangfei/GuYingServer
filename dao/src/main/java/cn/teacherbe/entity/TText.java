package cn.teacherbe.entity;

public class TText {
    private Integer id;

    private String textName;

    private Integer textPosition;

    private String textPositionName;

    private String textInfomation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName == null ? null : textName.trim();
    }

    public Integer getTextPosition() {
        return textPosition;
    }

    public void setTextPosition(Integer textPosition) {
        this.textPosition = textPosition;
    }

    public String getTextPositionName() {
        return textPositionName;
    }

    public void setTextPositionName(String textPositionName) {
        this.textPositionName = textPositionName == null ? null : textPositionName.trim();
    }

    public String getTextInfomation() {
        return textInfomation;
    }

    public void setTextInfomation(String textInfomation) {
        this.textInfomation = textInfomation == null ? null : textInfomation.trim();
    }
}