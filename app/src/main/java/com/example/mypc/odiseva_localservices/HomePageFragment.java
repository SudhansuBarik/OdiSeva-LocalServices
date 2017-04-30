package com.example.mypc.odiseva_localservices;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends Fragment {

    public HomePageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_page, container, false);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Get id of Beauty Services Linear Layout
        LinearLayout beautyServices = (LinearLayout) getView().findViewById(R.id.beauty_services);

        //Set a click listener on that layout
        if (beautyServices != null) {
            beautyServices.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent beautyServicesIntent = new Intent(HomePageFragment.this.getActivity(), BeautyServicesActivity.class);
                    //Start new activity
                    getActivity().startActivity(beautyServicesIntent);
                }
            });
        }

        //Get id of Events Management Linear Layout
        LinearLayout eventsManagement = (LinearLayout) getView().findViewById(R.id.events_management);

        //Set a click listener on that layout
        if (eventsManagement != null) {
            eventsManagement.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent eventsManagementIntent = new Intent(HomePageFragment.this.getActivity(), EventsManagementActivity.class);
                    //Start new activity
                    getActivity().startActivity(eventsManagementIntent);
                }
            });
        }

        //Get id of Health and Wellness Linear Layout
        LinearLayout healthAndWellness = (LinearLayout) getView().findViewById(R.id.health_and_wellness);

        //Set a click listener on that layout
        if (healthAndWellness != null) {
            healthAndWellness.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent healthAndWellnessIntent = new Intent(HomePageFragment.this.getActivity(), HealthAndWellnessActivity.class);
                    //Start new activity
                    getActivity().startActivity(healthAndWellnessIntent);
                }
            });
        }

        //Get id of Hobbies and Interests Linear Layout
        LinearLayout hobbiesAndInterests = (LinearLayout) getView().findViewById(R.id.hobbies_and_interests);

        //Set a click listener on that layout
        if (hobbiesAndInterests != null) {
            hobbiesAndInterests.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent hobbiesAndInterestsIntent = new Intent(HomePageFragment.this.getActivity(), HobbiesAndInterestsActivity.class);
                    //Start new activity
                    getActivity().startActivity(hobbiesAndInterestsIntent);
                }
            });
        }

        //Get id of Home Care Services Linear Layout
        LinearLayout homeCareServices = (LinearLayout) getView().findViewById(R.id.home_care_services);

        //Set a click listener on that layout
        if (homeCareServices != null) {
            homeCareServices.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent homeServicesIntent = new Intent(HomePageFragment.this.getActivity(), HomeCareServicesActivity.class);
                    //Start new activity
                    getActivity().startActivity(homeServicesIntent);
                }
            });
        }

        //Get id of Personal Services Linear Layout
        LinearLayout personalServices = (LinearLayout) getView().findViewById(R.id.personal_services);

        //Set a click listener on that layout
        if (personalServices != null) {
            personalServices.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent personalServicesIntent = new Intent(HomePageFragment.this.getActivity(), PersonalServicesActivity.class);
                    //Start new activity
                    getActivity().startActivity(personalServicesIntent);
                }
            });
        }

        //Get id of Repairs and Maintenance Linear Layout
        LinearLayout repairsAndMaintenance = (LinearLayout) getView().findViewById(R.id.repair_and_maintenance);

        //Set a click listener on that view
        if (repairsAndMaintenance != null) {
            repairsAndMaintenance.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent repairsAndMaintenanceIntent = new Intent(HomePageFragment.this.getActivity(), RepairsAndMaintenanceActivity.class);
                    //Start new activity
                    getActivity().startActivity(repairsAndMaintenanceIntent);
                }
            });
        }

        //Get id of Tour Services Linear Layout
        LinearLayout tourServices = (LinearLayout) getView().findViewById(R.id.tour_services);

        //Set a click listener on that layout
        if (tourServices != null) {
            tourServices.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    //Create a new intent to open the {@link NumbersActivity}
                    Intent tourServicesIntent = new Intent(HomePageFragment.this.getActivity(), TourServicesActivity.class);
                    //Start new activity
                    getActivity().startActivity(tourServicesIntent);
                }
            });
        }
    }
}
