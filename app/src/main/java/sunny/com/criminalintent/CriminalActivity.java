package sunny.com.criminalintent;

import android.support.v4.app.Fragment;

public class CriminalActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
