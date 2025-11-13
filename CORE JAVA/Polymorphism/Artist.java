package Polymorphism;


class Artist {
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
	
	void perform() {
	    System.out.println(name + " is performing their art.");
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

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Country: " + country);
		System.out.println("Art Style: " + artStyle);
		System.out.println("Experience: " + experience + " years");
		System.out.println("Earnings: $" + earnings);
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
    

    void perform() {
        System.out.println(name + " is singing beautifully in the genre of " + genre + ".");
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


	void display() {
		System.out.println("\n---------------SINGER-----------");
        super.display();
        System.out.println("Genre: " + genre);
        System.out.println("Albums Released: " + albumsReleased);
        System.out.println("Number of Concerts: " + noOfConcerts);
        System.out.println("Famous Song: " + famousSong);
        System.out.println("Playback Singer: " + (isPlaybackSinger ? "Yes" : "No"));
        System.out.println("Awards Won: " + awardsWon);
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
    

    void perform() {
        System.out.println(name + " is painting a masterpiece using " + mediumUsed + ".");
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


	void display() {
		System.out.println("\n---------------PAINTER-----------");
        super.display();
        System.out.println("Painting Style: " + paintingStyle);
        System.out.println("Famous Painting: " + famousPainting);
        System.out.println("Number of Exhibitions: " + noOfExhibitions);
        System.out.println("Medium Used: " + mediumUsed);
        System.out.println("Gallery Name: " + galleryName);
        System.out.println("Awards Won: " + awardsWon);
        System.out.println("National Award Winner: " + (isNationalAwardWinner ? "Yes" : "No"));
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
    
    void perform() {
        System.out.println(name + " is acting in the movie " + movieName + " as " + roleType + ".");
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


	void display() {
		System.out.println("\n---------------ACTOR-----------");
        super.display();
        System.out.println("Famous Movie: " + movieName);
        System.out.println("Role Type: " + roleType);
        System.out.println("Number of Movies: " + noOfMovies);
        System.out.println("Awards Won: " + noOfAwards);
        System.out.println("Famous Dialogue: " + famousDialogue);
        System.out.println("National Award Winner: " + (isNationalAwardWinner ? "Yes" : "No"));
        System.out.println("Production House: " + productionHouse);
    }
}

class TestArtist{
	public static void main(String[] args){
		Artist a1;
		
		a1 = new Singer("Lata Mangeshkar", 92, "Female", "India", "Singing", 70, 5000000, "Classical / Playback", 25, 2000, "Lag Jaa Gale", true, 100);
		a1.display();
		System.out.println("*******************************************************************************");
		a1.perform();
		System.out.println("*******************************************************************************");
	
		
		a1 = new Painter("M. F. Husain", 95, "Male", "India", "Painting", 70, 8000000, "Modern / Cubist", "Horses Series", 250, "Oil on Canvas", "Jehangir Art Gallery", 50, true);
		a1.display();
		System.out.println("***************************************************************");
		a1.perform();
		System.out.println("***************************************************************");


		a1 = new Actor("Amitabh Bachchan", 82, "Male", "India", "Acting", 55, 15000000, "Sholay", "Lead Role", 230, 200, "Rishte mein toh hum tumhare baap lagte hain, naam hai Shahenshah!", true, "Amitabh Bachchan Corporation Ltd.");
		a1.display();
		System.out.println("***************************************************************");
		a1.perform();
		System.out.println("***************************************************************");
	
	}
}
