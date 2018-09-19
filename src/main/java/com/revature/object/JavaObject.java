package com.revature.object;

import org.apache.log4j.Logger;

public class JavaObject extends Character implements CharacterAction{
	/**
	 * This is a free will assignment for you to have fun with what we have learned.
	 * 
	 * I want you to tell me a story using the following things:
	 * - Your own protagonist POJO.
	 * -- Provide three attributes to this POJO and two overloaded constructors besides the
	 * no args constructor.
	 * - Feel free to add more characters to your story.
	 * - An Interface and an Abstract Class which your POJO(s) will implement and/or extend.
	 * -- Add some fun methods in there.
	 * - Two custom exceptions, one extending from Exception and the other one extending
	 * from RuntimeException. These will be thrown in the story.
	 * 
	 * In the main method is where you tell the story. You can create as many instances
	 * (characters) as you need, but make you sure you present them into the console before
	 * starting the story.
	 * 
	 * Remember, I want you to have fun, BUT AS ALWAYS... Keep it professional.
	 * 
	 * P.S.: Don't forget to have this assignment under Java_Assignments folder.
	 **/

	private static final Logger LOGGER = Logger.getLogger(JavaObject.class);

	private boolean hasHair;
	private boolean isHero;
	private String eyeColor;

	public JavaObject() {
		eyeColor = "";
	}

	public JavaObject(boolean isMale, boolean hasHair, boolean isHero, String eyeColor) {
		super(isMale);
		this.hasHair = hasHair;
		this.isHero = isHero;
		this.eyeColor = eyeColor;
	}

	public JavaObject(int age, boolean isMale, String firstName, String lastName, boolean hasHair,
			boolean isHero, String eyeColor) {
		super(age, isMale, firstName, lastName);
		this.hasHair = hasHair;
		this.isHero = isHero;
		this.eyeColor = eyeColor;
	}

	@Override
	public void greeting() {
		LOGGER.info(this.getFirstName() + ": My name is " + this.getFirstName() + " " + this.getLastName() + ". "
				+ "Who are you?");
	}

