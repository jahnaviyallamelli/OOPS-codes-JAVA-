import sounds.Dolby;
import sounds.Podcast;
import java.util.*;

public class PlaySounds{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter what u want to hoover to : ");
		System.out.println("1.Dolby sounds!");
		System.out.println("2.Podcast sounds!");
		int ch = sc.nextInt();
		switch(ch){
			case 1:Dolby playD = new Dolby();
				playD.playDolby();
				break;
			case 2:Podcast playP = new Podcast();
				playP.playPodcast();
				break;
			default:System.out.println("Enter Invalid choice");
	
		}

	}

}