/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class HallList {

    private static Hall[] hallslist;
    private static int count;

    public HallList(int n) {
        hallslist = new Hall[n];
        count = 0;
    }

    public void add(String college, String venue, int level, int capacity, double price) {
        hallslist[count] = new Hall(college, venue, level, capacity, price);
        count++;
    }

    public void delete(int row) {
        hallslist[row + 1] = hallslist[count - 1];
        count--;
    }

    public void update(int row, String college, String venue, int level, int capacity, double price) {
        hallslist[row] = new Hall(college, venue, level, capacity, price);
    }

    public double search(String venue) {

        double price = 0;
        for (int i = 0; i < count; i++) {
            if (hallslist[i].getVenue().equalsIgnoreCase(venue)) {
                price = hallslist[i].getPrice();
            }
        }

        return price;
    }

    public int check(String venue) {
        int j = 0;
        
        for (int i = 0; i < count; i++) {
            if (hallslist[i].getVenue().equalsIgnoreCase(venue)) {
                j = 1;
            }
        }
        return j;
    }

}
