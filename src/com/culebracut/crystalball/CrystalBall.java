package com.culebracut.crystalball;

import java.util.Random;

public class CrystalBall {
	// Member variables (properties about the object)

	// Methods (abilities: things the object can do)
	String getAnAnswer(){
		String[] answers = { "It is certain", "It is decidedly so",
				"Without a doubt", "Yes definitely",
				"You may rely on it", "As I see it, yes",
				"Most likely", "Outlook good", "Yes",
				"Signs point to yes", "Reply hazy try again",
				"Ask again later", "Better not tell you now",
				"Cannot predict now", "Concentrate and ask again",
				"Don't count on it", "My reply is no",
				"My sources say no", "Outlook not so good",
				"Very doubtful" };
		// The button was pushed, so we should update it
		//String answer = "";

		// Randomly select an answer of either Yes, No, or Maybe
		Random randomGenerator = new Random();

		int randomNumber = randomGenerator.nextInt(answers.length);

		return answers[randomNumber];
	}
}
