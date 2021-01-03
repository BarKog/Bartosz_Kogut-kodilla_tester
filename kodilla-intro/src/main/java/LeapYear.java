public class LeapYear{
        public static void main(String[] args){
            int yearInt = 1600;
            if (yearInt % 4 == 0 && yearInt % 100 == 0 && yearInt % 400 == 0){
                System.out.println("Jest to rok przestępny");
            }
            else { System.out.println("Rok nie jest przestępny");

            }
               }
        }


