package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GuestList {


    public GuestList() {}

    private List<String> guests = new ArrayList<>();

    public void setGuests(List<String> guests) {
        this.guests = guests;
    }

    public List<String> getGuests() {
        return guests;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GuestList guestList = (GuestList) o;
        return Objects.equals(guests, guestList.guests);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guests);
    }
}
