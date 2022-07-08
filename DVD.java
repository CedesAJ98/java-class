public class DVD implements Comparable {
    /* member variables */
    private String title;
    private String date;
    private String rating;
    private String directorName;
    private String dvdStudio;
    private String userRating;


    public DVD(String title, String date, String rating, String directorName, String dvdStudio, String userRating) {
        this.title = title;
        this.date = date;
        this.rating = rating;
        this.directorName = directorName;
        this.dvdStudio = dvdStudio;
        this.userRating = userRating;
    }

  //setters+getters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirectorName() {
        return directorName;  //++++++++++// add others
    }
    public void setDirectorName(String directorName) {
        this.directorName = directorName; //++++++++++// add others
    }

    public String getDvdStudio() {
        return dvdStudio;
    }

    public void setDvdStudio(String dvdStudio) {
        this.dvdStudio = dvdStudio;
    }

    public String getUserRating() {
        return title;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }


    @Override
    public int compareTo(Object object) {
        DVD dvd = (DVD) object;
        return title.compareTo(dvd.getTitle());
    }

    // print DVD
    public String toString() {
        return "Title: " + title.toUpperCase() + " | " + " Date: " + date + " | " +  " Rating: " + rating.toUpperCase() + " | " + " Director's Name: " + directorName + " | " + " DVD Studio: " + dvdStudio + " | " + " User Rating: " + userRating;

    }

    //separate values by commas
    public char[] toCSV() {
        String str = title + "," + date + "," + rating + "," + directorName + "," + dvdStudio + "," + userRating;
        return str.toCharArray();
    }
}