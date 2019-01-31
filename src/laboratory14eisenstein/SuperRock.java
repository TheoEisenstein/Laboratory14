package laboratory14eisenstein;
import java.util.Random;
public class SuperRock extends Player {

		@Override
		public Roshambo generateRoshambo() {
		
			//Attempt to make random returns for SUPERROCK.
			//My understanding was nextInt(9) would include 0-8, 0-2 rock, 3-5 paper, 6-8 scissors
			Random rand = new Random();
			int randNo = rand.nextInt(9);
			
			if(randNo <= 2) {
				return Roshambo.ROCK;
			}else if(2 < randNo && randNo <=5) {
				return Roshambo.PAPER;
			}else {
			
				return Roshambo.SCISSORS;
			}
		}

		public SuperRock() {
			super();
		}

		public SuperRock(String name) {
			super(name);
		}

	
		}
		
		

