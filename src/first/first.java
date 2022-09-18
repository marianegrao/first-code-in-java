package first;

import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.time.format.TextStyle; import java.util.Locale;

public class first {
    public static void main(String[] args) {
        showSalutationWithDayOfWeek("LinkedIn");
    }
    public static void showSalutationWithDayOfWeek (String userName){
        int currentHour = LocalDateTime.now().getHour();
        boolean morning = currentHour > 0 && currentHour < 12;
        boolean afternoon =  currentHour >= 12 && currentHour < 18;
        boolean evening =  currentHour >= 18;
        String salutation; String farewell;
        if(morning){
            salutation = "Good morning";
            farewell = "Have a nice day";
        } else if (afternoon) {
            salutation = "Good afternoon";
            farewell = "Have a nice afternoon";
        } else if(evening) {
            salutation = "Good evening";
            farewell = "Have a nice evening";
        } else {
            salutation = "Hello";
            farewell = "Goodbye";
        }

        LocalDate today = LocalDate.now();
        String dayOfWeek = String.valueOf(today.getDayOfWeek()).toLowerCase();
        // to translate the day of week to any language:  Locale country = new Locale("pt", "BR"); String dayOfWeek = today.getDayOfWeek().getDisplayName(TextStyle.FULL, country);
        System.out.printf("%s, %s! Today is %s. %s.%n", salutation, userName, dayOfWeek, farewell);
    }
}
