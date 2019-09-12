package Assignment;

import java.util.Scanner;

public class SearchById {

        public int cusId;

        public SearchById() {
            System.out.println("Enter Id Of Customer");
            Scanner obj = new Scanner(System.in);
            cusId = obj.nextInt();
        }

        public int getCusId() {
            return cusId;
        }

    }




