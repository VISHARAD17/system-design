public class Status {
    int code;
    String msg;

    Status(int c, String m){
        code = c;
        msg = m;
    }

    // getter
    public String getMsg() {
        return msg;
    }
}
