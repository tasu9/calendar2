package com.example.calendar2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalendarFragment extends Fragment {

    private CalendarView calendarView;
    private TextView selectedDate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        calendarView = view.findViewById(R.id.calendarView);
        selectedDate = view.findViewById(R.id.selectedDate);

        calendarView.setOnDateChangeListener((view1, year, month, dayOfMonth) ->
                selectedDate.setText("Selected Date: " + year + "/" + (month + 1) + "/" + dayOfMonth)
        );

        return view;
    }
}
