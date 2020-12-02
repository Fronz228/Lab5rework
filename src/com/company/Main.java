package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        JSONconnection json = new JSONconnection();
        JSONconnection.URL = "https://date.nager.at/api/v2/publicholidays/2017/UA";
        json.run();

        String jsonData = json.jsonIn;
        ObjectMapper mapper = new ObjectMapper();

        HolidaysDB holidaysDB = new HolidaysDB();

        ArrayList<Holidays> holidays = mapper.reader()
                .forType(new TypeReference<ArrayList<Holidays>>() {
                })
                .readValue(jsonData);

        for(Holidays holiday : holidays){
            holidaysDB.add(holiday);
        }

        holidaysDB.getHolidaysArrayList().sort(Holidays.byNameAsc);
        System.out.println("After sorting by name ascending:\n" + holidays);
        holidaysDB.getHolidaysArrayList().sort(Holidays.byNameDesc);
        System.out.println("After sorting by name descending:\n" + holidays);

        System.out.println("Введите имя праздника;");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        HolidaysDB holidayName = holidaysDB.filterByLocalizedName(search);
        System.out.println(holidayName);
    }
}
