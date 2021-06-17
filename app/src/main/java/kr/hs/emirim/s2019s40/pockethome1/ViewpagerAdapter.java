package kr.hs.emirim.s2019s40.pockethome1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter {
    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //fragment 교체를 보여주는 처리 구현
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Fragword1.newInstance();
            case 1:
                return Fragword2.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }

    //상단의 탭 레이아웃 인디케이터 쪽에 텍스트 선언해
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "word1";
            case 1:
                return "word2";
            default:
                return null;
        }
    }
}