	@Override
	public void replyGreeting() {
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				try {
					throw new NamelessException("Dragon: I do not have a name, for I am a legend.");
				} catch (Exception e) {
					LOGGER.error(e);
				}
			} else {
				LOGGER.info(this.getLastName() + ": They call me " + this.getLastName() + ". Pleasure to meet you.");	
			}
		} else {
			LOGGER.info(this.getFirstName() + ": My name is " + this.getFirstName() + " " + this.getLastName() + ". Nice to meet you.");
		}
	}

	@Override
	public void run() {
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				LOGGER.info("The nameless one charges ahead.");	
			} else {
				LOGGER.info(this.getLastName() + " rushes in.");
			}
		} else {
			LOGGER.info(this.getFirstName() + " runs forward.");
		}
	}

	@Override
	public void dodge() {	
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				LOGGER.info("The nameless one swiftly dodges.");	
			} else {
				LOGGER.info(this.getLastName() + " sidesteps away from the maneuver.");
			}
		} else {
			LOGGER.info(this.getFirstName() + " is able to evade this attack.");
		}
	}

	@Override
	public void attack() {
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				LOGGER.info("The nameless one goes in for a vicious attack.");	
			} else {
				LOGGER.info(this.getLastName() + " swoops in for a furious blow.");
			}
		} else {
			LOGGER.info(this.getFirstName() + " comes in with a strong strike.");
		}
	}

	@Override
	public void disappear() {
		if(this.getFirstName().isEmpty()) {
			if(this.getLastName().isEmpty()) {
				LOGGER.info("The nameless one, having been defeated, vanishes.");	
			} else {
				LOGGER.info(this.getLastName() + ", with their loss, retreats.");
			}
		} else {
			LOGGER.info(this.getFirstName() + ", from this hard-fought battle, disappears.");
		}
	}

	public boolean isHasHair() {
		return hasHair;
	}

	public void setHasHair(boolean hasHair) {
		this.hasHair = hasHair;
	}

	public boolean isHero() {
		return isHero;
	}

	public void setHero(boolean isHero) {
		this.isHero = isHero;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
		result = prime * result + (hasHair ? 1231 : 1237);
		result = prime * result + (isHero ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaObject other = (JavaObject) obj;
		if (eyeColor == null) {
			if (other.eyeColor != null)
				return false;
		} else if (!eyeColor.equals(other.eyeColor))
			return false;
		if (hasHair != other.hasHair)
			return false;
		if (isHero != other.isHero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "JavaObject [hasHair=" + hasHair + ", isHero=" + isHero + ", eyeColor=" + eyeColor + "]";
	}

	public static void main(String[] args) {
		JavaObject pojo = new JavaObject(25, true, "Pojo", "Pendragon", true, true, "Blue");
		JavaObject javason = new JavaObject(23, false, "", "Javason", true, true, "Brown");
		JavaObject dragon = new JavaObject(true, false, false, "Red");
		boolean hasDodged = false;
		pojo.setHasHair(false);

		System.out.println();

		LOGGER.info("There once lived a knight named " + pojo.getFirstName() + " " + pojo.getLastName( )+ ".");
		if(pojo.isHasHair() == true) {
			LOGGER.info("He had long, flowing hair and was quite proud of it. (This was a bit of a side note,"
					+ " pay no attention to it.)");
		} else {
			LOGGER.info("He was bald, but was not ashamed of it. (This was a bit of a side note,"
					+ " pay no attention to it.)");
		}
		LOGGER.info("He lived in a kingdom that was every so often terrorized by a dangerous dragon.");
		LOGGER.info(pojo.getFirstName() + ", being a fearsome warrior, was sent off by his King to slay the foul beast.");
		LOGGER.info("So off he went to seek a fearsome creature, but along the way he came across a lady warrior who was"
				+ "minding her own business.");

		System.out.println();

		pojo.greeting();
		javason.replyGreeting();
		pojo.communicate("What brings you to this part of the woods?");
		javason.communicate("I should say the same to you, good sir.");
		pojo.communicate("I was sent on my way to slay the fearsome dragon of the mountains.");
		javason.communicate("That dragon has been a pain in my neck for years, and"
				+ " it's about time someone's done something about it.");
		pojo.communicate("Why don't you join me? You look like you could help out quite a bit.");
		if(javason.isHero = true) {
			javason.communicate("With pleasure.");
		} else {
			javason.communicate("No way. Get lost.");
		}

		System.out.println();

		LOGGER.info("And so, off they went to the mountains to find the dragon in its slumber.");
		LOGGER.info("As soon as they went to approach, the dragon awoke, somewhat irritated at these trespassers.");

		System.out.println();

		pojo.greeting();
		dragon.replyGreeting();

		System.out.println();

		LOGGER.info("Having found their target, " + pojo.getFirstName() + " and " + javason.getLastName() + " prepare their weapons.");
		pojo.run();
		javason.run();
		dragon.attack();
		pojo.dodge();
		javason.dodge();
		dragon.dodge();
		hasDodged = false;
		pojo.attack();
		if (hasDodged == true) {
			LOGGER.info("The dragon gets hit, but quickly shakes it off");
		} else {
			try {
				throw new DodgeException("The dragon, however, had preemptively evaded beforehand.");
			} catch (RuntimeException e) {
				LOGGER.error(e);
			}
		}
		dragon.attack();
		javason.dodge();
		LOGGER.info(pojo.getFirstName() + " gets nicked, but stands tall.");
		pojo.taunt("Is that the best you can do?");
		dragon.attack();
		pojo.dodge();
		pojo.run();
		pojo.attack();
		LOGGER.info("The dragon receives a major wound, and is not able to continue.");
		dragon.disappear();
		javason.victorySpeech("You did it! Now the dragon is finally gone!");
		pojo.victorySpeech("I couldn't have done it without you. Thanks, " + javason.getLastName() + "!");
		
		System.out.println();
		
		LOGGER.info("The end.");
	}
}
