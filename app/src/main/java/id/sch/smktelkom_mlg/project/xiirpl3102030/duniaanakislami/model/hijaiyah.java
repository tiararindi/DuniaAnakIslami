package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.R;

public class hijaiyah extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hijaiyah, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_hijaiyah, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            ImageView imghijah = (ImageView) rootView.findViewById(R.id.gambar);
            String name = "hijaiyah_" + getArguments().getInt(ARG_SECTION_NUMBER);
//                System.out.println(name);
//                int idku = getResources().getIdentifier(name, "drawable", getContext().getPackageName());
//                System.out.println(idku);
            //Drawable draw = getResources().getDrawable(name);
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h1));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h2));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 3) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h3));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 4) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h4));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 5) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h5));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 6) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h6));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 7) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h7));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 8) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h8));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 9) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h9));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 10) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h10));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 11) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h11));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 12) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h12));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 13) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h13));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 14) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h14));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 15) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h15));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 16) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h16));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 17) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h17));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 18) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h18));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 19) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h19));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 20) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h20));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 21) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h21));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 22) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h22));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 23) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h23));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 24) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h24));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 25) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h25));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 26) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h26));
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 27) {
                imghijah.setBackgroundDrawable(getResources().getDrawable(R.drawable.h27));
            }

            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 27;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "ALIF";
                case 1:
                    return "BA";
                case 2:
                    return "TA";
                case 3:
                    return "TSA";
                case 4:
                    return "JIM";
                case 5:
                    return "KHA";
                case 6:
                    return "GHO";
                case 7:
                    return "DAL";
                case 8:
                    return "DZAL";
                case 9:
                    return "RA";
                case 10:
                    return "ZAY";
                case 11:
                    return "SIN";
                case 12:
                    return "SYIN";
                case 13:
                    return "SAD";
                case 14:
                    return "DAD";
                case 15:
                    return "TO";
                case 16:
                    return "DHO";
                case 17:
                    return "AIN";
                case 18:
                    return "GHAIN";
                case 19:
                    return "FA";
                case 20:
                    return "QAF";
                case 21:
                    return "KAF";
                case 22:
                    return "LAM";
                case 23:
                    return "MIM";
                case 24:
                    return "NUN";
                case 25:
                    return "HA";
                case 26:
                    return "WAU";
                case 27:
                    return "YA";
            }
            return null;
        }
    }
}
