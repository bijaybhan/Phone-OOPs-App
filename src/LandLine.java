public class LandLine implements Phone
{
    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo)
    {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo()
    {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo)
    {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing)
    {
        isRinging = ringing;
    }

    public void isPowerOn()
    {

    }

    public void setPowerOn(boolean powerOn)
    {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn()
    {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo)
    {
        if (isPowerOn==true)
        {
            System.out.println("you are dailing the no"+phoneNo);
        }
        else
        {
            System.out.println("Your landline is off");
        }
    }

    @Override
    public void receiveedCall(String phoneNo)
    {
        if (isPowerOn && myPhoneNo.equals(phoneNo))
        {
            this.isRinging=true;
            System.out.println("Hey  "+myPhoneNo+"ypu are recieving a call  ");
        }
        else
        {
            System.out.println("Call Not Recieved");
        }
    }

    @Override
    public boolean answerCall()
    {
        if (isRinging==true)
        {
            System.out.println("Call Answered  ");
            this.isRinging=false;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean isRinging()
    {
        if (isRinging==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
