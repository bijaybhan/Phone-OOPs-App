public interface Phone
{

    void powerOn();

    void callNumber(String phoneNo);

    void receiveedCall(String phoneNo);

    boolean answerCall();

    boolean isRinging();

}
