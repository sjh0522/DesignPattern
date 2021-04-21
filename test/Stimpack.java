package Deco;

public class Stimpack extends CondimentDecorator{
	
	public Stimpack(Character character) {
		this.character = character; // association
	}
	
	@Override
	public String getDescription() {
		return character.getDescription() + "Stimpack";
	}

}
