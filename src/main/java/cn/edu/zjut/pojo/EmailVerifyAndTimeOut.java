package cn.edu.zjut.pojo;

public class EmailVerifyAndTimeOut {
    private long time;
    private boolean verificationState;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isVerificationState() {
        return verificationState;
    }

    public void setVerificationState(boolean verificationState) {
        this.verificationState = verificationState;
    }
}
