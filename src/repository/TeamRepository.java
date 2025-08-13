package repository;

import entity.Team;

public class TeamRepository {

	public static Team getMITeamDetails()
	{
		Team team=new Team();
		System.out.println("\nMumbai Indian Team Details: ");
		team.setId(101);
		team.setTeamName("Mumbai Indian");
		team.setCoachName("Jaywardhan");
		team.setCaptionName("Hardik Pandya");
		team.setNRR(2.3f);
		team.setQualified(false);
		team.setShortName("MI");
		return team;
	}
	//add similar mathod for remaining 9 teams
	
	public static Team getDCTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nDelhi Capitals Team Details: ");
		team.setId(102);
		team.setTeamName("Delhi Capitals");
		team.setCoachName("Ricky Ponting");
		team.setCaptionName("Axar Patel");
		team.setNRR(3.4f);
		team.setQualified(false);
		team.setShortName("DC");
		return team;
	}
	
	public static Team getCSKTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nChennai Super Kings Team Details: ");
		team.setId(103);
		team.setTeamName("Chennai Super Kings");
		team.setCoachName("Stephen Fleming");
		team.setCaptionName("Ruturaj Gaikwad");
		team.setNRR(3.5f);
		team.setQualified(true);
		team.setShortName("CSK");
		return team;
	}
	
	public static Team getGTTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nGujrat Titans Team Details: ");
		team.setId(104);
		team.setTeamName("Ashish Nehra");
		team.setTeamName("Shubman Gill");
		team.setNRR(4.5f);
		team.setQualified(true);
		return team;
	}
	
	public static Team getKKRTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nKolkata Knight Riders Team Details: ");
		team.setId(105);
		team.setTeamName("kolkate Knight Riders");
		team.setCoachName("Chandrakant pandit");
		team.setNRR(4.5f);
		team.setQualified(false);
		return team;
	}
	
	public static Team getLSGteamDetails()
	{
		Team team=new Team();
		System.out.println("\nLucknow Super Giants Team Details: ");
		team.setId(106);
		team.setTeamName("Lucknow Super Giants");
		team.setCoachName("Justin Langer");
		team.setCaptionName("KL Rahul");
		team.setNRR(2.3f);
		team.setQualified(true);
		team.setShortName("LSG");
		return team;
	}
	
	public static Team getPKTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nPunjab kings Team Details: ");
		team.setId(107);
		team.setTeamName("Punjab Kings");
		team.setCoachName("Trevor Bayliss");
		team.setCaptionName("Shreyas layer");
		team.setNRR(3.4f);
		team.setQualified(false);
		team.setShortName("PK");
		return team;
	}
	
	public static Team getRRTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nRajasthan Royals Team Details: ");
		team.setId(108);
		team.setTeamName("Rajasthan Royals");
		team.setCoachName("Krmar Sangakkara");
		team.setCaptionName("Sanju Samson");
		team.setNRR(1.3f);
		team.setQualified(true);
		team.setShortName("RR");
		return team;
	}
	
	public static Team getRCBTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nRoyal Challegers Benglore Team  Details: ");
		team.setId(109);
		team.setTeamName("Royal Challegers Banglore");
		team.setCoachName("Andy Flower");
		team.setCaptionName("Faf du Plessis");
		team.setNRR(3.4f);
		team.setQualified(false);
		team.setShortName("RCB");
		return team;
	}
	
	public static Team getShTeamDetails()
	{
		Team team=new Team();
		System.out.println("\nSunrisers Hayderabad Team Details: ");
		team.setId(110);
		team.setTeamName("Sunrisers Hayderabad");
		team.setCoachName("Daniel vettori");
		team.setCaptionName("Aiden Markram");
		team.setNRR(3.3f);
		team.setQualified(true);
		team.setShortName("SH");
		return team;
	}
}
