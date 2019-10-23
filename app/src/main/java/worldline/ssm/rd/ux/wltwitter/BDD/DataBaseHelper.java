package worldline.ssm.rd.ux.wltwitter.BDD;

import androidx.room.Room;

import worldline.ssm.rd.ux.wltwitter.WLTwitterApplication;

public class DataBaseHelper {
    private static final DataBaseHelper ourInstance = new DataBaseHelper();
    private final TwitterDataBase dataBase ;
   public static DataBaseHelper getInstance() {
        return ourInstance;
    }

    private DataBaseHelper() {
       dataBase = Room.databaseBuilder(WLTwitterApplication.getContext(), TwitterDataBase.class , "tweetDataBase.db").build();
    }
    public TwitterDAO getTwitterDao(){
       return  dataBase.tweeterDao();
    }
}
