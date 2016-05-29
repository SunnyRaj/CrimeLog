package sunny.com.criminalintent;

import java.util.Date;
import java.util.UUID;


public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public void crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public UUID getId(){
        return mId;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
    public String getTitle(){
        return mTitle;
    }
    public Date getDate(){
        return mDate;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
