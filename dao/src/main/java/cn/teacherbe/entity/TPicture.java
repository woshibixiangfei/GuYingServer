package cn.teacherbe.entity;

public class TPicture {
    private Integer id;

    private String pictureName;

    private Integer picturePosition;

    private String picturePositionName;

    private String pictureAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public Integer getPicturePosition() {
        return picturePosition;
    }

    public void setPicturePosition(Integer picturePosition) {
        this.picturePosition = picturePosition;
    }

    public String getPicturePositionName() {
        return picturePositionName;
    }

    public void setPicturePositionName(String picturePositionName) {
        this.picturePositionName = picturePositionName == null ? null : picturePositionName.trim();
    }

    public String getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(String pictureAddress) {
        this.pictureAddress = pictureAddress == null ? null : pictureAddress.trim();
    }
}