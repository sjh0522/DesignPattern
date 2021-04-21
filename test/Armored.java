package Deco;

public class Armored extends CondimentDecorator{
	public Armored(Character character) {
		this.character = character; // association
	}
	
	@Override
	public String getDescription() {
		return character.getDescription() + "Armored";
	}
}
