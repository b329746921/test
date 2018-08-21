package cn.bdqn.demo.pojo;

public class TUpload {
    private Long fileId;

    private Long grId;

    private String fileName;

    public TUpload(Long fileId, Long grId, String fileName) {
        this.fileId = fileId;
        this.grId = grId;
        this.fileName = fileName;
    }

    public TUpload() {
        super();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getGrId() {
        return grId;
    }

    public void setGrId(Long grId) {
        this.grId = grId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }
}