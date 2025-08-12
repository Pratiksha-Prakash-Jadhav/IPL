package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
 
	public void printTeamDetails()
	{
		Team teamMI=TeamRepository.getMITeamDetails();		
	    System.out.println(teamMI.getId());
	    System.out.println(teamMI.getTeamName());
	    System.out.println(teamMI.getCaptionName());
	    System.out.println(teamMI.getCoachName());
	    System.out.println(teamMI.getNRR());
	    System.out.println(teamMI.isQualified());
	    
	    Team teamDC=TeamRepository.getDCTeamDetails();
	    System.out.println(teamDC.getId());
	    System.out.println(teamDC.getTeamName());
	    System.out.println(teamDC.getCaptionName());
	    System.out.println(teamDC.getCoachName());
	    System.out.println(teamDC.getNRR());
	    System.out.println(teamDC.isQualified());
	    
	    Team teamCSK=TeamRepository.getCSKTeamDetails();
	    System.out.println(teamCSK.getId());
	    System.out.println(teamCSK.getTeamName());
	    System.out.println(teamCSK.getCaptionName());
	    System.out.println(teamCSK.getCoachName());
	    System.out.println(teamCSK.getNRR());
	    System.out.println(teamCSK.isQualified());
	    
	    
	    Team teamGTT=TeamRepository.getGTTeamDetails();
	    System.out.println(teamGTT.getId());
	    System.out.println(teamGTT.getTeamName());
	    System.out.println(teamGTT.getCaptionName());
	    System.out.println(teamGTT.getCoachName());
	    System.out.println(teamGTT.getNRR());
	    System.out.println(teamGTT.isQualified());
	    
	    Team teamKKR=TeamRepository.getKKRTeamDetails();
	    System.out.println(teamKKR.getId());
	    System.out.println(teamKKR.getTeamName());
	    System.out.println(teamKKR.getCaptionName());
	    System.out.println(teamKKR.getCoachName());
	    System.out.println(teamKKR.getNRR());
	    System.out.println(teamKKR.isQualified());
	    
	    Team teamLSG=TeamRepository.getLSGteamDetails();
	    System.out.println(teamLSG.getId());
	    System.out.println(teamLSG.getTeamName());
	    System.out.println(teamLSG.getCaptionName());
	    System.out.println(teamLSG.getCoachName());
	    System.out.println(teamLSG.getNRR());
	    System.out.println(teamLSG.isQualified());
	    
	    Team team6=TeamRepository.getPKTeamDetails();
	    System.out.println(team6.getId());
	    System.out.println(team6.getTeamName());
	    System.out.println(team6.getCaptionName());
	    System.out.println(team6.getCoachName());
	    System.out.println(team6.getNRR());
	    System.out.println(team6.isQualified());
	    
	    Team teamRRT=TeamRepository.getRRTeamDetails();
	    System.out.println(teamRRT.getId());
	    System.out.println(teamRRT.getTeamName());
	    System.out.println(teamRRT.getCaptionName());
	    System.out.println(teamRRT.getCoachName());
	    System.out.println(teamRRT.getNRR());
	    System.out.println(teamRRT.isQualified());
	    
	    Team teamRCB=TeamRepository.getRCBTeamDetails();
	    System.out.println(teamRCB.getId());
	    System.out.println(teamRCB.getTeamName());
	    System.out.println(teamRCB.getCaptionName());
	    System.out.println(teamRCB.getCoachName());
	    System.out.println(teamRCB.getNRR());
	    System.out.println(teamRCB.isQualified());
	    
	    Team teamSH=TeamRepository.getShTeamDetails();
	    System.out.println(teamSH.getId());
	    System.out.println(teamSH.getTeamName());
	    System.out.println(teamSH.getCaptionName());
	    System.out.println(teamSH.getCoachName());
	    System.out.println(teamSH.getNRR());
	    System.out.println(teamSH.isQualified());
	}
}
