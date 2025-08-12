package entity;

public class Team {
    private int id;
    private String teamName;
    private String captionName;
    private String coachName;
    private float nRR;
    private boolean isQualified;
    
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
}
