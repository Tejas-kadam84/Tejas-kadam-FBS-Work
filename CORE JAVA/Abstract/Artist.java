package Abstract;


abstract class Artist {
	String name;
	int age;
	String gender;
	String country;
	String artStyle;
	double experience;
	double earnings;

	Artist() {
		this.name = "M. F. Husain";
		age = 60;
		gender = "Male";
		country = "India";
		artStyle = "General";
		experience = 40;
		earnings = 50000;

	}

	Artist(String name, int age, String gender, String country, String artStyle, double experience, double earnings) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.country = country;
		this.artStyle = artStyle;
		this.experience = experience;
		this.earnings = earnings;
	}

	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getArtStyle() {
		return artStyle;
	}

	public void setArtStyle(String artStyle) {
		this.artStyle = artStyle;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	
	 abstract void perform();
	 
	 
	public String toString() {
	 	return "name is :"+this.name+"/"+this.age+"/"+this.gender+"/"+this.country+"/"+this.artStyle+"/"+this.experience+"/"+this.earnings;
}
	
}

class Singer extends Artist {
    String genre;
    int albumsReleased;
    int noOfConcerts;
    String famousSong;
    boolean isPlaybackSinger;
    int awardsWon;

    
    Singer() {
        super(); 
        this.genre = "Classical";
        this.albumsReleased = 25;
        this.noOfConcerts = 2000;
        this.famousSong = "lag jaa gale";
        this.isPlaybackSinger = false;
        this.awardsWon = 100;
    }


    Singer(String name, int age, String gender, String country,String artStyle, double experience, double earnings,
           String genre, int albumsReleased, int noOfConcerts, String famousSong,
           boolean isPlaybackSinger, int awardsWon) {
        super(name, age, gender, country,artStyle, experience, earnings);
        this.genre = genre;
        this.albumsReleased = albumsReleased;
        this.noOfConcerts = noOfConcerts;
        this.famousSong = famousSong;
        this.isPlaybackSinger = isPlaybackSinger;
        this.awardsWon = awardsWon;
    }



    public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getAlbumsReleased() {
		return albumsReleased;
	}


	public void setAlbumsReleased(int albumsReleased) {
		this.albumsReleased = albumsReleased;
	}


	public int getNoOfConcerts() {
		return noOfConcerts;
	}


	public void setNoOfConcerts(int noOfConcerts) {
		this.noOfConcerts = noOfConcerts;
	}


	public String getFamousSong() {
		return famousSong;
	}


	public void setFamousSong(String famousSong) {
		this.famousSong = famousSong;
	}


	public boolean isPlaybackSinger() {
		return isPlaybackSinger;
	}


	public void setPlaybackSinger(boolean isPlaybackSinger) {
		this.isPlaybackSinger = isPlaybackSinger;
	}


	public int getAwardsWon() {
		return awardsWon;
	}


	public void setAwardsWon(int awardsWon) {
		this.awardsWon = awardsWon;
	}

	
	public String toString() {
	 	return "genre is :"+this.genre+"/"+this.albumsReleased+"/"+this.noOfConcerts+"/"+this.famousSong+"/"+this.isPlaybackSinger+"/"+this.awardsWon;
}
	
	 void perform() {
	        System.out.println(name + " is singing beautifully in the genre of " + genre + ".");
	    }
	 
	
}

class Painter extends Artist {
    String paintingStyle;
    String famousPainting;
    int noOfExhibitions;
    String mediumUsed;
    String galleryName;
    int awardsWon;
    boolean isNationalAwardWinner;

    
    Painter() {
        super(); 
        this.paintingStyle = "Unknown";
        this.famousPainting = "Not available";
        this.noOfExhibitions = 0;
        this.mediumUsed = "Not specified";
        this.galleryName = "Not displayed";
        this.awardsWon = 0;
        this.isNationalAwardWinner = false;
    }

    
    Painter(String name, int age, String gender, String country,String artStyle, double experience, double earnings,
            String paintingStyle, String famousPainting, int noOfExhibitions,
            String mediumUsed, String galleryName, int awardsWon, boolean isNationalAwardWinner) {

        super(name, age, gender, country,artStyle, experience, earnings);
        this.paintingStyle = paintingStyle;
        this.famousPainting = famousPainting;
        this.noOfExhibitions = noOfExhibitions;
        this.mediumUsed = mediumUsed;
        this.galleryName = galleryName;
        this.awardsWon = awardsWon;
        this.isNationalAwardWinner = isNationalAwardWinner;
    }


    
    public String getPaintingStyle() {
		return paintingStyle;
	}


