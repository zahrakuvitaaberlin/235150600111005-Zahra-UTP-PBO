package src;
public class Cinema {
    String name;
    int studioCapacity;
    int [] User;
    int [] Studio;

    public void thisCinema(String n, int s ){
        name = n;
        studioCapacity = s;
    }
    private void init(){

    }
    public void registerUser(int[] user, boolean b){
        User = user;
    }
    public void authenticateUser(String email, String password){

    }
    public void displayListStudio(){

    }
    public void displayStudioDetail(int studioNumber){

    }
    public void addStudioDetail(String studioType, String movieTitle, double movieRating, String movieGenres){

    }
    public void getName(String n){

    }
}   