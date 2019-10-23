package worldline.ssm.rd.ux.wltwitter.BDD;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import worldline.ssm.rd.ux.wltwitter.pojo.Tweet;
@Dao
public interface TwitterDAO {
    @Query("SELECT * from Tweet")
    public List<Tweet> getAll();
    @Query( "SELECT * from Tweet WHERE name  LIKE :user ")
    public List<Tweet> getTweetbyUser(String user);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAll(List<Tweet> tweets);
    @Delete
    public void delete(Tweet tweet);
    @Update
    public void update(List<Tweet> tweets);
}