package entity;

public class Team {
    private int id;
    private String teamName;
    private String captionName;
    private String coachName;
    private float nRR;
    private boolean isQualified;
    private String shortName;

	
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public void setId(int id)
    {
    	this.id=id;
    }
    public int getId()
    {
    	return id;
    }
    
    public void setTeamName(String teamName)
    {
    	this.teamName=teamName;
    }
    public String getTeamName()
    {
    	return teamName;
    }
    
    public void setCaptionName(String captionName)
    {
    	this.captionName=captionName;
    }
    public String getCaptionName()
    {
    	return captionName;
    }
    
    public void setCoachName(String coachName)
    {
    	this.coachName=coachName;
    }
    
    public String getCoachName() {
    	return coachName;
    }
    
    public void setNRR(float nRR)
    {
    	this.nRR=nRR;
    }
    public float getNRR()
    {
    	return nRR;
    }
    
    public void setQualified(boolean isQualified)
    {
    	this.isQualified=isQualified;
    }
    public boolean isQualified()
    {
    	return isQualified;
    }
    @Override
	public String toString() {
		return "Teamid=" + id + ", \nTeamName=" + teamName + ", \nCaptionName=" + captionName + ", \nCoachName=" + coachName
				+ ", \nNRR=" + nRR + ", \nisQualified=" + isQualified + ", \nShortName=" + shortName + "";
	}
}
