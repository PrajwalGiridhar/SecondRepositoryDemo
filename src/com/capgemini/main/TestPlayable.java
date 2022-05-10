package com.capgemini.main;

import com.capgemini.entity.Flute;
import com.capgemini.entity.Veena;
import com.capgemini.intf.Playable;

public class TestPlayable
{
	public static void main(String[] args) 
	{
		Veena v = new Veena();
		v.play();
		
		Flute f = new Flute();
		f.play();
		
		Playable p = new Veena();
		p.play();
		
		Playable p1 = new Flute();
		p1.play();
		
	}

}
