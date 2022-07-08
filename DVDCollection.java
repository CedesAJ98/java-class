import java.io.*;
import java.util.*;

public class DVDCollection {
    private DVD[] dvdArray;
    private int numdvds;

    public DVDCollection() {
        dvdArray = new DVD[0];
        numdvds = 0; // no dvds at start
    }


    public String toString() {
        String str = "numdvds=" + numdvds + "\ndvdArray.length = " + dvdArray.length + "\n";
        for (int i = 0; i < numdvds; i++) {
            str += "dvdArray[" + i + "] = " + dvdArray[i] + "\n";
        }
        return str;
    }

    public void addOrModifyDVD(String title, String date, String rating, String directorName, String dvdStudio, String userRating) {//++++++++++// add others
        boolean alreadyPresent = false;
        int location = 0;
        // check if present
        for (int i = 0; i < numdvds; i++) {
            if (dvdArray[i].getTitle().equals(title)) {
                alreadyPresent = true;
                location = i;
            }
        }

        if (!alreadyPresent) {
            DVD dvd = new DVD(title, date, rating, directorName, dvdStudio, userRating);
            dvdArray = Arrays.copyOf(dvdArray, dvdArray.length + 1);
            dvdArray[dvdArray.length - 1] = dvd;
            numdvds += 1;
            if (numdvds > 1)
                Arrays.sort(dvdArray);
        } else {
            dvdArray[location].setDate(date);
            dvdArray[location].setRating(rating);
            dvdArray[location].setDirectorName(directorName);
            dvdArray[location].setDvdStudio(dvdStudio);
            dvdArray[location].setUserRating(userRating);

        }
    }

    public void removeDVD(String title) {
        boolean present = false;
        int location = 0;
       //check if file is already saved
        for (int i = 0; i < numdvds; i++) {
            if (dvdArray[i].getTitle().equals(title)) {
                present = true;
                if (i == 0) {
                    location = -1;
                    break;
                } else {
                    location = i;
                    break;
                }
            }
        }

        if (present && location == -1) {
            for (int i = 0; i < numdvds; i++) {
                dvdArray[i] = dvdArray[i + 1];
            }
            dvdArray[numdvds - 1] = null;// sets last dvd to be null
            numdvds -= 1;// decrease the number of dvds
        } else if (present && location != -1) {
            for (int j = location; j < numdvds - 1; j++) {
                dvdArray[j] = dvdArray[j + 1];
            }
            dvdArray = Arrays.copyOf(dvdArray, dvdArray.length - 1); // decrease the array
            numdvds -= 1;// decrease the number of dvds
        }
    }

    // display all DVDs
    public String getDVDsByRating(String rating) {
        String str = "";
        for (int i = 0; i < numdvds; i++) {
            if (dvdArray[i].getRating().equals(rating)) {
                str += dvdArray[i] + "\n";
            }
        }
        return str;
    }


    // load data
    public void loadData(String fileName) {
        String line;

        boolean found = false;
        Scanner in = null;
        try {
            in = new Scanner(new File(fileName));
            found = true;
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " is not found.");
        }
        if (found) {
            this.numdvds = 0;
            while (in.hasNext()) {
                line = in.nextLine();
                StringTokenizer st = new StringTokenizer(line, ",");
                String title = st.nextToken();
                String date = st.nextToken();
                String rating = st.nextToken();
                String directorName = st.nextToken();
                String dvdStudio = st.nextToken();
                String userRating = st.nextToken();
                addOrModifyDVD(title, date, rating, directorName, dvdStudio, userRating);
            }
        } else {
            new DVDCollection();
        }
    }

    // save data to a file
    public void save(String fileName) {
        PrintWriter save = null;
        try {
            save = new PrintWriter(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Could not save file.");
        }
        for (int i = 0; i < this.numdvds; i++) {
            save.print(dvdArray[i].toCSV());
            save.print("\r\n".toCharArray());
        }
        save.close();
    }

}



