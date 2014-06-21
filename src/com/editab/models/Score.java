package com.editab.models;

import java.util.ArrayList;
import java.util.List;

public class Score {
	
	// TODO : Might be better to consider note as an enum
	private List<String> note = new ArrayList<String> ();
	
	public void addNote(String not) {
		note.add(not);
	}
	
}
