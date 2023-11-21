import java.util.ArrayList;

public class PlayerBWeaponStore {

        static ArrayList<Integer> arrayList = new ArrayList();

        public static void setValue(int value) {
            arrayList.add(value);
            System.out.println(arrayList);
        }

        static int BplayerScore;

        public static int getBplayerScore() {

            for (int b: arrayList
            ) {

                BplayerScore += b;
            }
            return BplayerScore;

        }
    }



