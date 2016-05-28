package sunny.com.criminalintent;

import java.util.UUID;

/**
 * Created by sunny on 5/27/16.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public void crime() {
        mId = UUID.randomUUID();
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

}
