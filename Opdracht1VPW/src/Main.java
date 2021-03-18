import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int aantal = scanner.nextInt();
		scanner.nextLine();
		
		for(int x = 0; x < aantal; x++) {
			int aantalSpelers = scanner.nextInt();
			int[] bedragen = new int[aantalSpelers];
			
			for(int y = 0; y < aantalSpelers; y++) {
				bedragen[y] = scanner.nextInt();
			}
			
				int ingezetteWaarde = 0;
				int speler1Bedrag = bedragen[0];
				int maxBedrag = bedragen[0];
				for(int bedrag: bedragen) {
					
					if(maxBedrag < bedrag) {
						maxBedrag = bedrag;
					}
				}
				
				if(maxBedrag != speler1Bedrag) {
					ingezetteWaarde = speler1Bedrag;
				}
				//speler aan top en niemand kan hem inhalen -> max bedrag dat overwinning garandeert
				else {
					int tweedemaxBedrag = 0;
					bedragen[0] = 0;
					for(int bedrag: bedragen) {
						
						if(tweedemaxBedrag < bedrag) {
							tweedemaxBedrag = bedrag;
						}		
					}
					if(maxBedrag == tweedemaxBedrag) {
						ingezetteWaarde = speler1Bedrag;
					}else {
						if(speler1Bedrag < tweedemaxBedrag * 2) {
							//Hij kan ingehaalt worden
							ingezetteWaarde = tweedemaxBedrag * 2 - speler1Bedrag +1;
						}else {
							ingezetteWaarde = speler1Bedrag - tweedemaxBedrag * 2 - 1;
						}
					}
				}
				System.out.printf("%d %d%n", x+1, ingezetteWaarde);
			}
		}
		
		
	}
	
	


