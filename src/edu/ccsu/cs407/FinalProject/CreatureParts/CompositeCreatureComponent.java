package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;

import edu.ccsu.cs407.FinalProject.Exceptions.UnsupportedOperationException;

public class CompositeCreatureComponent extends CreatureComponent 
{
	private ArrayList creatureComponents = new ArrayList();
	
	public void add(CreatureComponent c)
	{
		creatureComponents.add(c);
	}
	
	public void remove(CreatureComponent c)
	{
		creatureComponents.remove(c);
	}
	
	public CreatureComponent getChild(int i)
	{
		return (CreatureComponent) creatureComponents.get(i);
	}
	
	public int getHealth()
	{
		int health = 0;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					health += creatureComponent.getHealth();
				} 
				catch (UnsupportedOperationException e) {}
		}
		
		return health;
	}
	
	public int getSpeed()
	{
		int speed = 0;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					speed += creatureComponent.getSpeed();
				} 
				catch (UnsupportedOperationException e) {}
		}
		
		return speed;
	}
	
	public int getWeight()
	{
		int weight = 0;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					weight += creatureComponent.getWeight();
				} 
				catch (UnsupportedOperationException e) {}
		}
		return weight;
	}
	
	public int getDamage()
	{
		int damage = 0;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					damage += creatureComponent.getDamage();
				} 
				catch (UnsupportedOperationException e) {}
		}
		return damage;
	}
	
	public boolean canFly()
	{
		boolean fly = false;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					if (creatureComponent.canFly())
					{
						fly=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return fly;
	}
	
	public boolean canSwim()
	{
		boolean swim= false;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					if (creatureComponent.canSwim())
					{
						swim=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return swim;
	}
	
	public boolean canEatLarger()
	{
		boolean larger = false;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					if (creatureComponent.canEatLarger())
					{
						larger=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return larger;
	}
	
	public boolean isOmnivore()
	{
		boolean omni = false;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					if (creatureComponent.isOmnivore())
					{
						omni=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return omni;
	}

	public boolean isCarnivore()
	{
		boolean carn = false;
		Iterator iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = (CreatureComponent)iterator.next();
		
				try 
				{
					if (creatureComponent.isCarnivore())
					{
						carn=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return carn;
	}
}
