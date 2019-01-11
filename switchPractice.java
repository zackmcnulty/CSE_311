public class switchPractice {
   public static void main(String[] args) {
      System.out.println(classesLeftInMorning("FRIDAY", true));
   }
   
   public static int classesLeftInMorning(String weekday, boolean lecture_flag) {
         switch (weekday) {
            case "SUNDAY":
            case "MONDAY":
               return lecture_flag ? 3 : 1;
            case "TUESDAY":
            case "WEDNESDAY":
               return lecture_flag ? 2 : 1;
            case "THURSDAY":
               return lecture_flag ? 1 : 1;
            case "FRIDAY":
               System.out.println( lecture_flag ? 1 : 0);
            case "SATURDAY":
               return lecture_flag ? 0 : 0;
          }
          return 0;
      }
}