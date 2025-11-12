package inheritance;



class SocialMediaAccount {
	String userName;         
    String email;           
    boolean isPublic;        
    boolean isVerified;     
    String countryOrigin;    
    int noOfPosts;           
    int likes;               
    int comments;            
    String createdAt;       
    int noOfImpressions;
    
    SocialMediaAccount(){
    	 userName = "Unknown User";
         email = "noemail@example.com";
         isPublic = true;
         isVerified = false;
         countryOrigin = "Not specified";
         noOfPosts = 0;
         likes = 0;
         comments = 0;
         createdAt = "2025-01-01";
         noOfImpressions = 0;
	}
	
    SocialMediaAccount(String userName,String email,boolean isPublic,boolean isVerified,String countryOrigin,int noOfPosts,int likes,int comments,String createdAt,int noOfImpressions){
		this.userName=userName;
		this.email=email;
		this.isPublic=isPublic;
		this.isVerified=isVerified;
		this.countryOrigin=countryOrigin;
		this.noOfPosts=noOfPosts;
		this.likes=likes;
		this.comments=comments;
		this.createdAt=createdAt;
		this.noOfImpressions=noOfImpressions;
		
		}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getCountryOrigin() {
		return countryOrigin;
	}

	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}

	public int getNoOfPosts() {
		return noOfPosts;
	}

	public void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getComments() {
		return comments;
	}

	public void setComments(int comments) {
		this.comments = comments;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public int getNoOfImpressions() {
		return noOfImpressions;
	}

	public void setNoOfImpressions(int noOfImpressions) {
		this.noOfImpressions = noOfImpressions;
	}
	
    void display() {
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Public Account: " + isPublic);
        System.out.println("Verified Account: " + isVerified);
        System.out.println("Country of Origin: " + countryOrigin);
        System.out.println("Number of Posts: " + noOfPosts);
        System.out.println("Likes: " + likes);
        System.out.println("Comments: " + comments);
        System.out.println("Created At: " + createdAt);
        System.out.println("Impressions: " + noOfImpressions);
     
    }
		
}

class InstagramAccount extends SocialMediaAccount {

int noOfFollowers;        
int noOfFollowing;       
int noOfHighlights;       
int noOfPostArchived;     
int noOfAudioSaved;       
int noOfStoryArchived;    


	InstagramAccount() {
    this.noOfFollowers = 0;
    this.noOfFollowing = 0;
    this.noOfHighlights = 0;
    this.noOfPostArchived = 0;
    this.noOfAudioSaved = 0;
    this.noOfStoryArchived = 0;
}


	InstagramAccount(String userName,String email,boolean isPublic,boolean isVerified,String countryOrigin,int noOfPosts,int likes,int comments,String createdAt,int noOfImpressions,int followers, int following, int highlights, int postArchived, int audioSaved, int storyArchived) {
	super( userName, email, isPublic, isVerified, countryOrigin, noOfPosts, likes, comments, createdAt,noOfImpressions);
    this.noOfFollowers = followers;
    this.noOfFollowing = following;
    this.noOfHighlights = highlights;
    this.noOfPostArchived = postArchived;
    this.noOfAudioSaved = audioSaved;
    this.noOfStoryArchived = storyArchived;
}
	
	


