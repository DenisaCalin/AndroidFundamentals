package com.example.androidfundamentals_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    private List<Event> events;
    private RecyclerView recyclerViewEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        getEvents();
        recyclerViewEvents = this.findViewById(R.id.recyclerViewEvents); //this e default

        setLayoutManager(recyclerViewEvents);
        setAdapter(recyclerViewEvents);
    }

    private void getEvents() {
        events = new ArrayList<>();
        Event event = null;
        for (int i = 0; i < 30; i++){
            event = new Event();
            event.setName("Untold " + i);
            event.setAddress("Cluj " + i);
            event.setStartDate(new Date());
            event.setDescription("Un event cool " + i);
            event.setUrlImage("https://www.romania-insider.com/sites/default/files/styles/article_large_image/public/featured_images/untold-2017.jpg");
            events.add(event);
        }
    }

    private void setLayoutManager(RecyclerView recyclerViewEvents) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewEvents.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerViewEvents) {
        EventsAdapter eventsAdapter = new EventsAdapter(events);
        recyclerViewEvents.setAdapter(eventsAdapter);
    }
}
