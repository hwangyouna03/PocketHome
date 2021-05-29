package kr.hs.emirim.s2019s40.pockethome1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragword1 extends Fragment {
    private View view;

    public static Fragword1 newInstance() {
        Fragword1 fragword1 = new Fragword1();
        return fragword1;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_word1, container, false);

        return view;
    }
}
