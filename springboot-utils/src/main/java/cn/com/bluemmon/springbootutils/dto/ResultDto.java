package cn.com.bluemmon.springbootutils.dto;


public class ResultDto<T> {
    private Boolean success;
    private T data;
    private String maessage;

    public ResultDto(T data) {
        this.success=true;
        this.data = data;
    }

    public ResultDto(Boolean success) {
        this.success = false;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMaessage() {
        return maessage;
    }

    public void setMaessage(String maessage) {
        this.maessage = maessage;
    }
}
