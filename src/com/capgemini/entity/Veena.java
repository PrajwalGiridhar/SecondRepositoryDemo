package com.capgemini.entity;

import com.capgemini.intf.Playable;

public class Veena implements Playable
{
	@Override
	public void play()
	{
		System.out.println("Veena is playing");
	}
}
