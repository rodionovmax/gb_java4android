package lesson2;

public class SwitchTest {
    public static void main(String[] args) {
        convertSeasonSwitch(3);
        convertSeasonSwitchToMonth(10);
    }

    private static void convertSeasonSwitch(int seasonNumber) {
        String season;

        switch (seasonNumber) {
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }

        System.out.println(season);
    }

//    private static void convertSeasonSwitchToMonth(int monthNumber) {
//        String season;
//
//        switch (monthNumber) {
//            case 1:
//            case 2:
//            case 12:
//                season = "Winter";
//                break;
//            case 3:
//            case 4:
//            case 5:
//                season = "Spring";
//                break;
//            case 6:
//            case 7:
//            case 8:
//                season = "Summer";
//                break;
//            case 9:
//            case 10:
//            case 11:
//                season = "Fall";
//                break;
//            default:
//                season = "Unknown season";
//        }
//
//        System.out.println(season);
//    }

    private static void convertSeasonSwitchToMonth(int monthNumber) {
        String season = switch (monthNumber) {
            case 1, 2, 12 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Unknown season";
        };

        System.out.println(season);
    }


}
