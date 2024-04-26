public class Ticket {
    private Movie movie;
    private int studioNumber;
    private String seat;

    public Ticket() {
    }

    public  Ticket(Movie movie, int studioNumber, String seat) {
        this.movie = movie;
        this.studioNumber = studioNumber;
        this.seat = seat;
    }
     public String getTicketInfo() {
        return getTicketInfo();
    }
     public Movie getMovie() {
        return movie;
    }
     public int getStudioNumber() {
        return studioNumber;
    }
    public void setPrice(double price) {
    }
    public String getSeat() {
        return seat;
    }
    public static double getTicketPrice(String type) {
        return getTicketPrice(type);
    }
}