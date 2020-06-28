// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Comparator;

public final class FindMeetingQuery {
  public Collection<TimeRange> query(Collection<Event> events, MeetingRequest request) {

// get attendees and duration needed for the meeting from the request
    Collection <String> attendees = new ArrayList<>();
    attendees = request.getAttendees();
    long duration = request.getDuration();

// arrayList for busy and free times
    List<TimeRange> busyTimes = new ArrayList<TimeRange>();
    List<TimeRange> availableTimes = new ArrayList<TimeRange>();

// create a list of times that the attendees are in meetings
    for( Event e : events) {

//check if the attendees are present 
// create list of attendes at event e
        Set<String> set = e.getAttendees();
        List<String> eventAttendees = new ArrayList<String>();
        eventAttendees.addAll(set);

        // iterate attendes at event e to see if any of them are invited in the new meeting request
        for (String s : eventAttendees) {
        if (attendees.contains(s)) {
        System.out.println(e.getWhen());

// add the times the attendees are booked to busyTimes arrayList
        busyTimes.add(e.getWhen());
        break;
        }
        }
      }

//sort for sequential access
//Collections.sort(busyTimes);
      Collections.sort(busyTimes, TimeRange.Comparators.ORDER_BY_START);

// check if the meeting duration fits when the attendees are not busy
// start checking at time 0
        int start = 0;
        boolean finished = false;
// cannot add a meeting longer than a day
        if (request.getDuration() > 1440){
            return availableTimes;
        }
        if (busyTimes.size() > 0){
        for(TimeRange t : busyTimes){
// the duration of the meeting slot must be at least as long as the meeting duration
        int timeDuration = (int) request.getDuration();
        TimeRange timeSpot = new TimeRange(start, timeDuration);
        if (t.overlaps(timeSpot) == false){
          while ((t.contains(timeDuration+start) == false) && (timeDuration+start < 1440)){
            timeDuration++;
            }
        TimeRange meetingTime = new TimeRange(start, timeDuration);
        availableTimes.add(meetingTime);
        if (start+timeDuration == 1440){ finished = true; }
        }
        start = t.end(); 
        }
    }

// if the last duration doesn't already go to 1440
        if ((start != 1440) && (finished == false)){
        boolean inclusive = false;
        TimeRange restOfDay = TimeRange.fromStartEnd(start, 1440, inclusive);
        availableTimes.add(restOfDay);
        }
    return availableTimes;
    }
}
