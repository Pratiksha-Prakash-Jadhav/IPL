package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
 
	public void selectOptions()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to IPL Portal");
		System.out.println("Please Select Following Options - ");
		System.out.println("1.Get All Team Details");
		System.out.println("2.Get team Details by short Name");
		System.out.println("3.Get team Ddetails by id");
		
		int input=sc.nextInt();
		System.out.println("You have selected option is: "+input);
		
		switch(input)
		{
                 //get all team details
		case 1:
		{
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getCSKTeamDetails());
			System.out.println(TeamRepository.getDCTeamDetails());
			System.out.println(TeamRepository.getGTTeamDetails());
			System.out.println(TeamRepository.getKKRTeamDetails());
			System.out.println(TeamRepository.getLSGteamDetails());
			System.out.println(TeamRepository.getPKTeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getRRTeamDetails());
			System.out.println(TeamRepository.getShTeamDetails());
			break;
		}
		
		      //get team details by using short name
		case 2:
		{
			System.out.println("please enter your fav team's short name: ");
			String teamShortName=sc.next();
			System.out.println("entered team short name is: "+teamShortName);
			getTeamByShortName(teamShortName);
			break;
		}
		      //get team details by using id
		
		case 3:
		{
			 System.out.println("please enter your team id number: ");
			 int teamId=sc.nextInt();
			 System.out.println("entered team id is: "+teamId);
			 getTeamById(teamId);
			 break;
		}
		
		default:
		{
			System.out.println("please enter valid input");
		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " +input);
		}
	}
	
	private void getTeamByShortName(String shortName)
	{
		switch(shortName)
		{
		case "MI":
		{
			System.out.println(TeamRepository.getMITeamDetails());
			break;
		}
		
		case "CSK":
		{
			System.out.println(TeamRepository.getCSKTeamDetails());
			break;
			
		}
		case "DC":
		{
			System.out.println(TeamRepository.getDCTeamDetails());
			break;
		}
		case "GT":
		{
			System.out.println(TeamRepository.getGTTeamDetails());
			break;
		}
		case "KKR":
		{
			System.out.println(TeamRepository.getKKRTeamDetails());
			break;
		}
		case "LSG":
		{
			System.out.println(TeamRepository.getLSGteamDetails());
			break;
		}
		case "PK":
		{
			System.out.println(TeamRepository.getPKTeamDetails());
			break;
		}
		case "RCB":
		{
			System.out.println(TeamRepository.getRCBTeamDetails());
			break;
		}
		case "RR":
		{
			System.out.println(TeamRepository.getRRTeamDetails());
			break;
		}
		case "SH":
		{
			System.out.println(TeamRepository.getShTeamDetails());
			break;
		}
		default:
		{
			throw new IllegalArgumentException("Unexpected value: " +shortName);
		}
	   }
		
	}
	
	private void getTeamById(int id) {
		
		if(id==101)
		{
			System.out.println(TeamRepository.getMITeamDetails());
		}
		else if(id==102)
		{
			System.out.println(TeamRepository.getDCTeamDetails());
		}
		else if(id==103)
		{
			System.out.println(TeamRepository.getShTeamDetails());
		}
		else if(id==104)
		{
			System.out.println(TeamRepository.getGTTeamDetails());
		}
		else if(id==105)
		{
			System.out.println(TeamRepository.getKKRTeamDetails());
		}
		else if(id==106)
		{
			System.out.println(TeamRepository.getLSGteamDetails());
		}
		else if(id==107)
		{
			System.out.println(TeamRepository.getPKTeamDetails());
		}
		else if(id==108)
		{
			System.out.println(TeamRepository.getRRTeamDetails());
		}
		else if(id==109)
		{
			System.out.println(TeamRepository.getRCBTeamDetails());
		}
		else if(id==110)
		{
			System.out.println(TeamRepository.getShTeamDetails());
		}
		else
		{
			System.out.println("Enter Valid Input");
		}
	}
}
