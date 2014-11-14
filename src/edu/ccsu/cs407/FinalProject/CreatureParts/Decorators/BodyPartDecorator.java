package edu.ccsu.cs407.FinalProject.CreatureParts.Decorators;

import edu.ccsu.cs407.FinalProject.CreatureParts.BodyPart;

/**
 * This class wraps a creature body part inside of another
 * body part object with a modified getHealth return
 * @author dcruz
 * @author seth
 * @author steven
 */

public abstract class BodyPartDecorator extends BodyPart 
{
	protected final BodyPart bodyPart;
	
	public BodyPartDecorator(BodyPart decoratedBodyPart)
	{
		bodyPart = decoratedBodyPart;
	}
	
	public int getHealth() {
		return bodyPart.getHealth();
	}
}
