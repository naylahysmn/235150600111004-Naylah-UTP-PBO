public class Studio {
    private Movie movie;
    private String type;
    private boolean[][] seats;

    public Studio() {
    }

    public Studio(Movie movie, String type, boolean[][] seats) {
        this.movie = movie;
        this.type = type;
        this.seats = seats;
    }
     public Studio(String type) {
        this.type = type;
    }
     public String getStudioInfo() {
        return getStudioInfo(); 
    }
     public int isBooked(char row, int col) {
        return isBooked(row, col);
    }
     public boolean reserve(char row, int col) {
        return reserve(row, col);
    }
     public String getType() {
        return type;
    }
     public Movie getMovie() {
        return movie;
    }
     public void setMovie(Movie movie) {
        this.movie = movie;
    }
     public void setSeats() {

     }
}