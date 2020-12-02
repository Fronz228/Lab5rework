package com.company;

import java.util.ArrayList;

public class HolidaysDB {
    private ArrayList<Holidays> holidaysArrayList;

    public void add(Holidays holidays) {
        this.holidaysArrayList.add(holidays);
    }

    public ArrayList<Holidays> getHolidaysArrayList() {
        return holidaysArrayList;
    }

    public HolidaysDB(ArrayList<Holidays> holidaysArrayList) {
        this.holidaysArrayList = holidaysArrayList;
    }

    public void setHolidaysArrayList(ArrayList<Holidays> holidaysArrayList) {
        this.holidaysArrayList = holidaysArrayList;
    }

    public HolidaysDB() {
        holidaysArrayList = new ArrayList<>();
    }

    public HolidaysDB filterByLocalizedName(String localizedName){
        HolidaysDB heroesDB = new HolidaysDB();
        for(Holidays holidays : this.holidaysArrayList){
            if(holidays.getName().toLowerCase().contains(localizedName.toLowerCase()))
                heroesDB.add(holidays);
        }
        return heroesDB;
    }

    @Override
    public String toString() {
        return "HeroesDB{" +
                "heroesArrayList=" + holidaysArrayList +
                '}';
    }
}
