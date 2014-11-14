package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.BodyPart;


/**
 * This class uses the decorator pattern to simulate an injury
 * on a creatures bodypart. 
 *
 * @author dcruz
 * @author seth
 * @author steven
 */

public class InjuredDecorator extends BodyPartDecorator
{
	private int injuryAmount;
	
	public InjuredDecorator(int injury, BodyPart bp)
	{
		super(bp);
		injuryAmount = injury;
	}
	
	public int getHealth() 
	{
		return bodyPart.getHealth() - injuryAmount;
	}
}
