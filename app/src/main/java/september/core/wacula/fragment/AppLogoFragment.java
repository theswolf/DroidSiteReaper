package september.core.wacula.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import september.core.wacula.R;

/**
 * Created by christian on 01/09/15.
 */
public class AppLogoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.logo_app, container, false);
        return view;
    }

}
