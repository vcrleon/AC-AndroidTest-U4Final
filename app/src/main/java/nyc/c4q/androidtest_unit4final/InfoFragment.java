package nyc.c4q.androidtest_unit4final;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {
    Button moreButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        buttonClicked();

        View v = inflater.inflate(R.layout.info_fragment, container, false);
        return v;


    }

    private void buttonClicked(){
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moreButton.setVisibility(View.INVISIBLE);
            }
        });
    }


}
