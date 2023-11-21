import java.util.ArrayList;

public class PlayerAWeponStore {

   static ArrayList <Integer>arrayList=new ArrayList();

    public static void setValue(int value) {
        arrayList.add(value);
        System.out.println(arrayList);
    }

   static int AplayerScore;
   public static int getAplayerScore(){

        for (int a:arrayList
             ) {

           AplayerScore+=a;
        }
        return AplayerScore;

    }



}
