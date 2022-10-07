public class ResponseData {
    private SkiEvent data;
    private String message;

    public ResponseData() {
    }

    public ResponseData(SkiEvent data, String message) {
        this.data = data;
        this.message = message;
    }

    public SkiEvent getData() {
        return data;
    }

    public void setData(SkiEvent data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