	public void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}


	public String getFamousPainting() {
		return famousPainting;
	}


	public void setFamousPainting(String famousPainting) {
		this.famousPainting = famousPainting;
	}


	public int getNoOfExhibitions() {
		return noOfExhibitions;
	}


	public void setNoOfExhibitions(int noOfExhibitions) {
		this.noOfExhibitions = noOfExhibitions;
	}


	public String getMediumUsed() {
		return mediumUsed;
	}


	public void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}


	public String getGalleryName() {
		return galleryName;
	}


	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}


	public int getAwardsWon() {
		return awardsWon;
	}


	public void setAwardsWon(int awardsWon) {
		this.awardsWon = awardsWon;
	}


	public boolean isNationalAwardWinner() {
		return isNationalAwardWinner;
	}


	public void setNationalAwardWinner(boolean isNationalAwardWinner) {
		this.isNationalAwardWinner = isNationalAwardWinner;
	}
	
	public String toString() {
	 	return "paintingStyle is :"+this.paintingStyle+"/"+this.famousPainting+"/"+this.noOfExhibitions+"/"+this.mediumUsed+"/"+this.galleryName+"/"+this.awardsWon+"/"+this.isNationalAwardWinner;
}
	

    void perform() {
        System.out.println(name + " is painting a masterpiece using " + mediumUsed + ".");
    }
}

class Actor extends Artist {
    String movieName;
    String roleType;
    int noOfMovies;
    int noOfAwards;
    String famousDialogue;
    boolean isNationalAwardWinner;
    String productionHouse;

 
    Actor() {
        super(); 
        this.movieName = "Unknown";
        this.roleType = "Not specified";
        this.noOfMovies = 0;
        this.noOfAwards = 0;
        this.famousDialogue = "N/A";
        this.isNationalAwardWinner = false;
        this.productionHouse = "Not specified";
    }


    Actor(String name, int age, String gender, String country,String artStyle, double experience, double earnings,String movieName, String roleType, int noOfMovies, int noOfAwards,String famousDialogue, boolean isNationalAwardWinner, String productionHouse) {

        super(name, age, gender, country, artStyle, experience, earnings);
        this.movieName = movieName;
        this.roleType = roleType;
        this.noOfMovies = noOfMovies;
        this.noOfAwards = noOfAwards;
        this.famousDialogue = famousDialogue;
        this.isNationalAwardWinner = isNationalAwardWinner;
        this.productionHouse = productionHouse;
    }



    public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getRoleType() {
		return roleType;
	}


	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}


	public int getNoOfMovies() {
		return noOfMovies;
	}


	public void setNoOfMovies(int noOfMovies) {
		this.noOfMovies = noOfMovies;
	}


	public int getNoOfAwards() {
		return noOfAwards;
	}


	public void setNoOfAwards(int noOfAwards) {
		this.noOfAwards = noOfAwards;
	}


	public String getFamousDialogue() {
		return famousDialogue;
	}


	public void setFamousDialogue(String famousDialogue) {
		this.famousDialogue = famousDialogue;
	}


	public boolean isNationalAwardWinner() {
		return isNationalAwardWinner;
	}


	public void setNationalAwardWinner(boolean isNationalAwardWinner) {
		this.isNationalAwardWinner = isNationalAwardWinner;
	}


	public String getProductionHouse() {
		return productionHouse;
	}


	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}
	
	public String toString() {
	 	return "movieName is :"+this.movieName+"/"+this.roleType+"/"+this.noOfMovies+"/"+this.noOfAwards+"/"+this.famousDialogue+"/"+this.isNationalAwardWinner+"/"+this.productionHouse;
}

    void perform() {
        System.out.println(name + " is acting in the movie " + movieName + " as " + roleType + ".");
    }
}

class TestArtist{
	public static void main(String[] args){
		Artist a1;
		
		a1 = new Singer("Lata Mangeshkar", 92, "Female", "India", "Singing", 70, 5000000, "Classical / Playback", 25, 2000, "Lag Jaa Gale", true, 100);
		a1.perform();
		System.out.println(a1.toString());
		System.out.println("*******************************************************************************");
	
		
		a1 = new Painter("M. F. Husain", 95, "Male", "India", "Painting", 70, 8000000, "Modern / Cubist", "Horses Series", 250, "Oil on Canvas", "Jehangir Art Gallery", 50, true);
		a1.perform();
		System.out.println(a1.toString());
		System.out.println("***************************************************************");


		a1 = new Actor("Amitabh Bachchan", 82, "Male", "India", "Acting", 55, 15000000, "Sholay", "Lead Role", 230, 200, "Rishte mein toh hum tumhare baap lagte hain, naam hai Shahenshah!", true, "Amitabh Bachchan Corporation Ltd.");
		a1.perform();
		System.out.println(a1.toString());
		System.out.println("***************************************************************");
	
	}
}

