package edu.ccsu.cs407.FinalProject.CreatureParts;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositeCreatureComponent extends CreatureComponent 
{
	private ArrayList<CreatureComponent> creatureComponents = new ArrayList<CreatureComponent>();
	
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
		return creatureComponents.get(i);
	}
	
	public ArrayList<CreatureComponent> getCreatureComponents(){
		return creatureComponents;
	}
	
	
	
	public int getHealth()
	{
		int health = 0;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
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
	
	public boolean canEatPlants()
	{
		boolean omni = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
				try 
				{
					if (creatureComponent.canEatPlants())
					{
						omni=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return omni;
	}

	public boolean canEatAnimals()
	{
		boolean carn = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
				try 
				{
					if (creatureComponent.canEatAnimals())
					{
						carn=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return carn;
	}

	public boolean canEatSameSpecies()
	{
		boolean cannibal = false;
		Iterator<CreatureComponent> iterator = creatureComponents.iterator();
		
		while (iterator.hasNext())
		{
			CreatureComponent creatureComponent = iterator.next();
		
				try 
				{
					if (creatureComponent.canEatAnimals())
					{
						cannibal=true;
					}
				} 
				catch (UnsupportedOperationException e) {}
		}
		return cannibal;
	}
}
