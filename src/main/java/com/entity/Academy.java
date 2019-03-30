package com.entity;

/**
 * @author zeng
 * @date 2019/3/30 - 11:02
 */
public class Academy {
    private Long academyId;
    private String academyName;
    private Integer academyStatus;

    @Override
    public String toString() {
        return "academy{" +
                "academyId=" + academyId +
                ", academyName='" + academyName + '\'' +
                ", academyStatus=" + academyStatus +
                '}';
    }

    public Long getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Long academyId) {
        this.academyId = academyId;
    }

    public String getAcademyName() {
        return academyName;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    public Integer getAcademyStatus() {
        return academyStatus;
    }

    public void setAcademyStatus(Integer academyStatus) {
        this.academyStatus = academyStatus;
    }
}
