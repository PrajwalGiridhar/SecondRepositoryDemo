package com.capgemini.entity;

import com.capgemini.intf.Playable;

public class Flute implements Playable
{
	@Override
	public void play()
	{
		System.out.println("Flute is playing");
	}

}
