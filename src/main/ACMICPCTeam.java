package main;

import java.util.Scanner;

public class ACMICPCTeam {

	/**
	 * You are given a list of N people who are attending ACM-ICPC World Finals. 
	 * Each of them are either well versed in a topic or they are not. 
	 * Find out the maximum number of topics a 2-person team can know. 
	 * And also find out how many teams can know that maximum number of topics.
	 * Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.
	 * Input: 4 5 [10101, 11100, 11010, 00101]
	 * Output 5 2 
	 * Explanation: (1, 3) and (3, 4) know all the 5 topics. So the maximal topics a 2-person team knows is 5, 
	 * and only 2 teams can achieve this.
	 * */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int personCount = in.nextInt();
		int topicCount = in.nextInt();
		String[] topics = new String[personCount];
		for(int i = 0; i < personCount; i++){
			topics[i] = in.next();
		} 
		/*
		 * Compare array[i] with remaining i+1 to last elements 
		 * i+1 with i+2 to last
		 * [10101 
		 *  01010 
		 *  11100
		 *  00011 ]
		 * */
		int maxTopics=0, maxTeams=0;
		for(int i=0; i< personCount; i++){
			for(int j=i+1; j< personCount; j++){
				String person1= topics[i];
				String person2= topics[j];
				int topicMatch = 0;
				for(int k=0; k< topicCount; k++){
					if(person1.charAt(k)=='1' || person2.charAt(k)=='1'){
						topicMatch++;
					}
				}
				if(topicMatch>maxTopics){
					maxTopics=topicMatch;
					maxTeams=1;
				}else if(topicMatch==maxTopics){
					maxTeams++;
				}
			}
		}
		System.out.println(maxTopics+"\n"+ maxTeams);
		in.close();
	}

}