	public int getNoOfFollowers() {
		return noOfFollowers;
	}


	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}


	public int getNoOfFollowing() {
		return noOfFollowing;
	}


	public void setNoOfFollowing(int noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}


	public int getNoOfHighlights() {
		return noOfHighlights;
	}


	public void setNoOfHighlights(int noOfHighlights) {
		this.noOfHighlights = noOfHighlights;
	}


	public int getNoOfPostArchived() {
		return noOfPostArchived;
	}


	public void setNoOfPostArchived(int noOfPostArchived) {
		this.noOfPostArchived = noOfPostArchived;
	}


	public int getNoOfAudioSaved() {
		return noOfAudioSaved;
	}


	public void setNoOfAudioSaved(int noOfAudioSaved) {
		this.noOfAudioSaved = noOfAudioSaved;
	}


	public int getNoOfStoryArchived() {
		return noOfStoryArchived;
	}


	public void setNoOfStoryArchived(int noOfStoryArchived) {
		this.noOfStoryArchived = noOfStoryArchived;
	}


	void display() {
	super.display();
	 System.out.println("\n---------------INSTAGRAM ACCOUNT----------------");
    System.out.println("Number of Followers: " + noOfFollowers);
    System.out.println("Number of Following: " + noOfFollowing);
    System.out.println("Number of Highlights: " + noOfHighlights);
    System.out.println("Number of Posts Archived: " + noOfPostArchived);
    System.out.println("Number of Audios Saved: " + noOfAudioSaved);
    System.out.println("Number of Stories Archived: " + noOfStoryArchived);
}
}

	class LinkedInAccount extends SocialMediaAccount{
    int noOfConnections;     
    int noOfProfileViews;    
    int noOfJobsApplied;     

    
    LinkedInAccount() {
        this.noOfConnections = 0;
        this.noOfProfileViews = 0;
        this.noOfJobsApplied = 0;
    }

    
    LinkedInAccount(String userName,String email,boolean isPublic,boolean isVerified,String countryOrigin,int noOfPosts,int likes,int comments,String createdAt,int noOfImpressions,int connections, int profileViews, int jobsApplied) {
    	super( userName, email, isPublic, isVerified, countryOrigin, noOfPosts, likes, comments, createdAt,noOfImpressions);
        this.noOfConnections = connections;
        this.noOfProfileViews = profileViews;
        this.noOfJobsApplied = jobsApplied;
    }

  
    public int getNoOfConnections() {
		return noOfConnections;
	}


	public void setNoOfConnections(int noOfConnections) {
		this.noOfConnections = noOfConnections;
	}


	public int getNoOfProfileViews() {
		return noOfProfileViews;
	}


	public void setNoOfProfileViews(int noOfProfileViews) {
		this.noOfProfileViews = noOfProfileViews;
	}


	public int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}


	public void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}


	void display() {
		System.out.println("\n---------------LINKEDIN ACCOUNT----------------");
    	super.display();
        System.out.println("Number of Connections: " + noOfConnections);
        System.out.println("Number of Profile Views: " + noOfProfileViews);
        System.out.println("Number of Jobs Applied: " + noOfJobsApplied);
    }
}
	
		class YouTubeChannel extends SocialMediaAccount{
	    int noOfSubscribers;       
	    double watchTime;           
	    boolean isMonetized;        
	    double estimatedRevenue;    

	   
	    YouTubeChannel() {
	        this.noOfSubscribers = 0;
	        this.watchTime = 0.0;
	        this.isMonetized = false;
	        this.estimatedRevenue = 0.0;
	    }

	    
	    YouTubeChannel(String userName,String email,boolean isPublic,boolean isVerified,String countryOrigin,int noOfPosts,int likes,int comments,String createdAt,int noOfImpressions,int subs, double watchTime, boolean monetized, double revenue) {
	    	super(userName,email, isPublic, isVerified, countryOrigin, noOfPosts, likes, comments, createdAt,noOfImpressions);
	        this.noOfSubscribers = subs;
	        this.watchTime = watchTime;
	        this.isMonetized = monetized;
	        this.estimatedRevenue = revenue;
	    }
	    
	    

	    public int getNoOfSubscribers() {
			return noOfSubscribers;
		}


		public void setNoOfSubscribers(int noOfSubscribers) {
			this.noOfSubscribers = noOfSubscribers;
		}


		public double getWatchTime() {
			return watchTime;
		}


		public void setWatchTime(double watchTime) {
			this.watchTime = watchTime;
		}


		public boolean isMonetized() {
			return isMonetized;
		}


		public void setMonetized(boolean isMonetized) {
			this.isMonetized = isMonetized;
		}


		public double getEstimatedRevenue() {
			return estimatedRevenue;
		}


		public void setEstimatedRevenue(double estimatedRevenue) {
			this.estimatedRevenue = estimatedRevenue;
		}


		void display() {
			System.out.println("\n---------------YOUTUBE CHANNEL----------------");
	    	super.display();
	        System.out.println("Number of Subscribers: " + noOfSubscribers);
	        System.out.println("Total Watch Time (hours): " + watchTime);
	        System.out.println("Is Monetized: " + isMonetized);
	        System.out.println("Estimated Revenue: $" + estimatedRevenue);
	    }
}
		
		class TestSocialMediaAccount{
			public static void main(String[] args) {
				InstagramAccount a1 = new InstagramAccount("tejas_k", "tejas@example.com", true, true, "India",250, 1200, 300, "2020-05-15", 15000,5000, 450, 15, 20, 40, 18);
				a1.display();
				
				
				LinkedInAccount n1 = new LinkedInAccount("tejas_k", "tejas@example.com", true, true, "India",120, 540, 230, "2018-09-20", 8500,500, 1250, 30);
				n1.display();
				
				YouTubeChannel b1 = new YouTubeChannel("TechTejas", "tejas@example.com", true, true, "India",320, 56000, 12500, "2019-03-15", 250000,15000, 4200.75, true, 1250.50);
				b1.display();
			}
		}
	