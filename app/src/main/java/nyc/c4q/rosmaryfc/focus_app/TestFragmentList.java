package nyc.c4q.rosmaryfc.focus_app;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by s3a on 8/25/15.
 */
public class TestFragmentList extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)  {
        View v2 = inflater.inflate(R.layout.activity_app_monitor, container, false);

        return v2;
    }
}
