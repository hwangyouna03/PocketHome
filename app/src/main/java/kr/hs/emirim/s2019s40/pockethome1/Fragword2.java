package kr.hs.emirim.s2019s40.pockethome1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragword2 extends Fragment {
    private View view;

    public static Fragword2 newInstance() {
        Fragword2 fragword2 = new Fragword2();
        return fragword2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_word2, container, false);

        return view;
    }
}
