package worldline.ssm.rd.ux.wltwitter.BDD;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import worldline.ssm.rd.ux.wltwitter.pojo.Tweet;

@Database(entities = {Tweet.class}, version = 1)
public abstract class TwitterDataBase extends RoomDatabase {
    public abstract TwitterDAO tweeterDao();
}
